package com.nexized.cross.manager;

import java.io.File;

import com.nexized.cross.conf.idManager;
import com.nexized.cross.world.biome.BiomeIceDesert;
import com.nexized.cross.world.biome.BiomeRedwoodForest;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
/**
 * 
 * @author afroraydude
 * @author nexized
 * @author @afroraydude
 * @author @nexized
 *
 */

public class biomeManager {
	
	// Define Biomes
	public static BiomeGenBase iceDesert;
	public static BiomeGenBase redwoodForest;
		
	// Defined Biomes(@nexized)
	//TODO: put all biomes here
	public static void init() {
		iceDesert = (new BiomeIceDesert(configManager.iceb).setBiomeName("Ice Desert").setMinMaxHeight(0.3F, 1.5F).setEnableSnow().setTemperatureRainfall(0.05F, 0.08F));
		redwoodForest = (new BiomeRedwoodForest(configManager.redwoodb).setBiomeName("Redwood Forest"));
		GameRegistry.addBiome(iceDesert);
	}
	
	
}
