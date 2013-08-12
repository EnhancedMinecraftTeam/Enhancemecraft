package com.nexized.cross.manager;

import com.nexized.cross.block.*;
import com.nexized.cross.conf.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

public class blockManager {
	
			// @oreBlocks
			public static Block oreAluminum;
			public static Block oreCopper;
			public static Block orePlatinum;
			public static Block oreSilver;
			public static Block oreTin;
			public static Block oreExperience;
			
			// @ingotBlocks
			public static Block blockAluminum;
			public static Block blockCopper;
			public static Block blockPlatinum;
			public static Block blockSilver;
			public static Block blockSteel;
			public static Block blockTin;
			public static Block blockBronze;
			
			// @addBlocks
			public static Block blockFosil;
			public static Block blockFreezer;
			public static Block blockCloud;
			
			// @fusionFurnance
			public static Block furnanceFusion;
			public static Block furnanceFusionOn;
			
	
			public static void doWork(confEntity idm, confLocalisation local) {
				// @Add Blocks to Registry
				addBlocks(idm);
				// @Add Names to Registry
				addNames(local);
				// @Add Blocks to Registry
				registerBlocks();
			}
			
			public static void addBlocks(confEntity idm)
			{
				// @Defaults 
				float oreResistance = 5.0F; 
				float blockResistance = 12.0F;
				
				// @oreBlocks
				oreAluminum = new crossOre(idm.oreAluminumID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreAluminum");
				oreCopper = new crossOre(idm.oreCopperID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreCopper");
				orePlatinum = new crossOre(idm.orePlatinumID, Material.rock).setHardness(5.0F).setResistance(oreResistance).setUnlocalizedName("orePlatinum");
				oreSilver = new crossOre(idm.oreSilverID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreSilver");
				oreTin = new crossOre(idm.oreTinID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreTin");
				oreExperience = new crossOre(idm.oreExperienceID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreExperience");
			
				// @ingotBlocks
				blockAluminum = new crossBlock(idm.blockAluminumID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockAluminum");
				blockCopper = new crossBlock(idm.blockCopperID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockCopper");
				blockPlatinum = new crossBlock(idm.blockPlatinumID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockPlatinum");
				blockSilver = new crossBlock(idm.blockSilverID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSilver");
				blockSteel = new crossBlock(idm.blockSteelID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSteel");
				blockTin = new crossBlock(idm.blockTinID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockTin");
			
				// @addBlocks
				blockFosil = new crossBlock(idm.blockFosilID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("blockFosil");
				blockFreezer = new crossBlock(idm.blockFreezerID, Material.rock).setHardness(4.0F).setResistance(blockResistance).setUnlocalizedName("blockFreezer");
				blockCloud = new crossBlock(idm.blockCloudID, Material.rock).setHardness(4.0F).setResistance(blockResistance).setUnlocalizedName("blockCloud");
			
				// @FusionFurnance
				furnanceFusion = new crossFusionFurnance(idm.furnanceFusionID, false).setHardness(3.5F).setResistance(10.0F).setUnlocalizedName("furnanceFusion");
				furnanceFusionOn = new crossFusionFurnance(idm.furnanceFusionOnID, true).setHardness(3.5F).setLightValue(1.0F).setUnlocalizedName("furnanceFusionOn");
			}
			
			public static void addNames(confLocalisation local) {
				
				// @oreBlocks
				LanguageRegistry.addName(oreAluminum, local.oreAluminumName);
				LanguageRegistry.addName(oreCopper, local.oreCopperName);
				LanguageRegistry.addName(orePlatinum, local.orePlatinumName);
				LanguageRegistry.addName(oreSilver, local.oreSilverName);
				LanguageRegistry.addName(oreTin, local.oreTinName);
				LanguageRegistry.addName(oreExperience, local.oreExperienceName);
				
				// @ingotBlocks
				LanguageRegistry.addName(blockAluminum, local.blockAluminumName);
				LanguageRegistry.addName(blockCopper, local.blockCopperName);
				LanguageRegistry.addName(blockPlatinum, local.blockPlatinumName);
				LanguageRegistry.addName(blockSilver, local.blockSilverName);
				LanguageRegistry.addName(blockSteel, local.blockSteelName);
				LanguageRegistry.addName(blockTin, local.blockTinName);
				
				// @addBlocks
				LanguageRegistry.addName(blockFosil, local.blockFosilName);
				LanguageRegistry.addName(blockFreezer, local.blockFreezerName);
				LanguageRegistry.addName(blockCloud, local.blockCloudName);
				
				LanguageRegistry.addName(furnanceFusion, local.furnanceFusionName);
				LanguageRegistry.addName(furnanceFusionOn, local.furnanceFusionName);
			}
			
			public static void registerBlocks() {
				// @setBlockHarvestLevel
				MinecraftForge.setBlockHarvestLevel(oreAluminum, "pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
				MinecraftForge.setBlockHarvestLevel(orePlatinum, "pickaxe", 3);
				MinecraftForge.setBlockHarvestLevel(oreSilver, "pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
				MinecraftForge.setBlockHarvestLevel(oreExperience, "pickaxe", 2);
				
				// registerBlocks
				GameRegistry.registerBlock(oreAluminum, oreAluminum.getUnlocalizedName());
				GameRegistry.registerBlock(oreCopper, oreCopper.getUnlocalizedName());
				GameRegistry.registerBlock(orePlatinum, orePlatinum.getUnlocalizedName());
				GameRegistry.registerBlock(oreSilver, oreSilver.getUnlocalizedName());
				GameRegistry.registerBlock(oreTin, oreTin.getUnlocalizedName());
				GameRegistry.registerBlock(oreExperience, oreExperience.getUnlocalizedName());
				
				GameRegistry.registerBlock(blockAluminum, blockAluminum.getUnlocalizedName());
				GameRegistry.registerBlock(blockCopper, blockCopper.getUnlocalizedName());
				GameRegistry.registerBlock(blockPlatinum, blockPlatinum.getUnlocalizedName());
				GameRegistry.registerBlock(blockSilver, blockSilver.getUnlocalizedName());
				GameRegistry.registerBlock(blockSteel, blockSteel.getUnlocalizedName());
				GameRegistry.registerBlock(blockTin, blockTin.getUnlocalizedName());
				
				GameRegistry.registerBlock(blockFosil, blockFosil.getUnlocalizedName());
				GameRegistry.registerBlock(blockFreezer, blockFreezer.getUnlocalizedName());
				GameRegistry.registerBlock(blockCloud, blockCloud.getUnlocalizedName());
				
				GameRegistry.registerBlock(furnanceFusion, furnanceFusion.getUnlocalizedName());
				// GameRegistry.registerBlock(furnanceFusionOn, furnanceFusionOn.getUnlocalizedName());
			}
			
}
