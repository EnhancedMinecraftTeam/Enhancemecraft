package com.nexized.cross.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-15 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;

import net.minecraft.creativetab.CreativeTabs;
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
	/*
	public static Item dustIron;
	public static Item dustAluminum;
	public static Item dustBronze;
	public static Item dustCopper;
	public static Item dustPlatinum;
	public static Item dustSilver;
	public static Item dustSteel;
	public static Item dustTin;
	*/
	public static void addItems(idManager idm, CreativeTabs tab) {
		ingotAluminum = new crossItem(idm.getItemID("ingotAluminum"), tab).setUnlocalizedName("ingotAluminum");
		ingotBronze = new crossItem(idm.getItemID("ingotBronze"), tab).setUnlocalizedName("ingotBronze");
		ingotCopper = new crossItem(idm.getItemID("ingotCopper"), tab).setUnlocalizedName("ingotCopper");
		ingotPlatinum = new crossItem(idm.getItemID("ingotPlatinum"), tab).setUnlocalizedName("ingotPlatinum");
		ingotSilver = new crossItem(idm.getItemID("ingotSilver"), tab).setUnlocalizedName("ingotSilver");
		ingotSteel = new crossItem(idm.getItemID("ingotSteel"), tab).setUnlocalizedName("ingotSteel");
		ingotTin = new crossItem(idm.getItemID("ingotTin"), tab).setUnlocalizedName("ingotTin");
		/*
		dustIron = new crossItem(idm.getItemID("dustIron"), tab).setUnlocalizedName("dustIron");
		dustAluminum = new crossItem(idm.getItemID("dustAluminum"), tab).setUnlocalizedName("dustAluminum");
		dustBronze = new crossItem(idm.getItemID("dustBronze"), tab).setUnlocalizedName("dustBronze");
		dustCopper = new crossItem(idm.getItemID("dustCopper"), tab).setUnlocalizedName("dustCopper");
		dustPlatinum = new crossItem(idm.getItemID("dustPlatinum"), tab).setUnlocalizedName("dustPlatinum");
		dustSilver = new crossItem(idm.getItemID("dustSilver"), tab).setUnlocalizedName("dustSilver");
		dustSteel = new crossItem(idm.getItemID("dustSteel"), tab).setUnlocalizedName("dustSteel");
		*/
	}
}