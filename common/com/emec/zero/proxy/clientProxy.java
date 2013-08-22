package com.emec.zero.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class clientProxy extends commonProxy {

	/*
	 * Armor Renderer (enabled on client)
	 */
	public int addArmor(String armor) { return RenderingRegistry.addNewArmourRendererPrefix(armor); }
	
}
