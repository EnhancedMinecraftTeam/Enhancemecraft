package com.emc.tools;

import java.io.File;

// import net.minecraft.server.MinecraftServer;

import com.emc.lib.emcLib;

// import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class coreTools {

	// @Direct output to System.Console Object / Check if on Server or Client
	public static void print(Object obj) {
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			System.out.println("[" + emcLib.ID + "]" + obj);
		} else {
			FMLCommonHandler.instance().getMinecraftServerInstance().logInfo("[" + emcLib.ID + "]"+ obj.toString());
		}
	}
	
	// @Helper for print values to System.Console / Check if on Server or Client 
	public static void printValues(String s, Object...objects) { print(String.format(s, objects)); }
	
	// @Check if this client is the host of the current instance
		@SideOnly(Side.CLIENT)
		public static boolean isClientHost() {
			if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
				// TODO: Implement Client Proxy Functions
				// String name = ClientProxy.getPlayer().username;
				// 	if(PacketHandler.isRemote && PacketHandler.typeOfServer == 1) {
				//		MinecraftServer server = FMLClientHandler.instance().getServer();
				//	if(server.getServerOwner().equals(name)) {
				//		return true;
				//	}
				//}
			}
			return false;
		}
		
		// @Set this if the mod is actually unloaded
		public static void setModUnloaded() {
			// ThirstMod.proxy.loadedMod = false;
			// PacketHandler.isRemote = false;
		}
		
		// @Get the current directory of the Minecraft instance
		public static String getMinecraftDir() {
			File s = ObfuscationReflectionHelper.getPrivateValue(Loader.class, Loader.instance(), "minecraftDir");
			return s.getAbsolutePath();
		}
	
		
		
}
