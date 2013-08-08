package com.nexized.cross.item;

import com.nexized.cross.conf.confEntity;
import com.nexized.cross.conf.confLocalisation;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class itemInit {

	// @itemIngot
	public static Item ingotAluminum;
	public static Item ingotCopper;
	public static Item ingotPlatinum;
	public static Item ingotSilver;
	public static Item ingotSteel;
	public static Item ingotTin;
	
	public static void doWork() {
		// @add Items
		addItems();
		// @add Names
		addNames();
	}
	
	public static void addItems() {
		ingotAluminum = new crossItem(confEntity.ingotAluminumID).setUnlocalizedName("ingotAluminum");
		ingotCopper = new crossItem(confEntity.ingotCopperID).setUnlocalizedName("ingotCopper");
		ingotPlatinum = new crossItem(confEntity.ingotPlatinumID).setUnlocalizedName("ingotPlatinum");
		ingotSilver = new crossItem(confEntity.ingotSilverID).setUnlocalizedName("ingotSilver");
		ingotSteel = new crossItem(confEntity.ingotSteelID).setUnlocalizedName("ingotSteel");
		ingotTin = new crossItem(confEntity.ingotTinID).setUnlocalizedName("ingotTin");
	}
	
	public static void addNames() {
		LanguageRegistry.addName(ingotAluminum, confLocalisation.ingotAluminumName);
		LanguageRegistry.addName(ingotCopper, confLocalisation.ingotCopperName);
		LanguageRegistry.addName(ingotPlatinum, confLocalisation.ingotPlatinumName);
		LanguageRegistry.addName(ingotSilver, confLocalisation.ingotSilverName);
		LanguageRegistry.addName(ingotSteel, confLocalisation.ingotSteelName);
		LanguageRegistry.addName(ingotTin, confLocalisation.ingotTinName);
	}
	
}
