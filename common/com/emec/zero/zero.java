package com.emec.zero;

/*
 * Author: nexized
 * Last changed: 2013-08-22 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import net.minecraft.creativetab.CreativeTabs;

import com.emec.zero.conf.localizationHandler;
import com.emec.zero.proxy.commonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = lib.ID, name = lib.NAME, version = lib.VERSION)
public class zero {

	@SidedProxy(clientSide = "com.emec.zero.proxy.clientProxy", 
			serverSide = "com.emec.zero.proxy.commonProxy")
	public static commonProxy proxy;
	
	@Instance("zero") 
	public static zero instance;
	
	// @Creative Tab
	public static CreativeTabs tabEnhanceMeCraft;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		localizationHandler.loadLanguages();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
}
