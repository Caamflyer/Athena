package com.mcath.athena.commands.handlers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class PermaCmdHandler {
    
    private CommandSender sender;
    private Command cmd;
    private String[] args;

    public PermaCmdHandler(CommandSender sender,Command cmd,String[] args) {
        this.sender = sender;
        this.cmd = cmd;
        this.args = args;
    }

}
