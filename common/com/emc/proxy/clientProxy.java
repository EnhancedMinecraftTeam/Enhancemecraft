package com.emc.proxy;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class clientProxy extends commonProxy {
	
	// @ArmorRenderer
	public int addArmor(String armor) { return RenderingRegistry.addNewArmourRendererPrefix(armor); }
	
	// @Instance 
	public static EntityPlayer getPlayer() {
		return FMLClientHandler.instance().getClient().thePlayer;
	}
	
	// @Instance
	public static EntityPlayerMP getPlayerMp(String username) {
		MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
		EntityPlayerMP player = server.getConfigurationManager().getPlayerForUsername(username);
		return player;
	}
	
	
}
