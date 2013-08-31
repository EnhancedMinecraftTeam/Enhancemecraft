package com.nexized.cross.manager;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class configManager {

	public static int MinerID;
	public static boolean enableMobs;
	public static int oreAluminumID;
	public static int iceb;
	public static int redwoodb;
	public static boolean enableBiomes;
	public static int emeraldshardblockID;
	public static int emeraldshardID;
	public static boolean enableafroitems;
	
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load();
		enableBiomes = config.get("Enable/Disable", "Biomes", true).getBoolean(true);
		emeraldshardID = config.get("Items", "Emerald Shard", 1102).getInt();
		enableafroitems = config.get("Enable/Disable", "0.4.0 Items", true).getBoolean(true);
		MinerID = config.get("Mob", "Miner", 20).getInt();
		enableMobs = config.get("Enable/Disable", "Mobs", true).getBoolean(true);
		oreAluminumID = config.get("Blocks", "Aluminum Ore", 1100).getInt();
		redwoodb = config.get("Biomes", "Redwood", 150).getInt();
		iceb = config.get("Biomes", "Ice", 151).getInt();
		emeraldshardblockID = config.get("Blocks", "Emerald Shard Ore", 1101).getInt();
		config.save();
	}
}
