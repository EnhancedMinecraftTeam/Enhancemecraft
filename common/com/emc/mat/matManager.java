package com.emc.mat;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-10-08
 * Licensed under nextized cross license - see license.txt for more information
 */


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

import com.emc.emc;
import com.emc.block.Blender;
import com.emc.block.IceOven;
import com.emc.block.emcBlock;
import com.emc.block.emcOre;
import com.emc.block.emcOreExperience;
import com.emc.conf.idManager;
import com.emc.item.emcArmor;
import com.emc.item.emcItem;
import com.emc.item.tools.toolAxe;
import com.emc.item.tools.toolHoe;
import com.emc.item.tools.toolPick;
import com.emc.item.tools.toolShovel;
import com.emc.item.tools.toolSword;
import com.emc.weapons.weaponCrossBow;
import com.emc.weapons.weaponHammer;
import com.emc.weapons.weaponHighTensileBow;
import com.emc.weapons.weaponKatana;
import com.emc.weapons.weaponLightningHammer;
import com.emc.weapons.weaponLongBow;

import cpw.mods.fml.common.registry.GameRegistry;

public class matManager {

	// @EnumToolMaterial (For itemTool Object)
	public static EnumToolMaterial materialAluminum = EnumHelper.addToolMaterial("ALUMINUM", 2, 200, 5.0F, 2, 14);
	public static EnumToolMaterial materialBronze = EnumHelper.addToolMaterial("BRONZE", 3, 300, 6.0F, 3, 14);
	public static EnumToolMaterial materialCopper = EnumHelper.addToolMaterial("COPPER", 2, 200, 4.0F, 2, 14);
	public static EnumToolMaterial materialPlatinum = EnumHelper.addToolMaterial("PLATINUM", 3, 2000, 12.0F, 4, 10);
	public static EnumToolMaterial materialSilver = EnumHelper.addToolMaterial("SILVER", 2, 1600, 6.0F, 2, 14);
	public static EnumToolMaterial materialSteel = EnumHelper.addToolMaterial("STEEL", 3, 2400, 16.0F, 6, 10);
    public static EnumToolMaterial materialTin = EnumHelper.addToolMaterial("TIN", 2, 200, 6.0F, 2, 14);
    public static EnumToolMaterial materialFreezirite = EnumHelper.addToolMaterial("FREEZERITE", 10, 2570, 12.5F, 8, 40);
    public static EnumToolMaterial materialVolcan = EnumHelper.addToolMaterial("VOLCAN", 4, 2570, 12.5F, 8, 40);
    public static EnumToolMaterial materialKatchin = EnumHelper.addToolMaterial("KATCHIN", 2, 3200, 4.0F, 26, 40);
    public static EnumToolMaterial materialEmerald = EnumHelper.addToolMaterial("EMERALD", 5, 3000, 5.0F, 8, 45);
    
    // @EnumArmorMaterial (for itemArmor Object)
    public static EnumArmorMaterial armorAluminum = EnumHelper.addArmorMaterial("ALUMINUM", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorBronze = EnumHelper.addArmorMaterial("BRONZE", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorCopper = EnumHelper.addArmorMaterial("COPPER", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorPlatinum = EnumHelper.addArmorMaterial("PLATINUM", 16, new int[] {4, 6, 4, 2}, 16);
    public static EnumArmorMaterial armorSilver = EnumHelper.addArmorMaterial("SILVER", 12, new int[] {3, 4, 3, 2}, 12);
    public static EnumArmorMaterial armorSteel = EnumHelper.addArmorMaterial("STEEL", 32, new int[] {8, 12, 8, 4}, 32);
    public static EnumArmorMaterial armorTin = EnumHelper.addArmorMaterial("TIN", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorMysterious = EnumHelper.addArmorMaterial("MYSTERIOUS", 8, new int[] {3, 5, 3, 2}, 30);
    public static EnumArmorMaterial armorFreezerite = EnumHelper.addArmorMaterial("FREEZERITE", 48, new int[] {6, 12, 5, 3}, 58);
    public static EnumArmorMaterial armorVolcan = EnumHelper.addArmorMaterial("VOLCAN", 48, new int[] {6, 23, 5, 3}, 58);
    public static EnumArmorMaterial armorEmerald = EnumHelper.addArmorMaterial("EMERALD", 60, new int[]{8, 15, 8, 6}, 70);
    
    // @Armor Renders
 	public static int armorAluminumRenderer;
 	public static int armorBronzeRenderer;
    public static int armorCopperRenderer;
    public static int armorPlatinumRenderer;
    public static int armorSilverRenderer;
    public static int armorSteelRenderer;
    public static int armorTinRenderer;
	public static int armorMysteriousRenderer;
	public static int armorFreezeriteRenderer;
	public static int armorVolcanRenderer;
	public static int armorEmeraldRenderer;

    // @oreBlocks
 	public static Block oreAluminum;
 	public static Block oreCopper;
 	public static Block orePlatinum;
 	public static Block oreSilver;
 	public static Block oreTin;
 	public static Block oreExperience;
 	public static Block blockFosil;
 	public static Block oreVolcan;
 	public static Block oreBronze;
 	public static Block oreSteel;
 	public static Block oreFrozen;
 	
 	// @ingotBlocks
 	public static Block blockAluminum;
 	public static Block blockBronze;
 	public static Block blockCopper;
 	public static Block blockPlatinum;
 	public static Block blockSilver;
 	public static Block blockSteel;
 	public static Block blockTin;
 	public static Block blockVolcan;
 	public static Block blockFrozen;

 	// @Blocks
 	public static Block BlenderIdle;
 	public static Block BlenderActive;
 	public static Block IceOvenIdle;
 	public static Block IceOvenActive;
 	
 	// @itemIngot
 	public static Item ingotAluminum;
 	public static Item ingotBronze;
 	public static Item ingotCopper;
 	public static Item ingotPlatinum;
 	public static Item ingotSilver;
 	public static Item ingotSteel;
 	public static Item ingotTin;
 	public static Item ingotFrozen;
 	
 	// @Items
 	public static Item Fur;
 	public static Item essenceLightning;
 	public static Item steelStick;
 	public static Item eggOstrich;
 	
 	// @itemDust
 	public static Item dustAluminum;
 	public static Item dustBronze;
 	public static Item dustCopper;
 	public static Item dustPlatinum;
 	public static Item dustSilver;
 	public static Item dustSteel;
 	public static Item dustTin;
 	
 	// @itemArmor Aluminum
	public static Item helmAluminum;
	public static Item chestAluminum;
	public static Item legsAluminum;
	public static Item bootsAluminum;
 	
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

	// @itemArmor Platinum	
	public static Item helmPlatinum;
	public static Item chestPlatinum;
	public static Item legsPlatinum;
	public static Item bootsPlatinum;

	
	// @itemArmor Silver
	public static Item helmSilver;
	public static Item chestSilver;
	public static Item legsSilver;
	public static Item bootsSilver;
	

	public static Item helmSteel;
	public static Item chestSteel;
	public static Item legsSteel;
	public static Item bootsSteel;

	// @itemArmor Tin
	public static Item helmTin;
	public static Item chestTin;
	public static Item legsTin;
	public static Item bootsTin;

	// @itemArmor Mysterious
	public static Item hoodMysterious;
	public static Item jacketMysterious;
	public static Item trousersMysterious;
	public static Item shoesMysterious;
	
	// @itemArmor Freezerite
	public static Item helmFreezerite;
	public static Item chestFreezerite;
	public static Item legsFreezerite;
	public static Item bootsFreezerite;
	
	// @itemArmor Volcan
	public static Item helmVolcan;
	public static Item chestVolcan;
	public static Item legsVolcan;
	public static Item bootsVolcan;
	
	// @itemArmor Emerald
	public static Item helmEmerald;
	public static Item chestEmerald;
	public static Item legsEmerald;
	public static Item bootsEmerald;
	
    // @toolsAxe
	public static Item axeAluminum;
	public static Item axeCopper;
	public static Item axePlatinum;
	public static Item axeSilver;
	public static Item axeSteel;
	public static Item axeTin;
	public static Item axeBronze;
	public static Item axeEmerald;
	
	// @toolsHoe
	public static Item hoeAluminum;
	public static Item hoeCopper;
	public static Item hoePlatinum;
	public static Item hoeSilver;
	public static Item hoeSteel;
	public static Item hoeTin;
	public static Item hoeBronze;
	public static Item hoeEmerald;

	// @toolsShovel
	public static Item shovelAluminum;
	public static Item shovelCopper;
	public static Item shovelPlatinum;
	public static Item shovelSilver;
	public static Item shovelSteel;
	public static Item shovelTin;
	public static Item shovelBronze;
	public static Item shovelEmerald;
	
	// @toolsPick
	public static Item pickAluminum;
	public static Item pickCopper;
	public static Item pickPlatinum;
	public static Item pickSilver;
	public static Item pickSteel;
	public static Item pickTin;
	public static Item pickBronze;
	public static Item pickEmerald;
	
	// @toolsSword
	public static Item swordAluminum;
	public static Item swordCopper;
	public static Item swordPlatinum;
	public static Item swordSilver;
	public static Item swordSteel;
	public static Item swordTin;
	public static Item swordBronze;
	public static Item swordEmerald;
	
	// @Special
	public static Item Katana;
	public static Item Katchin;
	public static Item KatanaHilt;
	public static Block oreKatchin;
	public static Item Hammer;
	public static Item throwingHammer;
	public static Item lightningHammer;
	public static Item bowLong;
	public static Item bowHighTensile;
	public static Item bowCross;

	// @Snowgate
	public static Item Freezerite;
	public static Block oreFreezer;
	public static Item pickaxeFreezerite;
	public static Item axeFreezerite;
	public static Item shovelFreezerite;
	public static Item hoeFreezerite;
	public static Item swordFreezerite;
	public static Item FreezeriteRod;
	public static Block blockFreezerite;
	
	// @Volcan
 	public static Item VolcanGem;
 	public static Item SatanicRod;
 	public static Item pickaxeVolcan;
 	public static Item axeVolcan;
 	public static Item swordVolcan;
 	public static Item shovelVolcan;
 	public static Item hoeVolcan;	
 	public static Block VolcanRock;
 	public static Block VolcanStone;
 	
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
			oreExperience = new emcOreExperience(idm.getBlockID("oreExperience"), Material.rock, tab).setHardness(3.0F).setResistance(oreRes).setUnlocalizedName("oreExperience");
 			oreFreezer = new emcOre(idm.getBlockID("oreFreezer"), Material.rock, emc.tabEMCSnowgate).setHardness(6.0F).setResistance(oreRes).setUnlocalizedName("oreFreezer");
			oreVolcan = new emcOre(2013, Material.rock, emc.tabEMCVolcan).setHardness(6.0F).setResistance(oreRes).setUnlocalizedName("VolcanOre");
 			oreBronze = new emcOre(2020, Material.rock, tab).setHardness(6.0F).setResistance(oreRes).setUnlocalizedName("oreBronze");
            oreKatchin = new emcOre(2019, Material.rock, tab).setHardness(7.0F).setResistance(7.0F).setUnlocalizedName("oreKatchin");
            oreSteel = new emcOre(2018, Material.rock, tab).setHardness(6.0F).setResistance(oreRes).setUnlocalizedName("oreSteel");
            oreFrozen = new emcOre(2017, Material.rock,tab).setHardness(3.4F).setResistance(oreRes).setUnlocalizedName("oreFrozen");
 			
			MinecraftForge.setBlockHarvestLevel(oreAluminum, "pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
			MinecraftForge.setBlockHarvestLevel(orePlatinum, "pickaxe", 3);
			MinecraftForge.setBlockHarvestLevel(oreSteel, "pickaxe", 4);
			MinecraftForge.setBlockHarvestLevel(oreSilver, "pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
			MinecraftForge.setBlockHarvestLevel(oreExperience, "pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(oreFreezer, "pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(oreVolcan, "pickaxe", 2);
			MinecraftForge.setBlockHarvestLevel(oreKatchin, "pickaxe", 4);
			MinecraftForge.setBlockHarvestLevel(oreFrozen, "pickaxe", 4);
			
			GameRegistry.registerBlock(oreAluminum, oreAluminum.getUnlocalizedName());
			GameRegistry.registerBlock(oreCopper, oreCopper.getUnlocalizedName());
			GameRegistry.registerBlock(orePlatinum, orePlatinum.getUnlocalizedName());
			GameRegistry.registerBlock(oreSilver, oreSilver.getUnlocalizedName());
			GameRegistry.registerBlock(oreTin, oreTin.getUnlocalizedName());
			GameRegistry.registerBlock(oreExperience, oreExperience.getUnlocalizedName());
 			GameRegistry.registerBlock(oreFreezer, oreFreezer.getUnlocalizedName());
 			GameRegistry.registerBlock(oreVolcan, oreVolcan.getUnlocalizedName());
 			GameRegistry.registerBlock(oreBronze, oreBronze.getUnlocalizedName());
 	        GameRegistry.registerBlock(oreKatchin, oreKatchin.getUnlocalizedName());
 	        GameRegistry.registerBlock(oreSteel, oreSteel.getUnlocalizedName());
 			GameRegistry.registerBlock(oreFrozen, oreFrozen.getUnlocalizedName());
 	        
			OreDictionary.registerOre("oreFreezer", new ItemStack(oreFreezer));
			OreDictionary.registerOre("oreAluminum", new ItemStack(oreAluminum));
			OreDictionary.registerOre("oreCopper", new ItemStack(oreCopper));
			OreDictionary.registerOre("orePlatinum", new ItemStack(orePlatinum));
			OreDictionary.registerOre("oreSilver", new ItemStack(oreSilver));
			OreDictionary.registerOre("oreTin", new ItemStack(oreTin));
			OreDictionary.registerOre("oreVolcan", new ItemStack(oreVolcan));
			OreDictionary.registerOre("oreBronze", new ItemStack(oreBronze));
			OreDictionary.registerOre("oreKatchin", new ItemStack(oreKatchin));
			OreDictionary.registerOre("oreSteel", new ItemStack(oreSteel));
			OreDictionary.registerOre("oreFrozen", new ItemStack(oreFrozen));
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
			VolcanRock = new emcBlock(idm.getBlockID("VolcanRock"), Material.rock, emc.tabEMCVolcan).setHardness(6.0F).setResistance(5.0F).setUnlocalizedName("VolcanoRock");
			VolcanStone = new emcBlock(idm.getBlockID("VolcanStone"), Material.rock, emc.tabEMCVolcan).setHardness(6.0F).setResistance(6.0F).setUnlocalizedName("VolcanoStone");
			blockVolcan = new emcBlock(idm.getBlockID("blockVolcan"), Material.rock, emc.tabEMCVolcan).setHardness(7.0F).setResistance(blockRes).setUnlocalizedName("VolcanBlock");
			blockFrozen = new emcBlock(2021, Material.rock, tab).setHardness(8.0F).setResistance(blockRes).setUnlocalizedName("blockFrozen");
			
			GameRegistry.registerBlock(blockAluminum, blockAluminum.getUnlocalizedName());
			GameRegistry.registerBlock(blockCopper, blockCopper.getUnlocalizedName());
			GameRegistry.registerBlock(blockPlatinum, blockPlatinum.getUnlocalizedName());
			GameRegistry.registerBlock(blockSilver, blockSilver.getUnlocalizedName());
			GameRegistry.registerBlock(blockSteel, blockSteel.getUnlocalizedName());
			GameRegistry.registerBlock(blockTin, blockTin.getUnlocalizedName());
			GameRegistry.registerBlock(VolcanRock, VolcanRock.getUnlocalizedName());
			GameRegistry.registerBlock(VolcanStone, VolcanStone.getUnlocalizedName());
			GameRegistry.registerBlock(blockVolcan, blockVolcan.getUnlocalizedName());
			GameRegistry.registerBlock(blockFrozen, blockFrozen.getUnlocalizedName());
			
		if(idm.ifEnabled("@MultiTexture")) {
	 			BlenderIdle = new Blender(2014, false).setHardness(3.0F).setUnlocalizedName("Blender_front").setCreativeTab(emc.tabEMCBlocks);
	 			BlenderActive = new Blender(2015, true).setHardness(3.0f).setUnlocalizedName("Blender_front_active");
	 			IceOvenIdle = new IceOven(2022, false).setHardness(3.5F).setUnlocalizedName("IceOven").setCreativeTab(emc.tabEMCBlocks);
	 			IceOvenActive = new IceOven(2023, true).setHardness(3.5F).setUnlocalizedName("IceOven_active");
			}} 		
 			GameRegistry.registerBlock(IceOvenActive, IceOvenActive.getUnlocalizedName());
 			GameRegistry.registerBlock(BlenderActive, BlenderActive.getUnlocalizedName());
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
 			ingotFrozen = new emcItem(3025, tab).setUnlocalizedName("ingotFrozen");
 		}
 		
 		if (idm.ifEnabled("@itemDust")) {
 			dustAluminum = new emcItem(idm.getItemID("dustAluminum"), tab).setUnlocalizedName("dustAluminum");
 			dustBronze = new emcItem(idm.getItemID("dustBronze"), tab).setUnlocalizedName("dustBronze");
 			dustCopper = new emcItem(idm.getItemID("dustCopper"), tab).setUnlocalizedName("dustCopper");
 			dustPlatinum = new emcItem(idm.getItemID("dustPlatinum"), tab).setUnlocalizedName("dustPlatinum");
 			dustSilver = new emcItem(idm.getItemID("dustSilver"), tab).setUnlocalizedName("dustSilver");
 			dustSteel = new emcItem(idm.getItemID("dustSteel"), tab).setUnlocalizedName("dustSteel");
 			dustTin = new emcItem(idm.getItemID("dustTin"), tab).setUnlocalizedName("dustTin");
 		}
 		
 		if(idm.ifEnabled("@items")) {
 			Fur = new emcItem(4845, tab).setUnlocalizedName("Fur");
 			essenceLightning = new emcItem(4875, tab).setUnlocalizedName("essenceLightning");
 			steelStick = new emcItem(4876, tab).setUnlocalizedName("stickSteel");
 			eggOstrich = new emcItem(4877, tab).setUnlocalizedName("eggOstrich");
 		}
 	}
 	
 	public static void addArmor(idManager idm, CreativeTabs tab) {
 		// Check if @armor is enabled
 		if(idm.ifEnabled("@armor")) {
 			// Initialize new @itemArmor
 			
 			// @itemArmor Aluminium
 			helmAluminum = new emcArmor(idm.getItemID("helmAluminum"), armorAluminum, armorAluminumRenderer, 0, "aluminum", tab).setUnlocalizedName("helmAluminum");
 			chestAluminum = new emcArmor(idm.getItemID("chestAluminum"), armorAluminum, armorAluminumRenderer, 1, "aluminum", tab).setUnlocalizedName("chestAluminum");
 			legsAluminum = new emcArmor(idm.getItemID("legsAluminum"), armorAluminum, armorAluminumRenderer, 2, "aluminum", tab).setUnlocalizedName("legsAluminum");
 			bootsAluminum = new emcArmor(idm.getItemID("bootsAluminum"), armorAluminum, armorAluminumRenderer, 3, "aluminum", tab).setUnlocalizedName("bootsAluminum");
 			
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
 			
 			// @itemArmor Platinum
 			helmPlatinum = new emcArmor(idm.getItemID("helmPlatinum"), armorPlatinum, armorPlatinumRenderer, 0, "platinum", tab).setUnlocalizedName("helmPlatinum");
 			chestPlatinum = new emcArmor(idm.getItemID("chestPlatinum"), armorPlatinum, armorPlatinumRenderer, 1, "platinum", tab).setUnlocalizedName("chestPlatinum");
 			legsPlatinum = new emcArmor(idm.getItemID("legsPlatinum"), armorPlatinum, armorPlatinumRenderer, 2, "platinum", tab).setUnlocalizedName("legsPlatinum");
 			bootsPlatinum = new emcArmor(idm.getItemID("bootsPlatinum"), armorPlatinum, armorPlatinumRenderer, 3, "platinum", tab).setUnlocalizedName("bootsPlatinum");
 			
 			// @itemArmor Silver
 			helmSilver = new emcArmor(idm.getItemID("helmSilver"), armorSilver, armorSilverRenderer, 0, "silver", tab).setUnlocalizedName("helmSilver");
 			chestSilver = new emcArmor(idm.getItemID("chestSilver"), armorSilver, armorSilverRenderer, 1, "silver", tab).setUnlocalizedName("chestSilver");
 			legsSilver = new emcArmor(idm.getItemID("legsSilver"), armorSilver, armorSilverRenderer, 2, "silver", tab).setUnlocalizedName("legsSilver");
 			bootsSilver = new emcArmor(idm.getItemID("bootsSilver"), armorSilver, armorSilverRenderer, 3, "silver", tab).setUnlocalizedName("bootsSilver");
 		
 			// @itemArmor Steel
 			helmSteel = new emcArmor(idm.getItemID("helmSteel"), armorSteel, armorSteelRenderer, 0, "steel", tab).setUnlocalizedName("helmSteel");
 			chestSteel = new emcArmor(idm.getItemID("chestSteel"), armorSteel, armorSteelRenderer, 1, "steel", tab).setUnlocalizedName("chestSteel");
 			legsSteel = new emcArmor(idm.getItemID("legsSteel"), armorSteel, armorSteelRenderer, 2, "steel", tab).setUnlocalizedName("legsSteel");
 			bootsSteel = new emcArmor(idm.getItemID("bootsSteel"), armorSteel, armorSteelRenderer, 3, "steel", tab).setUnlocalizedName("bootsSteel");
 			
 			// @itemArmor Tin
 			helmTin = new emcArmor(idm.getItemID("helmTin"), armorTin, armorTinRenderer, 0, "tin", tab).setUnlocalizedName("helmTin");
 			chestTin = new emcArmor(idm.getItemID("chestTin"), armorTin, armorTinRenderer, 1, "tin", tab).setUnlocalizedName("chestTin");
 			legsTin = new emcArmor(idm.getItemID("legsTin"), armorTin, armorTinRenderer, 2, "tin", tab).setUnlocalizedName("legsTin");
 			bootsTin = new emcArmor(idm.getItemID("bootsTin"), armorTin, armorTinRenderer, 3, "tin", tab).setUnlocalizedName("bootsTin");
 	 					
 			// @itemArmor Mysterious
	 		hoodMysterious = new emcArmor(4840, armorMysterious, armorMysteriousRenderer, 0, "mysterious", tab).setUnlocalizedName("Mysterious Hood");
	 		jacketMysterious = new emcArmor(4841, armorMysterious, armorMysteriousRenderer, 1, "mysterious", tab).setUnlocalizedName("Mysterious Jacket");
	 		trousersMysterious = new emcArmor(4842, armorMysterious, armorMysteriousRenderer, 2, "mysterious", tab).setUnlocalizedName("Mysterious Trousers");
	 		shoesMysterious = new emcArmor(4843, armorMysterious, armorMysteriousRenderer, 3, "mysterious", tab).setUnlocalizedName("Mysterious Shoes");
 			 		
	 		// @itemArmor Freezerite
	 		helmFreezerite = new emcArmor(4855, armorFreezerite, armorFreezeriteRenderer, 0, "freezerite", emc.tabEMCSnowgate).setUnlocalizedName("helmFreezerite");
	 		chestFreezerite = new emcArmor(4857, armorFreezerite, armorFreezeriteRenderer, 1, "freezerite", emc.tabEMCSnowgate).setUnlocalizedName("chestFreezerite");
	 		legsFreezerite = new emcArmor(4858, armorFreezerite, armorFreezeriteRenderer, 2, "freezerite", emc.tabEMCSnowgate).setUnlocalizedName("legsFreezerite");
	 		bootsFreezerite = new emcArmor(4859, armorFreezerite, armorFreezeriteRenderer, 3, "freezerite", emc.tabEMCSnowgate).setUnlocalizedName("bootsFreezerite");
	 		
	 		// @itemArmor Volcan
	 		helmVolcan = new emcArmor(4866, armorVolcan, armorVolcanRenderer, 0, "volcan", emc.tabEMCVolcan).setUnlocalizedName("helmVolcan");
	 		chestVolcan = new emcArmor(4867, armorVolcan, armorVolcanRenderer, 1, "volcan", emc.tabEMCVolcan).setUnlocalizedName("chestVolcan");
	 		legsVolcan = new emcArmor(4868, armorVolcan, armorVolcanRenderer, 2, "volcan", emc.tabEMCVolcan).setUnlocalizedName("legsVolcan");
	 		bootsVolcan = new emcArmor(4869, armorVolcan, armorVolcanRenderer, 3, "volcan", emc.tabEMCVolcan).setUnlocalizedName("bootsVolcan");
	 		
	 		// @itemArmor Emerald
	 		helmEmerald = new emcArmor(4870, armorEmerald, armorEmeraldRenderer, 0, "emerald", tab).setUnlocalizedName("emerald_helmet");
	 		chestEmerald = new emcArmor(4871, armorEmerald, armorEmeraldRenderer, 1, "emerald", tab).setUnlocalizedName("emerald_plate");
	 		legsEmerald = new emcArmor(4872, armorEmerald, armorEmeraldRenderer, 2, "emerald", tab).setUnlocalizedName("emerald_leggings");
	 		bootsEmerald = new emcArmor(4873, armorEmerald, armorEmeraldRenderer, 3, "emerald", tab).setUnlocalizedName("emerald_boots");
	 		
 			armorAluminumRenderer = emc.proxy.addArmor("aluminum");
 			armorBronzeRenderer = emc.proxy.addArmor("bronze");
 			armorCopperRenderer = emc.proxy.addArmor("copper");
 			armorPlatinumRenderer = emc.proxy.addArmor("platinum");
 			armorSilverRenderer = emc.proxy.addArmor("silver");
 			armorSteelRenderer = emc.proxy.addArmor("steel");
 			armorTinRenderer = emc.proxy.addArmor("tin"); 			
 			armorEmeraldRenderer = emc.proxy.addArmor("emerald");
 			armorMysteriousRenderer = emc.proxy.addArmor("mysterious");
 			armorFreezeriteRenderer = emc.proxy.addArmor("freezerite");
 			armorVolcanRenderer = emc.proxy.addArmor("volcan");
 			
 			if(idm.ifEnabled("@Armor")) {
 				// @itemArmor Aluminum
 				GameRegistry.addRecipe(new ItemStack(helmAluminum), new Object[]{"XXX", "X X", 'X', ingotAluminum});
 				GameRegistry.addRecipe(new ItemStack(chestAluminum), new Object[]{"X X", "XXX", "XXX", 'X', ingotAluminum});
 				GameRegistry.addRecipe(new ItemStack(legsAluminum), new Object[]{"XXX", "X X", "X X", 'X', ingotAluminum});
 				GameRegistry.addRecipe(new ItemStack(bootsAluminum), new Object[]{"X X", "X X", 'X', ingotAluminum});
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
 				// @itemArmor Platinum
 				GameRegistry.addRecipe(new ItemStack(helmPlatinum), new Object[]{"XXX", "X X", 'X', ingotPlatinum});
 				GameRegistry.addRecipe(new ItemStack(chestPlatinum), new Object[]{"X X", "XXX", "XXX", 'X', ingotPlatinum});
 				GameRegistry.addRecipe(new ItemStack(legsPlatinum), new Object[]{"XXX", "X X", "X X", 'X', ingotPlatinum});
 				GameRegistry.addRecipe(new ItemStack(bootsPlatinum), new Object[]{"X X", "X X", 'X', ingotPlatinum});
 				// @itemArmor Silver
 				GameRegistry.addRecipe(new ItemStack(helmSilver), new Object[]{"XXX", "X X", 'X', ingotSilver});
 				GameRegistry.addRecipe(new ItemStack(chestSilver), new Object[]{"X X", "XXX", "XXX", 'X', ingotSilver});
 				GameRegistry.addRecipe(new ItemStack(legsSilver), new Object[]{"XXX", "X X", "X X", 'X', ingotSilver});
 				GameRegistry.addRecipe(new ItemStack(bootsSilver), new Object[]{"X X", "X X", 'X', ingotSilver});
 				// @itemArmor Steel
 				GameRegistry.addRecipe(new ItemStack(helmSteel), new Object[]{"XXX", "X X", 'X', ingotSteel});
 				GameRegistry.addRecipe(new ItemStack(chestSteel), new Object[]{"X X", "XXX", "XXX", 'X', ingotSteel});
 				GameRegistry.addRecipe(new ItemStack(legsSteel), new Object[]{"XXX", "X X", "X X", 'X', ingotSteel});
 				GameRegistry.addRecipe(new ItemStack(bootsSteel), new Object[]{"X X", "X X", 'X', ingotSteel});
 				// @itemArmor Tin
 				GameRegistry.addRecipe(new ItemStack(helmTin), new Object[]{"XXX", "X X", 'X', ingotTin});
 				GameRegistry.addRecipe(new ItemStack(chestTin), new Object[]{"X X", "XXX", "XXX", 'X', ingotTin});
 				GameRegistry.addRecipe(new ItemStack(legsTin), new Object[]{"XXX", "X X", "X X", 'X', ingotTin});
 				GameRegistry.addRecipe(new ItemStack(bootsTin), new Object[]{"X X", "X X", 'X', ingotTin});
 				// @itemArmor Mysterious
 				GameRegistry.addRecipe(new ItemStack(hoodMysterious), new Object[]{"RLR", "RSR", "R R", 'R', Fur, 'L', Item.leather, 'S', Item.spiderEye});
 				GameRegistry.addRecipe(new ItemStack(jacketMysterious), new Object[]{"F F", "FBF", "FBF", 'F', Fur, 'B', Item.ingotGold});
 				GameRegistry.addRecipe(new ItemStack(trousersMysterious), new Object[]{"FFF", "F F", "F F", 'F', Fur});
 				GameRegistry.addRecipe(new ItemStack(shoesMysterious), new Object[]{"FXF", "FXF",  'F', Fur, 'X', Item.feather});
 				// @itemArmor Emerald
 				GameRegistry.addRecipe(new ItemStack(helmEmerald), new Object[]{"XXX", "X X", 'X', Item.emerald});
 				GameRegistry.addRecipe(new ItemStack(chestEmerald), new Object[]{"X X", "XXX", "XXX", 'X', Item.emerald});
 				GameRegistry.addRecipe(new ItemStack(legsEmerald), new Object[]{"XXX", "X X", "X X", 'X', Item.emerald});
 				GameRegistry.addRecipe(new ItemStack(bootsEmerald), new Object[]{"X X", "X X", 'X', Item.emerald});
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
 			swordEmerald = new toolSword(idm.getItemID("swordEmerald"), materialEmerald, tab).setUnlocalizedName("EmeraldSword");
 			
 			if(idm.ifEnabled("@itemIngot")) {
 				GameRegistry.addRecipe(new ItemStack(swordAluminum), new Object[] {" X ", " X ", " * ", 'X', ingotAluminum, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordCopper), new Object[] {" X ", " X ", " * ", 'X', ingotCopper, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordPlatinum), new Object[] {" X ", " X ", " * ", 'X', ingotPlatinum, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordSilver), new Object[] {" X ", " X ", " * ", 'X', ingotSilver, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordSteel), new Object[] {" X ", " X ", " * ", 'X', ingotSteel, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordTin), new Object[] {" X ", " X ", " * ", 'X', ingotTin, '*', Item.stick});
 				GameRegistry.addRecipe(new ItemStack(swordBronze), new Object[] {" X ", " X ", " * ", 'X', ingotBronze, '*', Item.stick});
 			}}
 		} 		
 	//Added By HackerTDog
 	public static void addSpecial(idManager idm, CreativeTabs tab) {
        if(idm.ifEnabled("@Special")) {
		    Katana = new weaponKatana(4831, materialKatchin, tab).setUnlocalizedName("Katana");
            Katchin = new emcItem(4833, tab).setUnlocalizedName("Katchin");
            KatanaHilt = new emcItem(4832, tab).setUnlocalizedName("Katana Hilt");
            Hammer = new weaponHammer(4834, materialKatchin, tab).setUnlocalizedName("Hammer");
            lightningHammer = new weaponLightningHammer(4790, materialKatchin, tab).setUnlocalizedName("hammerLightning");
            bowLong = new weaponLongBow(4878, tab).setUnlocalizedName("LongBow");
            bowHighTensile = new weaponHighTensileBow(4789, tab).setUnlocalizedName("HighTensileBow");
            bowCross = new weaponCrossBow(4791, tab).setUnlocalizedName("bowCross");
        }
 	}
 	public static void addSnowgate(idManager idm, CreativeTabs tab) {
 		if(idm.ifEnabled("@Snowgate")) {
 			float oreRes = 5.0F;
 			Freezerite = new emcItem(4846, tab).setUnlocalizedName("freezirite");
 			pickaxeFreezerite = new toolPick(4847, materialFreezirite, tab).setUnlocalizedName("pickFreezerite");
 			axeFreezerite = new toolAxe(4848, materialFreezirite, tab).setUnlocalizedName("axeFreezerite");
 			shovelFreezerite = new toolShovel(4849, materialFreezirite, tab).setUnlocalizedName("shovelFreezerite");
 			hoeFreezerite = new toolHoe(4850, materialFreezirite, tab).setUnlocalizedName("hoeFreezerite");
 			swordFreezerite = new toolSword(4851, materialFreezirite, tab).setUnlocalizedName("swordFreezerite");
 			FreezeriteRod = new emcItem(4852, tab).setUnlocalizedName("Freezirite Rod");
 			blockFreezerite = new emcBlock(idm.getBlockID("blockFreezerite"), Material.iron, tab).setHardness(10.0F).setResistance(12.0F).setUnlocalizedName("blockFreezer");
 			
 			//Registry
 			GameRegistry.registerBlock(blockFreezerite, blockFreezerite.getUnlocalizedName());
 			
 			//Harvest Level
 			MinecraftForge.setBlockHarvestLevel(blockFreezerite, "pickaxeFreezerite", 10);
 			// Tool Classes
 			MinecraftForge.setToolClass(pickaxeFreezerite, "pickaxe", 10);
 			MinecraftForge.setToolClass(axeFreezerite, "Axe", 4);
 			MinecraftForge.setToolClass(shovelFreezerite, "shovel", 4);
 			MinecraftForge.setToolClass(swordFreezerite, "sword", 4);
 			MinecraftForge.setToolClass(hoeFreezerite, "hoe", 4);
 		}
 	}
 	public static void addVolcan(idManager idm, CreativeTabs tab) {
 		if(idm.ifEnabled("@Volcan")) {
 			VolcanGem = new emcItem(4856, tab).setUnlocalizedName("Volcan Gem");
 			SatanicRod = new emcItem(4860, tab).setUnlocalizedName("SatanicRod");
 			pickaxeVolcan = new toolPick(4861, materialVolcan, tab).setUnlocalizedName("pickVolcan");
 			axeVolcan = new toolAxe(4862, materialVolcan, tab).setUnlocalizedName("axeVolcan");
 			swordVolcan = new toolSword(4863, materialVolcan, tab).setUnlocalizedName("swordVolcan");
 			shovelVolcan = new toolShovel(4864, materialVolcan, tab).setUnlocalizedName("shovelVolcan");
 			hoeVolcan = new toolHoe(4865, materialVolcan, tab).setUnlocalizedName("hoeVolcan");
 		}
 	}
 	
 	public static void addRecipes(idManager idm) {
 		if(idm.ifEnabled("@itemIngot")) {
			GameRegistry.addSmelting(oreAluminum.blockID, new ItemStack(ingotAluminum), 1.0F);
			GameRegistry.addSmelting(oreCopper.blockID, new ItemStack(ingotCopper), 1.0F);
			GameRegistry.addSmelting(orePlatinum.blockID, new ItemStack(ingotPlatinum), 1.0F);
			GameRegistry.addSmelting(oreSilver.blockID, new ItemStack(ingotSilver), 1.0F);
			GameRegistry.addSmelting(oreTin.blockID, new ItemStack(ingotTin), 1.0F);
			GameRegistry.addSmelting(oreBronze.blockID, new ItemStack(ingotBronze), 1.0F);
			GameRegistry.addSmelting(oreSteel.blockID, new ItemStack(ingotSteel), 2.0F);
			GameRegistry.addSmelting(oreFrozen.blockID, new ItemStack(ingotFrozen), 1.5F);
		}
 		if(idm.ifEnabled("@itemDust") & idm.ifEnabled("@itemIngot")) {
 			GameRegistry.addSmelting(dustAluminum.itemID, new ItemStack(ingotAluminum), 1.0F);
			GameRegistry.addSmelting(dustCopper.itemID, new ItemStack(ingotCopper), 1.0F);
			GameRegistry.addSmelting(dustPlatinum.itemID, new ItemStack(ingotPlatinum), 1.0F);
			GameRegistry.addSmelting(dustSilver.itemID, new ItemStack(ingotSilver), 1.0F);
			GameRegistry.addSmelting(dustTin.itemID, new ItemStack(ingotTin), 1.0F);
 		}
 		if(idm.ifEnabled("@itemIngot") & idm.ifEnabled("@ingotBlock")) {
			GameRegistry.addRecipe(new ItemStack(blockAluminum), new Object[] {"XXX", "XXX", "XXX", 'X', ingotAluminum});
			GameRegistry.addRecipe(new ItemStack(blockCopper), new Object[] {"XXX", "XXX", "XXX", 'X', ingotCopper});
			GameRegistry.addRecipe(new ItemStack(blockPlatinum), new Object[] {"XXX", "XXX", "XXX", 'X', ingotPlatinum});
			GameRegistry.addRecipe(new ItemStack(blockSilver), new Object[] {"XXX", "XXX", "XXX", 'X', ingotSilver});
			GameRegistry.addRecipe(new ItemStack(blockSteel), new Object[] {"XXX", "XXX", "XXX", 'X', ingotSteel});
			GameRegistry.addRecipe(new ItemStack(blockTin), new Object[] {"XXX", "XXX", "XXX", 'X', ingotTin});
			GameRegistry.addRecipe(new ItemStack(blockBronze), new Object[] {"XXX", "XXX", "XXX", 'X', ingotBronze});
			GameRegistry.addRecipe(new ItemStack(blockFrozen), new Object[] {"XXX", "XXX", "XXX", 'X', ingotFrozen});
		}
 		if(idm.ifEnabled("@ingotBlock")) {
 			GameRegistry.addRecipe(new ItemStack(ingotCopper, 9), new Object[] {"X", 'X', blockCopper});
 			GameRegistry.addRecipe(new ItemStack(ingotPlatinum, 9), new Object[] {"X", 'X', blockPlatinum});
 			GameRegistry.addRecipe(new ItemStack(ingotSilver, 9), new Object[] {"X", 'X', blockSilver});
 			GameRegistry.addRecipe(new ItemStack(ingotSteel, 9), new Object[] {"X", 'X', blockSteel});
 			GameRegistry.addRecipe(new ItemStack(ingotTin, 9), new Object[] {"X", 'X', blockTin});
 			GameRegistry.addRecipe(new ItemStack(ingotBronze, 9), new Object[] {"X", 'X', blockBronze});
 			GameRegistry.addRecipe(new ItemStack(ingotFrozen, 9), new Object[] {"X", 'X', blockFrozen});
			}
        if(idm.ifEnabled("@Special")) {
        	GameRegistry.addRecipe(new ItemStack(KatanaHilt), new Object[]{"XXX", " X ", 'X', Katchin});
        	GameRegistry.addRecipe(new ItemStack(Katana), new Object[]{"X", "X", "*", 'X', Item.ingotIron, '*', KatanaHilt});
        	GameRegistry.addSmelting(oreKatchin.blockID, new ItemStack(Katchin), 1.4F);
        	GameRegistry.addRecipe(new ItemStack(Hammer), new Object[]{"XXX", "XSX", " S ", 'X', blockSteel, 'S', steelStick});
        	
        if(idm.ifEnabled("@Snowgate")) {
        	GameRegistry.addRecipe(new ItemStack(pickaxeFreezerite), new Object[]{"FFF", " B ", " B ", 'F', Freezerite, 'B', FreezeriteRod});
        	GameRegistry.addRecipe(new ItemStack(swordFreezerite), new Object[]{"F", "F", "B", 'F', Freezerite, 'B', FreezeriteRod});
        	GameRegistry.addRecipe(new ItemStack(shovelFreezerite), new Object[]{"F", "B", "B", 'F', Freezerite, 'B', FreezeriteRod});
        	GameRegistry.addRecipe(new ItemStack(axeFreezerite), new Object[]{"FF ", "FB ", " B ", 'F', Freezerite, 'B', FreezeriteRod});
        	GameRegistry.addRecipe(new ItemStack(hoeFreezerite), new Object[]{"FF ", " B ", " B ", 'F', Freezerite, 'B', FreezeriteRod});
        	GameRegistry.addRecipe(new ItemStack(blockFreezerite), new Object[]{"XXX", "XXX", "XXX", 'X', Freezerite});
        	GameRegistry.addRecipe(new ItemStack(Freezerite, 9), new Object[]{"X", 'X', blockFreezerite});
        	
        	// @itemArmor  Freezerite
			GameRegistry.addRecipe(new ItemStack(helmFreezerite), new Object[]{"XSX", "X X", 'X', Freezerite,'S', blockFrozen});
			GameRegistry.addRecipe(new ItemStack(chestFreezerite), new Object[]{"X X", "XSX", "XSX", 'X', Freezerite, 'S', blockFrozen});
			GameRegistry.addRecipe(new ItemStack(legsFreezerite), new Object[]{"XSX", "X X", "F F", 'X', Freezerite, 'S', blockFrozen, 'F', ingotFrozen});
			GameRegistry.addRecipe(new ItemStack(bootsFreezerite), new Object[]{"X X", "S S", 'X', Freezerite, 'S', ingotFrozen});
        	
			// Smelting Recipes
        	GameRegistry.addSmelting(oreFreezer.blockID, new ItemStack(Freezerite), 1.3F);
        }
        if(idm.ifEnabled("@Volcan")) {
        	GameRegistry.addSmelting(oreVolcan.blockID, new ItemStack(VolcanGem), 1.8F);
 			GameRegistry.addSmelting(VolcanRock.blockID, new ItemStack(VolcanStone), 2.0F);
			GameRegistry.addRecipe(new ItemStack(blockVolcan), new Object[] {"XXX", "XXX", "XXX", 'X', VolcanGem});
			GameRegistry.addRecipe(new ItemStack(VolcanGem, 9), new Object[] {"X", 'X', blockVolcan});
			GameRegistry.addRecipe(new ItemStack(hoeVolcan), new Object[] {"XX ", " S ", " S ", 'S', SatanicRod, 'X', VolcanGem});
			GameRegistry.addRecipe(new ItemStack(pickaxeVolcan), new Object[] {"XXX", " S ", " S ", 'S', SatanicRod, 'X', VolcanGem});
			GameRegistry.addRecipe(new ItemStack(axeVolcan), new Object[] {"XX ", "XS ", " S ", 'S', SatanicRod, 'X', VolcanGem});
			GameRegistry.addRecipe(new ItemStack(swordVolcan), new Object[] {"X", "X", "S", 'S', SatanicRod, 'X', VolcanGem});
			GameRegistry.addRecipe(new ItemStack(shovelVolcan), new Object[] {"X", "S", "S", 'S', SatanicRod, 'X', VolcanGem});
        }
        if(idm.ifEnabled("@Items")) {
        	GameRegistry.addRecipe(new ItemStack(steelStick), new Object[] {"S", "S", "S", 'S', ingotSteel});
        }
        }
 	}
}