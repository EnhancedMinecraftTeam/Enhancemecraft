package com.nexized.cross.manager;

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;
import com.nexized.emec.emec;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class armorManager {

	public static Item helmAluminum;
	public static Item chestAluminum;
	public static Item legsAluminum;
	public static Item bootsAluminum;
	
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
	
	public static void doWork(idManager idm, confLocalisation local) {
		// @Add Armors
		addArmor(idm);
		// @Add Names
		addNames(local);
	}
	
	public static void addArmor(idManager idm) {
		helmAluminum = new crossArmor(idm.getItemID("helmAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 0, "aluminum").setUnlocalizedName("helmAluminum");
		chestAluminum = new crossArmor(idm.getItemID("chestAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 1, "aluminum").setUnlocalizedName("chestAluminum");
		legsAluminum = new crossArmor(idm.getItemID("legsAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 2, "aluminum").setUnlocalizedName("legsAluminum");
		bootsAluminum = new crossArmor(idm.getItemID("bootsAluminum"), crossMaterials.armorAluminum, emec.armorAluminumRenderer, 3, "aluminum").setUnlocalizedName("bootsAluminum");
		
		helmCopper = new crossArmor(idm.getItemID("helmCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 0, "copper").setUnlocalizedName("helmCopper");
		chestCopper = new crossArmor(idm.getItemID("chestCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 1, "copper").setUnlocalizedName("chestCopper");
		legsCopper = new crossArmor(idm.getItemID("legsCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 2, "copper").setUnlocalizedName("legsCopper");
		bootsCopper = new crossArmor(idm.getItemID("bootsCopper"), crossMaterials.armorCopper, emec.armorCopperRenderer, 3, "copper").setUnlocalizedName("bootsCopper");
		
		helmPlatinum = new crossArmor(idm.getItemID("helmPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 0, "platinum").setUnlocalizedName("helmPlatinum");
		chestPlatinum = new crossArmor(idm.getItemID("chestPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 1, "platinum").setUnlocalizedName("chestPlatinum");
		legsPlatinum = new crossArmor(idm.getItemID("legsPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 2, "platinum").setUnlocalizedName("legsPlatinum");
		bootsPlatinum = new crossArmor(idm.getItemID("bootsPlatinum"), crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 3, "platinum").setUnlocalizedName("bootsPlatinum");
		
		helmSilver = new crossArmor(idm.getItemID("helmSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 0, "silver").setUnlocalizedName("helmSilver");
		chestSilver = new crossArmor(idm.getItemID("chestSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 1, "silver").setUnlocalizedName("chestSilver");
		legsSilver = new crossArmor(idm.getItemID("legsSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 2, "silver").setUnlocalizedName("legsSilver");
		bootsSilver = new crossArmor(idm.getItemID("bootsSilver"), crossMaterials.armorSilver, emec.armorSilverRenderer, 3, "silver").setUnlocalizedName("bootsSilver");
		
		helmSteel = new crossArmor(idm.getItemID("helmSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 0, "steel").setUnlocalizedName("helmSteel");
		chestSteel = new crossArmor(idm.getItemID("chestSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 1, "steel").setUnlocalizedName("chestSteel");
		legsSteel = new crossArmor(idm.getItemID("legsSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 2, "steel").setUnlocalizedName("legsSteel");
		bootsSteel = new crossArmor(idm.getItemID("bootsSteel"), crossMaterials.armorSteel, emec.armorSteelRenderer, 3, "steel").setUnlocalizedName("bootsSteel");
		
		helmTin = new crossArmor(idm.getItemID("helmTin"), crossMaterials.armorTin, emec.armorTinRenderer, 0, "tin").setUnlocalizedName("helmTin");
		chestTin = new crossArmor(idm.getItemID("chestTin"), crossMaterials.armorTin, emec.armorTinRenderer, 1, "tin").setUnlocalizedName("chestTin");
		legsTin = new crossArmor(idm.getItemID("legsTin"), crossMaterials.armorTin, emec.armorTinRenderer, 2, "tin").setUnlocalizedName("legsTin");
		bootsTin = new crossArmor(idm.getItemID("bootsTin"), crossMaterials.armorTin, emec.armorTinRenderer, 3, "tin").setUnlocalizedName("bootsTin");
	}
	
	public static void addNames(confLocalisation local) {
		LanguageRegistry.addName(helmAluminum, local.helmAluminumName);
		LanguageRegistry.addName(chestAluminum, local.chestAluminumName);
		LanguageRegistry.addName(legsAluminum, local.legsAluminumName);
		LanguageRegistry.addName(bootsAluminum, local.bootsAluminumName);
		
		LanguageRegistry.addName(helmCopper, local.helmCopperName);
		LanguageRegistry.addName(chestCopper, local.chestCopperName);
		LanguageRegistry.addName(legsCopper, local.legsCopperName);
		LanguageRegistry.addName(bootsCopper, local.bootsCopperName);
		
		LanguageRegistry.addName(helmPlatinum, local.helmPlatinumName);
		LanguageRegistry.addName(chestPlatinum, local.chestPlatinumName);
		LanguageRegistry.addName(legsPlatinum, local.legsPlatinumName);
		LanguageRegistry.addName(bootsPlatinum, local.bootsPlatinumName);
		
		LanguageRegistry.addName(helmSilver, local.helmSilverName);
		LanguageRegistry.addName(chestSilver, local.chestSilverName);
		LanguageRegistry.addName(legsSilver, local.legsSilverName);
		LanguageRegistry.addName(bootsSilver, local.bootsSilverName);
		
		LanguageRegistry.addName(helmSteel, local.helmSteelName);
		LanguageRegistry.addName(chestSteel, local.chestSteelName);
		LanguageRegistry.addName(legsSteel, local.legsSteelName);
		LanguageRegistry.addName(bootsSteel, local.bootsSteelName);
		
		LanguageRegistry.addName(helmTin, local.helmTinName);
		LanguageRegistry.addName(chestTin, local.chestTinName);
		LanguageRegistry.addName(legsTin, local.legsTinName);
		LanguageRegistry.addName(bootsTin, local.bootsTinName);
	}
}
