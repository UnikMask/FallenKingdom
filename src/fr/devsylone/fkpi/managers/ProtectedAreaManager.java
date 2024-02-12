package fr.devsylone.fkpi.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import fr.devsylone.fkpi.protectedareas.AABBArea;
import fr.devsylone.fkpi.protectedareas.ProtectedArea;
import fr.devsylone.fkpi.util.Saveable;

public class ProtectedAreaManager implements Saveable {
    private final Map<String, ProtectedArea> areas = new HashMap<>();

    /**
     * Add an AABB kind of protected area to protected areas.
     *
     * @param name The area's name.
     * @param pointA {@link Location} of 1st area edge.
     * @param pointB {@link Location} of 2nd area edge.
     */
    public void addArea(String name, Location pointA, Location pointB) {
        areas.put("name", new AABBArea(pointA, pointB));
    }

    /**
     * Remove an area from the list of protected areas.
     *
     * @param name The area's name.
     * @return Whether an area corresponding to the name was removed.
     */
    public boolean remove(@NotNull String name) {
        return areas.remove(name) != null;
    }

    /**
     * Get the list of all areas.
     *
     * @return The list of all active protected areas.
     */
    public List<ProtectedArea> getAreaList() {
        return new ArrayList<>(areas.values());
    }

    @Override
    public void save(ConfigurationSection config) {
        ConfigurationSection areaCfg = config.createSection("Areas");
        for (Map.Entry<String, ProtectedArea> e : areas.entrySet()) {
            areaCfg.set(e.getKey(), e.getValue());
        }
    }

    @Override
    public void load(ConfigurationSection config) {
        if (!config.isConfigurationSection("Areas")) {
            return;
        }
        config = config.getConfigurationSection("Areas");
        for (String key : config.getKeys(false)) {
            Object area = config.get(key);
            if (area != null && area instanceof ProtectedArea) {
                areas.put(key, (ProtectedArea) area);
            }
        }
    }
}
