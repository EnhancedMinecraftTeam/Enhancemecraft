package com.nexized.cross.manager;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class configManager {

	public static int MinerID;
	public static boolean enableMobs;
	public static int oreAluminumID;
	
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load();
		MinerID = config.get("Mob", "Miner", 20).getInt();
		enableMobs = config.get("Enable/Disable", "Mobs", true).getBoolean(true);
		oreAluminumID = config.get("Blocks", "Aluminum Ore", 500).getInt();
		config.save();
	}
}
