package fr.devsylone.fallenkingdom.commands.chests.chestscommands;

import fr.devsylone.fallenkingdom.Fk;
import fr.devsylone.fallenkingdom.commands.ArgumentParser;
import fr.devsylone.fallenkingdom.commands.abstraction.CommandRole;
import fr.devsylone.fallenkingdom.commands.abstraction.CommandResult;
import fr.devsylone.fallenkingdom.commands.abstraction.FkPlayerCommand;
import fr.devsylone.fallenkingdom.commands.chests.FkChestsCommand;
import fr.devsylone.fallenkingdom.exception.FkLightException;
import fr.devsylone.fallenkingdom.players.FkPlayer;
import fr.devsylone.fallenkingdom.utils.Messages;
import fr.devsylone.fkpi.lockedchests.LockedChest;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;

import java.util.List;

public class Add extends FkPlayerCommand {
    public Add() {
        super("add", "<i1:day> <i:time> [name]", Messages.CMD_MAP_CHEST_ADD, CommandRole.ADMIN);
    }

    @Override
    public CommandResult execute(Fk plugin, Player sender, FkPlayer fkp, List<String> args,
            String label) {
        Chest target = FkChestsCommand.getCommandChest(sender); 
        int day =
                ArgumentParser.parsePositiveInt(args.get(0), false, Messages.CMD_ERROR_DAY_FORMAT);
        int time =
                ArgumentParser.parsePositiveInt(args.get(1), false, Messages.CMD_ERROR_TIME_FORMAT);

        String name = args.size() >= 3 ? args.get(2)
                : String.valueOf(
                        Fk.getInstance().getFkPI().getLockedChestsManager().getChestMap().size());

        LockedChest chest = new LockedChest(target.getLocation(), name);
        chest.addChestLoadout(day, time, 10000, null,
                target.getSnapshotInventory().getContents());
        Fk.getInstance().getFkPI().getLockedChestsManager().addOrEdit(chest);

        broadcast(Messages.CMD_LOCKED_CHEST_CREATED.getMessage().replace("%name%", name)
                .replace("%day%", String.valueOf(day)).replace("%x%", String.valueOf(target.getX()))
                .replace("%y%", String.valueOf(target.getY()))
                .replace("%z%", String.valueOf(target.getZ()))
                .replace("%time%", String.valueOf(time))
                .replace("%unit%", Messages.Unit.SECONDS.tl(time)), 3, args);
        return CommandResult.SUCCESS;
    }
}
