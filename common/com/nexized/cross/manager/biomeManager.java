package com.nexized.cross.manager;

import java.io.File;

import com.nexized.cross.conf.idManager;
import com.nexized.cross.world.biome.BiomeIceDesert;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
@Mod (modid = "emecBiomes", name = "§6§kEnhancemecraft Biomes Mod", version = "§k1.6.2")
/*
 * Author: nexized
 * Last changed: 2013-08-18 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

public class biomeManager {
	
	private static int iceb;
	private static int redwoodb;
	

	public void initConfiguration(FMLInitializationEvent event){
		Configuration config = new Configuration(new File("config/Enhancemecraft/Biomes.cfg"));
		config.load();
		redwoodb = config.get("Biomes", "Redwood", 150).getInt();
		iceb = config.get("Biomes", "Ice", 151).getInt();
		config.save();
	}
	
	// Define Biomes
	public static BiomeGenBase iceDesert;
	public static BiomeGenBase redwoodForest;
		
	// Defined Biomes(@nexized)
	//TODO: put all biomes here
	public void Load(FMLInitializationEvent event) {
		this.initConfiguration(event);
		iceDesert = (new BiomeIceDesert(this.iceb).setBiomeName("Ice Desert").setMinMaxHeight(0.3F, 1.5F).setEnableSnow().setTemperatureRainfall(0.05F, 0.08F));
		//redwoodForest = (new BiomeRedwoodForest(idm.getBiomeID("BiomeRedwoodForest")).setBiomeName("Redwood Forest"));
		GameRegistry.addBiome(iceDesert);
		
	}
	
	
}