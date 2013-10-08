package com.emc.world.biome;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.conf.idManager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;

public class biomeManager {

	// Define Biomes
	public static BiomeGenBase iceDesert;
	public static BiomeGenBase redwoodForest;
	
	public static void addBiomes(idManager idm) {
		iceDesert = (new biomeIceDesert(idm.getBiomeID("iceDesert")).setBiomeName("Ice Desert").setMinMaxHeight(0.3F, 1.5F).setEnableSnow().setTemperatureRainfall(0.05F, 0.08F));
		redwoodForest = (new biomeRedwoodForest(idm.getBiomeID("redwoodForest")).setBiomeName("Redwood Forest"));
		GameRegistry.addBiome(iceDesert);
	}
	
}
