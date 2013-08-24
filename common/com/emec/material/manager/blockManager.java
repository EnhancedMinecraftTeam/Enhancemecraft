package com.emec.material.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.emec.material.block.materialOre;
import com.emec.zero.conf.idManager;
import com.emec.zero.block.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
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
		public static Block blockBronze;
		public static Block blockCopper;
		public static Block blockPlatinum;
		public static Block blockSilver;
		public static Block blockSteel;
		public static Block blockTin;
		
		// @addBlocks
		public static Block blockFosil;
		
		public static void addBlocks(idManager idm, CreativeTabs tab)
		{
			// @Defaults 
			float oreResistance = 5.0F; 
			float blockResistance = 12.0F;

			// @oreBlocks
			oreAluminum = new materialOre(idm.getBlockID("oreAluminum"), Material.rock, tab).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreAluminum");
			oreCopper = new materialOre(idm.getBlockID("oreCopper"), Material.rock, tab).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreCopper");
			orePlatinum = new materialOre(idm.getBlockID("orePlatinum"), Material.rock, tab).setHardness(5.0F).setResistance(oreResistance).setUnlocalizedName("orePlatinum");
			oreSilver = new materialOre(idm.getBlockID("oreSilver"), Material.rock, tab).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreSilver");
			oreTin = new materialOre(idm.getBlockID("oreTin"), Material.rock, tab).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("oreTin");
			oreExperience = new materialOre(idm.getBlockID("oreExperience"), Material.rock, tab).setHardness(3.0F).setResistance(oreResistance).setUnlocalizedName("oreExperience");

			// @ingotBlocks
			blockAluminum = new zeroBlock(idm.getBlockID("blockAluminum"), Material.iron, tab).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockAluminum");
			blockBronze = new zeroBlock(idm.getBlockID("blockBronze"), Material.iron, tab).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockBronze");
			blockCopper = new zeroBlock(idm.getBlockID("blockCopper"), Material.iron, tab).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockCopper");
			blockPlatinum = new zeroBlock(idm.getBlockID("blockPlatinum"), Material.iron, tab).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockPlatinum");
			blockSilver = new zeroBlock(idm.getBlockID("blockSilver"), Material.iron, tab).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSilver");
			blockSteel = new zeroBlock(idm.getBlockID("blockSteel"), Material.iron, tab).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockSteel");
			blockTin = new zeroBlock(idm.getBlockID("blockTin"), Material.iron, tab).setHardness(7.0F).setResistance(blockResistance).setUnlocalizedName("blockTin");

			// @addBlocks
			blockFosil = new zeroBlock(idm.getBlockID("blockFosil"), Material.rock, tab).setHardness(1.7F).setResistance(oreResistance).setUnlocalizedName("blockFosil");
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

		}
}
