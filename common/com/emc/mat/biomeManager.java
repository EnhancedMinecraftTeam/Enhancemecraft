package com.emc.mat;

import java.io.File;

import com.emc.newthings.common.configManager;
import com.emc.world.biome.*;
import com.emc.*;

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
	public static BiomeGenBase doOctoBase;
		
	// Defined Biomes
	//TODO: Red rock mountains and canyons, Redwood forests(requires custom trees), Oasis, City(Can we really do this?), Wheat fields, Savanna(requires custom trees), Floating islands(Can we really do this?), Subway tunnels(This is not even a biome!!!), and Fairie Forest
	public static void init() {
		iceDesert = (new BiomeIceDesert(configManager.iceb).setBiomeName("Ice Desert").setMinMaxHeight(0.3F, 1.5F).setEnableSnow().setTemperatureRainfall(0.05F, 0.08F));
		redwoodForest = (new BiomeRedwoodForest(configManager.redwoodb).setBiomeName("Redwood Forest"));
		doOctoBase = (new BiomeDoOctoBase(100).setBiomeName("Tutorial").setMinMaxHeight(0.3F, 0.31F));
		GameRegistry.addBiome(iceDesert);
		GameRegistry.addBiome(doOctoBase);
		
		
	}
	
	
}