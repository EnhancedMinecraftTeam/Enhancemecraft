package com.emc.utils;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.io.File;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.MathHelper;

import com.emc.proxy.clientProxy;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class utils {

	// @Get players current name
	@SideOnly(Side.CLIENT)
	public static String getPlayerName() {
		return clientProxy.getPlayer().username;
	}
	
	// @Get players current speed
	public static int getMovementStat(EntityPlayer player) {
		double s = player.posX;
		double s1 = player.posY;
		double s2 = player.posZ;
		double d = s - player.prevPosX;
		double d1 = s1 - player.prevPosY;
		double d2 = s2 - player.prevPosZ;
		return Math.round(MathHelper.sqrt_double(d * d + d1 * d1 + d2 * d2) * 100F);
	}
	
	// @Get biome where the player is currently in 
	public static String getCurrentBiome(EntityPlayer player) {
		if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
			if(PacketHandler.isRemote == true) {
				return PacketPlayerPos.currentBiome;
			} else {
				return player.worldObj.getWorldChunkManager().getBiomeGenAt((int) player.posX, (int) player.posZ).biomeName;
			}
		} else {
			return player.worldObj.getWorldChunkManager().getBiomeGenAt((int) player.posX, (int) player.posZ).biomeName;
		}
	}
	
	// @Get if client is host (or is a server)
	@SideOnly(Side.CLIENT)
	public static boolean isClientHost() {
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			String name = clientProxy.getPlayer().username;
			if(PacketHandler.isRemote && PacketHandler.typeOfServer == 1) {
				MinecraftServer server = FMLClientHandler.instance().getServer();
				if(server.getServerOwner().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}
	
	// @Get Minecraft directory
	public static String getDir() {
		File s = ObfuscationReflectionHelper.getPrivateValue(Loader.class, Loader.instance(), "minecraftDir");
		return s.getAbsolutePath();
	}
	
	// @Print to output console
	public static void print(Object obj) {
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			System.out.println("[EnhanceMeCraft] " + obj);
		} else {
			FMLCommonHandler.instance().getMinecraftServerInstance().logInfo("[EnhanceMeCraft] "+ obj.toString());
		}
	}
	
	// @Print multiple objects
	public static void printValues(String s, Object...objects) {
		print(String.format(s, objects));
	}
	
	
	
}
