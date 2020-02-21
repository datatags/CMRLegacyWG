package me.AlanZ.CMRLegacyWG;

import org.bukkit.plugin.java.JavaPlugin;

import me.AlanZ.CommandMineRewards.worldguard.WorldGuardManager;

public class CMRLegacyWG extends JavaPlugin {
	
	public void onEnable() {
		if (WorldGuardManager.getWGMajorVersion() == 6) {
			getLogger().info("Registering RegionChecker...");
			WorldGuardManager.registerRegionChecker(new RegionCheckerWG6x());
		} else {
			getLogger().warning("CMRLegacyWG does not work in this version!");
		}
	}
}
