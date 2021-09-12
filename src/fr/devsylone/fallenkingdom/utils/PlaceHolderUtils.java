package fr.devsylone.fallenkingdom.utils;

import fr.devsylone.fallenkingdom.Fk;
import fr.devsylone.fallenkingdom.game.Game;
import fr.devsylone.fkpi.FkPI;
import fr.devsylone.fkpi.teams.Team;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public class PlaceHolderUtils
{
    public static final Supplier<Game> GAME_SUPPLIER = Fk.getInstance()::getGame;
	private static final double ANGLE_OFFSET = ((double) 360 / 16) * 13;

	private static @Nullable Location getPointingLocation(Player player)
	{
		// Vers la base
		Team pTeam = FkPI.getInstance().getTeamManager().getPlayerTeam(player);
		if (pTeam != null && requireNonNull(pTeam.getBase(), "player base").getCenter() != null && player.getWorld().equals(pTeam.getBase().getCenter().getWorld()))
			return pTeam.getBase().getCenter().clone();

		// Vers le portail
		Location portal = Fk.getInstance().getPlayerManager().getPlayer(player).getPortal();
		if (portal != null && portal.getWorld().equals(player.getWorld()))
			return portal.clone();

		return null;
	}

	private static Optional<Team> getNearestTeam(Player player, int iteration)
	{
		return FkPI.getInstance().getTeamManager().getTeams().stream()
				.filter(team -> team.getBase() != null && !team.getPlayers().contains(player.getName()))
				.filter(team -> team.getBase().getCenter().getWorld().equals(player.getWorld()))
				.sorted(Comparator.comparingDouble(team -> team.getBase().getCenter().distanceSquared(player.getLocation())))
				.skip(iteration)
				.findFirst();
	}

	public static String getBaseDistance(Player player)
	{
		Location pLoc = player.getLocation();
		Team pTeam = FkPI.getInstance().getTeamManager().getPlayerTeam(player);
		if (pTeam == null)
			return noTeam();
		if (pTeam.getBase() == null)
			return noBase();

		Location point = getPointingLocation(player);
		if (point != null)
			return String.valueOf((int) pLoc.distance(point));

		return Fk.getInstance().getDisplayService().text().noInfo(); // ?
	}

	public static String getBaseDirection(Player player)
	{
		Team pTeam = FkPI.getInstance().getTeamManager().getPlayerTeam(player);
		if (pTeam == null)
			return noTeam();
		if (pTeam.getBase() == null)
			return noBase();

		Location point = getPointingLocation(player);
		if (point != null)
			return getDirectionOf(player.getLocation(), point);

		return Fk.getInstance().getDisplayService().text().noInfo(); // ?
	}

	public static String getNearestTeamBase(Player player, int iteration)
	{
		if(FkPI.getInstance().getTeamManager().getTeams().size() < 1)
			return noTeam();

		Optional<Team> nearestTeam = getNearestTeam(player, iteration);
		return nearestTeam
				.map(team -> team.getChatColor() + team.getName())
				.orElse(Fk.getInstance().getDisplayService().text().noInfo());
	}

	public static String getNearestBaseDirection(Player player, int iteration)
	{
		if(FkPI.getInstance().getTeamManager().getTeams().size() < 1)
			return noTeam();

		Optional<Team> nearestTeam = getNearestTeam(player, iteration);
		return nearestTeam
				.map(team -> getDirectionOf(player.getLocation(), requireNonNull(team.getBase(), "team base").getCenter()))
				.orElse(Fk.getInstance().getDisplayService().text().noInfo());
	}

	public static String getTeamOf(Player p)
	{
		Team t = FkPI.getInstance().getTeamManager().getPlayerTeam(p);
		return t == null ? noTeam() : t.toString();
	}

	private static String getDirectionOf(Location location, Location target)
	{
		double yaw = location.getYaw();
		double z = target.getZ() - location.getZ();
		double x = target.getX() - location.getX();

		double theta = Math.toDegrees(Math.atan2(z, x));
		int angle = Math.floorMod((int) (ANGLE_OFFSET + theta - yaw), 360);
		return String.valueOf(Fk.getInstance().getDisplayService().text().arrowAt(angle));
	}
	
	public static String getBaseOrPortal(Player player)
	{
		Team pTeam = FkPI.getInstance().getTeamManager().getPlayerTeam(player);
		if (pTeam != null && pTeam.getBase() != null && pTeam.getBase().getCenter().getWorld().equals(player.getWorld()))
			return Messages.SCOREBOARD_BASE.getMessage();
		Location portal = Fk.getInstance().getPlayerManager().getPlayer(player).getPortal();
		if (portal != null && portal.getWorld().equals(player.getWorld()))
			return Messages.SCOREBOARD_PORTAL.getMessage();
		return Messages.SCOREBOARD_BASE.getMessage(); // Même si on pointe vers rien
	}

	public static int getDeaths(Player p)
	{
		return Fk.getInstance().getPlayerManager().getPlayer(p).getDeaths();
	}

	public static int getKills(Player p)
	{
		return Fk.getInstance().getPlayerManager().getPlayer(p).getKills();
	}

	private static String noTeam()
	{
		return Messages.CMD_SCOREBOARD_NO_TEAM.getMessage();
	}

	private static String noBase()
	{
		return Messages.CMD_SCOREBOARD_NO_BASE.getMessage();
	}
}
