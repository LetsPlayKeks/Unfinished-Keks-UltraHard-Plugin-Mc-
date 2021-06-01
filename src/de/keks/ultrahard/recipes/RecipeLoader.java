package de.keks.ultrahard.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
//import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class RecipeLoader {

	public void registerRecipes() {
		
		/*ItemStack parachute = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta parachuteMeta = parachute.getItemMeta();
		parachuteMeta.setDisplayName("§lLets you glide in the Air.");
		parachute.setItemMeta(parachuteMeta);
		
		@SuppressWarnings("deprecation")
		ShapelessRecipe parachuteRecipe = new ShapelessRecipe(parachute);
		parachuteRecipe.addIngredient(Material.LEATHER);*/
		
		ItemStack dog = new ItemStack(Material.WOLF_SPAWN_EGG);
		ItemMeta dogMeta = dog.getItemMeta();
		dog.setItemMeta(dogMeta);
		
		@SuppressWarnings("deprecation")
		ShapedRecipe dogRecipe = new ShapedRecipe(dog);
		dogRecipe.shape("GGG", "LLB", "LGL");
		dogRecipe.setIngredient('G', Material.GRAY_CARPET);
		//L = Leder/Leather
		dogRecipe.setIngredient('L', Material.LEATHER);
		dogRecipe.setIngredient('B', Material.BONE);
		//S = Faden/String
		//dogRecipe.setIngredient('S', Material.STRING);
		
		
		Bukkit.addRecipe(dogRecipe);
		
	}
	
}
