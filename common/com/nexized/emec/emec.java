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
	
	// @ConfgurationHandler
	ConfigurationHandler commonConfiguration;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
    {
		System.out.println("[" + modInfo.MODID+ "]" + "- Version " + modInfo.MODVERSION);
		System.out.println("[" + modInfo.MODID+ "]" + "- Loading commonConfiguration...");
		// @ConfigurationHandler
		commonConfiguration = new ConfigurationHandler(event);
    }
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
    {
		// @CommonLoader init
		System.out.println("[" + modInfo.MODID+ "]" + "- Initialisation...");
		CommonLoader.materialInit();
		// @CommonLoader add
		System.out.println("[" + modInfo.MODID+ "]" + "- Adding blocks...");
		CommonLoader.addBlocks(commonConfiguration);
		System.out.println("[" + modInfo.MODID+ "]" + "- Adding items...");
		CommonLoader.addItems(commonConfiguration);
		// @CommonLoader addNames
		System.out.println("[" + modInfo.MODID+ "]" + "- Adding names...");
		CommonLoader.addNames();
		// @CommonLoader addRecipes
		System.out.println("[" + modInfo.MODID+ "]" + "- Adding recipes...");
		CommonLoader.addRecipes();
		// @CommonLoader toolClasses
		CommonLoader.toolClasses();
		// CommonLoader postInit
		System.out.println("[" + modInfo.MODID+ "]" + "- Adding worldgenerator...");
		CommonLoader.postInit();
		System.out.println("[" + modInfo.MODID+ "]" + "- Initialisation sucessfully...");
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
    {
		
    }
	
}
