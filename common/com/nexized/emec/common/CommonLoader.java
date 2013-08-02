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
		AxeTin = (new axeTin(common.axeTinID, TIN).setUnlocalizedName("Tin Axe"));
		HoeTin = (new hoeTin(common.hoeTinID, TIN).setUnlocalizedName("Tin Hoe"));
		PickTin = (new pickTin(common.pickTinID, TIN).setUnlocalizedName("Tin Pickaxe"));
		ShovelTin = (new shovelTin(common.shovelTinID, TIN).setUnlocalizedName("Tin Shovel"));
		SwordTin = (new swordTin(common.swordTinID, TIN).setUnlocalizedName("Tin Sword"));
		
		// @Register Items Ingots
		GameRegistry.registerItem(IngotAluminium, "Aluminium Ingot");
		GameRegistry.registerItem(IngotCopper, "Copper Ingot");
		GameRegistry.registerItem(IngotPlatinum, "Platinum Ingot");
		GameRegistry.registerItem(IngotSilver, "Silver Ingot");
		GameRegistry.registerItem(IngotSteel, "Steel Ingot");
		GameRegistry.registerItem(IngotTin, "Tin Ingot");
		
		// @Register Tools
		GameRegistry.registerItem(AxeAluminium, "Aluminium Axe");
		GameRegistry.registerItem(AxeCopper, "Copper Axe");
		GameRegistry.registerItem(AxePlatinum, "Platinum Axe");
		GameRegistry.registerItem(AxeSilver, "Silver Axe");
		GameRegistry.registerItem(AxeSteel, "Steel Axe");
		GameRegistry.registerItem(AxeTin, "Tin Axe");
		
		GameRegistry.registerItem(HoeAluminium, "Aluminium Hoe");
		GameRegistry.registerItem(HoeCopper, "Copper Hoe");
		GameRegistry.registerItem(HoePlatinum, "Platinum Hoe");
		GameRegistry.registerItem(HoeSilver, "Silver Hoe");
		GameRegistry.registerItem(HoeSteel, "Steel Hoe");
		GameRegistry.registerItem(HoeTin, "Tin Hoe");
		
		GameRegistry.registerItem(PickAluminium, "Aluminium Pick");
		GameRegistry.registerItem(PickCopper, "Copper Pick");
		GameRegistry.registerItem(PickPlatinum, "Platinum Pick");
		GameRegistry.registerItem(PickSilver, "Silver Pick");
		GameRegistry.registerItem(PickSteel, "Steel Pick");
		GameRegistry.registerItem(PickTin, "Tin Pick");
		
		GameRegistry.registerItem(ShovelAluminium, "Aluminium Shovel");
		GameRegistry.registerItem(ShovelCopper, "Copper Shovel");
		GameRegistry.registerItem(ShovelPlatinum, "Platinum Shovel");
		GameRegistry.registerItem(ShovelSilver, "Silver Shovel");
		GameRegistry.registerItem(ShovelSteel, "Steel Shovel");
		GameRegistry.registerItem(ShovelTin, "Tin Shovel");
				
		GameRegistry.registerItem(SwordAluminium, "Aluminium Sword");
		GameRegistry.registerItem(SwordCopper, "Copper Sword");
		GameRegistry.registerItem(SwordPlatinum, "Platinum Sword");
		GameRegistry.registerItem(SwordSilver, "Silver Sword");
		GameRegistry.registerItem(SwordSteel, "Steel Sword");
		GameRegistry.registerItem(SwordTin, "Tin Sword");
	}
	
	public static void addNames() {
		// @Add Block Ores Names
		LanguageRegistry.addName(OreAluminium, "Aluminium Ore");
		LanguageRegistry.addName(OreCopper, "Copper Ore");
		LanguageRegistry.addName(OrePlatinum, "Platinum Ore");
		LanguageRegistry.addName(OreSilver, "Silver Ore");
		LanguageRegistry.addName(OreTin, "Tin Ore");
		
		// @Add Block Ingot Names
		LanguageRegistry.addName(BlockAluminium, "Aluminium Block");
		LanguageRegistry.addName(BlockCopper, "Copper Block");
		LanguageRegistry.addName(BlockPlatinum, "Platinum Block");
		LanguageRegistry.addName(BlockSilver, "Silver Block");
		LanguageRegistry.addName(BlockSteel, "Steel Block");
		LanguageRegistry.addName(BlockTin, "Tin Block");
		
		// @Add Additional Block Names
		LanguageRegistry.addName(BlockFosil, "Fosil Block");
		
		// @Add Ingot Names
		LanguageRegistry.addName(IngotAluminium, "Aluminium Ingot");
		LanguageRegistry.addName(IngotCopper, "Copper Ingot");
		LanguageRegistry.addName(IngotPlatinum, "Platinum Ingot");
		LanguageRegistry.addName(IngotSilver, "Silver Ingot");
		LanguageRegistry.addName(IngotSteel, "Steel Ingot");
		LanguageRegistry.addName(IngotTin, "Tin Ingot");
		
		// @Add Tools Names
		LanguageRegistry.addName(AxeAluminium, "Aluminium Axe");
		LanguageRegistry.addName(AxeCopper, "Copper Axe");
		LanguageRegistry.addName(AxePlatinum, "Platinum Axe");
		LanguageRegistry.addName(AxeSilver, "Silver Axe");
		LanguageRegistry.addName(AxeSteel, "Steel Axe");
		LanguageRegistry.addName(AxeTin, "Tin Axe");
		
		LanguageRegistry.addName(HoeAluminium, "Aluminium Hoe");
		LanguageRegistry.addName(HoeCopper, "Copper Hoe");
		LanguageRegistry.addName(HoePlatinum, "Platinum Hoe");
		LanguageRegistry.addName(HoeSilver, "Silver Hoe");
		LanguageRegistry.addName(HoeSteel, "Steel Hoe");
		LanguageRegistry.addName(HoeTin, "Tin Hoe");
		
		LanguageRegistry.addName(PickAluminium, "Aluminium Pickaxe");
		LanguageRegistry.addName(PickCopper, "Copper Pickaxe");
		LanguageRegistry.addName(PickPlatinum, "Platinum Pickaxe");
		LanguageRegistry.addName(PickSilver, "Silver Pickaxe");
		LanguageRegistry.addName(PickSteel, "Steel Pickaxe");
		LanguageRegistry.addName(PickTin, "Tin Pickaxe");
		
		LanguageRegistry.addName(ShovelAluminium, "Aluminium Shovel");
		LanguageRegistry.addName(ShovelCopper, "Copper Shovel");
		LanguageRegistry.addName(ShovelPlatinum, "Platinum Shovel");
		LanguageRegistry.addName(ShovelSilver, "Silver Shovel");
		LanguageRegistry.addName(ShovelSteel, "Steel Shovel");
		LanguageRegistry.addName(ShovelTin, "Tin Shovel");
		
		LanguageRegistry.addName(SwordAluminium, "Aluminium Sword");
		LanguageRegistry.addName(SwordCopper, "Copper Sword");
		LanguageRegistry.addName(SwordPlatinum, "Platinum Sword");
		LanguageRegistry.addName(SwordSilver, "Silver Sword");
		LanguageRegistry.addName(SwordSteel, "Steel Sword");
		LanguageRegistry.addName(SwordTin, "Tin Sword");
	}
	
	public static void addRecipes() {
		// @Add Ingot Smelting
		GameRegistry.addSmelting(OreAluminium.blockID, new ItemStack(IngotAluminium), 10.0F);
		GameRegistry.addSmelting(OreCopper.blockID, new ItemStack(IngotCopper), 10.0F);
		GameRegistry.addSmelting(OrePlatinum.blockID, new ItemStack(IngotPlatinum), 10.0F);
		GameRegistry.addSmelting(OreSilver.blockID, new ItemStack(IngotSilver), 10.0F);
		GameRegistry.addSmelting(OreTin.blockID, new ItemStack(IngotTin), 10.0F);
		
		// @Add Block Ingot Crafting
		GameRegistry.addRecipe(new ItemStack(BlockAluminium), new Object[] {"XXX", "XXX", "XXX", 'X', IngotAluminium});
		GameRegistry.addRecipe(new ItemStack(BlockCopper), new Object[] {"XXX", "XXX", "XXX", 'X', IngotCopper});
		GameRegistry.addRecipe(new ItemStack(BlockPlatinum), new Object[] {"XXX", "XXX", "XXX", 'X', IngotPlatinum});
		GameRegistry.addRecipe(new ItemStack(BlockSilver), new Object[] {"XXX", "XXX", "XXX", 'X', IngotSilver});
		GameRegistry.addRecipe(new ItemStack(BlockSteel), new Object[] {"XXX", "XXX", "XXX", 'X', IngotSteel});
		GameRegistry.addRecipe(new ItemStack(BlockTin), new Object[] {"XXX", "XXX", "XXX", 'X', IngotTin});
		
		// @Add Tool Crafting
		GameRegistry.addRecipe(new ItemStack(AxeAluminium), new Object[] {" XX", " *X", " * ", 'X', IngotAluminium, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(AxeCopper), new Object[] {" XX", " *X", " * ", 'X', IngotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(AxePlatinum), new Object[] {" XX", " *X", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(AxeSilver), new Object[] {" XX", " *X", " * ", 'X', IngotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(AxeSteel), new Object[] {" XX", " *X", " * ", 'X', IngotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(AxeTin), new Object[] {" XX", " *X", " * ", 'X', IngotTin, '*', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(HoeAluminium), new Object[] {" XX", " * ", " * ", 'X', IngotAluminium, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(HoeCopper), new Object[] {" XX", " * ", " * ", 'X', IngotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(HoePlatinum), new Object[] {" XX", " * ", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(HoeSilver), new Object[] {" XX", " * ", " * ", 'X', IngotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(HoeSteel), new Object[] {" XX", " * ", " * ", 'X', IngotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(HoeTin), new Object[] {" XX", " * ", " * ", 'X', IngotTin, '*', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(PickAluminium), new Object[] {"XXX", " * ", " * ", 'X', IngotAluminium, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(PickCopper), new Object[] {"XXX", " * ", " * ", 'X', IngotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(PickPlatinum), new Object[] {"XXX", " * ", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(PickSilver), new Object[] {"XXX", " * ", " * ", 'X', IngotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(PickSteel), new Object[] {"XXX", " * ", " * ", 'X', IngotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(PickTin), new Object[] {"XXX", " * ", " * ", 'X', IngotTin, '*', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(ShovelAluminium), new Object[] {" X ", " * ", " * ", 'X', IngotAluminium, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ShovelCopper), new Object[] {" X ", " * ", " * ", 'X', IngotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ShovelPlatinum), new Object[] {" X ", " * ", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ShovelSilver), new Object[] {" X ", " * ", " * ", 'X', IngotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ShovelSteel), new Object[] {" X ", " * ", " * ", 'X', IngotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ShovelTin), new Object[] {" X ", " * ", " * ", 'X', IngotTin, '*', Item.stick});
				
		GameRegistry.addRecipe(new ItemStack(SwordAluminium), new Object[] {" X ", " X ", " * ", 'X', IngotAluminium, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(SwordCopper), new Object[] {" X ", " X ", " * ", 'X', IngotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(SwordPlatinum), new Object[] {" X ", " X ", " * ", 'X', IngotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(SwordSilver), new Object[] {" X ", " X ", " * ", 'X', IngotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(SwordSteel), new Object[] {" X ", " X ", " * ", 'X', IngotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(SwordTin), new Object[] {" X ", " X ", " * ", 'X', IngotTin, '*', Item.stick});
	}

	public static void toolClasses() {
		MinecraftForge.setToolClass(PickAluminium, "pickaxe", 2);
		MinecraftForge.setToolClass(PickCopper, "pickaxe", 2);
		MinecraftForge.setToolClass(PickPlatinum, "pickaxe", 2);
		MinecraftForge.setToolClass(PickSilver, "pickaxe", 2);
		MinecraftForge.setToolClass(PickSteel, "pickaxe", 2);
		MinecraftForge.setToolClass(PickTin, "pickaxe", 2);
		
		MinecraftForge.setToolClass(AxeAluminium, "axe", 2);
		MinecraftForge.setToolClass(AxeCopper, "axe", 2);
		MinecraftForge.setToolClass(AxePlatinum, "axe", 2);
		MinecraftForge.setToolClass(AxeSilver, "axe", 2);
		MinecraftForge.setToolClass(AxeSteel, "axe", 2);
		MinecraftForge.setToolClass(AxeTin, "axe", 2);
        
		MinecraftForge.setToolClass(ShovelAluminium, "shovel", 2);
		MinecraftForge.setToolClass(ShovelCopper, "shovel", 2);
		MinecraftForge.setToolClass(ShovelPlatinum, "shovel", 2);
		MinecraftForge.setToolClass(ShovelSilver, "shovel", 2);
		MinecraftForge.setToolClass(ShovelSteel, "shovel", 2);
		MinecraftForge.setToolClass(ShovelTin, "shovel", 2);
        
		MinecraftForge.setToolClass(HoeAluminium, "hoe", 2);
		MinecraftForge.setToolClass(HoeCopper, "hoe", 2);
		MinecraftForge.setToolClass(HoePlatinum, "hoe", 2);
		MinecraftForge.setToolClass(HoeSilver, "hoe", 2);
		MinecraftForge.setToolClass(HoeSteel, "hoe", 2);
		MinecraftForge.setToolClass(HoeTin, "hoe", 2);
	}
	
	public static void postInit() {
		// @Add WorldGenerator
		GameRegistry.registerWorldGenerator(new emecWorldGenerator());
	}
	
}
