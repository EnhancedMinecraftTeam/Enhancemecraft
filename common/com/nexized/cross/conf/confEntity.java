package com.nexized.cross.conf;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class confEntity {
	
	// @oreBlocks
	public int oreAluminumID = 500;
	public int oreCopperID = 501;
	public int orePlatinumID = 502;
	public int oreSilverID = 503;
	public int oreTinID = 504;
	public int oreExperienceID = 505;
	
	// @ingotBlocks
	public int blockAluminumID = 510;
	public int blockCopperID = 511;
	public int blockPlatinumID = 512;
	public int blockSilverID = 513;
	public int blockSteelID = 514;
	public int blockTinID = 515;
	public int blockBronzeID = 515;
	
	// @addBlocks
	public int blockFosilID = 520;
	public int blockFreezerID = 521;
	public int blockCloudID = 522;
	public int blockBucketID = 523;

	// @fusionFurnance
	public int furnanceFusionID = 530;
	public int furnanceFusionOnID = 531;
	
	//@itemTools
	public int axeAluminumID = 4000;
	public int axeCopperID = 4001;
	public int axePlatinumID = 4002;
	public int axeSilverID = 4003;
	public int axeSteelID = 4004;
	public int axeTinID = 4005;
	public int axeBronzeID = 4006;
	
	public int hoeAluminumID = 4010;
	public int hoeCopperID = 4011;
	public int hoePlatinumID = 4012;
	public int hoeSilverID = 4013;
	public int hoeSteelID = 4014;
	public int hoeTinID = 4015;
	public int hoeBronzeID = 4016;
	
	public int shovelAluminumID = 4020;
	public int shovelCopperID = 4021;
	public int shovelPlatinumID = 4022;
	public int shovelSilverID = 4023;
	public int shovelSteelID = 4024;
	public int shovelTinID = 4025;
	public int shovelBronzeID = 4026;
	
	public int pickAluminumID = 4030;
	public int pickCopperID = 4031;
	public int pickPlatinumID = 4032;
	public int pickSilverID = 4033;
	public int pickSteelID = 4034;
	public int pickTinID = 4035;
	public int pickBronzeID = 4036;
	
	public int swordAluminumID = 4040;
	public int swordCopperID = 4041;
	public int swordPlatinumID = 4042;
	public int swordSilverID = 4043;
	public int swordSteelID = 4044;
	public int swordTinID = 4045;
	public int swordBronzeID = 4046;
	
	//@item Armors
	public int helmAluminumID = 4050;
	public int helmCopperID = 4051;
	public int helmPlatinumID = 4052;
	public int helmSilverID = 4053;
	public int helmSteelID = 4054;
	public int helmTinID = 4055;
	public int helmBronzeID = 4056;
	
	public int chestAluminumID = 4060;
	public int chestCopperID = 4061;
	public int chestPlatinumID = 4062;
	public int chestSilverID = 4063;
	public int chestSteelID = 4064;
	public int chestTinID = 4065;
	public int chestBronzeID = 4066;
	
	public int legsAluminumID = 4070;
	public int legsCopperID = 4071;
	public int legsPlatinumID = 4072;
	public int legsSilverID = 4073;
	public int legsSteelID = 4074;
	public int legsTinID = 4075;
	public int legsBronzeID = 4076;
	
	public int bootsAluminumID = 4080;
	public int bootsCopperID = 4081;
	public int bootsPlatinumID = 4082;
	public int bootsSilverID = 4083;
	public int bootsSteelID = 4084;
	public int bootsTinID = 4085;
	public int bootsBronzeID = 4086;

	// @itemIngot
	public int ingotAluminumID = 4090;
	public int ingotCopperID = 4091;
	public int ingotPlatinumID = 4092;
	public int ingotSilverID = 4093;
	public int ingotSteelID = 4094;
	public int ingotTinID = 4095;
	public int ingotBronzeID = 4096;
	
	// @itemFood
	public int foodRawbaconID = 4100;
	public int foodBaconID = 4101;
	
	// @itemShard
	public int shardAluminumID = 4200;
	public int shardCopperID = 4201;
	public int shardPlatinumID = 4203;
	public int shardSilverID = 4204;
	public int shardSteelID = 4205;
	public int shardTinID = 4206;
	public int shardBronzeID = 4207;
	
	// @itemDust
	public int dustAluminumID = 4210;
	public int dustCopperID = 4211;
	public int dustPlatinumID = 4213;
	public int dustSilverID = 4214;
	public int dustSteelID = 4215;
	public int dustTinID = 4216;
	public int dustBronzeID = 4217;
	public int dustIronID = 4218;
	
	public void runTask(FMLPreInitializationEvent event) {
		
		// @Configuration Initialization
		Configuration conf = new Configuration(event.getSuggestedConfigurationFile());

		// @Load Configuration
		conf.load();
		
		// @oreBlocks
		oreAluminumID = conf.getBlock("oreBlock", "Aluminum Ore", oreAluminumID).getInt();
		oreCopperID = conf.getBlock("oreBlock", "Copper Ore", oreCopperID).getInt();
		orePlatinumID = conf.getBlock("oreBlock", "Platinum Ore", orePlatinumID).getInt();
		oreSilverID = conf.getBlock("oreBlock", "Silver Ore", oreSilverID).getInt();
		oreTinID = conf.getBlock("oreBlock", "Tin Ore", oreTinID).getInt();
		oreExperienceID = conf.getBlock("oreBlock", "Experience Ore", oreExperienceID).getInt();
		
		// @ingotBlocks
		blockAluminumID = conf.getBlock("ingotBlock", "Aluminum Block", blockAluminumID).getInt();
		blockCopperID = conf.getBlock("ingotBlock", "Copper Block", blockCopperID).getInt();
		blockPlatinumID = conf.getBlock("ingotBlock", "Platinum Block", blockPlatinumID).getInt();
		blockSilverID = conf.getBlock("ingotBlock", "Silver Block", blockSilverID).getInt();
		blockSteelID = conf.getBlock("ingotBlock", "Steel Block", blockSteelID).getInt();
		blockTinID = conf.getBlock("ingotBlock", "Tin Block", blockTinID).getInt();
		
		// @addBlocks
		blockFosilID = conf.getBlock("oreBlock", "Fosil Block", blockFosilID).getInt();
		blockFreezerID = conf.getBlock("biomeBlock", "Freezer Block", blockFreezerID).getInt();
		blockCloudID = conf.getBlock("biomeBlock", "Cloud Block", blockCloudID).getInt();
		
		// @Furnances
		furnanceFusionID = conf.getBlock("furnances", "Fusion Furnance", furnanceFusionID ).getInt();
		furnanceFusionOnID = conf.getBlock("furnances", "Fusion Furnance onState", furnanceFusionOnID ).getInt();
		
		// @itemTools
		axeAluminumID = conf.getItem("toolAxe", "Aluminum Axe", axeAluminumID).getInt();
		axeCopperID = conf.getItem("toolAxe", "Copper Axe", axeCopperID).getInt();
		axePlatinumID = conf.getItem("toolAxe", "Platinum Axe", axePlatinumID).getInt();
		axeSilverID = conf.getItem("toolAxe", "Silver Axe", axeSilverID).getInt();
		axeSteelID = conf.getItem("toolAxe", "Steel Axe", axeSteelID).getInt();
		axeTinID = conf.getItem("toolAxe", "Tin Axe", axeTinID).getInt();
		
		hoeAluminumID = conf.getItem("toolHoe", "Aluminum Hoe", hoeAluminumID).getInt();
		hoeCopperID = conf.getItem("toolHoe", "Copper Hoe", hoeCopperID).getInt();
		hoePlatinumID = conf.getItem("toolHoe", "Platinum Hoe", hoePlatinumID).getInt();
		hoeSilverID = conf.getItem("toolHoe", "Silver Hoe", hoeSilverID).getInt();
		hoeSteelID = conf.getItem("toolHoe", "Steel Hoe", hoeSteelID).getInt();
		hoeTinID = conf.getItem("toolHoe", "Tin Hoe", hoeTinID).getInt();
		
		shovelAluminumID = conf.getItem("toolShovel", "Aluminum Shovel", shovelAluminumID).getInt();
		shovelCopperID = conf.getItem("toolShovel", "Copper Shovel", shovelCopperID).getInt();
		shovelPlatinumID = conf.getItem("toolShovel", "Platinum Shovel", shovelPlatinumID).getInt();
		shovelSilverID = conf.getItem("toolShovel", "Silver Shovel", shovelSilverID).getInt();
		shovelSteelID = conf.getItem("toolShovel", "Steel Shovel", shovelSteelID).getInt();
		shovelTinID = conf.getItem("toolShovel", "Tin Shovel", shovelTinID).getInt();
		
		pickAluminumID = conf.getItem("toolPick", "Aluminum Pick", pickAluminumID).getInt();
		pickCopperID = conf.getItem("toolPick", "Copper Pick", pickCopperID).getInt();
		pickPlatinumID = conf.getItem("toolPick", "Platinum Pick", pickPlatinumID).getInt();
		pickSilverID = conf.getItem("toolPick", "Silver Pick", pickSilverID).getInt();
		pickSteelID = conf.getItem("toolPick", "Steel Pick", pickSteelID).getInt();
		pickTinID = conf.getItem("toolPick", "Tin Pick", pickTinID).getInt();
		
		swordAluminumID = conf.getItem("toolSword", "Aluminum Sword", swordAluminumID).getInt();
		swordCopperID = conf.getItem("toolSword", "Copper Sword", swordCopperID).getInt();
		swordPlatinumID = conf.getItem("toolSword", "Platinum Sword", swordPlatinumID).getInt();
		swordSilverID = conf.getItem("toolSword", "Silver Sword", swordSilverID).getInt();
		swordSteelID = conf.getItem("toolSword", "Steel Sword", swordSteelID).getInt();
		swordTinID = conf.getItem("toolSword", "Tin Sword", swordTinID).getInt();
		
		helmAluminumID = conf.getItem("armorHelm", "Aluminum Helm", helmAluminumID).getInt();
		helmCopperID = conf.getItem("armorHelm", "Copper Helm", helmCopperID).getInt();
		helmPlatinumID = conf.getItem("armorHelm", "Platinum Helm", helmPlatinumID).getInt();
		helmSilverID = conf.getItem("armorHelm", "Silver Helm", helmSilverID).getInt();
		helmSteelID = conf.getItem("armorHelm", "Steel Helm", helmSteelID).getInt();
		helmTinID = conf.getItem("armorHelm", "Tin Helm", helmTinID).getInt();
		
		chestAluminumID = conf.getItem("armorChest", "Aluminum Chest", chestAluminumID).getInt();
		chestCopperID = conf.getItem("armorChest", "Copper Chest", chestCopperID).getInt();
		chestPlatinumID = conf.getItem("armorChest", "Platinum Chest", chestPlatinumID).getInt();
		chestSilverID = conf.getItem("armorChest", "Silver Chest", chestSilverID).getInt();
		chestSteelID = conf.getItem("armorChest", "Steel Chest", chestSteelID).getInt();
		chestTinID = conf.getItem("armorChest", "Tin Chest", chestTinID).getInt();
		
		legsAluminumID = conf.getItem("armorLegs", "Aluminum Legs", legsAluminumID).getInt();
		legsCopperID = conf.getItem("armorLegs", "Copper Legs", legsCopperID).getInt();
		legsPlatinumID = conf.getItem("armorLegs", "Platinum Legs", legsPlatinumID).getInt();
		legsSilverID = conf.getItem("armorLegs", "Silver Legs", legsSilverID).getInt();
		legsSteelID = conf.getItem("armorLegs", "Steel Legs", legsSteelID).getInt();
		legsTinID = conf.getItem("armorLegs", "Tin Legs", legsTinID).getInt();
		
		bootsAluminumID = conf.getItem("armorBoots", "Aluminum Boots", bootsAluminumID).getInt();
		bootsCopperID = conf.getItem("armorBoots", "Copper Boots", bootsCopperID).getInt();
		bootsPlatinumID = conf.getItem("armorBoots", "Platinum Boots", bootsPlatinumID).getInt();
		bootsSilverID = conf.getItem("armorBoots", "Silver Boots", bootsSilverID).getInt();
		bootsSteelID = conf.getItem("armorBoots", "Steel Boots", bootsSteelID).getInt();
		bootsTinID = conf.getItem("armorBoots", "Tin Boots", bootsTinID).getInt();
		
		// @itemIngot
		ingotAluminumID = conf.getItem("itemIngot", "Aluminum Ingot", ingotAluminumID).getInt();
		ingotCopperID = conf.getItem("itemIngot", "Copper Ingot", ingotCopperID).getInt();
		ingotPlatinumID = conf.getItem("itemIngot", "Platinum Ingot", ingotPlatinumID).getInt();
		ingotSilverID = conf.getItem("itemIngot", "Silver Ingot", ingotSilverID).getInt();
		ingotSteelID = conf.getItem("itemIngot", "Steel Ingot", ingotSteelID).getInt();
		ingotTinID = conf.getItem("itemIngot", "Tin Ingot", ingotTinID).getInt();
		
		// @itemFood
		foodRawbaconID = conf.getItem("itemFood", "Raw Bacon", foodRawbaconID).getInt();
		foodBaconID = conf.getItem("itemFood", "Bacon", foodBaconID).getInt();
		
		// @itemShard
		shardAluminumID = conf.getItem("itemShard", "Aluminum Shard", shardAluminumID).getInt();
		shardCopperID = conf.getItem("itemShard", "Copper Shard", shardCopperID).getInt();
		shardPlatinumID = conf.getItem("itemShard", "Platinum Shard", shardPlatinumID).getInt();
		shardSilverID = conf.getItem("itemShard", "Silver Shard", shardSilverID).getInt();
		shardSteelID = conf.getItem("itemShard", "Steel Shard", shardSteelID).getInt();
		shardTinID = conf.getItem("itemShard", "Tin Shard", shardTinID).getInt();
		
		// @itemDust
		dustAluminumID = conf.getItem("itemDust", "Aluminum Dust", dustAluminumID).getInt();
		dustCopperID = conf.getItem("itemDust", "Copper Dust", dustCopperID).getInt();
		dustPlatinumID = conf.getItem("itemDust", "Platinum Dust", dustPlatinumID).getInt();
		dustSilverID = conf.getItem("itemDust", "Silver Dust", dustSilverID).getInt();
		dustSteelID = conf.getItem("itemDust", "Steel Dust", dustSteelID).getInt();
		dustTinID = conf.getItem("itemDust", "Tin Dust", dustTinID).getInt();
		
		// Save Configuration
		conf.save();
	}
	
}
