package com.nexized.emec.common.instance;

import com.nexized.emec.block.blockIngot.blockFosil;
import com.nexized.emec.block.blockOre.oreAluminium;
import com.nexized.emec.block.blockOre.oreCopper;
import com.nexized.emec.block.blockOre.orePlatinum;
import com.nexized.emec.block.blockOre.oreSilver;
import com.nexized.emec.block.blockOre.oreTin;
import com.nexized.emec.common.ConfigurationHandler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
		public static Block BlockFosil;
		
	public static void addBlocks(ConfigurationHandler common) {
		
				// @Add Block Ores
				OreAluminium = (new oreAluminium(common.oreAluminiumID));
				OreCopper = (new oreCopper(common.oreCopperID));
				OrePlatinum = (new orePlatinum(common.orePlatinumID));
				OreSilver = (new oreSilver(common.oreSilverID));
				OreTin = (new oreTin(common.oreTinID));
				BlockFosil = (new blockFosil(common.blockFosilID, Material.iron));
				
				// @Register Ores
				GameRegistry.registerBlock(OreAluminium, "AluminiumOre");
				GameRegistry.registerBlock(OreCopper, "CopperOre");
				GameRegistry.registerBlock(OrePlatinum, "PlatinumOre");
				GameRegistry.registerBlock(OreSilver, "SilverOre");
				GameRegistry.registerBlock(OreTin, "TinOre");
				
				// @BlockHarvest
				MinecraftForge.setBlockHarvestLevel(OreAluminium, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OreCopper, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OrePlatinum, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OreSilver, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(OreTin, "Pickaxe", 2);
				MinecraftForge.setBlockHarvestLevel(BlockFosil, "Pickaxe", 3);
	}
	
	public static void addNames() {
		// @Add Block Ores Names
				LanguageRegistry.addName(OreAluminium, "Aluminium Ore");
				LanguageRegistry.addName(OreCopper, "Copper Ore");
				LanguageRegistry.addName(OrePlatinum, "Platinum Ore");
				LanguageRegistry.addName(OreSilver, "Silver Ore");
				LanguageRegistry.addName(OreTin, "Tin Ore");
				LanguageRegistry.addName(BlockFosil, "Fosil Block");
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
