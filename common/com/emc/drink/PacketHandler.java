package com.emc.drink;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

import com.emc.emc;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler {
	
	public static boolean isRemote = false;
	
	public static int typeOfServer;
	
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		ByteArrayDataInput dat = ByteStreams.newDataInput(packet.data);
		int id = dat.readInt();
		Object[] extradata = { (EntityPlayer)player };
		switch(FMLCommonHandler.instance().getEffectiveSide()) {
		case SERVER: {
			switch(id) {
		 		case 1: emc.instance.savePacket.readServer(id, dat, extradata); break;
		 		case 4: emc.instance.buyPacket.readServer(id, dat, extradata); break;
		 		case 5: emc.instance.hurtPlayer.readServer(id, dat, extradata); break;
		 		case 6: emc.instance.statsPacket.readServer(id, dat, extradata); break;
		 		case 9: emc.instance.potionPacket.readServer(id, dat, extradata); break;
			}
			break;
		}
		case CLIENT: {
			switch(id) {
				case 1: emc.instance.savePacket.readClient(id, dat, extradata); break;
				case 2: emc.instance.soundPacket.readClient(id, dat, extradata); break;
				case 3: emc.instance.posPacket.readClient(id, dat, extradata); break;
				case 7: emc.instance.commandPacket.readClient(id, dat, extradata); break;
				case 8: emc.instance.configPacket.readClient(id, dat, extradata); break;
			}
			break;
		}
	}
		
	}
	
	public void readClient(int id, ByteArrayDataInput data, Object[] extradata) {}
	public void readServer(int id, ByteArrayDataInput data, Object[] extradata) {}
}
