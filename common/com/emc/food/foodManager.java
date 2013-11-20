package com.emc.food;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-01
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.conf.idManager;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
		
		// @Defined Items(@HackerTDog)
		public static Item foodSandwich;
		public static Item foodRawOstrich;
		public static Item foodOstrich;
		
		public static void addFood(idManager idm, CreativeTabs tab) {
	    	if(idm.ifEnabled("@food")) {
				// Defined Items (@nexized)
		    	foodRawBacon = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodRawBacon"));
		    	foodBacon = (new emcFood(idm.getFoodID(), 5, 0.5F, true, tab).setUnlocalizedName("foodBacon"));
		    	foodRawMoutton = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodRawMoutton"));
		    	foodMoutton = (new emcFood(idm.getFoodID(), 4, 0.4F, true, tab).setUnlocalizedName("foodMoutton"));
		    	foodCucumber = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodCucumber"));
		    	foodBanana = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodBanana"));
		    	foodTunaSalad = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodTunaSalad"));
		    	foodRawSardine = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodRawSardine"));
		    	foodSardine = (new emcFood(idm.getFoodID(), 4, 0.4F, true, tab).setUnlocalizedName("foodSardine"));
		    	foodCheese = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodCheese"));
		    	foodRye = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodRye"));
		    	foodBarley = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodBarley"));
		    	
		    	foodCorn = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodCorn"));
		    	foodTomato = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodTomato"));
		    	foodStrawberry = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodStrawberry"));
		    	foodBlueberry = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodBlueberry"));
		    	foodGreenTomato = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodGreenTomato"));
		    	foodOrange = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodOrange"));
		    	foodLettuce = (new emcFood(idm.getFoodID(), 1, 0.1F, true, tab).setUnlocalizedName("foodLettuce"));
		    	foodEggplant = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodEggplant"));
		    	foodEggScramled = (new emcFood(idm.getFoodID(), 3, 0.3F, true, tab).setUnlocalizedName("foodEggScramled"));
		    	
		    	// @Defined Items By HackerTDog
		    	foodSandwich = (new emcFood(idm.getFoodID(), 8, 0.8F, true, tab).setUnlocalizedName("sandwich"));
		    	foodRawOstrich = (new  emcFood(idm.getFoodID(), 4, 0.4F, true, tab).setUnlocalizedName("foodRawOstrich"));
		    	foodOstrich = (new  emcFood(idm.getFoodID(), 9, 0.9F, true, tab).setUnlocalizedName("foodOstrich"));
		    	
	    	   //Recipes Cant believe you never made them yet
		    	GameRegistry.addSmelting(foodRawBacon.itemID, new ItemStack(foodBacon), 1.3F);
		    	GameRegistry.addSmelting(foodRawMoutton.itemID, new ItemStack(foodMoutton), 1.3F);
		    	GameRegistry.addSmelting(foodRawSardine.itemID, new ItemStack(foodSardine), 1.3F);
		    	GameRegistry.addSmelting(foodRawOstrich.itemID, new ItemStack(foodOstrich), 1.4F);
		    	GameRegistry.addRecipe(new ItemStack(foodSandwich), new Object[]{"B", "F", "B", 'B', Item.bread, 'F', Item.fishCooked});
		    	GameRegistry.addRecipe(new ItemStack(foodSandwich), new Object[]{"B", "F", "B", 'B', Item.bread, 'F', Item.chickenCooked});
		    	GameRegistry.addRecipe(new ItemStack(foodSandwich), new Object[]{"B", "F", "B", 'B', Item.bread, 'F', Item.beefCooked});
		    	GameRegistry.addRecipe(new ItemStack(foodSandwich), new Object[]{"B", "F", "B", 'B', Item.bread, 'F', foodBacon});
		    	GameRegistry.addRecipe(new ItemStack(foodSandwich), new Object[]{"B", "F", "B", 'B', Item.bread, 'F', foodMoutton});
		    	GameRegistry.addRecipe(new ItemStack(foodTunaSalad), new Object[]{"SFS", 'S', foodLettuce, 'F', Item.fishRaw});
	    	}
	    }
}
