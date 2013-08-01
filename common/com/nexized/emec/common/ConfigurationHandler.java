package com.nexized.emec.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

	// @Configuration
	Configuration commonConfiguration;
	
	// @BlockID
	
	// @ItemID
	
	// @Constructor
	public ConfigurationHandler(FMLPreInitializationEvent event) {
		// @Initialize
		commonConfiguration = new Configuration(event.getSuggestedConfigurationFile());
		// @Load
		commonConfiguration.load();
		// @getConfiguration
		
		// @Save
		commonConfiguration.save();
	}

}
