package de.keks.ultrahard.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.keks.ultrahard.main.Main;

public class PlayerMoveListener implements Listener{
	
	private int partyCounter;
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		if(player.isSprinting()) {
			
			partyCounter = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
			int partyCount = 190; // 190 seconds
			@Override
			public void run() {
				
					if(partyCount < 1) {
						player.sendMessage("You are all ok again.");
						Bukkit.getScheduler().cancelTask(partyCounter);
					}
					else if(partyCount == 10) {
						
						player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 2));
						player.sendMessage("You need a pause for breath.");
						player.sendMessage("Just don't sprint like a cheetah.");
						

					
				}if (partyCount < 191) {
					partyCount = partyCount -1;
				}
			}
			}, 0, 20);
			}
	
			}
			
			

}
