package com.emec.material;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = lib.ID, name = lib.NAME, version = lib.VERSION)

public class material {

	@Instance("material") 
	public static material instance;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
}
