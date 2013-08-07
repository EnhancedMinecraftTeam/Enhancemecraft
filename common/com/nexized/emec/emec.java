package com.nexized.emec;

import com.nexized.emec.lib.*;
import com.nexized.emec.proxy.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkMod;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = modInfo.ID, name = modInfo.NAME, version = modInfo.VERSION)

public class emec {

	@SidedProxy(clientSide = "com.nexized.emec.proxy.proxyClient", serverSide = "com.nexized.emec.proxy.proxyCommon")
	public static proxyCommon proxy;
	
	
	
}
