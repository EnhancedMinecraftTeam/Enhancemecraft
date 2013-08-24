package com.emec.food;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = lib.ID, name = lib.NAME, version = lib.VERSION)

public class food {

	@Instance("food") 
	public static food instance;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
	
}
