package com.nexized.cross.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-18 by nexized
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
    public static Item foodRawSardine;
    public static Item foodSardine;
    public static Item foodCheese;
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
    	// Defined Items (@nexized)
    	foodRawBacon = (new crossFood(idm.getItemID("foodRawBacon"), 1, 0.1F, true, tab).setUnlocalizedName("foodRawBacon"));
    	foodBacon = (new crossFood(idm.getItemID("foodBacon"), 3, 0.3F, true, tab).setUnlocalizedName("foodBacon"));
    	foodRawMoutton = (new crossFood(idm.getItemID("foodRawMoutton"), 1, 0.1F, true, tab).setUnlocalizedName("foodRawMoutton"));
    	foodMoutton = (new crossFood(idm.getItemID("foodMoutton"), 4, 0.4F, true, tab).setUnlocalizedName("foodMoutton"));
    	foodCucumber = (new crossFood(idm.getItemID("foodCucumber"), 1, 0.1F, true, tab).setUnlocalizedName("foodCucumber"));
    	foodBanana = (new crossFood(idm.getItemID("foodBanana"), 1, 0.1F, true, tab).setUnlocalizedName("foodBanana"));
    	foodTunaSalad = (new crossFood(idm.getItemID("foodTunaSalad"), 3, 0.3F, true, tab).setUnlocalizedName("foodTunaSalad"));
    	foodRawSardine = (new crossFood(idm.getItemID("foodRawSardine"), 1, 0.1F, true, tab).setUnlocalizedName("foodRawSardine"));
    	foodSardine = (new crossFood(idm.getItemID("foodSardine"), 1, 0.1F, true, tab).setUnlocalizedName("foodSardine"));
    	foodCheese = (new crossFood(idm.getItemID("foodCheese"), 3, 0.3F, true, tab).setUnlocalizedName("foodCheese"));
    	foodRye = (new crossFood(idm.getItemID("foodRye"), 1, 0.1F, true, tab).setUnlocalizedName("foodRye"));
    	foodBarley = (new crossFood(idm.getItemID("foodBarley"), 1, 0.1F, true, tab).setUnlocalizedName("foodBarley"));
    	
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
