package com.nexized.cross.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-15 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;
import com.nexized.cross.item.tools.*;

import net.minecraft.creativetab.CreativeTabs;
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
		
	public static void addTools(idManager idm, CreativeTabs tab) {
		// @Add toolAxe
		axeAluminum = new toolAxe(idm.getItemID("axeAluminum"), crossMaterials.materialAluminum, tab).setUnlocalizedName("axeAluminum");
		axeCopper = new toolAxe(idm.getItemID("axeCopper"), crossMaterials.materialCopper, tab).setUnlocalizedName("axeCopper");
		axePlatinum = new toolAxe(idm.getItemID("axePlatinum"), crossMaterials.materialPlatinum, tab).setUnlocalizedName("axePlatinum");
		axeSilver = new toolAxe(idm.getItemID("axeSilver"), crossMaterials.materialSilver, tab).setUnlocalizedName("axeSilver");
		axeSteel = new toolAxe(idm.getItemID("axeSteel"), crossMaterials.materialSteel, tab).setUnlocalizedName("axeSteel");
		axeTin = new toolAxe(idm.getItemID("axeTin"), crossMaterials.materialTin, tab).setUnlocalizedName("axeTin");
		axeBronze = new toolAxe(idm.getItemID("axeBronze"), crossMaterials.materialBronze, tab).setUnlocalizedName("axeBronze");
		// @Add toolHoe
		hoeAluminum = new toolHoe(idm.getItemID("hoeAluminum"), crossMaterials.materialAluminum, tab).setUnlocalizedName("hoeAluminum");
		hoeCopper = new toolHoe(idm.getItemID("hoeCopper"), crossMaterials.materialCopper, tab).setUnlocalizedName("hoeCopper");
		hoePlatinum = new toolHoe(idm.getItemID("hoePlatinum"), crossMaterials.materialPlatinum, tab).setUnlocalizedName("hoePlatinum");
		hoeSilver = new toolHoe(idm.getItemID("hoeSilver"), crossMaterials.materialSilver, tab).setUnlocalizedName("hoeSilver");
		hoeSteel = new toolHoe(idm.getItemID("hoeSteel"), crossMaterials.materialSteel, tab).setUnlocalizedName("hoeSteel");
		hoeTin = new toolHoe(idm.getItemID("hoeTin"), crossMaterials.materialTin, tab).setUnlocalizedName("hoeTin");
		hoeBronze = new toolHoe(idm.getItemID("hoeBronze"), crossMaterials.materialBronze, tab).setUnlocalizedName("axeBronze");
		// @Add toolPick
		pickAluminum = new toolPick(idm.getItemID("pickAluminum"), crossMaterials.materialAluminum, tab).setUnlocalizedName("pickAluminum");
		pickCopper = new toolPick(idm.getItemID("pickCopper"), crossMaterials.materialCopper, tab).setUnlocalizedName("pickCopper");
		pickPlatinum = new toolPick(idm.getItemID("pickPlatinum"), crossMaterials.materialPlatinum, tab).setUnlocalizedName("pickPlatinum");
		pickSilver = new toolPick(idm.getItemID("pickSilver"), crossMaterials.materialSilver, tab).setUnlocalizedName("pickSilver");
		pickSteel = new toolPick(idm.getItemID("pickSteel"), crossMaterials.materialSteel, tab).setUnlocalizedName("pickSteel");
		pickTin = new toolPick(idm.getItemID("pickTin"), crossMaterials.materialTin, tab).setUnlocalizedName("pickTin");
		pickBronze = new toolPick(idm.getItemID("pickBronze"), crossMaterials.materialBronze, tab).setUnlocalizedName("pickBronze");
		// @Add toolShovel
		shovelAluminum = new toolShovel(idm.getItemID("shovelAluminum"), crossMaterials.materialAluminum, tab).setUnlocalizedName("shovelAluminum");
		shovelCopper = new toolShovel(idm.getItemID("shovelCopper"), crossMaterials.materialCopper, tab).setUnlocalizedName("shovelCopper");
		shovelPlatinum = new toolShovel(idm.getItemID("shovelPlatinum"), crossMaterials.materialPlatinum, tab).setUnlocalizedName("shovelPlatinum");
		shovelSilver = new toolShovel(idm.getItemID("shovelSilver"), crossMaterials.materialSilver, tab).setUnlocalizedName("shovelSilver");
		shovelSteel = new toolShovel(idm.getItemID("shovelSteel"), crossMaterials.materialSteel, tab).setUnlocalizedName("shovelSteel");
		shovelTin = new toolShovel(idm.getItemID("shovelTin"), crossMaterials.materialTin, tab).setUnlocalizedName("shovelTin");
		shovelBronze = new toolShovel(idm.getItemID("shovelBronze"), crossMaterials.materialBronze, tab).setUnlocalizedName("shovelBronze");
		// @Add toolSword
		swordAluminum = new toolSword(idm.getItemID("swordAluminum"), crossMaterials.materialAluminum, tab).setUnlocalizedName("swordAluminum");
		swordCopper = new toolSword(idm.getItemID("swordCopper"), crossMaterials.materialCopper, tab).setUnlocalizedName("swordCopper");
		swordPlatinum = new toolSword(idm.getItemID("swordPlatinum"), crossMaterials.materialPlatinum, tab).setUnlocalizedName("swordPlatinum");
		swordSilver = new toolSword(idm.getItemID("swordSilver"), crossMaterials.materialSilver, tab).setUnlocalizedName("swordSilver");
		swordSteel = new toolSword(idm.getItemID("swordSteel"), crossMaterials.materialSteel, tab).setUnlocalizedName("swordSteel");
		swordTin = new toolSword(idm.getItemID("swordTin"), crossMaterials.materialTin, tab).setUnlocalizedName("swordTin");
		swordBronze = new toolSword(idm.getItemID("swordBronze"), crossMaterials.materialBronze, tab).setUnlocalizedName("swordBronze");
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
}
