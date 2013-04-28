package com.mcath.athena.punishments;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class TempCmdHandler {
    
    private CommandSender sender;
    private Command cmd;
    private String[] args;

    public TempCmdHandler(CommandSender sender,Command cmd,String[] args) {
        this.sender = sender;
        this.cmd = cmd;
        this.args = args;
    }

}
