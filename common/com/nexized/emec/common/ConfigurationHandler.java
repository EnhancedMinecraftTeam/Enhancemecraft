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
	public int axePlatinumID = 3001;
	public int hoePlatinumID = 3002;
	public int pickPlatinumID = 3003;
	public int shovelPlatinumID = 3004;
	public int swordPlatinumID = 3005;
	
	// @Constructor
	public ConfigurationHandler(FMLPreInitializationEvent event) {
		// @Initialize
		commonConfiguration = new Configuration(event.getSuggestedConfigurationFile());
		// @Load
		commonConfiguration.load();
		// @getConfiguration
		this.blockPlatinumID = commonConfiguration.getBlock("Platinum Block", blockPlatinumID).getInt();
		this.orePlatinumID = commonConfiguration.getBlock("Platinum Ore", orePlatinumID).getInt();
		this.ingotPlatinumID = commonConfiguration.getBlock("Platinum Ingot", ingotPlatinumID).getInt();
		this.axePlatinumID = commonConfiguration.getBlock("Platinum Axe", axePlatinumID).getInt();
		this.hoePlatinumID = commonConfiguration.getBlock("Platinum Hoe", hoePlatinumID).getInt();
		this.pickPlatinumID = commonConfiguration.getBlock("Platinum Pick", pickPlatinumID).getInt();
		this.shovelPlatinumID = commonConfiguration.getBlock("Platinum Shovel", shovelPlatinumID).getInt();
		this.swordPlatinumID = commonConfiguration.getBlock("Platinum Sword", swordPlatinumID).getInt();
		// @Save
		commonConfiguration.save();
	}

}
