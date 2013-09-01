package com.emc.proxy;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-08-30
 * Licensed under nextized cross license - see license.txt for more information
 */

import cpw.mods.fml.client.registry.RenderingRegistry;

public class clientProxy extends commonProxy {
	
	// @ArmorRenderer
	public int addArmor(String armor) { return RenderingRegistry.addNewArmourRendererPrefix(armor); }
	
}
