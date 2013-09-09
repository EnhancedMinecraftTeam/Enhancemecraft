package com.nexized.emec.configuration;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod.EventHandler;

public class emecConfigurationFile {
	
	public static int MinerID;
	public static boolean enableMobs;
	public static int oreAluminumID;
	public static int iceb;
	public static int redwoodb;
	public static boolean enableBiomes;
	public static boolean enableafroitems;
	public static boolean enable040Blocks;
		
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load();
		
		enableBiomes = config.get("Enable/Disable", "Biomes", true).getBoolean(true);
		enableafroitems = config.get("Enable/Disable", "0.4.0 Items", true).getBoolean(true);
		enableMobs = config.get("Enable/Disable", "Mobs", true).getBoolean(true);
		
		MinerID = config.get("Mob", "Miner", 30).getInt();
		
		oreAluminumID = config.get("Blocks", "Aluminum Ore", 1100).getInt();
		
		redwoodb = config.get("Biomes", "Redwood", 150).getInt();
		iceb = config.get("Biomes", "Ice", 151).getInt();
		
		config.save();
	}
}
