package com.nexized.cross.item;

import com.nexized.cross.conf.confEntity;
import com.nexized.cross.conf.confLocalisation;
import com.nexized.cross.item.tools.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class toolInit {

	public static Item axeAluminum;
	public static Item axeCopper;
	public static Item axePlatinum;
	public static Item axeSilver;
	public static Item axeSteel;
	public static Item axeTin;
	
	public static Item hoeAluminum;
	public static Item hoeCopper;
	public static Item hoePlatinum;
	public static Item hoeSilver;
	public static Item hoeSteel;
	public static Item hoeTin;
	
	public static Item shovelAluminum;
	public static Item shovelCopper;
	public static Item shovelPlatinum;
	public static Item shovelSilver;
	public static Item shovelSteel;
	public static Item shovelTin;
	
	public static Item pickAluminum;
	public static Item pickCopper;
	public static Item pickPlatinum;
	public static Item pickSilver;
	public static Item pickSteel;
	public static Item pickTin;
	
	public static Item swordAluminum;
	public static Item swordCopper;
	public static Item swordPlatinum;
	public static Item swordSilver;
	public static Item swordSteel;
	public static Item swordTin;
	
	public static void doWork(confEntity idm, confLocalisation local) {
		// @Add Tools
		addTools(idm);
		// @Add Names
		addNames(local);
		// @SetHarvestLevel
		setHarvestLevel();
	}
	
	public static void addTools(confEntity idm) {
		// @Add toolAxe
		axeAluminum = new toolAxe(idm.axeAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("axeAluminum");
		axeCopper = new toolAxe(idm.axeCopperID, crossMaterials.materialCopper).setUnlocalizedName("axeCopper");
		axePlatinum = new toolAxe(idm.axePlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("axePlatinum");
		axeSilver = new toolAxe(idm.axeSilverID, crossMaterials.materialSilver).setUnlocalizedName("axeSilver");
		axeSteel = new toolAxe(idm.axeSteelID, crossMaterials.materialSteel).setUnlocalizedName("axeSteel");
		axeTin = new toolAxe(idm.axeTinID, crossMaterials.materialTin).setUnlocalizedName("axeTin");
		// @Add toolHoe
		hoeAluminum = new toolHoe(idm.hoeAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("hoeAluminum");
		hoeCopper = new toolHoe(idm.hoeCopperID, crossMaterials.materialCopper).setUnlocalizedName("hoeCopper");
		hoePlatinum = new toolHoe(idm.hoePlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("hoePlatinum");
		hoeSilver = new toolHoe(idm.hoeSilverID, crossMaterials.materialSilver).setUnlocalizedName("hoeSilver");
		hoeSteel = new toolHoe(idm.hoeSteelID, crossMaterials.materialSteel).setUnlocalizedName("hoeSteel");
		hoeTin = new toolHoe(idm.hoeTinID, crossMaterials.materialTin).setUnlocalizedName("hoeTin");
		// @Add toolPick
		pickAluminum = new toolPick(idm.pickAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("pickAluminum");
		pickCopper = new toolPick(idm.pickCopperID, crossMaterials.materialCopper).setUnlocalizedName("pickCopper");
		pickPlatinum = new toolPick(idm.pickPlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("pickPlatinum");
		pickSilver = new toolPick(idm.pickSilverID, crossMaterials.materialSilver).setUnlocalizedName("pickSilver");
		pickSteel = new toolPick(idm.pickSteelID, crossMaterials.materialSteel).setUnlocalizedName("pickSteel");
		pickTin = new toolPick(idm.pickTinID, crossMaterials.materialTin).setUnlocalizedName("pickTin");
		// @Add toolPick
		shovelAluminum = new toolShovel(idm.shovelAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("shovelAluminum");
		shovelCopper = new toolShovel(idm.shovelCopperID, crossMaterials.materialCopper).setUnlocalizedName("shovelCopper");
		shovelPlatinum = new toolShovel(idm.shovelPlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("shovelPlatinum");
		shovelSilver = new toolShovel(idm.shovelSilverID, crossMaterials.materialSilver).setUnlocalizedName("shovelSilver");
		shovelSteel = new toolShovel(idm.shovelSteelID, crossMaterials.materialSteel).setUnlocalizedName("shovelSteel");
		shovelTin = new toolShovel(idm.shovelTinID, crossMaterials.materialTin).setUnlocalizedName("shovelTin");
		// @Add toolPick
		swordAluminum = new toolSword(idm.swordAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("swordAluminum");
		swordCopper = new toolSword(idm.swordCopperID, crossMaterials.materialCopper).setUnlocalizedName("swordCopper");
		swordPlatinum = new toolSword(idm.swordPlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("swordPlatinum");
		swordSilver = new toolSword(idm.swordSilverID, crossMaterials.materialSilver).setUnlocalizedName("swordSilver");
		swordSteel = new toolSword(idm.swordSteelID, crossMaterials.materialSteel).setUnlocalizedName("swordSteel");
		swordTin = new toolSword(idm.swordTinID, crossMaterials.materialTin).setUnlocalizedName("swordTin");
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
