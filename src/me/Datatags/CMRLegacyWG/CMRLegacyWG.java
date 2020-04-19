package me.Datatags.CMRLegacyWG;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.Datatags.CommandMineRewards.CommandMineRewards;
import me.Datatags.CommandMineRewards.worldguard.WorldGuardManager;

public class CMRLegacyWG extends JavaPlugin {
	
	public void onEnable() {
		CommandMineRewards cmr = (CommandMineRewards) Bukkit.getPluginManager().getPlugin("CommandMineRewards");
		WorldGuardManager wgm = cmr.getWGManager();
		if (wgm.getWGMajorVersion() == 6) {
			getLogger().info("Registering RegionChecker...");
			wgm.registerRegionChecker(new RegionCheckerWG6x());
		} else {
			getLogger().warning("CMRLegacyWG does not work with this version of WorldGuard!");
		}
	}
}
