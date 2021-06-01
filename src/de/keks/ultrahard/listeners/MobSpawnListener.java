package de.keks.ultrahard.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class MobSpawnListener implements Listener{
	
	@EventHandler
	public void onMobSpawn (CreatureSpawnEvent event) {
		if(event.getEntity() instanceof Zombie) {
			Zombie zombie = (Zombie)event.getEntity();
			zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1, true));
			zombie.getEquipment().setHelmet(new ItemStack (Material.IRON_HELMET));
			zombie.getEquipment().setChestplate(new ItemStack (Material.IRON_CHESTPLATE));
			zombie.getEquipment().setLeggings(new ItemStack (Material.IRON_LEGGINGS));
			zombie.getEquipment().setBoots(new ItemStack (Material.IRON_BOOTS));
			
		}
		if(event.getEntity() instanceof Skeleton) {
			Skeleton skeleton = (Skeleton)event.getEntity();
			
			skeleton.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1, true));
			skeleton.getEquipment().setHelmet(new ItemStack (Material.IRON_HELMET));
			skeleton.getEquipment().setChestplate(new ItemStack (Material.IRON_CHESTPLATE));
			skeleton.getEquipment().setLeggings(new ItemStack (Material.IRON_LEGGINGS));
			skeleton.getEquipment().setBoots(new ItemStack (Material.IRON_BOOTS));
			
			ItemStack itemStack = new ItemStack(Material.BOW);
			itemStack.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
			
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.setUnbreakable(true);
			
			itemStack.setItemMeta(itemMeta);
			skeleton.getEquipment().setItemInMainHand(itemStack);
		}
		if(event.getEntity() instanceof Creeper) {
			Creeper creeper = (Creeper)event.getEntity();
			creeper.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1, true));
			creeper.setPowered(true);
			creeper.setExplosionRadius(5);
			
		}
		if(event.getEntity() instanceof Spider) {
			Spider spider = (Spider)event.getEntity();
			spider.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1, true));
		}
		
	}

}
