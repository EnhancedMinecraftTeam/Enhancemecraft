package com.emc.proxy;

import java.util.EnumSet;

import com.emc.mat.matManager;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {

	private void onPlayerTick(EntityPlayer player) {
		if(player.getCurrentItemOrArmor(4) != null) {
			ItemStack Helmet = player.getCurrentItemOrArmor(4);
		if(Helmet.getItem() == matManager.helmVolcan) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 200, 2));
		}
		}
		if(player.getCurrentItemOrArmor(3) != null) {
			ItemStack Chestplate = player.getCurrentItemOrArmor(3);
		if(Chestplate.getItem() == matManager.chestVolcan) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 200, 2));
		}
		}
		if(player.getCurrentItemOrArmor(2) != null) {
			ItemStack Leggings = player.getCurrentItemOrArmor(2);
		if(Leggings.getItem() == matManager.legsVolcan) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 200, 2));
		}
		}
		if(player.getCurrentItemOrArmor(2) != null) {
			ItemStack Boots = player.getCurrentItemOrArmor(2);
		if(Boots.getItem() == matManager.bootsVolcan) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 200, 2));
		}
		}
	}
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if(type.equals(EnumSet.of(TickType.PLAYER))); {
			onPlayerTick((EntityPlayer) tickData[0]);
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public String getLabel() {
		return null;
	}
}
