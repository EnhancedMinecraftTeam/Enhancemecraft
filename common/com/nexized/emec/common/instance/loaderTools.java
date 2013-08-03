package com.nexized.emec.common.instance;

import com.nexized.emec.tool.toolAxe.*;
import com.nexized.emec.tool.toolHoe.*;
import com.nexized.emec.tool.toolPick.*;
import com.nexized.emec.tool.toolShovel.*;
import com.nexized.emec.tool.toolSword.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class loaderTools extends loaderIngot {

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
		
		public static void addItems(configurationHandler common) {
			// @Add Tools Aluminum
			AxeAluminium = (new axeAluminium(common.axeAluminiumID, ALUMINIUM).setUnlocalizedName("axeAluminium"));
			HoeAluminium = (new hoeAluminium(common.hoeAluminiumID, ALUMINIUM).setUnlocalizedName("hoeAluminium"));
			PickAluminium = (new pickAluminium(common.pickAluminiumID, ALUMINIUM).setUnlocalizedName("pickAluminium"));
			ShovelAluminium = (new shovelAluminium(common.shovelAluminiumID, ALUMINIUM).setUnlocalizedName("shovelAluminium"));
			SwordAluminium = (new swordAluminium(common.swordAluminiumID, ALUMINIUM).setUnlocalizedName("swordAluminium"));
			
			// @Add Tools Copper
			AxeCopper = (new axeCopper(common.axeCopperID, COPPER).setUnlocalizedName("axeCopper"));
			HoeCopper = (new hoeCopper(common.hoeCopperID, COPPER).setUnlocalizedName("hoeCopper"));
			PickCopper = (new pickCopper(common.pickCopperID, COPPER).setUnlocalizedName("pickCopper"));
			ShovelCopper = (new shovelCopper(common.shovelCopperID, COPPER).setUnlocalizedName("shovelCopper"));
			SwordCopper = (new swordCopper(common.swordCopperID, COPPER).setUnlocalizedName("swordCopper"));
			
			// @Add Tools Platinum
			AxePlatinum = (new axePlatinum(common.axePlatinumID, PLATINUM).setUnlocalizedName("axePlatinum"));
			HoePlatinum = (new hoePlatinum(common.hoePlatinumID, PLATINUM).setUnlocalizedName("hoePlatinum"));
			PickPlatinum = (new pickPlatinum(common.pickPlatinumID, PLATINUM).setUnlocalizedName("pickPlatinum"));
			ShovelPlatinum = (new shovelPlatinum(common.shovelPlatinumID, PLATINUM).setUnlocalizedName("shovelPlatinum"));
			SwordPlatinum = (new swordPlatinum(common.swordPlatinumID, PLATINUM).setUnlocalizedName("swordPlatinum"));
			
			// @Add Tools Silver
			AxeSilver = (new axeSilver(common.axeSilverID, SILVER).setUnlocalizedName("axeSilver"));
			HoeSilver = (new hoeSilver(common.hoeSilverID, SILVER).setUnlocalizedName("hoeSilver"));
			PickSilver = (new pickSilver(common.pickSilverID, SILVER).setUnlocalizedName("pickSilver"));
			ShovelSilver = (new shovelSilver(common.shovelSilverID, SILVER).setUnlocalizedName("shovelSilver"));
			SwordSilver = (new swordSilver(common.swordSilverID, SILVER).setUnlocalizedName("swordSilver"));
			
			// @Add Tools Steel
			AxeSteel = (new axeSteel(common.axeSteelID, STEEL).setUnlocalizedName("axeSteel"));
			HoeSteel = (new hoeSteel(common.hoeSteelID, STEEL).setUnlocalizedName("hoeSteel"));
			PickSteel = (new pickSteel(common.pickSteelID, STEEL).setUnlocalizedName("pickSteel"));
			ShovelSteel = (new shovelSteel(common.shovelSteelID, STEEL).setUnlocalizedName("shovelSteel"));
			SwordSteel = (new swordSteel(common.swordSteelID, STEEL).setUnlocalizedName("swordSteel"));
			
			// @Add Tools Tin
			AxeTin = (new axeTin(common.axeTinID, TIN).setUnlocalizedName("axeTin"));
			HoeTin = (new hoeTin(common.hoeTinID, TIN).setUnlocalizedName("hoeTin"));
			PickTin = (new pickTin(common.pickTinID, TIN).setUnlocalizedName("pickTin"));
			ShovelTin = (new shovelTin(common.shovelTinID, TIN).setUnlocalizedName("shovelTin"));
			SwordTin = (new swordTin(common.swordTinID, TIN).setUnlocalizedName("swordTin"));
		}
	
		public static void addNames() {
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
		
}
