package com.emc.conf;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-16
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.io.File;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class idManager {

	private File subConfigurationFile;
	private Configuration subConfiguration;
	
	private File idmConfigurationFile;
	private Configuration idmConfiguration;
	
	private int minBlockID = 500;
	private int minItemID = 4000;
	private int minBiomeID = 100;
	private int minEntityID = 20;
	
	private int currentBlockID = 0;
	private int currentItemID = 0;
	private int currentBiomeID = 0;
	private int currentEntityID = 0;
		
	public idManager(FMLPreInitializationEvent event) 
	{
		idmConfigurationFile = new File(event.getModConfigurationDirectory(), "/emcLib/idManager.cfg");
		idmConfiguration = new Configuration(idmConfigurationFile);		
		idmConfiguration.load();		
		
		subConfigurationFile = event.getSuggestedConfigurationFile();
		subConfiguration = new Configuration(subConfigurationFile);
		subConfiguration.load();
		
		this.currentBlockID = minBlockID - 1;
		this.currentItemID = minItemID - 1;
		this.currentBiomeID = minBiomeID - 1;
		this.currentEntityID = minEntityID -1;
		
		// TODO: Implement a new method of version management 
		
		idmConfiguration.save();
	}
	
	private int getNextBlockID() {
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
	
	public void saveConf() {
		this.idmConfiguration.save();
		this.subConfiguration.save();
	}
	
	public boolean ifEnabled(String subElement) {
		boolean ret = subConfiguration.get("enabledModules", subElement, true).getBoolean(true);
		subConfiguration.save();
		return ret;
	}
	
}
