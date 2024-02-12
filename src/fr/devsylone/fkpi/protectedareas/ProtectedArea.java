package fr.devsylone.fkpi.protectedareas;

import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;

public interface ProtectedArea extends ConfigurationSerializable {
    boolean isInside(Location location);
}
