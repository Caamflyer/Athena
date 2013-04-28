package com.mcath.athena.punishments;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class WarnCmdHandler {
    
    private CommandSender sender;
    private Command cmd;
    private String[] args;

    public WarnCmdHandler(CommandSender sender,Command cmd,String[] args) {
        this.sender=sender;
        this.cmd=cmd;
        this.args=args;
    }

}
