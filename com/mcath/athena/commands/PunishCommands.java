package com.mcath.athena.commands;

import com.mcath.athena.Athena;
import com.mcath.athena.AthenaUtil;
import com.mcath.athena.punishments.KickCmdHandler;
import com.mcath.athena.punishments.PermaCmdHandler;
import com.mcath.athena.punishments.PunishCmdHandler;
import com.mcath.athena.punishments.TempCmdHandler;
import com.mcath.athena.punishments.WarnCmdHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PunishCommands implements CommandExecutor {

    private Athena a;
    private PunishCmdHandler pch;
    private KickCmdHandler kch;
    private PermaCmdHandler pbch;
    private WarnCmdHandler wch;
    private TempCmdHandler tch;
    private FreezeCmdHandler fch;
    private AthenaUtil util=new AthenaUtil();
    
    public PunishCommands(Athena ath) {
        a=ath;
    }
    
    private final static String MULTIPLE_PLAYERS=ChatColor.RED+"Multiple players found. Please be more specific with the name you are specifying!";
    private final static String NOT_ONLINE=ChatColor.RED+"Player not found on the server. Please make sure you are typing the name correctly!";
    private final static String NO_PERMS=ChatColor.RED+"You have no permissions to do this!";
    private final static String TOO_MANY_ARGS=ChatColor.RED+"Too many arguments!";
    private final static String TOO_LITTLE_ARGS=ChatColor.RED+"Too little arguments!";
    private final static String CORRECT_FREEZE_USAGE=ChatColor.RED+"Correct usage: /freeze [username]";
    
    @Override
    public boolean onCommand(CommandSender sender,Command cmd,String alias,String[] args) {
        pch=new PunishCmdHandler(sender,cmd,args);
        kch=new KickCmdHandler(sender,cmd,args);
        pbch=new PermaCmdHandler(sender,cmd,args);
        wch=new WarnCmdHandler(sender,cmd,args);
        tch=new TempCmdHandler(sender,cmd,args);
        fch=new FreezeCmdHandler(sender,args);
        /* Plugin decides on a punishment */
        if("punish".equals(cmd.getName())) {
            
        }
        
        /* Kick handling */
        if("kick".equals(cmd.getName())) {
            
        }
        
        /* Permanently bans a player */
        if("permaban".equals(cmd.getName())) {
            
        }
        
        /* Bans a player for 7 days */
        if("tempban".equals(cmd.getName())) {
            
        }
        
        /* Warns a player */
        if("warn".equals(cmd.getName())) {
            
        }
        
        /* Freezes a player */
        if("freeze".equals(cmd.getName())) {
            if(args.length<1) {
                sender.sendMessage(TOO_LITTLE_ARGS);
            }
            else if(args.length>1) {
                sender.sendMessage(TOO_MANY_ARGS);
            }
            else {
                if(sender.hasPermission("athena.punish.freeze")) {
                    fch.handle();
                }
                else {
                    sender.sendMessage(NO_PERMS);
                }
            }
        }
        return true;
    }
    
}