package com.nexized.emec.proxy;

/*
 * Author: nexized
 * Last changed: 2013-08-14 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import cpw.mods.fml.client.registry.RenderingRegistry;

public class proxyClient extends proxyCommon {

	/*
	 * Armor Renderer (enabled on client)
	 */
	public int addArmor(String armor) { return RenderingRegistry.addNewArmourRendererPrefix(armor); }
	
}
