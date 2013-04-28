package com.mcath.athena;

import org.bukkit.plugin.java.JavaPlugin;
import com.mcath.athena.commands.PunishCommands;
import com.mcath.athena.punishments.FrozenPlayerInteractListener;
import java.util.HashSet;

public class Athena extends JavaPlugin {
    
    private static HashSet<String> frozen=new HashSet<>();

    public static HashSet<String> getFrozenHash() {
        return frozen;
    }

    public static void setFrozenHash(HashSet<String> frozen) {
        Athena.frozen = frozen;
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
