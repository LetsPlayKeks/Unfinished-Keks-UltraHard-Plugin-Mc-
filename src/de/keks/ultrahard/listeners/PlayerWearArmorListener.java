package de.keks.ultrahard.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerWearArmorListener implements Listener{

	@EventHandler
	public void onPlayerClickOnArmor(PlayerInteractEvent event) {
		if(event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK)) return;
		if(event.getItem() == null) return;
		if(event.getItem().getType() == null) return;
		if(
		event.getItem().getType() == Material.NETHERITE_HELMET || event.getItem().getType() == Material.NETHERITE_CHESTPLATE || 
		event.getItem().getType() == Material.NETHERITE_LEGGINGS || event.getItem().getType() == Material.NETHERITE_BOOTS || 
		
		event.getItem().getType() == Material.DIAMOND_HELMET || event.getItem().getType() == Material.DIAMOND_CHESTPLATE || 
		event.getItem().getType() == Material.DIAMOND_LEGGINGS || event.getItem().getType() == Material.DIAMOND_BOOTS || 
		
		event.getItem().getType() == Material.IRON_HELMET || event.getItem().getType() == Material.IRON_CHESTPLATE || 
		event.getItem().getType() == Material.IRON_LEGGINGS || event.getItem().getType() == Material.IRON_BOOTS || 
		
		event.getItem().getType() == Material.GOLDEN_HELMET || event.getItem().getType() == Material.GOLDEN_CHESTPLATE || 
		event.getItem().getType() == Material.GOLDEN_LEGGINGS || event.getItem().getType() == Material.GOLDEN_BOOTS || 
		
		event.getItem().getType() == Material.CHAINMAIL_HELMET || event.getItem().getType() == Material.CHAINMAIL_CHESTPLATE || 
		event.getItem().getType() == Material.CHAINMAIL_LEGGINGS || event.getItem().getType() == Material.CHAINMAIL_BOOTS 
		) {
			event.setCancelled(true);
			return;
		}
		


	}
	
	@EventHandler
	public void onPlayerWearArmor(InventoryClickEvent event) {
		if(
		event.getCurrentItem().getType() == Material.NETHERITE_HELMET || event.getCurrentItem().getType() == Material.NETHERITE_CHESTPLATE || 
		event.getCurrentItem().getType() == Material.NETHERITE_LEGGINGS || event.getCurrentItem().getType() == Material.NETHERITE_BOOTS || 
				
		event.getCurrentItem().getType() == Material.DIAMOND_HELMET || event.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE || 
		event.getCurrentItem().getType() == Material.DIAMOND_LEGGINGS || event.getCurrentItem().getType() == Material.DIAMOND_BOOTS || 
				
		event.getCurrentItem().getType() == Material.IRON_HELMET || event.getCurrentItem().getType() == Material.IRON_CHESTPLATE || 
		event.getCurrentItem().getType() == Material.IRON_LEGGINGS || event.getCurrentItem().getType() == Material.IRON_BOOTS || 
				
		event.getCurrentItem().getType() == Material.GOLDEN_HELMET || event.getCurrentItem().getType() == Material.GOLDEN_CHESTPLATE || 
		event.getCurrentItem().getType() == Material.GOLDEN_LEGGINGS || event.getCurrentItem().getType() == Material.GOLDEN_BOOTS || 
				
		event.getCurrentItem().getType() == Material.CHAINMAIL_HELMET || event.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE || 
		event.getCurrentItem().getType() == Material.CHAINMAIL_LEGGINGS || event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS || 
				
		event.getCurrentItem().getType() == Material.LEATHER_HELMET || event.getCurrentItem().getType() == Material.LEATHER_CHESTPLATE || 
		event.getCurrentItem().getType() == Material.LEATHER_LEGGINGS || event.getCurrentItem().getType() == Material.LEATHER_BOOTS
		) {
			event.setCancelled(true);
			return;
		}
		
	}
	
}
