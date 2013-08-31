package com.nexized.cross.manager;

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;
import com.nexized.emec.emec;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class armorManager {

	public static Item helmAluminum;
	public static Item chestAluminum;
	public static Item legsAluminum;
	public static Item bootsAluminum;
	
	public static Item helmBronze;
	public static Item chestBronze;
	public static Item legsBronze;
	public static Item bootsBronze;
	
	public static Item helmCopper;
	public static Item chestCopper;
	public static Item legsCopper;
	public static Item bootsCopper;
		
	public static Item helmPlatinum;
	public static Item chestPlatinum;
	public static Item legsPlatinum;
	public static Item bootsPlatinum;
	
	public static Item helmSilver;
	public static Item chestSilver;
	public static Item legsSilver;
	public static Item bootsSilver;
	
	public static Item helmSteel;
	public static Item chestSteel;
	public static Item legsSteel;
	public static Item bootsSteel;
	
	public static Item helmTin;
	public static Item chestTin;
	public static Item legsTin;
	public static Item bootsTin;
		
	public static void addArmor(idManager idm, CreativeTabs tab) {
		helmAluminum = new crossArmor(idm.getItemID("helmAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 0, "aluminum", tab).setUnlocalizedName("helmAluminum");
		chestAluminum = new crossArmor(idm.getItemID("chestAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 1, "aluminum", tab).setUnlocalizedName("chestAluminum");
		legsAluminum = new crossArmor(idm.getItemID("legsAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 2, "aluminum", tab).setUnlocalizedName("legsAluminum");
		bootsAluminum = new crossArmor(idm.getItemID("bootsAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 3, "aluminum", tab).setUnlocalizedName("bootsAluminum");
		
		helmBronze = new crossArmor(idm.getItemID("helmBronze"), crossMaterials.armorBronze, emec.armorBronzeRenderer, 0, "bronze", tab).setUnlocalizedName("helmBronze");
		chestBronze = new crossArmor(idm.getItemID("chestBronze"), crossMaterials.armorBronze, emec.armorBronzeRenderer, 1, "bronze", tab).setUnlocalizedName("chestBronze");
		legsBronze = new crossArmor(idm.getItemID("legsBronze"), crossMaterials.armorBronze, emec.armorBronzeRenderer, 2, "bronze", tab).setUnlocalizedName("legsBronze");
		bootsBronze = new crossArmor(idm.getItemID("bootsBronze"), crossMaterials.armorBronze, emec.armorBronzeRenderer, 3, "bronze", tab).setUnlocalizedName("bootsBronze");
				
		helmCopper = new crossArmor(idm.getItemID("helmCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 0, "copper", tab).setUnlocalizedName("helmCopper");
		chestCopper = new crossArmor(idm.getItemID("chestCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 1, "copper", tab).setUnlocalizedName("chestCopper");
		legsCopper = new crossArmor(idm.getItemID("legsCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 2, "copper", tab).setUnlocalizedName("legsCopper");
		bootsCopper = new crossArmor(idm.getItemID("bootsCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 3, "copper", tab).setUnlocalizedName("bootsCopper");
		
		helmPlatinum = new crossArmor(idm.getItemID("helmPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 0, "platinum", tab).setUnlocalizedName("helmPlatinum");
		chestPlatinum = new crossArmor(idm.getItemID("chestPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 1, "platinum", tab).setUnlocalizedName("chestPlatinum");
		legsPlatinum = new crossArmor(idm.getItemID("legsPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 2, "platinum", tab).setUnlocalizedName("legsPlatinum");
		bootsPlatinum = new crossArmor(idm.getItemID("bootsPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 3, "platinum", tab).setUnlocalizedName("bootsPlatinum");
		
		helmSilver = new crossArmor(idm.getItemID("helmSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 0, "silver", tab).setUnlocalizedName("helmSilver");
		chestSilver = new crossArmor(idm.getItemID("chestSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 1, "silver", tab).setUnlocalizedName("chestSilver");
		legsSilver = new crossArmor(idm.getItemID("legsSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 2, "silver", tab).setUnlocalizedName("legsSilver");
		bootsSilver = new crossArmor(idm.getItemID("bootsSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 3, "silver", tab).setUnlocalizedName("bootsSilver");
		
		helmSteel = new crossArmor(idm.getItemID("helmSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 0, "steel", tab).setUnlocalizedName("helmSteel");
		chestSteel = new crossArmor(idm.getItemID("chestSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 1, "steel", tab).setUnlocalizedName("chestSteel");
		legsSteel = new crossArmor(idm.getItemID("legsSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 2, "steel", tab).setUnlocalizedName("legsSteel");
		bootsSteel = new crossArmor(idm.getItemID("bootsSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 3, "steel", tab).setUnlocalizedName("bootsSteel");
		
		helmTin = new crossArmor(idm.getItemID("helmTin"), crossMaterials.armorTin, emec.armorTinRenderer, 0, "tin", tab).setUnlocalizedName("helmTin");
		chestTin = new crossArmor(idm.getItemID("chestTin"), crossMaterials.armorTin, emec.armorTinRenderer, 1, "tin", tab).setUnlocalizedName("chestTin");
		legsTin = new crossArmor(idm.getItemID("legsTin"), crossMaterials.armorTin, emec.armorTinRenderer, 2, "tin", tab).setUnlocalizedName("legsTin");
		bootsTin = new crossArmor(idm.getItemID("bootsTin"), crossMaterials.armorTin, emec.armorTinRenderer, 3, "tin", tab).setUnlocalizedName("bootsTin");
	}
}
