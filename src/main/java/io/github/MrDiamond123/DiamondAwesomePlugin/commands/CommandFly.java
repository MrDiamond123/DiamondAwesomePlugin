package io.github.MrDiamond123.DiamondAwesomePlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {

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
        if (args.length == 0) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("dap.dfly")) {
                    if (player.getAllowFlight()) {
                        player.sendMessage("Flight " + ChatColor.DARK_RED + "Disabled!");
                        player.setAllowFlight(false);
                        return true;
                    } else {
                        player.sendMessage("Flight " + ChatColor.DARK_GREEN + "Enabled!");
                        player.setAllowFlight(true);
                        return true;
                    }
                } else {
                    player.sendMessage("Sorry dude, I know you believe you can fly.");
                    player.sendMessage("But, permission" + ChatColor.DARK_RED + ChatColor.BOLD + " DENIED!");
                    return false;
                }

            }
            return true;
        } else {
            Player player = Bukkit.getPlayer(args[0]);
            if (sender.hasPermission("dap.dfly.others")) {
                if (player != null) {
                    if (player.getAllowFlight()) {
                        sender.sendMessage("You have" + ChatColor.DARK_RED + " disabled" + ChatColor.RESET + player.getDisplayName() + "'s flight!");
                        player.sendMessage("Your flight has been disabled!");
                        player.setAllowFlight(false);
                        return true;
                    } else {
                        sender.sendMessage("You have" + ChatColor.DARK_GREEN + " enabled" + ChatColor.RESET + player.getDisplayName() + "'s flight!");
                        player.sendMessage("Your flight has been enabled!");
                        player.setAllowFlight(true);
                        return true;
                    }

                }
            } else {
                sender.sendMessage("Sorry, you don't have permission to toggle other people's flight!");
                return false;
            }
        }
        return false;
    }


}
