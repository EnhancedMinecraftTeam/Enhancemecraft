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
	
	public static void doWork() {
		// @Add Tools
		addTools();
		// @Add Names
		addNames();
		// @SetHarvestLevel
		setHarvestLevel();
	}
	
	public static void addTools() {
		// @Add toolAxe
		axeAluminum = new toolAxe(confEntity.axeAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("axeAluminum");
		axeCopper = new toolAxe(confEntity.axeCopperID, crossMaterials.materialCopper).setUnlocalizedName("axeCopper");
		axePlatinum = new toolAxe(confEntity.axePlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("axePlatinum");
		axeSilver = new toolAxe(confEntity.axeSilverID, crossMaterials.materialSilver).setUnlocalizedName("axeSilver");
		axeSteel = new toolAxe(confEntity.axeSteelID, crossMaterials.materialSteel).setUnlocalizedName("axeSteel");
		axeTin = new toolAxe(confEntity.axeTinID, crossMaterials.materialTin).setUnlocalizedName("axeTin");
		// @Add toolHoe
		hoeAluminum = new toolHoe(confEntity.hoeAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("hoeAluminum");
		hoeCopper = new toolHoe(confEntity.hoeCopperID, crossMaterials.materialCopper).setUnlocalizedName("hoeCopper");
		hoePlatinum = new toolHoe(confEntity.hoePlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("hoePlatinum");
		hoeSilver = new toolHoe(confEntity.hoeSilverID, crossMaterials.materialSilver).setUnlocalizedName("hoeSilver");
		hoeSteel = new toolHoe(confEntity.hoeSteelID, crossMaterials.materialSteel).setUnlocalizedName("hoeSteel");
		hoeTin = new toolHoe(confEntity.hoeTinID, crossMaterials.materialTin).setUnlocalizedName("hoeTin");
		// @Add toolPick
		pickAluminum = new toolPick(confEntity.pickAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("pickAluminum");
		pickCopper = new toolPick(confEntity.pickCopperID, crossMaterials.materialCopper).setUnlocalizedName("pickCopper");
		pickPlatinum = new toolPick(confEntity.pickPlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("pickPlatinum");
		pickSilver = new toolPick(confEntity.pickSilverID, crossMaterials.materialSilver).setUnlocalizedName("pickSilver");
		pickSteel = new toolPick(confEntity.pickSteelID, crossMaterials.materialSteel).setUnlocalizedName("pickSteel");
		pickTin = new toolPick(confEntity.pickTinID, crossMaterials.materialTin).setUnlocalizedName("pickTin");
		// @Add toolPick
		shovelAluminum = new toolShovel(confEntity.shovelAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("shovelAluminum");
		shovelCopper = new toolShovel(confEntity.shovelCopperID, crossMaterials.materialCopper).setUnlocalizedName("shovelCopper");
		shovelPlatinum = new toolShovel(confEntity.shovelPlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("shovelPlatinum");
		shovelSilver = new toolShovel(confEntity.shovelSilverID, crossMaterials.materialSilver).setUnlocalizedName("shovelSilver");
		shovelSteel = new toolShovel(confEntity.shovelSteelID, crossMaterials.materialSteel).setUnlocalizedName("shovelSteel");
		shovelTin = new toolShovel(confEntity.shovelTinID, crossMaterials.materialTin).setUnlocalizedName("shovelTin");
		// @Add toolPick
		swordAluminum = new toolSword(confEntity.swordAluminumID, crossMaterials.materialAluminum).setUnlocalizedName("swordAluminum");
		swordCopper = new toolSword(confEntity.swordCopperID, crossMaterials.materialCopper).setUnlocalizedName("swordCopper");
		swordPlatinum = new toolSword(confEntity.swordPlatinumID, crossMaterials.materialPlatinum).setUnlocalizedName("swordPlatinum");
		swordSilver = new toolSword(confEntity.swordSilverID, crossMaterials.materialSilver).setUnlocalizedName("swordSilver");
		swordSteel = new toolSword(confEntity.swordSteelID, crossMaterials.materialSteel).setUnlocalizedName("swordSteel");
		swordTin = new toolSword(confEntity.swordTinID, crossMaterials.materialTin).setUnlocalizedName("swordTin");
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
	
	public static void addNames() {
		// @Add Tool Names
		LanguageRegistry.addName(axeAluminum, confLocalisation.axeAluminumName);
		LanguageRegistry.addName(axeCopper, confLocalisation.axeCopperName);
		LanguageRegistry.addName(axePlatinum, confLocalisation.axePlatinumName);
		LanguageRegistry.addName(axeSilver, confLocalisation.axeSilverName);
		LanguageRegistry.addName(axeSteel, confLocalisation.axeSteelName);
		LanguageRegistry.addName(axeTin, confLocalisation.axeTinName);
		
		LanguageRegistry.addName(hoeAluminum, confLocalisation.hoeAluminumName);
		LanguageRegistry.addName(hoeCopper, confLocalisation.hoeCopperName);
		LanguageRegistry.addName(hoePlatinum, confLocalisation.hoePlatinumName);
		LanguageRegistry.addName(hoeSilver, confLocalisation.hoeSilverName);
		LanguageRegistry.addName(hoeSteel, confLocalisation.hoeSteelName);
		LanguageRegistry.addName(hoeTin, confLocalisation.hoeTinName);
		
		LanguageRegistry.addName(shovelAluminum, confLocalisation.shovelAluminumName);
		LanguageRegistry.addName(shovelCopper, confLocalisation.shovelCopperName);
		LanguageRegistry.addName(shovelPlatinum, confLocalisation.shovelPlatinumName);
		LanguageRegistry.addName(shovelSilver, confLocalisation.shovelSilverName);
		LanguageRegistry.addName(shovelSteel, confLocalisation.shovelSteelName);
		LanguageRegistry.addName(shovelTin, confLocalisation.shovelTinName);
		
		LanguageRegistry.addName(pickAluminum, confLocalisation.pickAluminumName);
		LanguageRegistry.addName(pickCopper, confLocalisation.pickCopperName);
		LanguageRegistry.addName(pickPlatinum, confLocalisation.pickPlatinumName);
		LanguageRegistry.addName(pickSilver, confLocalisation.pickSilverName);
		LanguageRegistry.addName(pickSteel, confLocalisation.pickSteelName);
		LanguageRegistry.addName(pickTin, confLocalisation.pickTinName);
		
		LanguageRegistry.addName(swordAluminum, confLocalisation.swordAluminumName);
		LanguageRegistry.addName(swordCopper, confLocalisation.swordCopperName);
		LanguageRegistry.addName(swordPlatinum, confLocalisation.swordPlatinumName);
		LanguageRegistry.addName(swordSilver, confLocalisation.swordSilverName);
		LanguageRegistry.addName(swordSteel, confLocalisation.swordSteelName);
		LanguageRegistry.addName(swordTin, confLocalisation.swordTinName);
	}
}
