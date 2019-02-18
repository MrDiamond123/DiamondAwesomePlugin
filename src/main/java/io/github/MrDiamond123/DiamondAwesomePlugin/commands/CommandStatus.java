package io.github.MrDiamond123.DiamondAwesomePlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CommandStatus implements CommandExecutor {
    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("dap.dstatus")) {
        	if (args.length != 0) {
	            Player player = Bukkit.getPlayer(args[0]);
	            if (player == null) {
	                sender.sendMessage("Sorry, but that is a not a player!");
	                return false;
	            } else {
	                sender.sendMessage("PLAYER INFO");
	                sender.sendMessage("Username: " + player.getName());
	                sender.sendMessage("Display name: " + player.getDisplayName());
	                sender.sendMessage("Health: " + player.getHealth());
	                sender.sendMessage("Hunger: " + player.getFoodLevel());
	                sender.sendMessage("Allowed to fly: " + player.getAllowFlight());
	                sender.sendMessage("Flying: " + player.isFlying());
	                return true;
	            }
        	} else {
        		sender.sendMessage("Sorry, but you need to specify a player.");
        		return false;
        	}
        } else {
            sender.sendMessage("Sorry, but you need the permission \"dap.dstatus\"");
            return false;
        }
    }
}
