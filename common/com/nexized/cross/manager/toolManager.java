package com.nexized.cross.manager;

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;
import com.nexized.cross.item.tools.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class toolManager {

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
	
	public static void doWork(idManager idm, confLocalisation local) {
		// @Add Tools
		addTools(idm);
		// @Add Names
		addNames(local);
		// @SetHarvestLevel
		setHarvestLevel();
	}
	
	public static void addTools(idManager idm) {
		// @Add toolAxe
		axeAluminum = new toolAxe(idm.getItemID("axeAluminum"), crossMaterials.materialAluminum).setUnlocalizedName("axeAluminum");
		axeCopper = new toolAxe(idm.getItemID("axeCopper"), crossMaterials.materialCopper).setUnlocalizedName("axeCopper");
		axePlatinum = new toolAxe(idm.getItemID("axePlatinum"), crossMaterials.materialPlatinum).setUnlocalizedName("axePlatinum");
		axeSilver = new toolAxe(idm.getItemID("axeSilver"), crossMaterials.materialSilver).setUnlocalizedName("axeSilver");
		axeSteel = new toolAxe(idm.getItemID("axeSteel"), crossMaterials.materialSteel).setUnlocalizedName("axeSteel");
		axeTin = new toolAxe(idm.getItemID("axeTin"), crossMaterials.materialTin).setUnlocalizedName("axeTin");
		// @Add toolHoe
		hoeAluminum = new toolHoe(idm.getItemID("hoeAluminum"), crossMaterials.materialAluminum).setUnlocalizedName("hoeAluminum");
		hoeCopper = new toolHoe(idm.getItemID("hoeCopper"), crossMaterials.materialCopper).setUnlocalizedName("hoeCopper");
		hoePlatinum = new toolHoe(idm.getItemID("hoePlatinum"), crossMaterials.materialPlatinum).setUnlocalizedName("hoePlatinum");
		hoeSilver = new toolHoe(idm.getItemID("hoeSilver"), crossMaterials.materialSilver).setUnlocalizedName("hoeSilver");
		hoeSteel = new toolHoe(idm.getItemID("hoeSteel"), crossMaterials.materialSteel).setUnlocalizedName("hoeSteel");
		hoeTin = new toolHoe(idm.getItemID("hoeTin"), crossMaterials.materialTin).setUnlocalizedName("hoeTin");
		// @Add toolPick
		pickAluminum = new toolPick(idm.getItemID("pickAluminum"), crossMaterials.materialAluminum).setUnlocalizedName("pickAluminum");
		pickCopper = new toolPick(idm.getItemID("pickCopper"), crossMaterials.materialCopper).setUnlocalizedName("pickCopper");
		pickPlatinum = new toolPick(idm.getItemID("pickPlatinum"), crossMaterials.materialPlatinum).setUnlocalizedName("pickPlatinum");
		pickSilver = new toolPick(idm.getItemID("pickSilver"), crossMaterials.materialSilver).setUnlocalizedName("pickSilver");
		pickSteel = new toolPick(idm.getItemID("pickSteel"), crossMaterials.materialSteel).setUnlocalizedName("pickSteel");
		pickTin = new toolPick(idm.getItemID("pickTin"), crossMaterials.materialTin).setUnlocalizedName("pickTin");
		// @Add toolShovel
		shovelAluminum = new toolShovel(idm.getItemID("shovelAluminum"), crossMaterials.materialAluminum).setUnlocalizedName("shovelAluminum");
		shovelCopper = new toolShovel(idm.getItemID("shovelCopper"), crossMaterials.materialCopper).setUnlocalizedName("shovelCopper");
		shovelPlatinum = new toolShovel(idm.getItemID("shovelPlatinum"), crossMaterials.materialPlatinum).setUnlocalizedName("shovelPlatinum");
		shovelSilver = new toolShovel(idm.getItemID("shovelSilver"), crossMaterials.materialSilver).setUnlocalizedName("shovelSilver");
		shovelSteel = new toolShovel(idm.getItemID("shovelSteel"), crossMaterials.materialSteel).setUnlocalizedName("shovelSteel");
		shovelTin = new toolShovel(idm.getItemID("shovelTin"), crossMaterials.materialTin).setUnlocalizedName("shovelTin");
		// @Add toolSword
		swordAluminum = new toolSword(idm.getItemID("swordAluminum"), crossMaterials.materialAluminum).setUnlocalizedName("swordAluminum");
		swordCopper = new toolSword(idm.getItemID("swordCopper"), crossMaterials.materialCopper).setUnlocalizedName("swordCopper");
		swordPlatinum = new toolSword(idm.getItemID("swordPlatinum"), crossMaterials.materialPlatinum).setUnlocalizedName("swordPlatinum");
		swordSilver = new toolSword(idm.getItemID("swordSilver"), crossMaterials.materialSilver).setUnlocalizedName("swordSilver");
		swordSteel = new toolSword(idm.getItemID("swordSteel"), crossMaterials.materialSteel).setUnlocalizedName("swordSteel");
		swordTin = new toolSword(idm.getItemID("swordTin"), crossMaterials.materialTin).setUnlocalizedName("swordTin");
	}
	
	public static void setHarvestLevel() {
		MinecraftForge.setToolClass(pickAluminum, "pickaxe", 2);
		MinecraftForge.setToolClass(pickCopper, "pickaxe", 2);
		MinecraftForge.setToolClass(pickPlatinum, "pickaxe", 3);
		MinecraftForge.setToolClass(pickSilver, "pickaxe", 2);
		MinecraftForge.setToolClass(pickSteel, "pickaxe", 4);
		MinecraftForge.setToolClass(pickTin, "pickaxe", 2);
		
		MinecraftForge.setToolClass(axeAluminum, "axe", 2);
		MinecraftForge.setToolClass(axeCopper, "axe", 2);
		MinecraftForge.setToolClass(axePlatinum, "axe", 3);
		MinecraftForge.setToolClass(axeSilver, "axe", 2);
		MinecraftForge.setToolClass(axeSteel, "axe", 4);
		MinecraftForge.setToolClass(axeTin, "axe", 2);
        
		MinecraftForge.setToolClass(shovelAluminum, "shovel", 2);
		MinecraftForge.setToolClass(shovelCopper, "shovel", 2);
		MinecraftForge.setToolClass(shovelPlatinum, "shovel", 3);
		MinecraftForge.setToolClass(shovelSilver, "shovel", 2);
		MinecraftForge.setToolClass(shovelSteel, "shovel", 4);
		MinecraftForge.setToolClass(shovelTin, "shovel", 2);
        
		MinecraftForge.setToolClass(hoeAluminum, "hoe", 2);
		MinecraftForge.setToolClass(hoeCopper, "hoe", 2);
		MinecraftForge.setToolClass(hoePlatinum, "hoe", 3);
		MinecraftForge.setToolClass(hoeSilver, "hoe", 2);
		MinecraftForge.setToolClass(hoeSteel, "hoe", 4);
		MinecraftForge.setToolClass(hoeTin, "hoe", 2);
	}
	
	public static void addNames(confLocalisation local) {
		// @Add Tool Names
		LanguageRegistry.addName(axeAluminum, local.axeAluminumName);
		LanguageRegistry.addName(axeCopper, local.axeCopperName);
		LanguageRegistry.addName(axePlatinum, local.axePlatinumName);
		LanguageRegistry.addName(axeSilver, local.axeSilverName);
		LanguageRegistry.addName(axeSteel, local.axeSteelName);
		LanguageRegistry.addName(axeTin, local.axeTinName);
		
		LanguageRegistry.addName(hoeAluminum, local.hoeAluminumName);
		LanguageRegistry.addName(hoeCopper, local.hoeCopperName);
		LanguageRegistry.addName(hoePlatinum, local.hoePlatinumName);
		LanguageRegistry.addName(hoeSilver, local.hoeSilverName);
		LanguageRegistry.addName(hoeSteel, local.hoeSteelName);
		LanguageRegistry.addName(hoeTin, local.hoeTinName);
		
		LanguageRegistry.addName(shovelAluminum, local.shovelAluminumName);
		LanguageRegistry.addName(shovelCopper, local.shovelCopperName);
		LanguageRegistry.addName(shovelPlatinum, local.shovelPlatinumName);
		LanguageRegistry.addName(shovelSilver, local.shovelSilverName);
		LanguageRegistry.addName(shovelSteel, local.shovelSteelName);
		LanguageRegistry.addName(shovelTin, local.shovelTinName);
		
		LanguageRegistry.addName(pickAluminum, local.pickAluminumName);
		LanguageRegistry.addName(pickCopper, local.pickCopperName);
		LanguageRegistry.addName(pickPlatinum, local.pickPlatinumName);
		LanguageRegistry.addName(pickSilver, local.pickSilverName);
		LanguageRegistry.addName(pickSteel, local.pickSteelName);
		LanguageRegistry.addName(pickTin, local.pickTinName);
		
		LanguageRegistry.addName(swordAluminum, local.swordAluminumName);
		LanguageRegistry.addName(swordCopper, local.swordCopperName);
		LanguageRegistry.addName(swordPlatinum, local.swordPlatinumName);
		LanguageRegistry.addName(swordSilver, local.swordSilverName);
		LanguageRegistry.addName(swordSteel, local.swordSteelName);
		LanguageRegistry.addName(swordTin, local.swordTinName);
	}
}
