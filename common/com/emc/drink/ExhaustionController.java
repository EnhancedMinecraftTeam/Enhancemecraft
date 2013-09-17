package com.emc.drink;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.emc;
import com.emc.utils.utils;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;

public class ExhaustionController {

	@SuppressWarnings("unused")
	private PlayerStatistics stats;

	public ExhaustionController(PlayerStatistics stats) {
		this.stats = stats;
	}

	public void exhaustPlayer(EntityPlayer player) {
		float exhaustAmplifier = (float) (isNight(player) ? 0.90 : 1);
		int multiplier = utils.getCurrentBiome(player) == "Desert" ? 2 : 1;
		int movement = utils.getMovementStat(player);
		float tweak = 0.1F;
		if (player.isInsideOfMaterial(Material.water)) {
			if (movement > 0) {
				PlayerHandler.getPlayer(player.username).addExhaustion(0.015F * (float) movement * 0.003F * tweak * exhaustAmplifier);
			}
		} else if (player.isInWater()) {
			if (movement > 0) {
				PlayerHandler.getPlayer(player.username).addExhaustion(0.015F * (float) movement * 0.003F * tweak * exhaustAmplifier);
			}
		} else if (player.onGround) {
			if (movement > 0) {
				if (player.isSprinting()) {
					PlayerHandler.getPlayer(player.username).addExhaustion(0.09999999F * (float) movement * 0.02F * multiplier * tweak * exhaustAmplifier);
				} else {
					PlayerHandler.getPlayer(player.username).addExhaustion(0.01F * (float) movement * 0.02F * multiplier * tweak * exhaustAmplifier);
				}
			}
		} else if (emc.isJumping(player)) {
			if (player.isSprinting()) {
				PlayerHandler.getPlayer(player.username).addExhaustion(0.04F * multiplier * tweak * exhaustAmplifier);
			} else {
				PlayerHandler.getPlayer(player.username).addExhaustion(0.004F * multiplier * tweak * exhaustAmplifier);

			}
		} 
	}

	public static void addExhaustion(EntityPlayer player, float f) {
		PlayerHandler.getPlayer(player.username).addExhaustion(f);
	}

	public boolean isNight(EntityPlayer player) {
		return FMLCommonHandler.instance().getEffectiveSide().isClient()
				? FMLClientHandler.instance().getClient().theWorld.isDaytime() == false : player.worldObj.isDaytime() == false;
	}
	
}
