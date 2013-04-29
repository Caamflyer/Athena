package com.mcath.athena.commands.handlers;

import java.util.ArrayList;

import org.bukkit.command.CommandSender;

import com.mcath.athena.Athena;

public class ReportCmdHandler 
{
	private CommandSender sender;
    private String[] args;
    
	private Athena a;
	public ReportCmdHandler(Athena ath) {
        a = ath;
    }
	
    public ReportCmdHandler(CommandSender sender, String[] args) {
        this.sender = sender;
        this.args = args;
    }
    
    public void handle()
    {
    	StringBuilder reason = new StringBuilder();
    	for(int i = 1; i <= (args.length - 1); i++)
    	{
    		reason.append(args[i] + " ");
    	}
    	ReportsCmdHandler.newReport(sender.getName(), args[0], reason.toString());
    	
    }
}
