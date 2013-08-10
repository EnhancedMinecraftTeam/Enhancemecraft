package com.nexized.cross.manager;

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class itemManager {

	// @itemIngot
	public static Item ingotAluminum;
	public static Item ingotCopper;
	public static Item ingotPlatinum;
	public static Item ingotSilver;
	public static Item ingotSteel;
	public static Item ingotTin;
	
	public static void doWork(confEntity idm, confLocalisation local) {
		// @add Items
		addItems(idm);
		// @add Names
		addNames(local);
	}
	
	public static void addItems(confEntity idm) {
		ingotAluminum = new crossItem(idm.ingotAluminumID).setUnlocalizedName("ingotAluminum");
		ingotCopper = new crossItem(idm.ingotCopperID).setUnlocalizedName("ingotCopper");
		ingotPlatinum = new crossItem(idm.ingotPlatinumID).setUnlocalizedName("ingotPlatinum");
		ingotSilver = new crossItem(idm.ingotSilverID).setUnlocalizedName("ingotSilver");
		ingotSteel = new crossItem(idm.ingotSteelID).setUnlocalizedName("ingotSteel");
		ingotTin = new crossItem(idm.ingotTinID).setUnlocalizedName("ingotTin");
	}
	
	public static void addNames(confLocalisation local) {
		LanguageRegistry.addName(ingotAluminum, local.ingotAluminumName);
		LanguageRegistry.addName(ingotCopper, local.ingotCopperName);
		LanguageRegistry.addName(ingotPlatinum, local.ingotPlatinumName);
		LanguageRegistry.addName(ingotSilver, local.ingotSilverName);
		LanguageRegistry.addName(ingotSteel, local.ingotSteelName);
		LanguageRegistry.addName(ingotTin, local.ingotTinName);
	}
	
}
