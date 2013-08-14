package com.nexized.cross.manager;

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class itemManager {

	// @itemIngot
	public static Item ingotAluminum;
	public static Item ingotBronze;
	public static Item ingotCopper;
	public static Item ingotPlatinum;
	public static Item ingotSilver;
	public static Item ingotSteel;
	public static Item ingotTin;
	
	public static Item dustIron;
	public static Item dustAluminum;
	public static Item dustBronze;
	public static Item dustCopper;
	public static Item dustPlatinum;
	public static Item dustSilver;
	public static Item dustSteel;
	public static Item dustTin;
	
	public static void doWork(idManager idm, confLocalisation local) {
		// @add Items
		addItems(idm);
		// @add Names
		addNames(local);
	}
	
	public static void addItems(idManager idm) {
		ingotAluminum = new crossItem(idm.getItemID("ingotAluminum")).setUnlocalizedName("ingotAluminum");
		ingotCopper = new crossItem(idm.getItemID("ingotCopper")).setUnlocalizedName("ingotCopper");
		ingotPlatinum = new crossItem(idm.getItemID("ingotPlatinum")).setUnlocalizedName("ingotPlatinum");
		ingotSilver = new crossItem(idm.getItemID("ingotSilver")).setUnlocalizedName("ingotSilver");
		ingotSteel = new crossItem(idm.getItemID("ingotSteel")).setUnlocalizedName("ingotSteel");
		ingotTin = new crossItem(idm.getItemID("ingotTin")).setUnlocalizedName("ingotTin");
		
		dustAluminum = new crossItem(idm.getItemID("dustAluminum")).setUnlocalizedName("dustAluminum");
		dustCopper = new crossItem(idm.getItemID("dustCopper")).setUnlocalizedName("dustCopper");
		dustPlatinum = new crossItem(idm.getItemID("dustPlatinum")).setUnlocalizedName("dustPlatinum");
		dustSilver = new crossItem(idm.getItemID("dustSilver")).setUnlocalizedName("dustSilver");
		dustSteel = new crossItem(idm.getItemID("dustSteel")).setUnlocalizedName("dustSteel");
		dustTin = new crossItem(idm.getItemID("dustTin")).setUnlocalizedName("dustTin");
	}
	
	public static void addNames(confLocalisation local) {
		LanguageRegistry.addName(ingotAluminum, local.ingotAluminumName);
		LanguageRegistry.addName(ingotCopper, local.ingotCopperName);
		LanguageRegistry.addName(ingotPlatinum, local.ingotPlatinumName);
		LanguageRegistry.addName(ingotSilver, local.ingotSilverName);
		LanguageRegistry.addName(ingotSteel, local.ingotSteelName);
		LanguageRegistry.addName(ingotTin, local.ingotTinName);
		
		LanguageRegistry.addName(dustAluminum, local.dustAluminumName);
		LanguageRegistry.addName(dustCopper, local.dustCopperName);
		LanguageRegistry.addName(dustPlatinum, local.dustPlatinumName);
		LanguageRegistry.addName(dustSilver, local.dustSilverName);
		LanguageRegistry.addName(dustSteel, local.dustSteelName);
		LanguageRegistry.addName(dustTin, local.dustTinName);
	}
	
}
