package com.nexized.cross.conf;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class confLocalisation {

		// @oreBlocks
		public String oreAluminumName = "";
		public String oreCopperName= "";
		public String orePlatinumName= "";
		public String oreSilverName= "";
		public String oreTinName= "";
		public String oreExperienceName= "";
		
		// @ingotBlocks
		public String blockAluminumName= "";
		public String blockCopperName= "";
		public String blockPlatinumName= "";
		public String blockSilverName= "";
		public String blockSteelName= "";
		public String blockTinName= "";
		
		// @addBlocks
		public String blockFosilName= "";
		
		//@itemTools
		public String axeAluminumName= "";
		public String axeCopperName= "";
		public String axePlatinumName= "";
		public String axeSilverName= "";
		public String axeSteelName= "";
		public String axeTinName= "";
		
		public String hoeAluminumName= "";
		public String hoeCopperName= "";
		public String hoePlatinumName= "";
		public String hoeSilverName= "";
		public String hoeSteelName= "";
		public String hoeTinName= "";
		
		public String shovelAluminumName= "";
		public String shovelCopperName= "";
		public String shovelPlatinumName= "";
		public String shovelSilverName= "";
		public String shovelSteelName= "";
		public String shovelTinName= "";
		
		public String pickAluminumName= "";
		public String pickCopperName= "";
		public String pickPlatinumName= "";
		public String pickSilverName= "";
		public String pickSteelName= "";
		public String pickTinName= "";
		
		public String swordAluminumName= "";
		public String swordCopperName= "";
		public String swordPlatinumName= "";
		public String swordSilverName= "";
		public String swordSteelName= "";
		public String swordTinName= "";
		
		//@item Armors
		public String helmAluminumName= "";
		public String helmCopperName= "";
		public String helmPlatinumName= "";
		public String helmSilverName= "";
		public String helmSteelName= "";
		public String helmTinName= "";
		
		public String chestAluminumName= "";
		public String chestCopperName= "";
		public String chestPlatinumName= "";
		public String chestSilverName= "";
		public String chestSteelName= "";
		public String chestTinName= "";
		
		public String legsAluminumName= "";
		public String legsCopperName= "";
		public String legsPlatinumName= "";
		public String legsSilverName= "";
		public String legsSteelName= "";
		public String legsTinName= "";
		
		public String bootsAluminumName= "";
		public String bootsCopperName= "";
		public String bootsPlatinumName= "";
		public String bootsSilverName= "";
		public String bootsSteelName= "";
		public String bootsTinName= "";
		
		// @itemIngot
		public String ingotAluminumName= "";
		public String ingotCopperName= "";
		public String ingotPlatinumName= "";
		public String ingotSilverName= "";
		public String ingotSteelName= "";
		public String ingotTinName= "";
	
		public void runTask(FMLPreInitializationEvent event) {
			
			// @Configuration Initialization
			Configuration conf = new Configuration(event.getSuggestedConfigurationFile());
			
			// @Load Configuration
			conf.load();
			
			oreAluminumName = conf.get("blockName", "oreAluminum", "Aluminum Ore").getString();
			oreCopperName = conf.get("blockName", "oreCopper", "Copper Ore").getString();
			orePlatinumName = conf.get("blockName", "orePlatinum", "Platinum Ore").getString();
			oreSilverName = conf.get("blockName", "oreSilver", "Silver Ore").getString();
			oreTinName = conf.get("blockName", "oreTin", "Tin Ore").getString();
			
			blockAluminumName = conf.get("blockName", "blockAluminum", "Aluminum Block").getString();
			blockCopperName = conf.get("blockName", "blockCopper", "Copper Block").getString();
			blockPlatinumName = conf.get("blockName", "blockPlatinum", "Platinum Block").getString();
			blockSilverName = conf.get("blockName", "blockSilver", "Silver Block").getString();
			blockSteelName = conf.get("blockName", "blockSteel", "Steel Block").getString();
			blockTinName = conf.get("blockName", "blockTin", "Tin Block").getString();
			blockFosilName = conf.get("blockName", "blockFosil", "Fosil Block").getString();
			
			axeAluminumName = conf.get("itemName", "axeAluminum", "Aluminum Axe").getString();
			axeCopperName = conf.get("itemName", "axeCopper", "Copper Axe").getString();
			axePlatinumName = conf.get("itemName", "axePlatinum", "Platinum Axe").getString();
			axeSilverName = conf.get("itemName", "axeSilver", "Silver Axe").getString();
			axeSteelName = conf.get("itemName", "axeSteel", "Steel Axe").getString();
			axeTinName = conf.get("itemName", "axeTin", "Tin Axe").getString();
			
			hoeAluminumName = conf.get("itemName", "hoeAluminum", "Aluminum Hoe").getString();
			hoeCopperName = conf.get("itemName", "hoeCopper", "Copper Hoe").getString();
			hoePlatinumName = conf.get("itemName", "hoePlatinum", "Platinum Hoe").getString();
			hoeSilverName = conf.get("itemName", "hoeSilver", "Silver Hoe").getString();
			hoeSteelName = conf.get("itemName", "hoeSteel", "Steel Hoe").getString();
			hoeTinName = conf.get("itemName", "hoeTin", "Tin Hoe").getString();
			
			shovelAluminumName = conf.get("itemName", "shovelAluminum", "Aluminum Shovel").getString();
			shovelCopperName = conf.get("itemName", "shovelCopper", "Copper Shovel").getString();
			shovelPlatinumName = conf.get("itemName", "shovelPlatinum", "Platinum Shovel").getString();
			shovelSilverName = conf.get("itemName", "shovelSilver", "Silver Shovel").getString();
			shovelSteelName = conf.get("itemName", "shovelSteel", "Steel Shovel").getString();
			shovelTinName = conf.get("itemName", "shovelTin", "Tin Shovel").getString();
			
			pickAluminumName = conf.get("itemName", "pickAluminum", "Aluminum Pick").getString();
			pickCopperName = conf.get("itemName", "pickCopper", "Copper Pick").getString();
			pickPlatinumName = conf.get("itemName", "pickPlatinum", "Platinum Pick").getString();
			pickSilverName = conf.get("itemName", "pickSilver", "Silver Pick").getString();
			pickSteelName = conf.get("itemName", "pickSteel", "Steel Pick").getString();
			pickTinName = conf.get("itemName", "pickTin", "Tin Pick").getString();
			
			swordAluminumName = conf.get("itemName", "swordAluminum", "Aluminum Sword").getString();
			swordCopperName = conf.get("itemName", "swordCopper", "Copper Sword").getString();
			swordPlatinumName = conf.get("itemName", "swordPlatinum", "Platinum Sword").getString();
			swordSilverName = conf.get("itemName", "swordSilver", "Silver Sword").getString();
			swordSteelName = conf.get("itemName", "swordSteel", "Steel Sword").getString();
			swordTinName = conf.get("itemName", "swordTin", "Tin Sword").getString();
			
			helmAluminumName = conf.get("itemName", "helmAluminum", "Aluminum Helm").getString();
			helmCopperName = conf.get("itemName", "helmCopper", "Copper Helm").getString();
			helmPlatinumName = conf.get("itemName", "helmPlatinum", "Platinum Helm").getString();
			helmSilverName = conf.get("itemName", "helmSilver", "Silver Helm").getString();
			helmSteelName = conf.get("itemName", "helmSteel", "Steel Helm").getString();
			helmTinName = conf.get("itemName", "helmTin", "Tin Helm").getString();
			
			chestAluminumName = conf.get("itemName", "chestAluminum", "Aluminum Chestplate").getString();
			chestCopperName = conf.get("itemName", "chestCopper", "Copper Chestplate").getString();
			chestPlatinumName = conf.get("itemName", "chestPlatinum", "Platinum Chestplate").getString();
			chestSilverName = conf.get("itemName", "chestSilver", "Silver Chestplate").getString();
			chestSteelName = conf.get("itemName", "chestSteel", "Steel Chestplate").getString();
			chestTinName = conf.get("itemName", "chestTin", "Tin Chestplate").getString();
			
			legsAluminumName = conf.get("itemName", "legsAluminum", "Aluminum Legs").getString();
			legsCopperName = conf.get("itemName", "legsCopper", "Copper Legs").getString();
			legsPlatinumName = conf.get("itemName", "legsPlatinum", "Platinum Legs").getString();
			legsSilverName = conf.get("itemName", "legsSilver", "Silver Legs").getString();
			legsSteelName = conf.get("itemName", "legsSteel", "Steel Legs").getString();
			legsTinName = conf.get("itemName", "legsTin", "Tin Legs").getString();
			
			bootsAluminumName = conf.get("itemName", "bootsAluminum", "Aluminum Boots").getString();
			bootsCopperName = conf.get("itemName", "bootsCopper", "Copper Boots").getString();
			bootsPlatinumName = conf.get("itemName", "bootsPlatinum", "Platinum Boots").getString();
			bootsSilverName = conf.get("itemName", "bootsSilver", "Silver Boots").getString();
			bootsSteelName = conf.get("itemName", "bootsSteel", "Steel Boots").getString();
			bootsTinName = conf.get("itemName", "bootsTin", "Tin Boots").getString();
			
			// @itemIngot
			ingotAluminumName = conf.get("itemName", "ingotAluminum", "Aluminum Ingot").getString();
			ingotCopperName = conf.get("itemName", "ingotCopper", "Copper Ingot").getString();
			ingotPlatinumName = conf.get("itemName", "ingotPlatinum", "Platinum Ingot").getString();
			ingotSilverName = conf.get("itemName", "ingotSilver", "Silver Ingot").getString();
			ingotSteelName = conf.get("itemName", "ingotSteel", "Steel Ingot").getString();
			ingotTinName = conf.get("itemName", "ingotTin", "Tin Ingot").getString();
			
			
			// Save Configuration
			conf.save();
			
		}
		
}
