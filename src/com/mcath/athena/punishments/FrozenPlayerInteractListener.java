package com.mcath.athena.punishments;

import com.mcath.athena.Athena;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class FrozenPlayerInteractListener implements Listener {
    
    private boolean frozen(String plname) {
        return Athena.getFrozenHash().contains(plname);
    }
    
    @EventHandler(priority=EventPriority.MONITOR)
    public void playerMove(PlayerMoveEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            Location loc=e.getFrom();
            Location locto=e.getTo();
            float yaw=locto.getYaw();
            float pitch=locto.getPitch();
            loc.setYaw(yaw);
            loc.setPitch(pitch);
            e.setTo(loc);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void bedEnter(PlayerBedEnterEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void bucketFill(PlayerBucketFillEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void dropItem(PlayerDropItemEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void pickupItem(PlayerPickupItemEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void playerFish(PlayerFishEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void playerInteract(PlayerInteractEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void itemChange(PlayerItemHeldEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void playerShear(PlayerShearEntityEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void blockBreak(BlockBreakEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void blockPlace(BlockPlaceEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void blockIgnite(BlockIgniteEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void singInteract(SignChangeEvent e) {
        String plname=e.getPlayer().getName();
        if(frozen(plname)) {
            e.setCancelled(true);
        }
    }
    
}
