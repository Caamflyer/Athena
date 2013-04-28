package com.mcath.athena.commands;

import com.mcath.athena.Athena;
import com.mcath.athena.AthenaUtil;
import java.util.HashMap;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FreezeCmdHandler {
    
    private CommandSender sender;
    private String[] args;
    private AthenaUtil util=new AthenaUtil();
    
    private final static String FROZEN_PLAYER=ChatColor.GREEN+"You have frozen ";
    private final static String FROZEN_YOU=ChatColor.GOLD+"You have been frozen!";

    public FreezeCmdHandler(CommandSender sender,String[] args) {
        this.sender=sender;
        this.args=args;
    }
    
    public void handle() {
        String player=util.getPlayerByStartOfName(args[0]);
        Player pl=Bukkit.getServer().getPlayer(args[0]);
        String pldisplay=pl.getDisplayName();
        Athena.getFrozenHash().add(player);
        sender.sendMessage(FROZEN_PLAYER+pldisplay);
        pl.sendMessage(FROZEN_YOU);
    }

}