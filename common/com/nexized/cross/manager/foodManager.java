package com.nexized.cross.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-13 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.conf.confLocalisation;
import com.nexized.cross.conf.idManager;
import com.nexized.cross.item.food.crossFood;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class foodManager {

	// @Defined Items (@nexized)
	public static Item foodRawbacon;
    public static Item foodBacon;
    
    // @Defined Items (@mod_attackz)  
	public static Item foodCorn;
	public static Item foodTomato;
	public static Item foodStrawberry;
	public static Item foodBlueberry;
	public static Item foodGreenTomato;
	public static Item foodOrange;
	public static Item foodLettuce;
	public static Item foodEggplant;
	public static Item foodEggScramled;
	
    public static void doWork(idManager idm, confLocalisation local) {
    	// @Add Food Items
    	addFood(idm);
    	// @Add Food Names
    	addNames(local);
    }
    
    public static void addFood(idManager idm) {
    	foodRawbacon = (new crossFood(idm.getItemID("foodRawbacon"), 1, 0.1F, true).setUnlocalizedName("foodRawbacon"));
    	foodBacon = (new crossFood(idm.getItemID("foodBacon"), 3, 0.3F, true).setUnlocalizedName("foodBacon"));
    }
    
    public static void addNames(confLocalisation local) {
    	LanguageRegistry.addName(foodRawbacon, local.foodRawbaconName);
    	LanguageRegistry.addName(foodBacon, local.foodBaconName);
    }
    
}
