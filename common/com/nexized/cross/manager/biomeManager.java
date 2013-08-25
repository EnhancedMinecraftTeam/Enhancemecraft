package com.nexized.cross.manager;

import com.nexized.cross.conf.idManager;
import com.nexized.cross.world.biome.BiomeIceDesert;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.world.biome.BiomeGenBase;

/**Biome Manager
 * this sets up the biomes
 * you Define, add the settings to, and register biomes here
 * @author afroraydude
 */
public class biomeManager {

	//Define Biomes
	public static BiomeGenBase iceDesert;
	public static BiomeGenBase redwoodForest;
		
	// Defined Biomes(@nexized)
	//TODO: put all biomes here
	public static void addBiome(idManager idm) {
		iceDesert = (new BiomeIceDesert(idm.getBiomeID("BiomeIceDesert")).setBiomeName("Ice Desert").setMinMaxHeight(0.3F, 1.5F).setEnableSnow().setTemperatureRainfall(0.05F, 0.08F));
		//redwoodForest = (new BiomeRedwoodForest(idm.getBiomeID("BiomeRedwoodForest")).setBiomeName("Redwood Forest"));
		
		GameRegistry.addBiome(iceDesert);
		
	}
	
	
}