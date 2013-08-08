package com.nexized.cross.block;

import com.nexized.cross.conf.confEntity;
import com.nexized.cross.conf.confLocalisation;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

public class blockInit {

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
	
			public static void doWork() {
				// @Add Blocks to Registry
				addBlocks();
				// @Add Names to Registry
				addNames();
				// @Add Blocks to Registry
				registerBlocks();
			}
			
			public static void addBlocks()
			{
				// @Defaults 
				float oreResistance = 5.0F; 
				float blockResistance = 12.0F;
				
				// @oreBlocks
				oreAluminum = new crossBlock(confEntity.oreAluminumID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreAluminum");
				oreCopper = new crossBlock(confEntity.oreCopperID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreCopper");
				orePlatinum = new crossBlock(confEntity.orePlatinumID, Material.rock).setHardness(5.0F).setResistance(oreResistance).setUnlocalizedName("orePlatinum");
				oreSilver = new crossBlock(confEntity.oreSilverID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreSilver");
				oreTin = new crossBlock(confEntity.oreTinID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreTin");
				oreExperience = new crossBlock(confEntity.oreExperienceID, Material.rock).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreExperience");
			
				// @ingotBlocks
				blockAluminum = new crossBlock(confEntity.blockAluminumID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockAluminum");
				blockCopper = new crossBlock(confEntity.blockCopperID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockCopper");
				blockPlatinum = new crossBlock(confEntity.blockPlatinumID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockPlatinum");
				blockSilver = new crossBlock(confEntity.blockSilverID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSilver");
				blockSteel = new crossBlock(confEntity.blockSteelID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSteel");
				blockTin = new crossBlock(confEntity.blockTinID, Material.iron).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockTin");
			
				// @addBlocks
				blockFosil = new crossBlock(confEntity.blockFosilID, Material.rock).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("blockFosil");
			}
			
			public static void addNames() {
				
				// @oreBlocks
				LanguageRegistry.addName(oreAluminum, confLocalisation.oreAluminumName);
				LanguageRegistry.addName(oreCopper, confLocalisation.oreCopperName);
				LanguageRegistry.addName(orePlatinum, confLocalisation.orePlatinumName);
				LanguageRegistry.addName(oreSilver, confLocalisation.oreSilverName);
				LanguageRegistry.addName(oreTin, confLocalisation.oreTinName);
				LanguageRegistry.addName(oreExperience, confLocalisation.oreExperienceName);
				
				// @ingotBlocks
				LanguageRegistry.addName(blockAluminum, confLocalisation.blockAluminumName);
				LanguageRegistry.addName(blockCopper, confLocalisation.blockCopperName);
				LanguageRegistry.addName(blockPlatinum, confLocalisation.blockPlatinumName);
				LanguageRegistry.addName(blockSilver, confLocalisation.blockSilverName);
				LanguageRegistry.addName(blockSteel, confLocalisation.blockSteelName);
				LanguageRegistry.addName(blockTin, confLocalisation.blockTinName);
				
				// @addBlocks
				LanguageRegistry.addName(blockFosil, confLocalisation.blockFosilName);
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
