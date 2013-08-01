package com.nexized.emec.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

import com.nexized.emec.blocks.*;
import com.nexized.emec.items.*;
import com.nexized.emec.world.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonLoader {

	// @Block Ores
	public static Block OrePlatinum;
	// @Blocks
	public static Block BlockPlatinum;
	
	// @Items
	public static Item IngotPlatinum;
	
	// @Material 
	public static EnumToolMaterial PLATINUM;
	
	public static void init() {
		PLATINUM = EnumHelper.addToolMaterial("PLATINUM", 4, 300, 6.5F, 4.0F, 16);
	}
	
	public static void addBlocks(ConfigurationHandler common) {
		// @Add Blocks
		OrePlatinum = (new orePlatinum(common.orePlatinumID));
		BlockPlatinum = (new blockPlatinum(common.blockPlatinumID, Material.iron)); 
		// @Register Blocks
		GameRegistry.registerBlock(OrePlatinum, "PlatinumOre");
		GameRegistry.registerBlock(BlockPlatinum, "PlatinumBlock");
		// @BlockHarvest
		MinecraftForge.setBlockHarvestLevel(OrePlatinum, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockPlatinum, "Pickaxe", 2);
	}
	
	public static void addItems(ConfigurationHandler common) {
		// @Add Items
		IngotPlatinum = (new ingotPlatinum(common.ingotPlatinumID).setUnlocalizedName("Platinum Ingot"));
		// @Register Items
		GameRegistry.registerItem(IngotPlatinum, "Platinum Ingot");
	}
	
	public static void addNames() {
		// @Add Block Names
		LanguageRegistry.addName(BlockPlatinum, "Block of Platinum");
		LanguageRegistry.addName(OrePlatinum, "Platinum Ore");
		// @Add Item Names
		LanguageRegistry.addName(IngotPlatinum, "Platinum Ingot");
	}
	
	public static void addRecipes() {
		// @Add Block Recipes
		GameRegistry.addSmelting(OrePlatinum.blockID, new ItemStack(IngotPlatinum), 10.0F);
		GameRegistry.addRecipe(new ItemStack(BlockPlatinum), new Object[] {"XXX", "XXX", "XXX", 'X', IngotPlatinum});
	}

	public static void postInit() {
		// @Add WorldGenerator
		GameRegistry.registerWorldGenerator(new emecWorldGenerator());
	}
	
}
