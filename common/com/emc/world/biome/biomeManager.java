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
	public static BiomeGenBase Volcan;
	public static BiomeGenBase Oasis;
	
	public static void addBiomes(idManager idm) {
		iceDesert = (new biomeIceDesert(idm.getBiomeID("iceDesert")).setBiomeName("Ice Desert").setMinMaxHeight(0.3F, 1.5F).setEnableSnow().setTemperatureRainfall(0.05F, 0.08F));
		GameRegistry.addBiome(iceDesert);
		Volcan = (new biomeVolcan(idm.getBiomeID("Volcan")).setBiomeName("Volcan").setMinMaxHeight(0.4F, 1.7F));
		GameRegistry.addBiome(Volcan);
	}
	
}
