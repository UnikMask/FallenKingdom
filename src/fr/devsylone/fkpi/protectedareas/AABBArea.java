package fr.devsylone.fkpi.protectedareas;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.configuration.serialization.SerializableAs;
import org.bukkit.util.Vector;

@SerializableAs("AABBArea")
public class AABBArea implements ProtectedArea {
    Vector low, high;

    public boolean isInside(Location location) {
        return location.getX() >= low.getX() && location.getY() >= low.getY()
                && location.getZ() >= low.getZ() && location.getX() <= high.getX()
                && location.getY() <= high.getY() && location.getZ() <= high.getZ();
    }

    public Map<String, Object> serialize() {
        Map<String, Object> res = new HashMap<>();
        res.put("low", low);
        res.put("high", high);
        return res;
    }

    public static AABBArea deserialize(Map<String, Object> args) {
        Vector low = new Vector(), high = new Vector();
        if (args.get("low") instanceof Vector) {
            low = (Vector) args.get("low");
        }
        if (args.get("high") instanceof Vector) {
            high = (Vector) args.get("high");
        }
        return new AABBArea(low, high);
    }

    public AABBArea(Location pointA, Location pointB) {
        low = new Vector(Math.max(pointA.getX(), pointB.getX()),
                Math.max(pointA.getY(), pointB.getY()), Math.max(pointA.getZ(), pointB.getZ()));
    }

    public AABBArea(Vector low, Vector high) {

    }
}
