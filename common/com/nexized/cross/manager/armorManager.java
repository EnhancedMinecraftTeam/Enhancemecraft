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
	
	public static void doWork(confEntity idm, confLocalisation local) {
		// @Add Armors
		addArmor(idm);
		// @Add Names
		addNames(local);
	}
	
	public static void addArmor(confEntity idm) {
		helmAluminum = new crossArmor(idm.helmAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 0, "aluminum").setUnlocalizedName("helmAluminum");
		chestAluminum = new crossArmor(idm.chestAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 1, "aluminum").setUnlocalizedName("chestAluminum");
		legsAluminum = new crossArmor(idm.legsAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 2, "aluminum").setUnlocalizedName("legsAluminum");
		bootsAluminum = new crossArmor(idm.bootsAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 3, "aluminum").setUnlocalizedName("bootsAluminum");
		
		helmCopper = new crossArmor(idm.helmCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 0, "copper").setUnlocalizedName("helmCopper");
		chestCopper = new crossArmor(idm.chestCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 1, "copper").setUnlocalizedName("chestCopper");
		legsCopper = new crossArmor(idm.legsCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 2, "copper").setUnlocalizedName("legsCopper");
		bootsCopper = new crossArmor(idm.bootsCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 3, "copper").setUnlocalizedName("bootsCopper");
		
		helmPlatinum = new crossArmor(idm.helmPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 0, "platinum").setUnlocalizedName("helmPlatinum");
		chestPlatinum = new crossArmor(idm.chestPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 1, "platinum").setUnlocalizedName("chestPlatinum");
		legsPlatinum = new crossArmor(idm.legsPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 2, "platinum").setUnlocalizedName("legsPlatinum");
		bootsPlatinum = new crossArmor(idm.bootsPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 3, "platinum").setUnlocalizedName("bootsPlatinum");
		
		helmSilver = new crossArmor(idm.helmSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 0, "silver").setUnlocalizedName("helmSilver");
		chestSilver = new crossArmor(idm.chestSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 1, "silver").setUnlocalizedName("chestSilver");
		legsSilver = new crossArmor(idm.legsSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 2, "silver").setUnlocalizedName("legsSilver");
		bootsSilver = new crossArmor(idm.bootsSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 3, "silver").setUnlocalizedName("bootsSilver");
		
		helmSteel = new crossArmor(idm.helmSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 0, "steel").setUnlocalizedName("helmSteel");
		chestSteel = new crossArmor(idm.chestSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 1, "steel").setUnlocalizedName("chestSteel");
		legsSteel = new crossArmor(idm.legsSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 2, "steel").setUnlocalizedName("legsSteel");
		bootsSteel = new crossArmor(idm.bootsSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 3, "steel").setUnlocalizedName("bootsSteel");
		
		helmTin = new crossArmor(idm.helmTinID, crossMaterials.armorTin, emec.armorTinRenderer, 0, "tin").setUnlocalizedName("helmTin");
		chestTin = new crossArmor(idm.chestTinID, crossMaterials.armorTin, emec.armorTinRenderer, 1, "tin").setUnlocalizedName("chestTin");
		legsTin = new crossArmor(idm.legsTinID, crossMaterials.armorTin, emec.armorTinRenderer, 2, "tin").setUnlocalizedName("legsTin");
		bootsTin = new crossArmor(idm.bootsTinID, crossMaterials.armorTin, emec.armorTinRenderer, 3, "tin").setUnlocalizedName("bootsTin");
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
