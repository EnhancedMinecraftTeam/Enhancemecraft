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
import com.nexized.emec.items.tools.*;
import com.nexized.emec.items.weapons.*;
import com.nexized.emec.world.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonLoader {

	// @Block Ores
	public static Block OreAluminium;
	public static Block OreCopper;
	public static Block OrePlatinum;
	public static Block OreSilver;
	public static Block OreTin;
	
	// @Ingot Blocks
	public static Block BlockAluminium;
	public static Block BlockCopper;
	public static Block BlockPlatinum;
	public static Block BlockSteel;
	public static Block BlockSilver;
	public static Block BlockTin;
	
	// @Additional Blocks
	public static Block BlockFosil;
	
	// @Items
	public static Item IngotAluminium;
	public static Item IngotCopper;
	public static Item IngotPlatinum;
	public static Item IngotSilver;
	public static Item IngotSteel;
	public static Item IngotTin;
	
	// @Material 
	public static EnumToolMaterial ALUMINIUM;
	public static EnumToolMaterial COPPER;
	public static EnumToolMaterial PLATINUM;
	public static EnumToolMaterial SILVER;
	public static EnumToolMaterial STEEL;
	public static EnumToolMaterial TIN;
		
	// @Tools
	public static Item AxeAluminium;
	public static Item AxeCopper;
	public static Item AxePlatinum;
	public static Item AxeSilver;
	public static Item AxeSteel;
	public static Item AxeTin;
	public static Item HoeAluminium;
	public static Item HoeCopper;
	public static Item HoePlatinum;
	public static Item HoeSilver;
	public static Item HoeSteel;
	public static Item HoeTin;
	public static Item PickAluminium;
	public static Item PickCopper;
	public static Item PickPlatinum;
	public static Item PickSilver;
	public static Item PickSteel;
	public static Item PickTin;
	public static Item ShovelAluminium;
	public static Item ShovelCopper;
	public static Item ShovelPlatinum;
	public static Item ShovelSilver;
	public static Item ShovelSteel;
	public static Item ShovelTin;
	public static Item SwordAluminium;
	public static Item SwordCopper;
	public static Item SwordPlatinum;
	public static Item SwordSilver;
	public static Item SwordSteel;
	public static Item SwordTin;
	
	public static void materialInit() {
		// @Add Materials
		ALUMINIUM = EnumHelper.addToolMaterial("ALUMINIUM", 2, 150, 4.0F, 3.0F, 16);
		COPPER = EnumHelper.addToolMaterial("COPPER", 2, 200, 4.5F, 3.0F, 16);
		PLATINUM = EnumHelper.addToolMaterial("PLATINUM", 4, 300, 6.5F, 4.0F, 16);
		SILVER = EnumHelper.addToolMaterial("SILVER", 3, 250, 5.0F, 3.0F, 16);
		STEEL = EnumHelper.addToolMaterial("STEEL", 4, 400, 7.0F, 5.0F, 16);
		TIN = EnumHelper.addToolMaterial("TIN", 2, 200, 4.5F, 3.0F, 16);
	}
	
	public static void addBlocks(ConfigurationHandler common) {
		// @Add Block Ores
		OreAluminium = (new oreAluminium(common.oreAluminiumID));
		OreCopper = (new oreCopper(common.oreCopperID));
		OrePlatinum = (new orePlatinum(common.orePlatinumID));
		OreSilver = (new oreSilver(common.oreSilverID));
		OreTin = (new oreTin(common.oreTinID));
		
		// @Add Ingot Blocks
		BlockAluminium = (new blockAluminium(common.blockAluminiumID, Material.iron));
		BlockCopper = (new blockCopper(common.blockCopperID, Material.iron));
		BlockPlatinum = (new blockPlatinum(common.blockPlatinumID, Material.iron)); 
		BlockSilver = (new blockSilver(common.blockSilverID, Material.iron));
		BlockSteel = (new blockSteel(common.blockSteelID, Material.iron));
		BlockTin = (new blockTin(common.blockTinID, Material.iron));
		
		// @Add Additional Blocks
		BlockFosil = (new blockFosil(common.blockFosilID, Material.iron));
		
		// @Register Ores
		GameRegistry.registerBlock(OreAluminium, "AluminiumOre");
		GameRegistry.registerBlock(OreCopper, "CopperOre");
		GameRegistry.registerBlock(OrePlatinum, "PlatinumOre");
		GameRegistry.registerBlock(OreSilver, "SilverOre");
		GameRegistry.registerBlock(OreTin, "TinOre");
		
		// @Register Ingot Blocks
		GameRegistry.registerBlock(BlockAluminium, "AluminiumBlock");
		GameRegistry.registerBlock(BlockCopper, "CopperBlock");
		GameRegistry.registerBlock(BlockPlatinum, "PlatinumBlock");
		GameRegistry.registerBlock(BlockSilver, "SilverBlock");
		GameRegistry.registerBlock(BlockSteel, "SteelBlock");
		GameRegistry.registerBlock(BlockTin, "TinBlock");
		
		// @Register Additional Blocks
		GameRegistry.registerBlock(BlockFosil, "Fosil Block");
				
		// @BlockHarvest
		MinecraftForge.setBlockHarvestLevel(OreAluminium, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OreCopper, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OrePlatinum, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OreSilver, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OreTin, "Pickaxe", 2);
		
		MinecraftForge.setBlockHarvestLevel(BlockAluminium, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockCopper, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockPlatinum, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockSilver, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockSteel, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockTin, "Pickaxe", 2);
	}
	
	public static void addItems(ConfigurationHandler common) {
		// @Add Ingot
		IngotAluminium = (new ingotAluminium(common.ingotAluminiumID).setUnlocalizedName("Aluminium Ingot"));
		IngotCopper = (new ingotCopper(common.ingotCopperID).setUnlocalizedName("Copper Ingot"));
		IngotPlatinum = (new ingotPlatinum(common.ingotPlatinumID).setUnlocalizedName("Platinum Ingot"));
		IngotSilver = (new ingotSilver(common.ingotSilverID).setUnlocalizedName("Silver Ingot"));
		IngotSteel = (new ingotSteel(common.ingotSteelID).setUnlocalizedName("Steel Ingot"));
		IngotTin = (new ingotTin(common.ingotTinID).setUnlocalizedName("Tin Ingot"));
		
		// @Add Tools Aluminium
		AxeAluminium = (new axeAluminium(common.axeAluminiumID, ALUMINIUM).setUnlocalizedName("Aluminium Axe"));
		HoeAluminium = (new hoeAluminium(common.hoeAluminiumID, ALUMINIUM).setUnlocalizedName("Aluminium Hoe"));
		PickAluminium = (new pickAluminium(common.pickAluminiumID, ALUMINIUM).setUnlocalizedName("Aluminium Pickaxe"));
		ShovelAluminium = (new shovelAluminium(common.shovelAluminiumID, ALUMINIUM).setUnlocalizedName("Aluminium Shovel"));
		SwordAluminium = (new swordAluminium(common.swordAluminiumID, ALUMINIUM).setUnlocalizedName("Aluminium Sword"));
		
		// @Add Tools Copper
		AxeCopper = (new axeCopper(common.axeCopperID, COPPER).setUnlocalizedName("Copper Axe"));
		HoeCopper = (new hoeCopper(common.hoeCopperID, COPPER).setUnlocalizedName("Copper Hoe"));
		PickCopper = (new pickCopper(common.pickCopperID, COPPER).setUnlocalizedName("Copper Pickaxe"));
		ShovelCopper = (new shovelCopper(common.shovelCopperID, COPPER).setUnlocalizedName("Copper Shovel"));
		SwordCopper = (new swordCopper(common.swordCopperID, COPPER).setUnlocalizedName("Copper Sword"));
		
		// @Add Tools Platinum
		AxePlatinum = (new axePlatinum(common.axePlatinumID, PLATINUM).setUnlocalizedName("Platinum Axe"));
		HoePlatinum = (new hoePlatinum(common.hoePlatinumID, PLATINUM).setUnlocalizedName("Platinum Hoe"));
		PickPlatinum = (new pickPlatinum(common.pickPlatinumID, PLATINUM).setUnlocalizedName("Platinum Pickaxe"));
		ShovelPlatinum = (new shovelPlatinum(common.shovelPlatinumID, PLATINUM).setUnlocalizedName("Platinum Shovel"));
		SwordPlatinum = (new swordPlatinum(common.swordPlatinumID, PLATINUM).setUnlocalizedName("Platinum Sword"));
		
		// @Add Tools Silver
		AxeSilver = (new axeSilver(common.axeSilverID, SILVER).setUnlocalizedName("Silver Axe"));
		HoeSilver = (new hoeSilver(common.hoeSilverID, SILVER).setUnlocalizedName("Silver Hoe"));
		PickSilver = (new pickSilver(common.pickSilverID, SILVER).setUnlocalizedName("Silver Pickaxe"));
		ShovelSilver = (new shovelSilver(common.shovelSilverID, SILVER).setUnlocalizedName("Silver Shovel"));
		SwordSilver = (new swordSilver(common.swordSilverID, SILVER).setUnlocalizedName("Silver Sword"));
		
		// @Add Tools Steel
		AxeSteel = (new axeSteel(common.axeSteelID, STEEL).setUnlocalizedName("Steel Axe"));
		HoeSteel = (new hoeSteel(common.hoeSteelID, STEEL).setUnlocalizedName("Steel Hoe"));
		PickSteel = (new pickSteel(common.pickSteelID, STEEL).setUnlocalizedName("Steel Pickaxe"));
		ShovelSteel = (new shovelSteel(common.shovelSteelID, STEEL).setUnlocalizedName("Steel Shovel"));
		SwordSteel = (new swordSteel(common.swordSteelID, STEEL).setUnlocalizedName("Steel Sword"));
		
		// @Add Tools Tin
		AxePlatinum = (new axePlatinum(common.axePlatinumID, PLATINUM).setUnlocalizedName("Platinum Axe"));
		HoePlatinum = (new hoePlatinum(common.hoePlatinumID, PLATINUM).setUnlocalizedName("Platinum Hoe"));
		PickPlatinum = (new pickPlatinum(common.pickPlatinumID, PLATINUM).setUnlocalizedName("Platinum Pickaxe"));
		ShovelPlatinum = (new shovelPlatinum(common.shovelPlatinumID, PLATINUM).setUnlocalizedName("Platinum Shovel"));
		SwordPlatinum = (new swordPlatinum(common.swordPlatinumID, PLATINUM).setUnlocalizedName("Platinum Sword"));
		
		// @Register Items
		GameRegistry.registerItem(IngotPlatinum, "Platinum Ingot");
		GameRegistry.registerItem(AxePlatinum, "Platinum Axe");
		GameRegistry.registerItem(HoePlatinum, "Platinum Hoe");
		GameRegistry.registerItem(PickPlatinum, "Platinum Pick");
		GameRegistry.registerItem(ShovelPlatinum, "Platinum Shovel");
		GameRegistry.registerItem(SwordPlatinum, "Platinum Sword");
	}
	
	public static void addNames() {
		// @Add Block Names
		LanguageRegistry.addName(BlockPlatinum, "Block of Platinum");
		LanguageRegistry.addName(OrePlatinum, "Platinum Ore");
		// @Add Item Names
		LanguageRegistry.addName(IngotPlatinum, "Platinum Ingot");
		LanguageRegistry.addName(AxePlatinum, "Platinum Axe");
		LanguageRegistry.addName(HoePlatinum, "Platinum Hoe");
		LanguageRegistry.addName(PickPlatinum, "Platinum Pickaxe");
		LanguageRegistry.addName(ShovelPlatinum, "Platinum Shovel");
		LanguageRegistry.addName(SwordPlatinum, "Platinum Sword");
	}
	
	public static void addRecipes() {
		// @Add Block Recipes
		GameRegistry.addSmelting(OrePlatinum.blockID, new ItemStack(IngotPlatinum), 10.0F);
		GameRegistry.addRecipe(new ItemStack(BlockPlatinum), new Object[] {"XXX", "XXX", "XXX", 'X', IngotPlatinum});
		// @Add Item Recipes
		GameRegistry.addRecipe(new ItemStack(AxePlatinum), new Object[] {" XX", " *X", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(HoePlatinum), new Object[] {" XX", " * ", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(PickPlatinum), new Object[] {"XXX", " * ", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ShovelPlatinum), new Object[] {" X ", " * ", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(SwordPlatinum), new Object[] {" X ", " X ", " * ", 'X', IngotPlatinum, '*', Item.stick});
	}

	public static void toolClasses() {
		MinecraftForge.setToolClass(PickPlatinum, "pickaxe", 2);
        MinecraftForge.setToolClass(AxePlatinum, "axe", 2);
        MinecraftForge.setToolClass(ShovelPlatinum, "shovel", 2);
        MinecraftForge.setToolClass(HoePlatinum, "hoe", 2);
	}
	
	public static void postInit() {
		// @Add WorldGenerator
		GameRegistry.registerWorldGenerator(new emecWorldGenerator());
	}
	
}
