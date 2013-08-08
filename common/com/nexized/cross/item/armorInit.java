package com.nexized.cross.item;

import com.nexized.cross.conf.confEntity;
import com.nexized.cross.conf.confLocalisation;
import com.nexized.emec.emec;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class armorInit {

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
	
	public static void doWork() {
		// @Add Armors
		addArmor();
		// @Add Names
		addNames();
	}
	
	public static void addArmor() {
		helmAluminum = new crossArmor(confEntity.helmAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 0, "aluminum").setUnlocalizedName("helmAluminum");
		chestAluminum = new crossArmor(confEntity.chestAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 1, "aluminum").setUnlocalizedName("chestAluminum");
		legsAluminum = new crossArmor(confEntity.legsAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 2, "aluminum").setUnlocalizedName("legsAluminum");
		bootsAluminum = new crossArmor(confEntity.bootsAluminumID, crossMaterials.armorAluminum, emec.armorAluminumRenderer, 3, "aluminum").setUnlocalizedName("bootsAluminum");
		
		helmCopper = new crossArmor(confEntity.helmCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 0, "copper").setUnlocalizedName("helmCopper");
		chestCopper = new crossArmor(confEntity.chestCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 1, "copper").setUnlocalizedName("chestCopper");
		legsCopper = new crossArmor(confEntity.legsCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 2, "copper").setUnlocalizedName("legsCopper");
		bootsCopper = new crossArmor(confEntity.bootsCopperID, crossMaterials.armorCopper, emec.armorCopperRenderer, 3, "copper").setUnlocalizedName("bootsCopper");
		
		helmPlatinum = new crossArmor(confEntity.helmPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 0, "platinum").setUnlocalizedName("helmPlatinum");
		chestPlatinum = new crossArmor(confEntity.chestPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 1, "platinum").setUnlocalizedName("chestPlatinum");
		legsPlatinum = new crossArmor(confEntity.legsPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 2, "platinum").setUnlocalizedName("legsPlatinum");
		bootsPlatinum = new crossArmor(confEntity.bootsPlatinumID, crossMaterials.armorPlatinum, emec.armorPlatinumRenderer, 3, "platinum").setUnlocalizedName("bootsPlatinum");
		
		helmSilver = new crossArmor(confEntity.helmSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 0, "silver").setUnlocalizedName("helmSilver");
		chestSilver = new crossArmor(confEntity.chestSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 1, "silver").setUnlocalizedName("chestSilver");
		legsSilver = new crossArmor(confEntity.legsSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 2, "silver").setUnlocalizedName("legsSilver");
		bootsSilver = new crossArmor(confEntity.bootsSilverID, crossMaterials.armorSilver, emec.armorSilverRenderer, 3, "silver").setUnlocalizedName("bootsSilver");
		
		helmSteel = new crossArmor(confEntity.helmSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 0, "steel").setUnlocalizedName("helmSteel");
		chestSteel = new crossArmor(confEntity.chestSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 1, "steel").setUnlocalizedName("chestSteel");
		legsSteel = new crossArmor(confEntity.legsSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 2, "steel").setUnlocalizedName("legsSteel");
		bootsSteel = new crossArmor(confEntity.bootsSteelID, crossMaterials.armorSteel, emec.armorSteelRenderer, 3, "steel").setUnlocalizedName("bootsSteel");
		
		helmTin = new crossArmor(confEntity.helmTinID, crossMaterials.armorTin, emec.armorTinRenderer, 0, "tin").setUnlocalizedName("helmTin");
		chestTin = new crossArmor(confEntity.chestTinID, crossMaterials.armorTin, emec.armorTinRenderer, 1, "tin").setUnlocalizedName("chestTin");
		legsTin = new crossArmor(confEntity.legsTinID, crossMaterials.armorTin, emec.armorTinRenderer, 2, "tin").setUnlocalizedName("legsTin");
		bootsTin = new crossArmor(confEntity.bootsTinID, crossMaterials.armorTin, emec.armorTinRenderer, 3, "tin").setUnlocalizedName("bootsTin");
	}
	
	public static void addNames() {
		LanguageRegistry.addName(helmAluminum, confLocalisation.helmAluminumName);
		LanguageRegistry.addName(chestAluminum, confLocalisation.chestAluminumName);
		LanguageRegistry.addName(legsAluminum, confLocalisation.legsAluminumName);
		LanguageRegistry.addName(bootsAluminum, confLocalisation.bootsAluminumName);
		
		LanguageRegistry.addName(helmCopper, confLocalisation.helmCopperName);
		LanguageRegistry.addName(chestCopper, confLocalisation.chestCopperName);
		LanguageRegistry.addName(legsCopper, confLocalisation.legsCopperName);
		LanguageRegistry.addName(bootsCopper, confLocalisation.bootsCopperName);
		
		LanguageRegistry.addName(helmPlatinum, confLocalisation.helmPlatinumName);
		LanguageRegistry.addName(chestPlatinum, confLocalisation.chestPlatinumName);
		LanguageRegistry.addName(legsPlatinum, confLocalisation.legsPlatinumName);
		LanguageRegistry.addName(bootsPlatinum, confLocalisation.bootsPlatinumName);
		
		LanguageRegistry.addName(helmSilver, confLocalisation.helmSilverName);
		LanguageRegistry.addName(chestSilver, confLocalisation.chestSilverName);
		LanguageRegistry.addName(legsSilver, confLocalisation.legsSilverName);
		LanguageRegistry.addName(bootsSilver, confLocalisation.bootsSilverName);
		
		LanguageRegistry.addName(helmSteel, confLocalisation.helmSteelName);
		LanguageRegistry.addName(chestSteel, confLocalisation.chestSteelName);
		LanguageRegistry.addName(legsSteel, confLocalisation.legsSteelName);
		LanguageRegistry.addName(bootsSteel, confLocalisation.bootsSteelName);
		
		LanguageRegistry.addName(helmTin, confLocalisation.helmTinName);
		LanguageRegistry.addName(chestTin, confLocalisation.chestTinName);
		LanguageRegistry.addName(legsTin, confLocalisation.legsTinName);
		LanguageRegistry.addName(bootsTin, confLocalisation.bootsTinName);
	}
}
