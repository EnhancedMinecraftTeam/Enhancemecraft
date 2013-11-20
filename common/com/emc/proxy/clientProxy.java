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

import com.emc.mob.ai.EntityMoltenWolf;
import com.emc.mob.ai.EntityNetherMen;
import com.emc.mob.ai.EntityOstrich;
import com.emc.mob.ai.EntityThunderRat;
import com.emc.mob.ai.entityMiner;
import com.emc.mob.model.ModelMoltenWolf;
import com.emc.mob.model.ModelNetherMen;
import com.emc.mob.model.ModelOstrich;
import com.emc.mob.model.ModelThunderRat;
import com.emc.mob.model.modelMiner;
import com.emc.mob.render.RenderMoltenWolf;
import com.emc.mob.render.RenderNetherMen;
import com.emc.mob.render.RenderOstrich;
import com.emc.mob.render.RenderThunderRat;
import com.emc.mob.render.renderMiner;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

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
	// Rendering Registry
	@Override
	public void RegisterRenderers() {
	RenderingRegistry.registerEntityRenderingHandler(EntityOstrich.class, new RenderOstrich(new ModelOstrich(), 0.3F));
	RenderingRegistry.registerEntityRenderingHandler(entityMiner.class, new renderMiner(new modelMiner(), 0.2F));
	RenderingRegistry.registerEntityRenderingHandler(EntityThunderRat.class, new RenderThunderRat(new ModelThunderRat(), 0.2F));
	RenderingRegistry.registerEntityRenderingHandler(EntityNetherMen.class, new RenderNetherMen(new ModelNetherMen(), 0.4F));
	RenderingRegistry.registerEntityRenderingHandler(EntityMoltenWolf.class, new RenderMoltenWolf(new ModelMoltenWolf(), 0.2F));
	}
	@Override
	public void registerServerTickHandler() {
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.CLIENT);
	}
}
