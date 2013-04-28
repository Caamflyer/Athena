package com.mcath.athena;

import org.bukkit.plugin.java.JavaPlugin;
import com.mcath.athena.commands.PunishCommands;
import com.mcath.athena.punishments.FrozenPlayerInteractListener;
import java.util.ArrayList;
import java.util.HashSet;

public class Athena extends JavaPlugin {
    
    private static ArrayList<String> frozen = new ArrayList<String>();

    public static ArrayList<String> getFrozenHash() {
        return frozen;
    }

    public static void setFrozenHash(ArrayList<String> frozen) {
        Athena.frozen = frozen;
    }
    
    public static boolean isFrozenHash(String s) {
        return Athena.frozen.contains(s);
    }

    @Override
    public void onEnable() {
        this.getCommand("freeze").setExecutor(new PunishCommands(this));
        this.getServer().getPluginManager().registerEvents(new FrozenPlayerInteractListener(), this);
        Athena.getFrozenHash().clear();
    }
    
    @Override
    public void onDisable() {
        Athena.getFrozenHash().clear();
    }
    
}
