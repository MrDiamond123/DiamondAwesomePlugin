package io.github.MrDiamond123.DiamondAwesomePlugin.commands;

import io.github.MrDiamond123.DiamondAwesomePlugin.DiamondLikesPrettyColors;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import static io.github.MrDiamond123.DiamondAwesomePlugin.DiamondLikesPrettyColors.outputBooleanColors;

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
            if(args.length == 0) {
                sender.sendMessage("Sorry, but you need to put in a player's name!");
                return false;
            } else {
                Player player = Bukkit.getPlayer(args[0]);
                if (player == null) {
                    sender.sendMessage("Sorry, but that is a invalid player!");
                    return false;
                } else {
                    sender.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "PLAYER INFO");
                    sender.sendMessage("Username: " + player.getName());
                    sender.sendMessage("Display name: " + player.getDisplayName());
                    sender.sendMessage("Health: " + player.getHealth());
                    sender.sendMessage("Hunger: " + player.getFoodLevel());
                    sender.sendMessage("Allowed to fly: " + outputBooleanColors(player.getAllowFlight()));
                    sender.sendMessage("Flying: " + outputBooleanColors(player.isFlying()));
                    sender.sendMessage("Gamemode: " + player.getGameMode());
                    sender.sendMessage("Current World: " + player.getWorld().getName());
                    sender.sendMessage("X: " + player.getLocation().getX());
                    sender.sendMessage("Y: " + player.getLocation().getY());
                    sender.sendMessage("Z: " + player.getLocation().getZ());

                    return true;
                }

            }
    }
return true;
    }




}
