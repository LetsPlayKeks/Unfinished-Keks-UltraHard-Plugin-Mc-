package de.keks.ultrahard.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerDamageListener implements Listener{
	
	@EventHandler
	public void onPlayerTakeDamage(EntityDamageByBlockEvent event) {
		if(event.getEntity() instanceof Player) {
			if(event.getDamager().getType().equals(Material.SWEET_BERRY_BUSH)) {
				Player player = (Player) event.getEntity();
				player.sendMessage("You are bleeding...");
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 30, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 30, 2));
			}
		}
		
	}
	@EventHandler
	public void onPlayerTakeDamage(EntityDamageByEntityEvent event) {
		if(event.getEntity() instanceof Player) {
		 Player player = (Player) event.getEntity();
		 if(player.getHealth() == 5.0) {
			player.sendMessage("You are bleeding...");
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 30, 3));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 30, 2));
			
			

			
			
		 }
		}
		
	}

}
