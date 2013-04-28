package com.mcath.athena.punishments;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class PunishCmdHandler {
    
    private CommandSender sender;
    private Command cmd;
    private String[] args;

    public PunishCmdHandler(CommandSender sender,Command cmd,String[] args) {
        this.sender=sender;
        this.cmd=cmd;
        this.args=args;
    }

}
