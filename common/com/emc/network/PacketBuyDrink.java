package com.emc.network;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import com.emc.emc;
import com.emc.drink.PacketHandler;
import com.google.common.io.ByteArrayDataInput;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.server.MinecraftServer;

	public class PacketBuyDrink extends PacketHandler {

		@Override
		public void readServer(int id, ByteArrayDataInput dat, Object[] extradata) {
			int drinkID = dat.readInt();
			int ironAmount = dat.readInt();
			boolean shiftClick = dat.readBoolean();
			String username = dat.readLine();

			MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
			EntityPlayerMP player = server.getConfigurationManager().getPlayerForUsername(username);
			buyDrink(drinkID, ironAmount, shiftClick, player);
		}

		public void buyDrink(int id, int coins, boolean shiftClick, EntityPlayerMP player) {
			boolean purchasedItem = false;
			int coinsAvailable = 0;
			int doneUpto = 0;
			int startingCoins = coins;
			boolean canPurchase = false;;

			if(player.capabilities.isCreativeMode == false) {
				if(shiftClick == false) {
					for(int i = 0; i < player.inventory.getSizeInventory(); i++) {
						ItemStack stack = player.inventory.getStackInSlot(i);
						if(stack != null) {
							if(stack.itemID == emc.currency.shiftedIndex) {
								coinsAvailable += stack.stackSize;
							}
						}
					}

					if(coinsAvailable - coins >= 0) {
						for(int i = 0; i < startingCoins; i++) {
							player.inventory.consumeInventoryItem(emc.currency.shiftedIndex);
							coins--;
						}
						canPurchase = true;
					} 

					if(coins <= 0) {
						if(canPurchase) {
							player.inventory.addItemStackToInventory(new ItemStack(id, 1, 0));
						} 
					} else player.addChatMessage("You do not have enough coins in your inventory to purchase this drink!");
				} else {
					for(int i = 0; i < player.inventory.getSizeInventory(); i++) {
						ItemStack stack = player.inventory.getStackInSlot(i);
						if(stack != null) {
							if(stack.itemID == emc.currency.shiftedIndex) {
								coinsAvailable += stack.stackSize;
							}
						}
					}

					if(coinsAvailable - (coins * getMaxCanPurchase(coinsAvailable, startingCoins)) >= 0) {
						if(getMaxCanPurchase(coinsAvailable, startingCoins) != 0) {
							for(int i = 0; i < startingCoins * getMaxCanPurchase(coinsAvailable, startingCoins); i++) {
								player.inventory.consumeInventoryItem(emc.currency.shiftedIndex);
								coins--;
							}
							canPurchase = true;
						} else {
							canPurchase = false;
						}
					}

					if(coins <= 0) {
						if(canPurchase) {
							player.inventory.addItemStackToInventory(new ItemStack(id, 1 * getMaxCanPurchase(coinsAvailable, startingCoins), 0));
						} 
					} else player.addChatMessage("You do not have enough coins in your inventory to purchase this drink!");
				}
			} else {
				player.inventory.addItemStackToInventory(new ItemStack(id, 1, 0));
			}
		}

		public int getMaxCanPurchase(int totalCoins, int coinsNeeded) {
			int times = 0;
			for(int i = 0; i < 2432; i++) {
				if(totalCoins - coinsNeeded >= 0) {
					totalCoins -= coinsNeeded;
					times++;
				}
			}
			return times;
		}

		public static void buyDrink(int id, int amount, boolean shiftClick, String username) {
			ByteArrayOutputStream bos = new ByteArrayOutputStream(110);
			DataOutputStream dos = new DataOutputStream(bos);

			try {
				dos.writeInt(4);
				dos.writeInt(id);
				dos.writeInt(amount);
				dos.writeBoolean(shiftClick);
				dos.writeBytes(username);
			} catch(Exception e) {
				e.printStackTrace();
			}

			Packet250CustomPayload pkt = new Packet250CustomPayload();
			pkt.channel = "EMEC";
			pkt.data = bos.toByteArray();
			pkt.length = bos.size();
			pkt.isChunkDataPacket = false;
			PacketDispatcher.sendPacketToServer(pkt);
		}

		@Override
		public void readClient(int id, ByteArrayDataInput data, Object[] extradata) {
		}
	
}
