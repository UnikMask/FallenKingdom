package fr.devsylone.fallenkingdom.display;

import fr.devsylone.fallenkingdom.Fk;
import fr.devsylone.fallenkingdom.display.change.DisplayChange;
import fr.devsylone.fallenkingdom.display.change.SetScoreboardLineChange;
import fr.devsylone.fallenkingdom.players.FkPlayer;
import fr.devsylone.fallenkingdom.scoreboard.PlaceHolder;
import fr.devsylone.fkpi.util.Saveable;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import static fr.devsylone.fallenkingdom.display.DisplayType.ACTIONBAR;
import static fr.devsylone.fallenkingdom.display.DisplayType.SCOREBOARD;
import static java.util.Objects.requireNonNull;

public class GlobalDisplayService implements DisplayService, Saveable {

    private final DisplayText text = new DisplayText();
    private final Stack<DisplayChange<?>> revisions = new Stack<>();
    private Map<DisplayType, DisplayService> services;
    private ScoreboardDisplayService scoreboard;

    public GlobalDisplayService() {
        this.services = Collections.emptyMap();
        this.scoreboard = new ScoreboardDisplayService();
    }

    @Override
    public boolean contains(@NotNull PlaceHolder placeHolder) {
        for (DisplayService service : this.services.values()) {
            if (service.contains(placeHolder)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAny(@NotNull PlaceHolder... placeHolders) {
        for (DisplayService service : this.services.values()) {
            if (service.containsAny(placeHolders)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(@NotNull Player player, @NotNull FkPlayer fkPlayer, @NotNull PlaceHolder... placeHolders) {
        for (DisplayService service : this.services.values()) {
            service.update(player, fkPlayer, placeHolders);
        }
    }

    public void updateAll(PlaceHolder... placeHolders) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (!Fk.getInstance().getWorldManager().isAffected(player.getWorld())) {
                continue;
            }
            final FkPlayer fkPlayer = Fk.getInstance().getPlayerManager().getPlayer(player);
            for (DisplayService service : this.services.values()) {
                service.update(player, fkPlayer, placeHolders);
            }
        }
    }

    public @NotNull ScoreboardDisplayService scoreboard() {
        return this.scoreboard;
    }

    private void setScoreboard(@NotNull ScoreboardDisplayService scoreboard) {
        this.scoreboard = scoreboard;
        this.services.put(SCOREBOARD, scoreboard);
    }

    public boolean setScoreboardLine(int line, @Nullable String value) {
        final SetScoreboardLineChange change = new SetScoreboardLineChange(this.scoreboard, line, value);
        this.revisions.push(change);
        this.setScoreboard(change.apply(this.scoreboard));
        return true;
    }

    public void setScoreboardLines(@NotNull List<@NotNull String> lines) {
        this.setScoreboard(this.scoreboard.withLines(lines));
    }

    public void setScoreboardTitle(@NotNull String title) {
        this.setScoreboard(this.scoreboard.withTitle(title));
    }

    public @NotNull DisplayText text() {
        return this.text;
    }

    private static final String TITLE = "title";
    private static final String SIDEBAR = "sidebar";

    @Override
    public void load(ConfigurationSection config) {
        final Map<DisplayType, DisplayService> services = new EnumMap<>(DisplayType.class);
        if (config.contains(ACTIONBAR.asString())) {
            services.put(ACTIONBAR, new SimpleDisplayService(ACTIONBAR, config.getString(ACTIONBAR.asString(), "")));
        }
        if (config.contains(SCOREBOARD.asString())) {
            final ConfigurationSection section = requireNonNull(config.getConfigurationSection(SCOREBOARD.asString()), "scoreboard config has no section");
            this.scoreboard = new ScoreboardDisplayService(section.getString(TITLE, ""), section.getStringList(SIDEBAR));
            services.put(SCOREBOARD, this.scoreboard);
        } else {
            this.scoreboard = new ScoreboardDisplayService();
        }
        this.services = services;
        this.text.load(config);
    }

    @Override
    public void save(ConfigurationSection config) {
        for (Map.Entry<DisplayType, DisplayService> entry : this.services.entrySet()) {
            final String key = entry.getKey().asString();
            final DisplayService service = entry.getValue();
            if (service instanceof ScoreboardDisplayService) {
                final ConfigurationSection section = config.createSection(key);
                section.set(TITLE, ((ScoreboardDisplayService) service).title());
                section.set(SIDEBAR, ((ScoreboardDisplayService) service).lines());
            } else {
                config.set(key, ((SimpleDisplayService) service).value());
            }
        }
        this.text.save(config);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public boolean undo() {
        if (this.revisions.empty()) {
            return false;
        }
        final DisplayChange change = this.revisions.pop();
        final DisplayType type = change.type();
        final DisplayService service = this.services.get(type);
        if (service == null) {
            throw new IllegalStateException("Unable to recreate the display service.");
        }
        final DisplayService changed = change.revert(service);
        this.services.put(type, changed);
        if (type == SCOREBOARD) {
            this.scoreboard = (ScoreboardDisplayService) changed;
        }
        return true;
    }
}
