package com.nexized.emec.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class proxyClient extends proxyCommon {

	public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
	
}
