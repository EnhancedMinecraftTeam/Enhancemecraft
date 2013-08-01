package com.nexized.emec.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

	// @Configuration
	Configuration commonConfiguration;
	
	// @BlockID
	public int oreAluminiumID = 500;
	public int oreCopperID = 501;
	public int orePlatinumID = 502;
	public int oreSilverID = 503;
	public int oreTinID = 504;
	
	public int blockAluminiumID = 505;
	public int blockCopperID = 506;
	public int blockPlatinumID = 507;
	public int blockSilverID = 508;
	public int blockSteelID = 509;
	public int blockTinID = 510;
		
	// @ItemID
	public int ingotAluminiumID = 3000;
	public int ingotCopperID = 3001;
	public int ingotPlatinumID = 3002;
	public int ingotSilverID = 3003;
	public int ingotSteelID = 3004;
	public int ingotTinID = 3005;
	
	public int axeAluminiumID = 3006;
	public int axeCopperID = 3007;
	public int axePlatinumID = 3008;
	public int axeSilverID = 3009;
	public int axeTinID = 3010;
	public int hoeAluminiumID = 3011;
	public int hoeCopperID = 3012;
	public int hoePlatinumID = 3013;
	public int hoeSilverID = 3014;
	public int hoeSteelID = 3015;
	public int hoeTinID = 3016;
	public int pickAluminiumID = 3017;
	public int pickCopperID = 3018;
	public int pickPlatinumID = 3019;
	public int pickSilverID = 3020;
	public int pickSteelID = 3021;
	public int pickTinID = 3022;
	public int shovelAluminiumID = 3023;
	public int shovelCopperID = 3024;
	public int shovelPlatinumID = 3025;
	public int shovelSilverID = 3026;
	public int shovelSteelID = 3027;
	public int shovelTinID = 3028;
	public int swordAluminiumID = 3029;
	public int swordCopperID = 3030;
	public int swordPlatinumID = 3031;
	public int swordSilverID = 3032;
	public int swordSteelID = 3033;
	public int swordTinID = 3034;
	
	// @Constructor
	public ConfigurationHandler(FMLPreInitializationEvent event) {
		// @Initialize
		commonConfiguration = new Configuration(event.getSuggestedConfigurationFile());
		// @Load
		commonConfiguration.load();
		this.oreAluminiumID = commonConfiguration.getBlock("Aluminium Ore", oreAluminiumID).getInt();
		this.oreCopperID = commonConfiguration.getBlock("Copper Ore", oreCopperID).getInt();
		this.orePlatinumID = commonConfiguration.getBlock("Platinum Ore", orePlatinumID).getInt();
		this.oreSilverID = commonConfiguration.getBlock("Silver Ore", oreSilverID).getInt();
		this.oreTinID = commonConfiguration.getBlock("Tin Ore", oreTinID).getInt();
		
		this.blockAluminiumID = commonConfiguration.getBlock("Aluminium Block", blockAluminiumID).getInt();
		
		this.ingotAluminiumID = commonConfiguration.getBlock("Aluminium Ingot", ingotAluminiumID).getInt();
		
		this.axeAluminiumID = commonConfiguration.getBlock("Aluminium Axe", axeAluminiumID).getInt();
		
		this.hoeAluminiumID = commonConfiguration.getBlock("Aluminium Hoe", hoeAluminiumID).getInt();
		
		this.pickAluminiumID = commonConfiguration.getBlock("Aluminium Pick", pickAluminiumID).getInt();
		
		this.shovelAluminiumID = commonConfiguration.getBlock("Aluminium Shovel", shovelAluminiumID).getInt();
		
		this.swordAluminiumID = commonConfiguration.getBlock("Aluminium Sword", swordAluminiumID).getInt();
		// @Save
		commonConfiguration.save();
	}

}
