package fr.devsylone.fallenkingdom.manager.saveable;

import fr.devsylone.fallenkingdom.Fk;
import fr.devsylone.fallenkingdom.players.FkPlayer;
import fr.devsylone.fallenkingdom.utils.Messages;
import fr.devsylone.fkpi.util.Saveable;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class PlayerManager implements Saveable
{
	protected final Map<UUID, Location> onTnt = new HashMap<>();
	protected final Map<UUID, FkPlayer> playersByUUID = new HashMap<>();
	protected final Map<String, FkPlayer> playersByString = new HashMap<>();

	public @NotNull List<@NotNull FkPlayer> getConnectedPlayers()
	{
		List<FkPlayer> players = new LinkedList<>();
		for (Map.Entry<UUID, FkPlayer> entry : playersByUUID.entrySet()) {
			Player player = Bukkit.getPlayer(entry.getKey());
			if (player != null && Fk.getInstance().getWorldManager().isAffected(player.getWorld())) {
				players.add(entry.getValue());
			}
		}
		return players;
	}

	public @NotNull List<@NotNull Player> getOnlinePlayers()
	{
		List<Player> players = new LinkedList<>();
		for (Map.Entry<UUID, FkPlayer> entry : playersByUUID.entrySet()) {
			Player player = Bukkit.getPlayer(entry.getKey());
			if (player != null && Fk.getInstance().getWorldManager().isAffected(player.getWorld())) {
				players.add(player);
			}
		}
		return players;
	}

	public void putOnTnt(@NotNull UUID player, @NotNull Location tnt)
	{
		onTnt.put(player, tnt);
	}

	public boolean wasOnTnt(@NotNull UUID player)
	{
		return onTnt.containsKey(player);
	}

	public void removeOnTnt(@NotNull UUID player)
	{
		onTnt.remove(player);
	}

	public @Nullable Location getTntLoc(@NotNull UUID player)
	{
		return onTnt.get(player);
	}

	public @NotNull FkPlayer getPlayer(@NotNull String name)
	{
		return this.playersByString.computeIfAbsent(name, FkPlayer::new);
	}

	public @NotNull FkPlayer getPlayer(@NotNull OfflinePlayer player)
	{
		FkPlayer fkPlayer = playersByUUID.get(player.getUniqueId());
		if (fkPlayer != null) {
			return fkPlayer;
		}

		fkPlayer = getPlayer(requireNonNull(player.getName(), Messages.CONSOLE_PLAYER_NAME_NOT_SET.getMessage()));
		playersByUUID.put(player.getUniqueId(), fkPlayer);
		return fkPlayer;
	}

	public @Nullable FkPlayer getPlayerIfExist(@NotNull Player player)
	{
		return playersByUUID.get(player.getUniqueId());
	}

	@Override
	public void load(ConfigurationSection config)
	{
		ConfigurationSection section = config.getConfigurationSection("Players");
		if(section == null)
			return;
		for(String key : section.getKeys(false))
			getPlayer(key).loadNullable(section.getConfigurationSection(key));
	}

	@Override
	public void save(ConfigurationSection config)
	{
		for(Map.Entry<String, FkPlayer> entry : playersByString.entrySet())
			entry.getValue().save(config.createSection("Players." + entry.getKey()));
	}
}
