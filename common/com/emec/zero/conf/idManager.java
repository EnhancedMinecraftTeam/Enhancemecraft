package com.emec.zero.conf;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class idManager {

	// configuration
	private File idmConfigurationFile;
	private Configuration idmConfiguration;
	
	// min block id
	private int minBlockID = 500;
	// min item id
	private int minItemID = 4000;
	
	// value for current block
	private int currentBlockID = 0;
	// value for current item
	private int currentItemID = 0;
	
	public idManager(FMLPreInitializationEvent event) 
	{
		
		idmConfigurationFile = new File(event.getModConfigurationDirectory(), 
				"/emecZero/idManager.cfg");
		idmConfiguration = new Configuration(idmConfigurationFile);		
		idmConfiguration.load();		
		
		this.currentBlockID = minBlockID - 1;
		this.currentItemID = minItemID - 1;	
		
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
	
	public int getBlockID(String blockID) {
		return idmConfiguration.getBlock("emecBlock", blockID, getNextBlockID()).getInt();
	}
	
	public int getItemID(String itemID) {
		return idmConfiguration.getItem("emecItem", itemID, getNextItemID()).getInt();
	}

	public void saveConf() {
		this.idmConfiguration.save();
	}
	
}
