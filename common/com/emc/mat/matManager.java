package com.emc.mat;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-01
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.emc;
import com.emc.block.emcBlock;
import com.emc.block.emcOre;
import com.emc.conf.idManager;
import com.emc.item.emcArmor;
import com.emc.item.emcItem;
import com.emc.item.tools.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public class matManager {

	// @EnumToolMaterial (For itemTool Object)
	public static EnumToolMaterial materialAluminum = EnumHelper.addToolMaterial("ALUMINUM", 2, 200, 5.0F, 2, 14);
	public static EnumToolMaterial materialBronze = EnumHelper.addToolMaterial("BRONZE", 3, 300, 6.0F, 3, 14);
	public static EnumToolMaterial materialCopper = EnumHelper.addToolMaterial("COPPER", 2, 200, 4.0F, 2, 14);
	public static EnumToolMaterial materialPlatinum = EnumHelper.addToolMaterial("PLATINUM", 3, 2000, 12.0F, 4, 10);
	public static EnumToolMaterial materialSilver = EnumHelper.addToolMaterial("SILVER", 2, 1600, 6.0F, 2, 14);
	public static EnumToolMaterial materialSteel = EnumHelper.addToolMaterial("STEEL", 3, 2400, 16.0F, 6, 10);
    public static EnumToolMaterial materialTin = EnumHelper.addToolMaterial("TIN", 2, 200, 6.0F, 2, 14);
    
    // @EnumArmorMaterial (for itemArmor Object)
    public static EnumArmorMaterial armorAluminum = EnumHelper.addArmorMaterial("ALUMINUM", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorBronze = EnumHelper.addArmorMaterial("BRONZE", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorCopper = EnumHelper.addArmorMaterial("COPPER", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorPlatinum = EnumHelper.addArmorMaterial("PLATINUM", 16, new int[] {4, 6, 4, 2}, 16);
    public static EnumArmorMaterial armorSilver = EnumHelper.addArmorMaterial("SILVER", 12, new int[] {3, 4, 3, 2}, 12);
    public static EnumArmorMaterial armorSteel = EnumHelper.addArmorMaterial("STEEL", 32, new int[] {8, 12, 8, 4}, 32);
    public static EnumArmorMaterial armorTin= EnumHelper.addArmorMaterial("TIN", 8, new int[] {2, 3, 2, 1}, 8);
	
    // @Armor Renders
 	public static int armorAluminumRenderer;
 	public static int armorBronzeRenderer;
    public static int armorCopperRenderer;
    public static int armorPlatinumRenderer;
    public static int armorSilverRenderer;
    public static int armorSteelRenderer;
    public static int armorTinRenderer;
    
    // @oreBlocks
 	public static Block oreAluminum;
 	public static Block oreCopper;
 	public static Block orePlatinum;
 	public static Block oreSilver;
 	public static Block oreTin;
 	public static Block oreExperience;
 	public static Block blockFosil;
 	
 	// @ingotBlocks
 	public static Block blockAluminum;
 	public static Block blockBronze;
 	public static Block blockCopper;
 	public static Block blockPlatinum;
 	public static Block blockSilver;
 	public static Block blockSteel;
 	public static Block blockTin;
 	
 	// @biomeBlocks
 	public static Block blockFreezer;
 	public static Block blockCloud;
    
 	// @itemIngot
 	public static Item ingotAluminum;
 	public static Item ingotBronze;
 	public static Item ingotCopper;
 	public static Item ingotPlatinum;
 	public static Item ingotSilver;
 	public static Item ingotSteel;
 	public static Item ingotTin;
 	
 	/* @itemArmor Aluminum
	public static Item helmAluminum;
	public static Item chestAluminum;
	public static Item legsAluminum;
	public static Item bootsAluminum;
 	*/
 	
 	// @itemArmor Bronze
	public static Item helmBronze;
	public static Item chestBronze;
	public static Item legsBronze;
	public static Item bootsBronze;
	
	// @itemArmor Copper
	public static Item helmCopper;
	public static Item chestCopper;
	public static Item legsCopper;
	public static Item bootsCopper;

	/* @itemArmor Platinum	
	public static Item helmPlatinum;
	public static Item chestPlatinum;
	public static Item legsPlatinum;
	public static Item bootsPlatinum;
	*/
	
	/* @itemArmor Silver
	public static Item helmSilver;
	public static Item chestSilver;
	public static Item legsSilver;
	public static Item bootsSilver;
	*/

	public static Item helmSteel;
	public static Item chestSteel;
	public static Item legsSteel;
	public static Item bootsSteel;

	/* @itemArmor Tin
	public static Item helmTin;
	public static Item chestTin;
	public static Item legsTin;
	public static Item bootsTin;
	*/	
 	
	public static Item axeAluminum;
	public static Item axeCopper;
	public static Item axePlatinum;
	public static Item axeSilver;
	public static Item axeSteel;
	public static Item axeTin;
	public static Item axeBronze;
	
	public static Item hoeAluminum;
	public static Item hoeCopper;
	public static Item hoePlatinum;
	public static Item hoeSilver;
	public static Item hoeSteel;
	public static Item hoeTin;
	public static Item hoeBronze;
	
	public static Item shovelAluminum;
	public static Item shovelCopper;
	public static Item shovelPlatinum;
	public static Item shovelSilver;
	public static Item shovelSteel;
	public static Item shovelTin;
	public static Item shovelBronze;
	
	public static Item pickAluminum;
	public static Item pickCopper;
	public static Item pickPlatinum;
	public static Item pickSilver;
	public static Item pickSteel;
	public static Item pickTin;
	public static Item pickBronze;
	
	public static Item swordAluminum;
	public static Item swordCopper;
	public static Item swordPlatinum;
	public static Item swordSilver;
	public static Item swordSteel;
	public static Item swordTin;
	public static Item swordBronze;
	
 	public static void addBlocks(idManager idm, CreativeTabs tab)
	{
 		// Check if @oreBlocks are enabled
 		if (idm.ifEnabled("@oreBlock")) {
 			float oreRes = 5.0F;
 			
 			// Initialize new @oreBlocks
 			oreAluminum = new emcOre(idm.getBlockID("oreAluminum"), Material.rock, tab).setHardness(3.0F).setResistance(oreRes).setUnlocalizedName("oreAluminum");
			oreCopper = new emcOre(idm.getBlockID("oreCopper"), Material.rock, tab).setHardness(1.7F).setResistance(oreRes).setUnlocalizedName("oreCopper");
			orePlatinum = new emcOre(idm.getBlockID("orePlatinum"), Material.rock, tab).setHardness(5.0F).setResistance(oreRes).setUnlocalizedName("orePlatinum");
			oreSilver = new emcOre(idm.getBlockID("oreSilver"), Material.rock, tab).setHardness(3.0F).setResistance(oreRes).setUnlocalizedName("oreSilver");
			oreTin = new emcOre(idm.getBlockID("oreTin"), Material.rock, tab).setHardness(1.7F).setResistance(oreRes).setUnlocalizedName("oreTin");
			oreExperience = new emcOre(idm.getBlockID("oreExperience"), Material.rock, tab).setHardness(3.0F).setResistance(oreRes).setUnlocalizedName("oreExperience");
			blockFosil = new emcBlock(idm.getBlockID("blockFosil"), Material.rock, tab).setHardness(1.7F).setResistance(oreRes).setUnlocalizedName("blockFosil");
			
			MinecraftForge.setBlockHarvestLevel(oreAluminum, "pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
			MinecraftForge.setBlockHarvestLevel(orePlatinum, "pickaxe", 3);
			MinecraftForge.setBlockHarvestLevel(oreSilver, "pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
			MinecraftForge.setBlockHarvestLevel(oreExperience, "pickaxe", 2);
			
			GameRegistry.registerBlock(oreAluminum, oreAluminum.getUnlocalizedName());
			GameRegistry.registerBlock(oreCopper, oreCopper.getUnlocalizedName());
			GameRegistry.registerBlock(orePlatinum, orePlatinum.getUnlocalizedName());
			GameRegistry.registerBlock(oreSilver, oreSilver.getUnlocalizedName());
			GameRegistry.registerBlock(oreTin, oreTin.getUnlocalizedName());
			GameRegistry.registerBlock(oreExperience, oreExperience.getUnlocalizedName());
			GameRegistry.registerBlock(blockFosil, blockFosil.getUnlocalizedName());
			
			OreDictionary.registerOre("oreAluminum", new ItemStack(oreAluminum));
			OreDictionary.registerOre("oreCopper", new ItemStack(oreCopper));
			OreDictionary.registerOre("orePlatinum", new ItemStack(orePlatinum));
			OreDictionary.registerOre("oreSilver", new ItemStack(oreSilver));
			OreDictionary.registerOre("oreTin", new ItemStack(oreTin));
 		}
 		
 		// Check if @ingotBlocks are enabled
 		if(idm.ifEnabled("@ingotBlock")) {
 			float blockRes = 12.0F;
 			
 			// Initialize new @ingotBlocks
 			blockAluminum = new emcBlock(idm.getBlockID("blockAluminum"), Material.iron, tab).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("blockAluminum");
			blockBronze = new emcBlock(idm.getBlockID("blockBronze"), Material.iron, tab).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("blockBronze");
			blockCopper = new emcBlock(idm.getBlockID("blockCopper"), Material.iron, tab).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("blockCopper");
			blockPlatinum = new emcBlock(idm.getBlockID("blockPlatinum"), Material.iron, tab).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("blockPlatinum");
			blockSilver = new emcBlock(idm.getBlockID("blockSilver"), Material.iron, tab).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("blockSilver");
			blockSteel = new emcBlock(idm.getBlockID("blockSteel"), Material.iron, tab).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("blockSteel");
			blockTin = new emcBlock(idm.getBlockID("blockTin"), Material.iron, tab).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("blockTin");
			
			GameRegistry.registerBlock(blockAluminum, blockAluminum.getUnlocalizedName());
			GameRegistry.registerBlock(blockCopper, blockCopper.getUnlocalizedName());
			GameRegistry.registerBlock(blockPlatinum, blockPlatinum.getUnlocalizedName());
			GameRegistry.registerBlock(blockSilver, blockSilver.getUnlocalizedName());
			GameRegistry.registerBlock(blockSteel, blockSteel.getUnlocalizedName());
			GameRegistry.registerBlock(blockTin, blockTin.getUnlocalizedName());
 		}
 		
 		// Check if @biomeblocks are enabled
 		if(idm.ifEnabled("@biome")) {
 			float blockRes = 12.0F;
 			
 			// Initialize new @biomeblocks
 			blockFreezer = new emcBlock(idm.getBlockID("blockFreezer"), Material.rock, tab).setHardness(4.0F).setResistance(blockRes).setUnlocalizedName("blockFreezer");
			blockCloud = new emcBlock(idm.getBlockID("blockCloud"), Material.rock, tab).setHardness(4.0F).setResistance(blockRes).setUnlocalizedName("blockCloud");
 		}
 		
	}
 	
 	public static void addItems(idManager idm, CreativeTabs tab) {
 		// Check if @itemIngots are enabled 
 		if(idm.ifEnabled("@itemIngot")) {
 			// Initialize new @itemIngots
 			ingotAluminum = new emcItem(idm.getItemID("ingotAluminum"), tab).setUnlocalizedName("ingotAluminum");
 			ingotBronze = new emcItem(idm.getItemID("ingotBronze"), tab).setUnlocalizedName("ingotBronze");
 			ingotCopper = new emcItem(idm.getItemID("ingotCopper"), tab).setUnlocalizedName("ingotCopper");
 			ingotPlatinum = new emcItem(idm.getItemID("ingotPlatinum"), tab).setUnlocalizedName("ingotPlatinum");
 			ingotSilver = new emcItem(idm.getItemID("ingotSilver"), tab).setUnlocalizedName("ingotSilver");
 			ingotSteel = new emcItem(idm.getItemID("ingotSteel"), tab).setUnlocalizedName("ingotSteel");
 			ingotTin = new emcItem(idm.getItemID("ingotTin"), tab).setUnlocalizedName("ingotTin");
 		}
 	}
 	
 	public static void addArmor(idManager idm, CreativeTabs tab) {
 		// Check if @armor is enabled
 		if(idm.ifEnabled("@armor")) {
 			// Initialize new @itemArmor
 			
 			/* @itemArmor Aluminum
 			helmAluminum = new emcArmor(idm.getItemID("helmAluminum"), armorAluminum, armorAluminumRenderer, 0, "aluminum", tab).setUnlocalizedName("helmAluminum");
 			chestAluminum = new emcArmor(idm.getItemID("chestAluminum"), armorAluminum, armorAluminumRenderer, 1, "aluminum", tab).setUnlocalizedName("chestAluminum");
 			legsAluminum = new emcArmor(idm.getItemID("legsAluminum"), armorAluminum, armorAluminumRenderer, 2, "aluminum", tab).setUnlocalizedName("legsAluminum");
 			bootsAluminum = new emcArmor(idm.getItemID("bootsAluminum"), armorAluminum, armorAluminumRenderer, 3, "aluminum", tab).setUnlocalizedName("bootsAluminum");
 			*/
 			
 			// @itemArmor Bronze
 			helmBronze = new emcArmor(idm.getItemID("helmBronze"), armorBronze, armorBronzeRenderer, 0, "bronze", tab).setUnlocalizedName("helmBronze");
 			chestBronze = new emcArmor(idm.getItemID("chestBronze"), armorBronze, armorBronzeRenderer, 1, "bronze", tab).setUnlocalizedName("chestBronze");
 			legsBronze = new emcArmor(idm.getItemID("legsBronze"), armorBronze, armorBronzeRenderer, 2, "bronze", tab).setUnlocalizedName("legsBronze");
 			bootsBronze = new emcArmor(idm.getItemID("bootsBronze"), armorBronze, armorBronzeRenderer, 3, "bronze", tab).setUnlocalizedName("bootsBronze");
 			
 			// @itemArmor Copper
 			helmCopper = new emcArmor(idm.getItemID("helmCopper"), armorCopper, armorCopperRenderer, 0, "copper", tab).setUnlocalizedName("helmCopper");
 			chestCopper = new emcArmor(idm.getItemID("chestCopper"), armorCopper, armorCopperRenderer, 1, "copper", tab).setUnlocalizedName("chestCopper");
 			legsCopper = new emcArmor(idm.getItemID("legsCopper"), armorCopper, armorCopperRenderer, 2, "copper", tab).setUnlocalizedName("legsCopper");
 			bootsCopper = new emcArmor(idm.getItemID("bootsCopper"), armorCopper, armorCopperRenderer, 3, "copper", tab).setUnlocalizedName("bootsCopper");
 			
 			/* @itemArmor Platinum
 			helmPlatinum = new emcArmor(idm.getItemID("helmPlatinum"), armorPlatinum, armorPlatinumRenderer, 0, "platinum", tab).setUnlocalizedName("helmPlatinum");
 			chestPlatinum = new emcArmor(idm.getItemID("chestPlatinum"), armorPlatinum, armorPlatinumRenderer, 1, "platinum", tab).setUnlocalizedName("chestPlatinum");
 			legsPlatinum = new emcArmor(idm.getItemID("legsPlatinum"), armorPlatinum, armorPlatinumRenderer, 2, "platinum", tab).setUnlocalizedName("legsPlatinum");
 			bootsPlatinum = new emcArmor(idm.getItemID("bootsPlatinum"), armorPlatinum, armorPlatinumRenderer, 3, "platinum", tab).setUnlocalizedName("bootsPlatinum");
 			*/
 			
 			/* @itemArmor Silver
 			helmSilver = new emcArmor(idm.getItemID("helmSilver"), armorSilver, armorSilverRenderer, 0, "silver", tab).setUnlocalizedName("helmSilver");
 			chestSilver = new emcArmor(idm.getItemID("chestSilver"), armorSilver, armorSilverRenderer, 1, "silver", tab).setUnlocalizedName("chestSilver");
 			legsSilver = new emcArmor(idm.getItemID("legsSilver"), armorSilver, armorSilverRenderer, 2, "silver", tab).setUnlocalizedName("legsSilver");
 			bootsSilver = new emcArmor(idm.getItemID("bootsSilver"), armorSilver, armorSilverRenderer, 3, "silver", tab).setUnlocalizedName("bootsSilver");
 			*/
 			
 			// @itemArmor Steel
 			helmSteel = new emcArmor(idm.getItemID("helmSteel"), armorSteel, armorSteelRenderer, 0, "steel", tab).setUnlocalizedName("helmSteel");
 			chestSteel = new emcArmor(idm.getItemID("chestSteel"), armorSteel, armorSteelRenderer, 1, "steel", tab).setUnlocalizedName("chestSteel");
 			legsSteel = new emcArmor(idm.getItemID("legsSteel"), armorSteel, armorSteelRenderer, 2, "steel", tab).setUnlocalizedName("legsSteel");
 			bootsSteel = new emcArmor(idm.getItemID("bootsSteel"), armorSteel, armorSteelRenderer, 3, "steel", tab).setUnlocalizedName("bootsSteel");
 			
 			/* @itemArmor Tin
 			helmTin = new emcArmor(idm.getItemID("helmTin"), armorTin, armorTinRenderer, 0, "tin", tab).setUnlocalizedName("helmTin");
 			chestTin = new emcArmor(idm.getItemID("chestTin"), armorTin, armorTinRenderer, 1, "tin", tab).setUnlocalizedName("chestTin");
 			legsTin = new emcArmor(idm.getItemID("legsTin"), armorTin, armorTinRenderer, 2, "tin", tab).setUnlocalizedName("legsTin");
 			bootsTin = new emcArmor(idm.getItemID("bootsTin"), armorTin, armorTinRenderer, 3, "tin", tab).setUnlocalizedName("bootsTin");
 			*/
 			
 			armorAluminumRenderer = emc.proxy.addArmor("aluminum");
 			armorBronzeRenderer = emc.proxy.addArmor("bronze");
 			armorCopperRenderer = emc.proxy.addArmor("copper");
 			armorPlatinumRenderer = emc.proxy.addArmor("platinum");
 			armorSilverRenderer = emc.proxy.addArmor("silver");
 			armorSteelRenderer = emc.proxy.addArmor("steel");
 			armorTinRenderer = emc.proxy.addArmor("tin");
 			
 			
 			if(idm.ifEnabled("@ingotBlock")) {
 				// @itemArmor Bronze
 				GameRegistry.addRecipe(new ItemStack(helmBronze), new Object[]{"XXX", "X X", 'X', ingotBronze});
 				GameRegistry.addRecipe(new ItemStack(chestBronze), new Object[]{"X X", "XXX", "XXX", 'X', ingotBronze});
 				GameRegistry.addRecipe(new ItemStack(legsBronze), new Object[]{"XXX", "X X", "X X", 'X', ingotBronze});
 				GameRegistry.addRecipe(new ItemStack(bootsBronze), new Object[]{"X X", "X X", 'X', ingotBronze});
 				// @itemArmor Copper
 				GameRegistry.addRecipe(new ItemStack(helmCopper), new Object[]{"XXX", "X X", 'X', ingotCopper});
 				GameRegistry.addRecipe(new ItemStack(chestCopper), new Object[]{"X X", "XXX", "XXX", 'X', ingotCopper});
 				GameRegistry.addRecipe(new ItemStack(legsCopper), new Object[]{"XXX", "X X", "X X", 'X', ingotCopper});
 				GameRegistry.addRecipe(new ItemStack(bootsCopper), new Object[]{"X X", "X X", 'X', ingotCopper});
 				// @itemArmor Steel
 				GameRegistry.addRecipe(new ItemStack(helmSteel), new Object[]{"XXX", "X X", 'X', ingotSteel});
 				GameRegistry.addRecipe(new ItemStack(chestSteel), new Object[]{"X X", "XXX", "XXX", 'X', ingotSteel});
 				GameRegistry.addRecipe(new ItemStack(legsSteel), new Object[]{"XXX", "X X", "X X", 'X', ingotSteel});
 				GameRegistry.addRecipe(new ItemStack(bootsSteel), new Object[]{"X X", "X X", 'X', ingotSteel});
 			}
 		}
 	}
 	
 	public static void addTools(idManager idm, CreativeTabs tab) {
 		// Check if @toolAxe is enabled
 		if(idm.ifEnabled("@toolAxe")) {
 			// Initialize new @toolAxe
 			axeAluminum = new toolAxe(idm.getItemID("axeAluminum"), materialAluminum, tab).setUnlocalizedName("axeAluminum");
 			axeCopper = new toolAxe(idm.getItemID("axeCopper"), materialCopper, tab).setUnlocalizedName("axeCopper");
 			axePlatinum = new toolAxe(idm.getItemID("axePlatinum"), materialPlatinum, tab).setUnlocalizedName("axePlatinum");
 			axeSilver = new toolAxe(idm.getItemID("axeSilver"), materialSilver, tab).setUnlocalizedName("axeSilver");
 			axeSteel = new toolAxe(idm.getItemID("axeSteel"), materialSteel, tab).setUnlocalizedName("axeSteel");
 			axeTin = new toolAxe(idm.getItemID("axeTin"), materialTin, tab).setUnlocalizedName("axeTin");
 			axeBronze = new toolAxe(idm.getItemID("axeBronze"), materialBronze, tab).setUnlocalizedName("axeBronze");
 		
 			MinecraftForge.setToolClass(axeAluminum, "axe", 2);
 			MinecraftForge.setToolClass(axeCopper, "axe", 2);
 			MinecraftForge.setToolClass(axePlatinum, "axe", 3);
 			MinecraftForge.setToolClass(axeSilver, "axe", 2);
 			MinecraftForge.setToolClass(axeSteel, "axe", 4);
 			MinecraftForge.setToolClass(axeTin, "axe", 2);
 			
 			if(idm.ifEnabled("@itemIngot")) {
	 			GameRegistry.addRecipe(new ItemStack(axeAluminum), new Object[] {" XX", " *X", " * ", 'X', ingotAluminum, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(axeCopper), new Object[] {" XX", " *X", " * ", 'X', ingotCopper, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(axePlatinum), new Object[] {" XX", " *X", " * ", 'X', ingotPlatinum, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(axeSilver), new Object[] {" XX", " *X", " * ", 'X',ingotSilver, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(axeSteel), new Object[] {" XX", " *X", " * ", 'X', ingotSteel, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(axeTin), new Object[] {" XX", " *X", " * ", 'X', ingotTin, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(axeBronze), new Object[] {" XX", " *X", " * ", 'X', ingotBronze, '*', Item.stick});
 			}
 		}
 		// Check if @toolHoe is enabled
 		if(idm.ifEnabled("@toolHoe")) {
 		// Initialize new @toolHoe
 			hoeAluminum = new toolHoe(idm.getItemID("hoeAluminum"), materialAluminum, tab).setUnlocalizedName("hoeAluminum");
 			hoeCopper = new toolHoe(idm.getItemID("hoeCopper"), materialCopper, tab).setUnlocalizedName("hoeCopper");
 			hoePlatinum = new toolHoe(idm.getItemID("hoePlatinum"), materialPlatinum, tab).setUnlocalizedName("hoePlatinum");
 			hoeSilver = new toolHoe(idm.getItemID("hoeSilver"), materialSilver, tab).setUnlocalizedName("hoeSilver");
 			hoeSteel = new toolHoe(idm.getItemID("hoeSteel"), materialSteel, tab).setUnlocalizedName("hoeSteel");
 			hoeTin = new toolHoe(idm.getItemID("hoeTin"), materialTin, tab).setUnlocalizedName("hoeTin");
 			hoeBronze = new toolHoe(idm.getItemID("hoeBronze"), materialBronze, tab).setUnlocalizedName("axeBronze");
 		
 			MinecraftForge.setToolClass(hoeAluminum, "hoe", 2);
 			MinecraftForge.setToolClass(hoeCopper, "hoe", 2);
 			MinecraftForge.setToolClass(hoePlatinum, "hoe", 3);
 			MinecraftForge.setToolClass(hoeSilver, "hoe", 2);
 			MinecraftForge.setToolClass(hoeSteel, "hoe", 4);
 			MinecraftForge.setToolClass(hoeTin, "hoe", 2);
 			
 			if(idm.ifEnabled("@itemIngot")) {
	 			GameRegistry.addRecipe(new ItemStack(hoeAluminum), new Object[] {" XX", " * ", " * ", 'X', ingotAluminum, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(hoeCopper), new Object[] {" XX", " * ", " * ", 'X', ingotCopper, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(hoePlatinum), new Object[] {" XX", " * ", " * ", 'X', ingotPlatinum, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(hoeSilver), new Object[] {" XX", " * ", " * ", 'X', ingotSilver, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(hoeSteel), new Object[] {" XX", " * ", " * ", 'X', ingotSteel, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(hoeTin), new Object[] {" XX", " * ", " * ", 'X', ingotTin, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(hoeBronze), new Object[] {" XX", " * ", " * ", 'X', ingotBronze, '*', Item.stick});
 			}
 		}
 		// Check if @toolPick is enabled
 		if(idm.ifEnabled("@toolPick")) {
 		// Initialize new @toolPick
 			pickAluminum = new toolPick(idm.getItemID("pickAluminum"), materialAluminum, tab).setUnlocalizedName("pickAluminum");
 			pickCopper = new toolPick(idm.getItemID("pickCopper"), materialCopper, tab).setUnlocalizedName("pickCopper");
 			pickPlatinum = new toolPick(idm.getItemID("pickPlatinum"), materialPlatinum, tab).setUnlocalizedName("pickPlatinum");
 			pickSilver = new toolPick(idm.getItemID("pickSilver"), materialSilver, tab).setUnlocalizedName("pickSilver");
 			pickSteel = new toolPick(idm.getItemID("pickSteel"), materialSteel, tab).setUnlocalizedName("pickSteel");
 			pickTin = new toolPick(idm.getItemID("pickTin"), materialTin, tab).setUnlocalizedName("pickTin");
 			pickBronze = new toolPick(idm.getItemID("pickBronze"), materialBronze, tab).setUnlocalizedName("pickBronze");
 		
 			MinecraftForge.setToolClass(pickAluminum, "pickaxe", 2);
 			MinecraftForge.setToolClass(pickCopper, "pickaxe", 2);
 			MinecraftForge.setToolClass(pickPlatinum, "pickaxe", 3);
 			MinecraftForge.setToolClass(pickSilver, "pickaxe", 2);
 			MinecraftForge.setToolClass(pickSteel, "pickaxe", 4);
 			MinecraftForge.setToolClass(pickTin, "pickaxe", 2);
 			
 			if(idm.ifEnabled("@itemIngot")) {
	 			GameRegistry.addRecipe(new ItemStack(pickAluminum), new Object[] {"XXX", " * ", " * ", 'X', ingotAluminum, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(pickCopper), new Object[] {"XXX", " * ", " * ", 'X', ingotCopper, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(pickPlatinum), new Object[] {"XXX", " * ", " * ", 'X', ingotPlatinum, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(pickSilver), new Object[] {"XXX", " * ", " * ", 'X', ingotSilver, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(pickSteel), new Object[] {"XXX", " * ", " * ", 'X', ingotSteel, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(pickTin), new Object[] {"XXX", " * ", " * ", 'X', ingotTin, '*', Item.stick});
	 			GameRegistry.addRecipe(new ItemStack(pickBronze), new Object[] {"XXX", " * ", " * ", 'X', ingotBronze, '*', Item.stick});
 			}
 		}
 		if(idm.ifEnabled("@toolShovel")) {
 		// Initialize new @toolShovel
 			shovelAluminum = new toolShovel(idm.getItemID("shovelAluminum"), materialAluminum, tab).setUnlocalizedName("shovelAluminum");
 			shovelCopper = new toolShovel(idm.getItemID("shovelCopper"), materialCopper, tab).setUnlocalizedName("shovelCopper");
 			shovelPlatinum = new toolShovel(idm.getItemID("shovelPlatinum"), materialPlatinum, tab).setUnlocalizedName("shovelPlatinum");
 			shovelSilver = new toolShovel(idm.getItemID("shovelSilver"), materialSilver, tab).setUnlocalizedName("shovelSilver");
 			shovelSteel = new toolShovel(idm.getItemID("shovelSteel"), materialSteel, tab).setUnlocalizedName("shovelSteel");
 			shovelTin = new toolShovel(idm.getItemID("shovelTin"), materialTin, tab).setUnlocalizedName("shovelTin");
 			shovelBronze = new toolShovel(idm.getItemID("shovelBronze"), materialBronze, tab).setUnlocalizedName("shovelBronze");
 			
 			MinecraftForge.setToolClass(shovelAluminum, "shovel", 2);
 			MinecraftForge.setToolClass(shovelCopper, "shovel", 2);
 			MinecraftForge.setToolClass(shovelPlatinum, "shovel", 3);
 			MinecraftForge.setToolClass(shovelSilver, "shovel", 2);
 			MinecraftForge.setToolClass(shovelSteel, "shovel", 4);
 			MinecraftForge.setToolClass(shovelTin, "shovel", 2);
 			
 			if(idm.ifEnabled("@itemIngot")) {
 				GameRegistry.addRecipe(new ItemStack(shovelAluminum), new Object[] {" X ", " * ", " * ", 'X', ingotAluminum, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(shovelCopper), new Object[] {" X ", " * ", " * ", 'X', ingotCopper, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(shovelPlatinum), new Object[] {" X ", " * ", " * ", 'X', ingotPlatinum, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(shovelSilver), new Object[] {" X ", " * ", " * ", 'X', ingotSilver, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(shovelSteel), new Object[] {" X ", " * ", " * ", 'X', ingotSteel, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(shovelTin), new Object[] {" X ", " * ", " * ", 'X', ingotTin, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(shovelBronze), new Object[] {" X ", " * ", " * ", 'X', ingotBronze, '*', Item.stick});
 			}
 		}
 		if(idm.ifEnabled("@toolSword")) {
 			swordAluminum = new toolSword(idm.getItemID("swordAluminum"), materialAluminum, tab).setUnlocalizedName("swordAluminum");
 			swordCopper = new toolSword(idm.getItemID("swordCopper"), materialCopper, tab).setUnlocalizedName("swordCopper");
 			swordPlatinum = new toolSword(idm.getItemID("swordPlatinum"), materialPlatinum, tab).setUnlocalizedName("swordPlatinum");
 			swordSilver = new toolSword(idm.getItemID("swordSilver"), materialSilver, tab).setUnlocalizedName("swordSilver");
 			swordSteel = new toolSword(idm.getItemID("swordSteel"), materialSteel, tab).setUnlocalizedName("swordSteel");
 			swordTin = new toolSword(idm.getItemID("swordTin"), materialTin, tab).setUnlocalizedName("swordTin");
 			swordBronze = new toolSword(idm.getItemID("swordBronze"), materialBronze, tab).setUnlocalizedName("swordBronze");
 			
 			if(idm.ifEnabled("@itemIngot")) {
 				GameRegistry.addRecipe(new ItemStack(swordAluminum), new Object[] {" X ", " X ", " * ", 'X', ingotAluminum, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordCopper), new Object[] {" X ", " X ", " * ", 'X', ingotCopper, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordPlatinum), new Object[] {" X ", " X ", " * ", 'X', ingotPlatinum, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordSilver), new Object[] {" X ", " X ", " * ", 'X', ingotSilver, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordSteel), new Object[] {" X ", " X ", " * ", 'X', ingotSteel, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordTin), new Object[] {" X ", " X ", " * ", 'X', ingotTin, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordBronze), new Object[] {" X ", " X ", " * ", 'X', ingotBronze, '*', Item.stick});
 			}
 		} 		
 	}
 	
 	public static void addRecipes(idManager idm) {
 		if(idm.ifEnabled("@itemIngot")) {
			GameRegistry.addSmelting(oreAluminum.blockID, new ItemStack(ingotAluminum), 1.0F);
			GameRegistry.addSmelting(oreCopper.blockID, new ItemStack(ingotCopper), 1.0F);
			GameRegistry.addSmelting(orePlatinum.blockID, new ItemStack(ingotPlatinum), 1.0F);
			GameRegistry.addSmelting(oreSilver.blockID, new ItemStack(ingotSilver), 1.0F);
			GameRegistry.addSmelting(oreTin.blockID, new ItemStack(ingotTin), 1.0F);
		}
 		if(idm.ifEnabled("@itemIngot")) {
			GameRegistry.addRecipe(new ItemStack(blockAluminum), new Object[] {"XXX", "XXX", "XXX", 'X', ingotAluminum});
			GameRegistry.addRecipe(new ItemStack(blockCopper), new Object[] {"XXX", "XXX", "XXX", 'X', ingotCopper});
			GameRegistry.addRecipe(new ItemStack(blockPlatinum), new Object[] {"XXX", "XXX", "XXX", 'X', ingotPlatinum});
			GameRegistry.addRecipe(new ItemStack(blockSilver), new Object[] {"XXX", "XXX", "XXX", 'X', ingotSilver});
			GameRegistry.addRecipe(new ItemStack(blockSteel), new Object[] {"XXX", "XXX", "XXX", 'X', ingotSteel});
			GameRegistry.addRecipe(new ItemStack(blockTin), new Object[] {"XXX", "XXX", "XXX", 'X', ingotTin});
			GameRegistry.addRecipe(new ItemStack(blockBronze), new Object[] {"XXX", "XXX", "XXX", 'X', ingotBronze});
		}
 		if(idm.ifEnabled("@ingotBlock")) {
 			GameRegistry.addRecipe(new ItemStack(ingotCopper, 9), new Object[] {"X", 'X', blockCopper});
 			GameRegistry.addRecipe(new ItemStack(ingotPlatinum, 9), new Object[] {"X", 'X', blockPlatinum});
 			GameRegistry.addRecipe(new ItemStack(ingotSilver, 9), new Object[] {"X", 'X', blockSilver});
 			GameRegistry.addRecipe(new ItemStack(ingotSteel, 9), new Object[] {"X", 'X', blockSteel});
 			GameRegistry.addRecipe(new ItemStack(ingotTin, 9), new Object[] {"X", 'X', blockTin});
 			GameRegistry.addRecipe(new ItemStack(ingotBronze, 9), new Object[] {"X", 'X', blockBronze});
			}
 	}
}
