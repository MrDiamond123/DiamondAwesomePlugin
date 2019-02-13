package io.github.MrDiamond123.DiamondAwesomePlugin;

import io.github.MrDiamond123.DiamondAwesomePlugin.commands.CommandFly;
import org.bukkit.plugin.java.JavaPlugin;

public class DiamondAwesomePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("This great plugin, which was coded by DiamondMCPro, is now enabled!");

        //COMMANDS
        this.getCommand("dfly").setExecutor(new CommandFly());

        //EVENTS
        getServer().getPluginManager().registerEvents(new DiamondSometimesListens(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("This great plugin, which was coded by DiamondMCPro, is now disabled!");
    }

}
