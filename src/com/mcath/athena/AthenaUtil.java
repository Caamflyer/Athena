package com.mcath.athena;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class AthenaUtil {
    
    /* Using the start of someone's username, makes sure there are not two players with the same start */
    public boolean isNotMultipleByStartOfName(String start) {
        Player[] players = Bukkit.getServer().getOnlinePlayers();
        int count = 0;
        /* Cycle through each player on server, check if they match the argument */
        for(Player pl : players) {
            int substrlen=start.length()-1;
            String plname=pl.getName();
            String plshort=plname.substring(0, substrlen);
            if(start.equalsIgnoreCase(plshort)) {
                count++;
            }
        }
        /* If only one player matches, return true */
        if(count == 1) {
            return true;
        }
        /* If any more or less than one match, return false */
        else {
            return false;
        }
    }
    
    /* Makes sure the start of the name specified matches to any online players */
    public boolean isOnline(String start) {
        Player[] players = Bukkit.getServer().getOnlinePlayers();
        int count = 0;
        /* Cycle through each player on server, check if they match the argument */
        for(Player pl : players) {
            int substrlen=start.length()-1;
            String plname=pl.getName();
            String plshort=plname.substring(0, substrlen);
            if(start.equalsIgnoreCase(plshort)) {
                count++;
            }
        }
        /* If only one player matches, return true */
        if(count==1) {
            return true;
        }
        /* If any more or less than one match, return false */
        else {
            return false;
        }
    }
    
    /* Gets the full username based on the start of it */
    public String getPlayerByStartOfName(String start) {
        Player[] players = Bukkit.getServer().getOnlinePlayers();
        String player = null;
        /* Cycle through players, checking if they match the start of name */
        for(Player pl : players) {
            int substrlen = start.length()-1;
            String plname = pl.getName();
            String plshort = plname.substring(0, substrlen);
            if(start.equalsIgnoreCase(plshort)) {
                player = pl.getName();
            }
        }
        return player;
    }
    
}