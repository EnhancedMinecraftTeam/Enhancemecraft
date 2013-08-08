package com.nexized.emec;

import net.minecraft.creativetab.CreativeTabs;

import com.nexized.cross.block.blockInit;
import com.nexized.cross.conf.*;
import com.nexized.emec.lib.modInfo;
import com.nexized.emec.proxy.proxyCommon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = modInfo.ID, name = modInfo.NAME, version = modInfo.VERSION)

public class emec {
	
	@SidedProxy(clientSide = "com.nexized.emec.proxy.proxyClient", serverSide = "com.nexized.emec.proxy.proxyCommon")
	public static proxyCommon proxy;
	
	public static CreativeTabs tabEnhanceMeCraft;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		// @Configuration
		confEntity.runTask(event);
		// @Localisation
		confLocalisation.runTask(event);		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		// @Custom Tab
		tabEnhanceMeCraft = new CreativeTabs("tabEnhanceMeCraft");
		// @Add Blocks
		blockInit.doWork();
		
	}
	
}
