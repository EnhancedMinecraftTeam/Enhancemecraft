package com.nexized.cross.conf;

import java.io.File;

import com.nexized.cross.lib.libInfo;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class idManager {
	
	private File idmConfigurationFile;
	private Configuration idmConfiguration;
	
	private int minBlockID = 500;
	private int minItemID = 4000;
	private int minBiomeID = 100;
	
	private int currentBlockID = 0;
	private int currentItemID = 0;
	private int currentBiomeID = 0;
		
	public idManager(FMLPreInitializationEvent event) 
	{
		idmConfigurationFile = new File(event.getModConfigurationDirectory(), "/crossLib/idManager.cfg");
		idmConfiguration = new Configuration(idmConfigurationFile);		
		idmConfiguration.load();		
		
		this.currentBlockID = minBlockID - 1;
		this.currentItemID = minItemID - 1;
		this.currentBiomeID = minBiomeID - 1;
		
		if (idmConfiguration.get("Version", "idmVersion", libInfo.updatedID).getInt() < libInfo.updatedID) {
			idmConfigurationFile.delete();
			idmConfiguration = new Configuration(idmConfigurationFile);
			idmConfiguration.load();
		}		
		
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
	
	public int getBlockID(String blockID) {
		return idmConfiguration.getBlock("crossBlock", blockID, getNextBlockID()).getInt();
	}
	
	public int getItemID(String itemID) {
		return idmConfiguration.getItem("crossItem", itemID, getNextItemID()).getInt();
	}
	
	public int getBiomeID(String biomeID) {
		return idmConfiguration.get("crossBiome", biomeID, getNextBiomeID()).getInt();
	}
	
	public void saveConf() {
		this.idmConfiguration.save();
	}
	
}
