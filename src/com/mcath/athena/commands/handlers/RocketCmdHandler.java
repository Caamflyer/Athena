package com.mcath.athena.commands.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class RocketCmdHandler
{

	private CommandSender sender;
	private String[] args;

	public RocketCmdHandler(CommandSender sender, String[] args)
	{
		this.sender = sender;
		this.args = args;
	}

	public void handle()
	{
		if(!args[0].equalsIgnoreCase("*"))
		{
			Player pl = Bukkit.getServer().getPlayer(args[0]);
			String pldisplay = pl.getDisplayName();
			if(pl.isOnGround()) // DEPRECATED
			{
				pl.setVelocity(new Vector(0, 9, 0));
				pl.sendMessage(ChatColor.GREEN + sender.getName() + " has rocketed you!");
				sender.sendMessage(ChatColor.GREEN + "You have successfully rocketed " + pldisplay);
			}
			else
			{
				sender.sendMessage(ChatColor.RED + "This user was not on the ground, therefore you cannot rocket them, please try again later!");
			}
		}
		else
		{
			int rocketed = 0;
			int failed = 0;
			for(Player p : Bukkit.getOnlinePlayers())
			{
				if(p.isOnGround()) // DEPRECATED
				{
					p.setVelocity(new Vector(0, 9, 0));
					p.sendMessage(ChatColor.GREEN + sender.getName() + " has rocketed you!");
					rocketed++;
				}
				else
				{
					failed++;
				}
			}
			sender.sendMessage(ChatColor.GREEN + "You have successfully rocketed " + ChatColor.DARK_GREEN + rocketed + ChatColor.GREEN + " players, " + ChatColor.RED + failed + " people did not get rocketed.");
		}
	}

}
