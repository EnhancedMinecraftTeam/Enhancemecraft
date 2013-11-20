package com.emc.conf;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-10-06
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class idManager {

	// subConfiguration (@/config/emc.cfg)
	private File subConfigurationFile;
	private Configuration subConfiguration;
	
	// idmConfiguration (@/config/emc/idManager.cfg)
	private File idmConfigurationFile;
	private Configuration idmConfiguration;
	
	// min id (for autoincrement)
	private int minBlockID = 300;
	private int minItemID = 4000;
	private int minBiomeID = 100;
	private int minEntityID = 20;
	private int minFoodID = 2020;
	
	// current id (for autoincrement)
	private int currentBlockID = 0; 
	private int currentItemID = 0;
	private int currentBiomeID = 0;
	private int currentEntityID = 0;
	private int currentFoodID = 2020;
	
	public idManager(FMLPreInitializationEvent event) 
	{
		// idManager configuration
		idmConfigurationFile = new File(event.getModConfigurationDirectory(), "/emc/idManager.cfg");
		idmConfiguration = new Configuration(idmConfigurationFile);		
		idmConfiguration.load();		
		
		// Sub configuration
		subConfigurationFile = event.getSuggestedConfigurationFile();
		subConfiguration = new Configuration(subConfigurationFile);
		subConfiguration.load();
		
		// Current ID
		currentBlockID = idmConfiguration.get("idManager", "minBlockID", minBlockID + 1).getInt();
		currentItemID = idmConfiguration.get("idManager", "minItemID", minItemID + 1).getInt(); 
		currentBiomeID = idmConfiguration.get("idManager", "minBiomeID", minBiomeID + 1).getInt();
		currentEntityID = idmConfiguration.get("idManager", "minEntityID", minEntityID + 1).getInt();
		currentFoodID = idmConfiguration.get("idManager", "minFoodID", minFoodID + 1).getInt(2020);
		
		// Save configuration
		idmConfiguration.save();
		subConfiguration.save();
	}
	
	public int getNextBlockID() {
		this.currentBlockID = this.currentBlockID + 1;
		return this.currentBlockID;
	}
	
	private int getNextItemID() {
		this.currentItemID = this.currentItemID + 1;
		return this.currentItemID;
	}
	
	private int getNextBiomeID() {
		this.currentBiomeID = this.currentBiomeID + 1;
		return this.currentBiomeID;
	}
	
	private int getNextEntityID() {
		this.currentEntityID = this.currentEntityID + 1;
		return this.currentEntityID;
	}
	
	public int getFoodID() {
		this.currentFoodID = this.currentFoodID + 1;
		return this.currentFoodID;
	}
	
	public int getBlockID(String blockID) {
		return idmConfiguration.getBlock("emcBlock", blockID, getNextBlockID()).getInt();
	}
	
	public int getItemID(String itemID) {
		return idmConfiguration.getItem("emcItem", itemID, getNextItemID()).getInt();
	}
	
	public int getBiomeID(String biomeID) {
		return idmConfiguration.get("emcBiome", biomeID, getNextBiomeID()).getInt();
	}
	
	public int getEntityID(String entityID) {
		return idmConfiguration.get("emcMob", entityID, getNextEntityID()).getInt();
	}
	
	public int getFoodID(String foodID) {
		return idmConfiguration.get("emcFood", foodID, getNextItemID()).getInt();
	}
	public void saveConf() {
		this.idmConfiguration.save();
		this.subConfiguration.save();
	}
	
	public boolean ifEnabled(String subElement) {
		boolean ret = subConfiguration.get("enabledModules", subElement, true).getBoolean(true);
		subConfiguration.save();
		return ret;
	}
	
	public int getTemperature(String Biome, int defaultTemperature) { 
		int ret = subConfiguration.get("biomeTemperatures", Biome, defaultTemperature).getInt();
		subConfiguration.save();
		return ret;
	}

	
}
