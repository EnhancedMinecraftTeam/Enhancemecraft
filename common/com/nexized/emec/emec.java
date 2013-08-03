package com.nexized.emec;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance; 
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

import com.nexized.emec.lib.*;
import com.nexized.emec.world.emecWorldGenerator;
import com.nexized.emec.common.*;
import com.nexized.emec.common.instance.configurationHandler;
import com.nexized.emec.common.instance.loaderIngot;
import com.nexized.emec.common.instance.loaderOre;
import com.nexized.emec.common.instance.loaderTools;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = modInfo.MODID, name = modInfo.MODNAME, version = modInfo.MODVERSION)

public class emec {

	@SidedProxy(clientSide = "com.nexized.emec.common.ClientProxy", serverSide = "com.nexized.emec.common.CommonProxy")
    public static CommonProxy proxy;
	
	@Instance
    public emec instance;
	
	// @ConfgurationHandler
	public configurationHandler commonConfiguration;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
    {
		System.out.println("[" + modInfo.MODID+ "]" + "- Version " + modInfo.MODVERSION);
		// @ConfigurationHandler
		commonConfiguration = new configurationHandler(event);
    }
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
    {
		/* 	Old method for MaterialInitialisation
			CommonLoader.materialInit();
			CommonLoader.addBlocks(commonConfiguration);
			CommonLoader.addItems(commonConfiguration);
			CommonLoader.addNames();
			CommonLoader.addRecipes();
			CommonLoader.toolClasses();
			CommonLoader.postInit();
    	*/
		
		// @New Initialization
		loaderIngot.addBlocks(commonConfiguration); loaderIngot.addItems(commonConfiguration);
		loaderIngot.addNames(); loaderIngot.addRecipes();
		
		loaderOre.addBlocks(commonConfiguration); 
		loaderOre.addNames(); loaderOre.addRecipes();
		
		loaderTools.addItems(commonConfiguration);
		loaderTools.addNames(); loaderTools.addRecipes();
		
		// @Add WorldGenerator
		GameRegistry.registerWorldGenerator(new emecWorldGenerator());
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
    {
		
    }
	
}
