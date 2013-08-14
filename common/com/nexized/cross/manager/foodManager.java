package com.nexized.cross.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-13 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.conf.idManager;
import com.nexized.cross.item.food.crossFood;

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
	    
    public static void addFood(idManager idm) {
    	foodRawbacon = (new crossFood(idm.getItemID("foodRawbacon"), 1, 0.1F, true).setUnlocalizedName("foodRawbacon"));
    	foodBacon = (new crossFood(idm.getItemID("foodBacon"), 3, 0.3F, true).setUnlocalizedName("foodBacon"));
    	foodCorn = (new crossFood(idm.getItemID("foodCorn"), 1, 0.1F, true).setUnlocalizedName("foodCorn"));
    	foodTomato = (new crossFood(idm.getItemID("foodTomato"), 3, 0.3F, true).setUnlocalizedName("foodTomato"));
    	foodStrawberry = (new crossFood(idm.getItemID("foodStrawberry"), 1, 0.1F, true).setUnlocalizedName("foodStrawberry"));
    	foodBlueberry = (new crossFood(idm.getItemID("foodBlueberry"), 3, 0.3F, true).setUnlocalizedName("foodBlueberry"));
    	foodGreenTomato = (new crossFood(idm.getItemID("foodTomato"), 1, 0.1F, true).setUnlocalizedName("foodGreenTomato"));
    	foodOrange = (new crossFood(idm.getItemID("foodOrange"), 3, 0.3F, true).setUnlocalizedName("foodOrange"));
    	foodLettuce = (new crossFood(idm.getItemID("foodLettuce"), 1, 0.1F, true).setUnlocalizedName("foodLettuce"));
    	foodEggplant = (new crossFood(idm.getItemID("foodEggplant"), 3, 0.3F, true).setUnlocalizedName("foodEggplant"));
    	foodEggScramled = (new crossFood(idm.getItemID("foodEggScramled"), 3, 0.3F, true).setUnlocalizedName("foodEggScramled"));
    }
    
}
