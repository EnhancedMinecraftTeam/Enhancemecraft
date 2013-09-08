package com.emc;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-01
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.emc.conf.idManager;
import com.emc.food.emcFoodDropEvent;
import com.emc.food.foodManager;
import com.emc.lib.emcLib;
import com.emc.localization.localizationHandler;
import com.emc.mat.matManager;
import com.emc.proxy.commonProxy;
import com.emc.world.emcWorldGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = emcLib.ID, name = emcLib.NAME, version = emcLib.VERSION)

public class emc {

	@SidedProxy(clientSide = "com.emc.proxy.clientProxy", serverSide = "com.emc.proxy.commonProxy")
	public static commonProxy proxy;
	
	@Instance("emc")
    public static emc instance;
	
	// @Creative Tab
	public static CreativeTabs tabEMCBlocks;
	public static CreativeTabs tabEMCItems;
	public static CreativeTabs tabEMCArmor;
	public static CreativeTabs tabEMCFood;
	
	// @ID Manager
    idManager idm;
    
    @EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
    	// @ID Manager
    	idm = new idManager(event);
    	// @Localisation
    	localizationHandler.loadLanguages();
    }
    
    @EventHandler
	public void Load(FMLInitializationEvent event) {
    	// Custom Tabs
    	if(idm.ifEnabled("@oreBlock") || idm.ifEnabled("@ingotBlock")) {
	    		tabEMCBlocks = new CreativeTabs("tabEMCBlocks") {
	    		public ItemStack getIconItemStack() {
	               	return new ItemStack(matManager.oreCopper, 1, 0);
					}
	    		};
    		}
    	if(idm.ifEnabled("@itemIngot") || idm.ifEnabled("@toolAxe")
    		|| idm.ifEnabled("@toolHoe") || idm.ifEnabled("@toolPick")
    		|| idm.ifEnabled("@toolShovel") || idm.ifEnabled("@toolSword")) {
    		tabEMCItems = new CreativeTabs("tabEMCBlocks") {
    		public ItemStack getIconItemStack() {
    			return new ItemStack(matManager.ingotCopper, 1, 0);
    			}
    		};
    	}
    	if(idm.ifEnabled("@armor")) {
    		tabEMCArmor = new CreativeTabs("tabEMCArmor") {
        		public ItemStack getIconItemStack() {
        			return new ItemStack(matManager.chestCopper, 1, 0);
        		}
        	};
    	}
    	if(idm.ifEnabled("@food")) {
    		tabEMCFood = new CreativeTabs("tabEMCFood") {
        		public ItemStack getIconItemStack() {
        			return new ItemStack(foodManager.foodBacon, 1, 0);
        		}
        	};
        	// Enable FoodDropEvent for @food
        	MinecraftForge.EVENT_BUS.register(new emcFoodDropEvent());
    	}
    	
    	// @Add Stuff
    	matManager.addBlocks(idm, tabEMCBlocks);
    	matManager.addItems(idm, tabEMCItems);
    	matManager.addArmor(idm, tabEMCArmor);
    	matManager.addTools(idm, tabEMCItems);
    	matManager.addRecipes(idm);
    	
    	// @Add Food
    	foodManager.addFood(idm, tabEMCFood);
    	
    	// @IDManager
    	idm.saveConf();
    	
    	// WorldGenerator if @oreBlocks are enabled
    	if(idm.ifEnabled("@oreBlock")) {
    	GameRegistry.registerWorldGenerator(new emcWorldGenerator());
    	}
    	
    	
    }   
	
}
