package de.keks.ultrahard.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerSleepListener implements Listener{
	
	@EventHandler
	public void onPlayerSleep(PlayerBedEnterEvent event) {
		event.setCancelled(true);
		
	}

}
