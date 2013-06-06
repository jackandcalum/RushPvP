package me.weecazza.RushPvP;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPvP extends JavaPlugin {
	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("Enabled");
		
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Disabled");
		
	}

}
