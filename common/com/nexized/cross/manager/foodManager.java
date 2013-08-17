package com.nexized.cross.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-13 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.conf.idManager;
import com.nexized.cross.item.food.crossFood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class foodManager {

	// @Defined Items (@nexized)
	public static Item foodRawBacon;
    public static Item foodBacon;
    public static Item foodRawMoutton;
    public static Item foodMoutton;
    public static Item foodCucumber;
    public static Item foodBanana;
    public static Item foodTunaSalad;
    public static Item foodSardine;
    public static Item foodChese;
    public static Item foodRye;
    public static Item foodBarley;
    
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
	    
    public static void addFood(idManager idm, CreativeTabs tab) {
    	foodRawBacon = (new crossFood(idm.getItemID("foodRawBacon"), 1, 0.1F, true, tab).setUnlocalizedName("foodRawBacon"));
    	foodRawMoutton = (new crossFood(idm.getItemID("foodRawMoutton"), 1, 0.1F, true, tab).setUnlocalizedName("foodRawMoutton"));
    	foodBacon = (new crossFood(idm.getItemID("foodBacon"), 3, 0.3F, true, tab).setUnlocalizedName("foodBacon"));
    	foodMoutton = (new crossFood(idm.getItemID("foodMoutton"), 4, 0.4F, true, tab).setUnlocalizedName("foodMoutton"));
    	foodCorn = (new crossFood(idm.getItemID("foodCorn"), 1, 0.1F, true, tab).setUnlocalizedName("foodCorn"));
    	foodTomato = (new crossFood(idm.getItemID("foodTomato"), 3, 0.3F, true, tab).setUnlocalizedName("foodTomato"));
    	foodStrawberry = (new crossFood(idm.getItemID("foodStrawberry"), 1, 0.1F, true, tab).setUnlocalizedName("foodStrawberry"));
    	foodBlueberry = (new crossFood(idm.getItemID("foodBlueberry"), 3, 0.3F, true, tab).setUnlocalizedName("foodBlueberry"));
    	foodGreenTomato = (new crossFood(idm.getItemID("foodTomato"), 1, 0.1F, true, tab).setUnlocalizedName("foodGreenTomato"));
    	foodOrange = (new crossFood(idm.getItemID("foodOrange"), 3, 0.3F, true, tab).setUnlocalizedName("foodOrange"));
    	foodLettuce = (new crossFood(idm.getItemID("foodLettuce"), 1, 0.1F, true, tab).setUnlocalizedName("foodLettuce"));
    	foodEggplant = (new crossFood(idm.getItemID("foodEggplant"), 3, 0.3F, true, tab).setUnlocalizedName("foodEggplant"));
    	foodEggScramled = (new crossFood(idm.getItemID("foodEggScramled"), 3, 0.3F, true, tab).setUnlocalizedName("foodEggScramled"));
    }
    
}
