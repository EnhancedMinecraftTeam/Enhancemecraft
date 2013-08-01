package com.nexized.emec.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

	// @Configuration
	Configuration commonConfiguration;
	
	// @BlockID
	public int orePlatinumID = 500;
	public int blockPlatinumID = 501;
	
	// @ItemID
	public int ingotPlatinumID = 3000;
	
	// @Constructor
	public ConfigurationHandler(FMLPreInitializationEvent event) {
		// @Initialize
		commonConfiguration = new Configuration(event.getSuggestedConfigurationFile());
		// @Load
		commonConfiguration.load();
		// @getConfiguration
		this.blockPlatinumID = commonConfiguration.getBlock("Platinum Block", blockPlatinumID).getInt();
		this.orePlatinumID = commonConfiguration.getBlock("Platinum Ore", orePlatinumID).getInt();
		// @Save
		commonConfiguration.save();
	}

}
