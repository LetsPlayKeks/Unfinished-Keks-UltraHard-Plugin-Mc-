package de.keks.ultrahard.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class ObsidianBreakListener implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		if(event.getBlock().getType() == Material.OBSIDIAN || event.getBlock().getType() == Material.CRYING_OBSIDIAN) {
			if(event.getPlayer().getInventory().contains(Material.DIAMOND_PICKAXE)) {
				if(event.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_PICKAXE)) {
				event.getPlayer().getInventory().remove(Material.DIAMOND_PICKAXE);
				event.getPlayer().sendMessage("Obsidian is really hard, isn't it?");
				}

			}
		}
		
	}

}
