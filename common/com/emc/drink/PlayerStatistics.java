package com.emc.drink;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.util.Random;

import com.emc.api.thirstEvent;
import com.emc.utils.utils;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class PlayerStatistics {

	public int level;
	public float saturation;
	public float exhaustion;
	public int healhurtTimer;
	public int drinkTimer;
	public int rainTimer;

	private Random random = new Random();
	private PoisonController poisonCon = new PoisonController();
	private ExhaustionController exhauster = new ExhaustionController(this);

	private int drunkWater;
	public int timesDrunkShifting;
	public int timeRemainingToShift;

	public int timeInColdWater;
	public boolean frozenDroplets;
	public int coldDamage;

	public PlayerStatistics() {
		level = 20;
		saturation = 5f;
		exhaustion = 0f;
		healhurtTimer = 0;
		drinkTimer = 0;
	}
	
	public void onTick(EntityPlayer player, EntityPlayerMP playerMP) {
		int difSet = player.worldObj.difficultySetting;
		if (exhaustion > 4f) {
			exhaustion = 0f;
			if (saturation > 0f) {
				saturation = saturation - 1f;
			} else if (difSet > 0) {
				level = level - 1;
			}
		}
		if (level == 0) {
			healhurtTimer++;
			if (healhurtTimer > 80) {
				if (player.getHealth() > 10 || difSet >= 3 || player.getHealth() > 1 && difSet >= 2) {
					healhurtTimer = 0;
					if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
						PacketHurtPlayer.sendPacket();
					}
					MinecraftForge.EVENT_BUS.post(new thirstEvent.OnPlayerHurt(player));
				}
			}
		}
		poisonCon.onTick(player);
		if (player.isSneaking() && player.isInWater()) {
			drinkTimer++;
			if (drinkTimer > 20) {
				if(level < 20 && timesDrunkShifting < 15) {
					this.addStats(1, 0.3f);
					timesDrunkShifting+= 1;
					if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
						PacketPlaySound.sendPlaySound(playerMP);
					} 
					if (poisonCon.getBiomesList().containsKey(utils.getCurrentBiome(player))) {
						getPoison().startPoison(random, poisonCon.getBiomePoison(utils.getCurrentBiome(player)));
					}
				} 
				if(level < 20) {
					drunkWater++;
					if(drunkWater > 44) {
						if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
							playerMP.worldObj.setBlockWithNotify((int)player.posX, (int)player.posY - 1, (int)player.posZ, Block.sand.blockID);
						}
						drunkWater = 0;
					} 
				}
				if(timesDrunkShifting > 14) {
					ThirstMod.displayMessage = 4;
				}
				MinecraftForge.EVENT_BUS.post(new thirstEvent.OnPlayerDrinkWater(player));
				drinkTimer = 0;
			}
		} else drunkWater = 0;
		if (level <= 6) {
			player.setSprinting(false);
		}
		if (level < 0) {
			level = 0;
		}
		if(timesDrunkShifting > 14) {
			timeRemainingToShift++;
			if(timeRemainingToShift > 2000) {
				timesDrunkShifting = 0;
				timeRemainingToShift = 0;
			}
		}
		exhauster.exhaustPlayer(player);
		drinkFromRain(player, playerMP);
		if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
			PacketPlayerPos.sendPlayerPos(playerMP);
		}
	}
	
	public void drinkFromRain(EntityPlayer player, EntityPlayerMP playerMP) {
		int x = (int)player.posX;
		int y = (int)player.posY;
		int z = (int)player.posZ;

		if(player.isSneaking() == true && isPlayerTopEmpty(x, y, z, player.worldObj) == true && player.worldObj.getWorldInfo().isRaining() == true
				&& player.isInWater() == false && player.isInsideOfMaterial(Material.water) == false) {
			rainTimer++;
			if(rainTimer > 40) {
				this.addStats(1, 0.4f);
				rainTimer = 0;
			}
		}
	}
	
	public boolean isPlayerTopEmpty(int x, int y, int z, World world) {
		for(int i = y; i < 256; i++) {
			if(world.getBlockId(x, i, z) != 0) {
				return false;
			}
		}
		return true;
	}
	
	public void handleHyperthermia(EntityPlayer player) {
		if(player.isInWater() && isPlayerInColdBiome(player)) {
			timeInColdWater++;
		} 
		if(timeInColdWater > 2400) {
			coldDamage++;
			frozenDroplets = true;
			if(coldDamage > 200) {
				PacketHurtPlayer.sendPacket();
				coldDamage = 0;
			}
		}
		if(frozenDroplets == true && !player.isInWater()) {
			timeInColdWater--;
		}
		if(timeInColdWater < 0) {
			timeInColdWater = 0;
		}
	}
	
	public boolean isPlayerInColdBiome(EntityPlayer player) {
		if(utils.getCurrentBiome(player).contains("Jungle") || utils.getCurrentBiome(player).contains("Ice") || utils.getCurrentBiome(player).contains("Taiga")) {
			return true;
		}
		return false;
	}

	public PoisonController getPoison() {
		return poisonCon;
	}

	public ExhaustionController getExhauster() {
		return exhauster;
	}
	
	public void addExhaustion(float par1) {
		exhaustion = Math.min(exhaustion + par1, 40F);
	}
	
	public void addStats(int par1, float par2) {
		level = Math.min(par1 + level, 20);
		saturation = Math.min(saturation + (float) par1 * par2 * 2.0F, level);
	}
	
}
