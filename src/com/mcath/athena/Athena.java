package com.mcath.athena;

import org.bukkit.plugin.java.JavaPlugin;
import com.mcath.athena.commands.PunishCommands;
import com.mcath.athena.punishments.FrozenPlayerInteractListener;
import java.util.ArrayList;
import java.util.HashSet;

public class Athena extends JavaPlugin {
    
    private static ArrayList<String> frozen = new ArrayList<String>();
    private static ArrayList<String> reportReceivers = new ArrayList<String>();

    public static ArrayList<String> getFrozenHash() {
        return frozen;
    }

    public static void setFrozenHash(ArrayList<String> frozen) {
        Athena.frozen = frozen;
    }
    
    public static boolean isFrozenHash(String s) {
        return Athena.frozen.contains(s);
    }
    
    public static ArrayList<String> getReportsReceivers()
    {
    	return reportReceivers;
    }

    @Override
    public void onEnable() {
        this.getCommand("freeze").setExecutor(new PunishCommands(this));
        this.getCommand("rocket").setExecutor(new PunishCommands(this));
        this.getCommand("report").setExecutor(new PunishCommands(this));
        this.getCommand("reports").setExecutor(new PunishCommands(this));
        this.getServer().getPluginManager().registerEvents(new FrozenPlayerInteractListener(), this);
        Athena.getFrozenHash().clear();
    }
    
    @Override
    public void onDisable() {
        Athena.getFrozenHash().clear();
    }
    
}
