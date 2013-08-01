package com.nexized.emec;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance; 
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import com.nexized.emec.lib.*;
import com.nexized.emec.common.*;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = modInfo.MODID, name = modInfo.MODNAME, version = modInfo.MODVERSION)

public class emec {

	@SidedProxy(clientSide = "com.nexized.emec.common.ClientProxy", serverSide = "com.nexized.emec.common.CommonProxy")
    public static CommonProxy proxy;
	
	@Instance
    public emec instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
    {
		
    }
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
    {
		
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
