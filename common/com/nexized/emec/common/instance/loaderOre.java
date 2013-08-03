package com.nexized.emec.common.instance;

import com.nexized.emec.block.blockOre.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class loaderOre extends loaderIngot {

	// @Block Ores
		public static Block OreAluminium;
		public static Block OreCopper;
		public static Block OrePlatinum;
		public static Block OreSilver;
		public static Block OreTin;
	
		// @Additional Blocks
		public static Block OreFossil;
		public static Block OreExp;
		
	public static void addBlocks(configurationHandler common) {
		
				// @Add Block Ores
				OreAluminium = (new oreAluminium(common.oreAluminiumID)).setUnlocalizedName("oreAluminium");
				OreCopper = (new oreCopper(common.oreCopperID)).setUnlocalizedName("oreCopper");
				OrePlatinum = (new orePlatinum(common.orePlatinumID)).setUnlocalizedName("orePlatinum");
				OreSilver = (new oreSilver(common.oreSilverID)).setUnlocalizedName("oreSilver");
				OreTin = (new oreTin(common.oreTinID)).setUnlocalizedName("oreTin");
				OreFossil = (new oreFossil(common.oreFossilID)).setUnlocalizedName("oreFossil");
				OreExp = (new oreExperience(common.oreExpID).setUnlocalizedName("oreExp"));
				
				// @Register Ores
				GameRegistry.registerBlock(OreAluminium, "oreAluminium");
				GameRegistry.registerBlock(OreCopper, "oreCopper");
				GameRegistry.registerBlock(OrePlatinum, "orePlatinum");
				GameRegistry.registerBlock(OreSilver, "oreSilver");
				GameRegistry.registerBlock(OreTin, "oreTin");
				GameRegistry.registerBlock(OreFossil, "oreFossil");
				GameRegistry.registerBlock(OreExp, "oreFreeExp");
				
				// @BlockHarvest
				MinecraftForge.setBlockHarvestLevel(OreAluminium, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OreCopper, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OrePlatinum, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OreSilver, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OreTin, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OreFossil, "Pickaxe", 3);
				MinecraftForge.setBlockHarvestLevel(OreExp, "Pickaxe", 2);
	}
	
	public static void addNames() {
		// @Add Block Ores Names
				LanguageRegistry.addName(OreAluminium, "Aluminium Ore");
				LanguageRegistry.addName(OreCopper, "Copper Ore");
				LanguageRegistry.addName(OrePlatinum, "Platinum Ore");
				LanguageRegistry.addName(OreSilver, "Silver Ore");
				LanguageRegistry.addName(OreTin, "Tin Ore");
				LanguageRegistry.addName(OreFossil, "Fossil Ore");
				LanguageRegistry.addName(OreExp, "Experience Ore");
	}
	
	public static void addRecipes() {
		// @Add Ingot Smelling
		GameRegistry.addSmelting(OreAluminium.blockID, new ItemStack(IngotAluminium), 10.0F);
		GameRegistry.addSmelting(OreCopper.blockID, new ItemStack(IngotCopper), 10.0F);
		GameRegistry.addSmelting(OrePlatinum.blockID, new ItemStack(IngotPlatinum), 10.0F);
		GameRegistry.addSmelting(OreSilver.blockID, new ItemStack(IngotSilver), 10.0F);
		GameRegistry.addSmelting(OreTin.blockID, new ItemStack(IngotTin), 10.0F);
	}
}
