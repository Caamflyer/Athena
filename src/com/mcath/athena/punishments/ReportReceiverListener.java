package com.mcath.athena.punishments;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.mcath.athena.Athena;

public class ReportReceiverListener implements Listener
{
	
	@EventHandler
	public void ReportReceiverLogin(PlayerJoinEvent e)
	{
		if(e.getPlayer().hasPermission("athena.punish.reports"))
		{
			Athena.getReportsReceivers().add(e.getPlayer().getName());
		}
	}
	
	@EventHandler
	public void ReportReceiverQuit(PlayerQuitEvent e)
	{
		if(e.getPlayer().hasPermission("athena.punish.reports"))
		{
			Athena.getReportsReceivers().remove(e.getPlayer().getName());
		}
	}
}
