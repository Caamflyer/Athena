package com.mcath.athena.commands.handlers;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.mcath.athena.Athena;

public class ReportsCmdHandler
{
	private CommandSender sender;
    private String[] args;
    
	private Athena a;
	private static ArrayList<String> reports = new ArrayList<String>();
    
	public ReportsCmdHandler(Athena ath) {
        a = ath;
    }
	
    public ReportsCmdHandler(CommandSender sender, String[] args) {
        this.sender = sender;
        this.args = args;
    }
    
    public void handle()
    {
    	for(String s : reports)
    	{
    		sender.sendMessage(s);
    	}
    }
    
	public static int getReportsSize()
    {
    	return reports.size();
    }
    
    public static void trimReports()
    {
    	if(getReportsSize() >= 10)
    		reports.trimToSize();
    	else
    		return;
    }
    
    public static void newReport(String reporter, String reported, String reason)
    {
    	reports.add(ChatColor.GOLD + reporter + ChatColor.GRAY + " is reporting " + ChatColor.GOLD + reported + ChatColor.GRAY + " for " + reason);
    	if(!Athena.getReportsReceivers().isEmpty())
    	{
    		for(String s : Athena.getReportsReceivers())
    		{
    			Player p = Bukkit.getPlayerExact(s);
    			p.sendMessage(ChatColor.GOLD + "[REPORT] " + ChatColor.RED + reporter + ChatColor.GRAY + " is reporting " + ChatColor.RED + reported + ChatColor.GRAY + " for " + reason);
    		}
    	}
    	trimReports();
    }
}
