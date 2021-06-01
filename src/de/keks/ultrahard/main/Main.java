package de.keks.ultrahard.main;


import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import de.keks.ultrahard.recipes.RecipeLoader;
import de.keks.ultrahard.listeners.MobSpawnListener;
import de.keks.ultrahard.listeners.ObsidianBreakListener;
//import de.keks.ultrahard.listeners.PlayerDamageListener;
//import de.keks.ultrahard.listeners.PlayerMoveListener;
import de.keks.ultrahard.listeners.PlayerSleepListener;
import de.keks.ultrahard.listeners.PlayerWearArmorListener;
import de.keks.ultrahard.listeners.RespawnListener;
//import de.keks.ultrahard.listeners.WolfTameListener;

import org.bukkit.plugin.PluginManager;



public class Main extends JavaPlugin {
	
	public ArrayList<Player> players;
	private static Main plugin;
	
	public void onEnable() {
		plugin = this;
		
		players = new ArrayList<>();
		new RecipeLoader().registerRecipes();
		
		System.out.println("PLUGIN WURDE GELADEN!");
		System.out.println("Kekse sind lecker!");
		
		//getCommand("command").setExecutor(new Class Name());
		
		PluginManager pluginManager = Bukkit.getPluginManager();

		pluginManager.registerEvents(new RespawnListener(), this);
		pluginManager.registerEvents(new MobSpawnListener(), this);
		pluginManager.registerEvents(new PlayerSleepListener(), this);
		pluginManager.registerEvents(new PlayerWearArmorListener(), this);
		//pluginManager.registerEvents(new WolfTameListener(), this);
		//pluginManager.registerEvents(new PlayerDamageListener(), this);
		pluginManager.registerEvents(new ObsidianBreakListener(), this);
		//pluginManager.registerEvents(new PlayerMoveListener(), this);
		
		//pluginManager.registerEvents(new Class Name(this), this);
		//pluginManager.registerEvents(new Class Name(), this);
		
	
	}
	
	public static Main getPlugin() {
		return plugin;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
}
