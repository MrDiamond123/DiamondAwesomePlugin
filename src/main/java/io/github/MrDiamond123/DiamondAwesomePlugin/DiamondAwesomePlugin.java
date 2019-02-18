package io.github.MrDiamond123.DiamondAwesomePlugin;

import io.github.MrDiamond123.DiamondAwesomePlugin.commands.CommandFly;
import io.github.MrDiamond123.DiamondAwesomePlugin.commands.CommandStatus;

import org.bukkit.plugin.java.JavaPlugin;

public class DiamondAwesomePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("This great plugin, which was coded by DiamondMCPro, is now enabled!");

        //COMMANDS
        this.getCommand("dfly").setExecutor(new CommandFly());
        this.getCommand("dstatus").setExecutor(new CommandStatus());

        //EVENTS
        getServer().getPluginManager().registerEvents(new DiamondSometimesListens(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("This great plugin, which was coded by DiamondMCPro, is now disabled!");
    }

}
