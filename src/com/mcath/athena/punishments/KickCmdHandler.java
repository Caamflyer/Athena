package com.mcath.athena.punishments;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class KickCmdHandler {
    
    private CommandSender sender;
    private Command cmd;
    private String[] args;

    public KickCmdHandler(CommandSender sender,Command cmd,String[] args) {
        this.sender = sender;
        this.cmd = cmd;
        this.args = args;
    }

}
