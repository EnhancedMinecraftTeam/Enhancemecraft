package com.nexized.emec.common.instance;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class configurationHandler {

	// @Configuration
	Configuration commonConfiguration;
	
	// @BlockID
	public int oreAluminiumID = 500;
	public int oreCopperID = 501;
	public int orePlatinumID = 502;
	public int oreSilverID = 503;
	public int oreTinID = 504;
	public int oreFossilID = 511;
	public int oreExpID = 512;
	
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
	public int axeSteelID = 3010;
	public int axeTinID = 3011;
	public int hoeAluminiumID = 3012;
	public int hoeCopperID = 3013;
	public int hoePlatinumID = 3014;
	public int hoeSilverID = 3015;
	public int hoeSteelID = 3016;
	public int hoeTinID = 3017;
	public int pickAluminiumID = 3018;
	public int pickCopperID = 3019;
	public int pickPlatinumID = 3020;
	public int pickSilverID = 3021;
	public int pickSteelID = 3022;
	public int pickTinID = 3023;
	public int shovelAluminiumID = 3024;
	public int shovelCopperID = 3025;
	public int shovelPlatinumID = 3026;
	public int shovelSilverID = 3027;
	public int shovelSteelID = 3028;
	public int shovelTinID = 3029;
	public int swordAluminiumID = 3030;
	public int swordCopperID = 3031;
	public int swordPlatinumID = 3032;
	public int swordSilverID = 3033;
	public int swordSteelID = 3034;
	public int swordTinID = 3035;
	public int helmetCopperID = 3036;
	public int helmetSteelID = 3040;
	public int chestplateCopperID = 3037;
	public int chestplateSteelID = 3041;
	public int legginsCopperID = 3038;
	public int legginsSteelID = 3042;
	public int bootsCopperID = 3039;
	public int bootsSteelID = 3043;
	
	// @Constructor
	public configurationHandler(FMLPreInitializationEvent event) {
		// @Initialize
		commonConfiguration = new Configuration(event.getSuggestedConfigurationFile());
		// @Load
		commonConfiguration.load();
		
		// @Ore Block
		this.oreAluminiumID = commonConfiguration.getBlock("Aluminium Ore", oreAluminiumID).getInt();
		this.oreCopperID = commonConfiguration.getBlock("Copper Ore", oreCopperID).getInt();
		this.orePlatinumID = commonConfiguration.getBlock("Platinum Ore", orePlatinumID).getInt();
		this.oreSilverID = commonConfiguration.getBlock("Silver Ore", oreSilverID).getInt();
		this.oreTinID = commonConfiguration.getBlock("Tin Ore", oreTinID).getInt();
		this.oreFossilID = commonConfiguration.getBlock("Fosil Ore", oreFossilID).getInt();
		this.oreExpID = commonConfiguration.getBlock("Experience Ore", oreExpID).getInt();
		
		// @Ingot Block
		this.blockAluminiumID = commonConfiguration.getBlock("Aluminium Block", blockAluminiumID).getInt();
		this.blockCopperID = commonConfiguration.getBlock("Copper Block", blockCopperID).getInt();
		this.blockPlatinumID = commonConfiguration.getBlock("Platinum Block", blockPlatinumID).getInt();
		this.blockSilverID = commonConfiguration.getBlock("Silver Block", blockSilverID).getInt();
		this.blockSteelID = commonConfiguration.getBlock("Steel Block", blockSteelID).getInt();
		this.blockTinID = commonConfiguration.getBlock("Tin Block", blockTinID).getInt();
			
		// @Ingot Item
		this.ingotAluminiumID = commonConfiguration.getBlock("Aluminium Ingot", ingotAluminiumID).getInt();
		this.ingotCopperID = commonConfiguration.getBlock("Copper Ingot", ingotCopperID).getInt();
		this.ingotPlatinumID = commonConfiguration.getBlock("Platinum Ingot", ingotPlatinumID).getInt();
		this.ingotSilverID = commonConfiguration.getBlock("Silver Ingot", ingotSilverID).getInt();
		this.ingotSteelID = commonConfiguration.getBlock("Steel Ingot", ingotSteelID).getInt();
		this.ingotTinID = commonConfiguration.getBlock("Tin Ingot", ingotTinID).getInt();
		
		// @Tools Axe
		this.axeAluminiumID = commonConfiguration.getBlock("Aluminium Axe", axeAluminiumID).getInt();
		this.axeCopperID = commonConfiguration.getBlock("Copper Axe", axeCopperID).getInt();
		this.axePlatinumID = commonConfiguration.getBlock("Platinum Axe", axePlatinumID).getInt();
		this.axeSilverID = commonConfiguration.getBlock("Silver Axe", axeSilverID).getInt();
		this.axeSteelID = commonConfiguration.getBlock("Steel Axe", axeSteelID).getInt();
		this.axeTinID = commonConfiguration.getBlock("Tin Axe", axeTinID).getInt();
		
		// @Tools Hoe
		this.hoeAluminiumID = commonConfiguration.getBlock("Aluminium Hoe", hoeAluminiumID).getInt();
		this.hoeCopperID = commonConfiguration.getBlock("Copper Hoe", hoeCopperID).getInt();
		this.hoePlatinumID = commonConfiguration.getBlock("Platinum Hoe", hoePlatinumID).getInt();
		this.hoeSilverID = commonConfiguration.getBlock("Silver Hoe", hoeSilverID).getInt();
		this.hoeSteelID = commonConfiguration.getBlock("Steel Hoe", hoeSteelID).getInt();
		this.hoeTinID = commonConfiguration.getBlock("Tin Hoe", hoeTinID).getInt();
		
		// @Tools Pickaxe
		this.pickAluminiumID = commonConfiguration.getBlock("Aluminium Pick", pickAluminiumID).getInt();
		this.pickCopperID = commonConfiguration.getBlock("Copper Pick", pickCopperID).getInt();
		this.pickPlatinumID = commonConfiguration.getBlock("Platinum Pick", pickPlatinumID).getInt();
		this.pickSilverID = commonConfiguration.getBlock("Silver Pick", pickSilverID).getInt();
		this.pickSteelID = commonConfiguration.getBlock("Steel Pick", pickSteelID).getInt();
		this.pickTinID = commonConfiguration.getBlock("Tin Pick", pickTinID).getInt();
		
		// @Tools Shovel
		this.shovelAluminiumID = commonConfiguration.getBlock("Aluminium Shovel", shovelAluminiumID).getInt();
		this.shovelCopperID = commonConfiguration.getBlock("Copper Shovel", shovelCopperID).getInt();
		this.shovelPlatinumID = commonConfiguration.getBlock("Platinum Shovel", shovelPlatinumID).getInt();
		this.shovelSilverID = commonConfiguration.getBlock("Silver Shovel", shovelSilverID).getInt();
		this.shovelSteelID = commonConfiguration.getBlock("Steel Shovel", shovelSteelID).getInt();
		this.shovelTinID = commonConfiguration.getBlock("Tin Shovel", shovelTinID).getInt();
		
		// @Weapons Sword
		this.swordAluminiumID = commonConfiguration.getBlock("Aluminium Sword", swordAluminiumID).getInt();
		this.swordCopperID = commonConfiguration.getBlock("Copper Sword", swordCopperID).getInt();
		this.swordPlatinumID = commonConfiguration.getBlock("Platinum Sword", swordPlatinumID).getInt();
		this.swordSilverID = commonConfiguration.getBlock("Silver Sword", swordSilverID).getInt();
		this.swordSteelID = commonConfiguration.getBlock("Steel Sword", swordSteelID).getInt();
		this.swordTinID = commonConfiguration.getBlock("Tin Sword", swordTinID).getInt();
		
		// @Armor Helmet
		this.helmetCopperID = commonConfiguration.getBlock("Copper Helmet", helmetCopperID).getInt();
		this.helmetSteelID = commonConfiguration.getBlock("Steel Helmet", helmetSteelID).getInt();
		// @Armor Chestplate
		this.chestplateCopperID = commonConfiguration.getBlock("Copper Chestplate", chestplateCopperID).getInt();
		this.chestplateSteelID = commonConfiguration.getBlock("Steel Chestplate", chestplateSteelID).getInt();
		// @Armor Leggins
		this.legginsCopperID = commonConfiguration.getBlock("Copper Leggings", legginsCopperID).getInt();
		this.legginsSteelID = commonConfiguration.getBlock("Steel Leggings", legginsSteelID).getInt();
		// @Armor Boots
		this.bootsCopperID = commonConfiguration.getBlock("Copper Boots", bootsCopperID).getInt();
		this.bootsSteelID = commonConfiguration.getBlock("Steel Boots", bootsSteelID).getInt();
		// @Save
		commonConfiguration.save();
	}

}
