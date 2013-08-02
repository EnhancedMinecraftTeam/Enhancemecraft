package com.nexized.emec.common.instance;

import com.nexized.emec.block.blockIngot.*;
import com.nexized.emec.common.ConfigurationHandler;
import com.nexized.emec.item.itemIngot.ingotAluminium;
import com.nexized.emec.item.itemIngot.ingotCopper;
import com.nexized.emec.item.itemIngot.ingotPlatinum;
import com.nexized.emec.item.itemIngot.ingotSilver;
import com.nexized.emec.item.itemIngot.ingotSteel;
import com.nexized.emec.item.itemIngot.ingotTin;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class loaderIngot extends loaderMaterial {

		// @Ingot Blocks
		// public static Block BlockAluminium;
		// public static Block BlockCopper;
		// public static Block BlockPlatinum;
		// public static Block BlockSteel;
		public static Block BlockSilver;
		//public static Block BlockTin;
		
		// @Ingot Items
		public static Item IngotAluminium;
		public static Item IngotCopper;
		public static Item IngotPlatinum;
		public static Item IngotSilver;
		public static Item IngotSteel;
		public static Item IngotTin;
		
		
		public static void addBlocks(ConfigurationHandler common) {
			// @ Add Blocks
			// BlockAluminium = (new blockAluminium(common.blockAluminiumID, Material.iron));
			// BlockCopper = (new blockCopper(common.blockCopperID, Material.iron));
			// BlockPlatinum = (new blockPlatinum(common.blockPlatinumID, Material.iron)); 
			BlockSilver = (new blockSilver(common.blockSilverID, Material.iron));
			// BlockSteel = (new blockSteel(common.blockSteelID, Material.iron));
			// BlockTin = (new blockTin(common.blockTinID, Material.iron));
			
		
			// @Register Blocks
			// GameRegistry.registerBlock(BlockAluminium, "AluminiumBlock");
			// GameRegistry.registerBlock(BlockCopper, "CopperBlock");
			// GameRegistry.registerBlock(BlockPlatinum, "PlatinumBlock");
			GameRegistry.registerBlock(BlockSilver, "SilverBlock");
			// GameRegistry.registerBlock(BlockSteel, "SteelBlock");
			// GameRegistry.registerBlock(BlockTin, "TinBlock");
			// GameRegistry.registerBlock(BlockFosil, "Fosil Block");
			
			// @BlockHarvest Level
			// MinecraftForge.setBlockHarvestLevel(BlockAluminium, "Pickaxe", 2);
			// MinecraftForge.setBlockHarvestLevel(BlockCopper, "Pickaxe", 2);
			// MinecraftForge.setBlockHarvestLevel(BlockPlatinum, "Pickaxe", 3);
			MinecraftForge.setBlockHarvestLevel(BlockSilver, "Pickaxe", 2);
			// MinecraftForge.setBlockHarvestLevel(BlockSteel, "Pickaxe", 3);
			// MinecraftForge.setBlockHarvestLevel(BlockTin, "Pickaxe", 2);
		}
		
		public static void addItems(ConfigurationHandler common) {
			// @Add Ingot Items
			IngotAluminium = (new ingotAluminium(common.ingotAluminiumID).setUnlocalizedName("Aluminium Ingot"));
			IngotCopper = (new ingotCopper(common.ingotCopperID).setUnlocalizedName("Copper Ingot"));
			IngotPlatinum = (new ingotPlatinum(common.ingotPlatinumID).setUnlocalizedName("Platinum Ingot"));
			IngotSilver = (new ingotSilver(common.ingotSilverID).setUnlocalizedName("Silver Ingot"));
			IngotSteel = (new ingotSteel(common.ingotSteelID).setUnlocalizedName("Steel Ingot"));
			IngotTin = (new ingotTin(common.ingotTinID).setUnlocalizedName("Tin Ingot"));
			
			// @Register Ingot Items
			GameRegistry.registerItem(IngotAluminium, "Aluminium Ingot");
			GameRegistry.registerItem(IngotCopper, "Copper Ingot");
			GameRegistry.registerItem(IngotPlatinum, "Platinum Ingot");
			GameRegistry.registerItem(IngotSilver, "Silver Ingot");
			GameRegistry.registerItem(IngotSteel, "Steel Ingot");
			GameRegistry.registerItem(IngotTin, "Tin Ingot");
		}
		
		public static void addNames() {
			// @Add Block Names
			// LanguageRegistry.addName(BlockAluminium, "Aluminium Block");
			// LanguageRegistry.addName(BlockCopper, "Copper Block");
			// LanguageRegistry.addName(BlockPlatinum, "Platinum Block");
			LanguageRegistry.addName(BlockSilver, "Silver Block");
			// LanguageRegistry.addName(BlockSteel, "Steel Block");
			// LanguageRegistry.addName(BlockTin, "Tin Block");
			// @Add Ingot Names
			LanguageRegistry.addName(IngotAluminium, "Aluminium Ingot");
			LanguageRegistry.addName(IngotCopper, "Copper Ingot");
			LanguageRegistry.addName(IngotPlatinum, "Platinum Ingot");
			LanguageRegistry.addName(IngotSilver, "Silver Ingot");
			LanguageRegistry.addName(IngotSteel, "Steel Ingot");
			LanguageRegistry.addName(IngotTin, "Tin Ingot");
		}
		
		public static void addRecipes() {
			// @Add Block Ingot Crafting
			// GameRegistry.addRecipe(new ItemStack(BlockAluminium), new Object[] {"XXX", "XXX", "XXX", 'X', IngotAluminium});
			// GameRegistry.addRecipe(new ItemStack(BlockCopper), new Object[] {"XXX", "XXX", "XXX", 'X', IngotCopper});
			// GameRegistry.addRecipe(new ItemStack(BlockPlatinum), new Object[] {"XXX", "XXX", "XXX", 'X', IngotPlatinum});
			GameRegistry.addRecipe(new ItemStack(BlockSilver), new Object[] {"XXX", "XXX", "XXX", 'X', IngotSilver});
			// GameRegistry.addRecipe(new ItemStack(BlockSteel), new Object[] {"XXX", "XXX", "XXX", 'X', IngotSteel});
			// GameRegistry.addRecipe(new ItemStack(BlockTin), new Object[] {"XXX", "XXX", "XXX", 'X', IngotTin});
		}
	
		
}
