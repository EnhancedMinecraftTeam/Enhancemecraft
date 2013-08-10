package com.nexized.cross.manager;

import com.nexized.cross.conf.confEntity;
import com.nexized.cross.conf.confLocalisation;
import com.nexized.cross.item.food.crossFood;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class foodManager {

	public static Item foodRawbacon;
    public static Item foodBacon;
	
    public static void doWork(confEntity idm, confLocalisation local) {
    	// @Add Food Items
    	addFood(idm);
    	// @Add Food Names
    	addNames(local);
    }
    
    public static void addFood(confEntity idm) {
    	foodRawbacon = (new crossFood(idm.foodRawbaconID, 1, 0.1F, true).setUnlocalizedName("foodRawbacon"));
    	foodBacon = (new crossFood(idm.foodBaconID, 3, 0.3F, true).setUnlocalizedName("foodBacon"));
    }
    
    public static void addNames(confLocalisation local) {
    	LanguageRegistry.addName(foodRawbacon, local.foodRawbaconName);
    	LanguageRegistry.addName(foodBacon, local.foodBaconName);
    }
    
}
