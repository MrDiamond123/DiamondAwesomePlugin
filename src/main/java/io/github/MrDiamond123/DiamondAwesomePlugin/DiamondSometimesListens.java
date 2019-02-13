package io.github.MrDiamond123.DiamondAwesomePlugin;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;



import static org.bukkit.Bukkit.getPlayer;

public class DiamondSometimesListens implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String playername = player.getName();
        String displayname = player.getDisplayName();

        //Check if its the best Minecraft Player Ever
        if(player == getPlayer("DiamondMCPro")) {
            Firework firework = (Firework) player.getWorld().spawnEntity(player.getLocation(), EntityType.FIREWORK);
            FireworkMeta fireworkmeta = firework.getFireworkMeta();
            fireworkmeta.setPower(5);
            fireworkmeta.addEffect(FireworkEffect.builder().with(FireworkEffect.Type.BALL_LARGE).trail(true).withColor(Color.BLUE).build());
            firework.setFireworkMeta(fireworkmeta);

            Bukkit.broadcastMessage(ChatColor.DARK_BLUE + "We all need to welcome the creator of the best plugin ever....");
            Bukkit.broadcastMessage(ChatColor.BLUE + "Vortex's Dev" + ChatColor.BOLD + "DiamondMCPro!");

        } else {
            //Simple messages for default names
            if(playername == displayname) {

                if(player.getFirstPlayed() == 0) {
                    //First join message (Assuming the display name is the same as the player name
                    Bukkit.broadcastMessage("Give a warm welcome to " + playername + "!");
                } else {
                    //Normal join message
                    Bukkit.broadcastMessage("Welcome back, " + playername + "!");
                }
            } else {
                //If player has a different display name then player name
                Bukkit.broadcastMessage("Welcome back, " + playername + "Also known as " + displayname + "!");
            }
        }

        }
    }

