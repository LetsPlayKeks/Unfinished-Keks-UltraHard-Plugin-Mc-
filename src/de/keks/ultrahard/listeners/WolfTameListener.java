package de.keks.ultrahard.listeners;

import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class WolfTameListener implements Listener{
	
	@EventHandler
	public void onWolfTame(EntityTameEvent event) {
		if(event.getEntity() instanceof Wolf) {
			Wolf wolf = (Wolf)event.getEntity();
			wolf.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 2));
			wolf.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 999999, 2));
			wolf.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 999999, 2));
			wolf.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999, 2));
		}
	}

}
