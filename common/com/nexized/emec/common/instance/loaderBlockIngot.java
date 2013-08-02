package com.nexized.emec.common.instance;

import com.nexized.emec.block.blockIngot.blockAluminium;
import com.nexized.emec.block.blockIngot.blockCopper;
import com.nexized.emec.block.blockIngot.blockFosil;
import com.nexized.emec.block.blockIngot.blockPlatinum;
import com.nexized.emec.block.blockIngot.blockSilver;
import com.nexized.emec.block.blockIngot.blockSteel;
import com.nexized.emec.block.blockIngot.blockTin;
import com.nexized.emec.common.ConfigurationHandler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
// import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class loaderBlockIngot extends materialLoader {

		// @Ingot Blocks
		public static Block BlockAluminium;
		public static Block BlockCopper;
		public static Block BlockPlatinum;
		public static Block BlockSteel;
		public static Block BlockSilver;
		public static Block BlockTin;
		
		// @Additional Blocks
		public static Block BlockFosil;

		public static void addBlocks(ConfigurationHandler common) {
			// @ Add Blocks
			BlockAluminium = (new blockAluminium(common.blockAluminiumID, Material.iron));
			BlockCopper = (new blockCopper(common.blockCopperID, Material.iron));
			BlockPlatinum = (new blockPlatinum(common.blockPlatinumID, Material.iron)); 
			BlockSilver = (new blockSilver(common.blockSilverID, Material.iron));
			BlockSteel = (new blockSteel(common.blockSteelID, Material.iron));
			BlockTin = (new blockTin(common.blockTinID, Material.iron));
			BlockFosil = (new blockFosil(common.blockFosilID, Material.iron));
		
			// @Register Blocks
			GameRegistry.registerBlock(BlockAluminium, "AluminiumBlock");
			GameRegistry.registerBlock(BlockCopper, "CopperBlock");
			GameRegistry.registerBlock(BlockPlatinum, "PlatinumBlock");
			GameRegistry.registerBlock(BlockSilver, "SilverBlock");
			GameRegistry.registerBlock(BlockSteel, "SteelBlock");
			GameRegistry.registerBlock(BlockTin, "TinBlock");
			GameRegistry.registerBlock(BlockFosil, "Fosil Block");
			
			// @BlockHarvest Level
			MinecraftForge.setBlockHarvestLevel(BlockAluminium, "Pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(BlockCopper, "Pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(BlockPlatinum, "Pickaxe", 3);
			MinecraftForge.setBlockHarvestLevel(BlockSilver, "Pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(BlockSteel, "Pickaxe", 3);
			MinecraftForge.setBlockHarvestLevel(BlockTin, "Pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(BlockFosil, "Pickaxe", 3);
		}
		
		public static void addNames() {
			// @Add Block Names
			LanguageRegistry.addName(BlockAluminium, "Aluminium Block");
			LanguageRegistry.addName(BlockCopper, "Copper Block");
			LanguageRegistry.addName(BlockPlatinum, "Platinum Block");
			LanguageRegistry.addName(BlockSilver, "Silver Block");
			LanguageRegistry.addName(BlockSteel, "Steel Block");
			LanguageRegistry.addName(BlockTin, "Tin Block");
			LanguageRegistry.addName(BlockFosil, "Fosil Block");
		}
		
		public static void addRecipes() {
			
		}
		
}
