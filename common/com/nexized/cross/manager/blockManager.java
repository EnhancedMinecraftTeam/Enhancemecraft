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
			
			// @addBlocks
			public static Block blockFosil;
	
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
				oreAluminum = new crossBlock(idm.oreAluminumID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreAluminum");
				oreCopper = new crossBlock(idm.oreCopperID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreCopper");
				orePlatinum = new crossBlock(idm.orePlatinumID, Material.rock).setHardness(5.0F).setResistance(oreResistance).setUnlocalizedName("orePlatinum");
				oreSilver = new crossBlock(idm.oreSilverID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreSilver");
				oreTin = new crossBlock(idm.oreTinID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreTin");
				oreExperience = new crossBlock(idm.oreExperienceID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreExperience");
			
				// @ingotBlocks
				blockAluminum = new crossBlock(idm.blockAluminumID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockAluminum");
				blockCopper = new crossBlock(idm.blockCopperID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockCopper");
				blockPlatinum = new crossBlock(idm.blockPlatinumID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockPlatinum");
				blockSilver = new crossBlock(idm.blockSilverID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSilver");
				blockSteel = new crossBlock(idm.blockSteelID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSteel");
				blockTin = new crossBlock(idm.blockTinID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockTin");
			
				// @addBlocks
				blockFosil = new crossBlock(idm.blockFosilID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("blockFosil");
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
			}
			
}
