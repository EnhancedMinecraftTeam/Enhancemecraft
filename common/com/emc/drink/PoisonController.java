package com.emc.drink;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.emc.api.thirstEvent;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class PoisonController {

	private int poisonTimer;
	private int healthPoison;
	private boolean poisonPlayer = false;
	private boolean preloadedPoison = false;
	private boolean isPoisoned = false;
	@SuppressWarnings("rawtypes")
	private static Map biomesList = new HashMap();
	private boolean loadedClass = false;
	private int poisonID;
	public boolean drankPoisonStoper = false;
	private boolean addedPotion = false;

	public void onTick(EntityPlayer player) {
		if (shouldPoison() == true) {
			if(preloadedPoison == false) {
				Random random = new Random();
				poisonID = random.nextInt(4);
				preloadedPoison = true;
			}
			if(drankPoisonStoper == true) {
				poisonTimer = 0;
				isPoisoned = false;
				poisonPlayer = false;
			}
			addPoisonType(poisonID, player);
		}
		if (loadedClass == false) {
			addBiomePoison();
			loadedClass = true;
		}
	}
	
	public void startPoison() {
		preloadedPoison = false;
		poisonPlayer = true;
		drankPoisonStoper = false;
		addedPotion = false;
	}

	private void addPoisonType(int i, EntityPlayer player) {
		if(i == 0) fastDehydration(player);
		else if(i == 1) addBadPotion(player);
		else if(i == 2) healthPoison(player);
	}

	public void fastDehydration(EntityPlayer player) {
		if(shouldPoison()) {
			MinecraftForge.EVENT_BUS.post(new thirstEvent.OnPlayerPoisoned(360 - poisonTimer));
			poisonTimer++;
			PlayerHandler.getPlayer(player.username).addExhaustion(0.061111111111111f);
			isPoisoned = true;
			if (poisonTimer > 360) {
				poisonTimer = 0;
				isPoisoned = false;
				poisonPlayer = false;
			}
		}
	}

	public void addBadPotion(EntityPlayer player) {
		if(shouldPoison()) {
			MinecraftForge.EVENT_BUS.post(new thirstEvent.OnPlayerPoisoned(360 - poisonTimer));
			poisonTimer++;
			isPoisoned = true;

			if (addedPotion == false) {
				if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
					PacketPotionEffect.sendPacket(Potion.moveSlowdown.id, 18, 1);
					PacketPotionEffect.sendPacket(Potion.weakness.id, 18, 1);
				}
				addedPotion = true;
			}

			if (poisonTimer > 680) {
				poisonTimer = 0;
				isPoisoned = false;
				poisonPlayer = false;
			}
		}
	}

	public void healthPoison(EntityPlayer player) {
		if(shouldPoison()) {
			MinecraftForge.EVENT_BUS.post(new thirstEvent.OnPlayerPoisoned(360 - poisonTimer));
			poisonTimer++;
			healthPoison++;
			isPoisoned = true;

			if(healthPoison > 40) {
				if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
					PacketHurtPlayer.sendPacket();
				}
				healthPoison = 0;
			}

			if(addedPotion == false) {
				if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
					PacketPotionEffect.sendPacket(Potion.confusion.id, 18, 1);
				}
				addedPotion = true;
			}

			if (poisonTimer > 360) {
				poisonTimer = 0;
				isPoisoned = false;
				poisonPlayer = false;
			}
		}
	}
	
	public void startPoison(Random random, float f) {
		if(random.nextFloat() < f) {
			startPoison();
		}
	}
	
	public boolean shouldPoison() {
		if (poisonPlayer == true && MinecraftForge.EVENT_BUS.post(new thirstEvent.ShouldPoison()) == false) {
			return true;
		} 
		return false;
	}
	
	public boolean isPoisoned() {
		return isPoisoned;
	}
	
	public int poisonTimeRemain() {
		if (poisonTimer > 0) {
			return poisonTimer;
		} else {
			return 0;
		}
	}

	public static float getBiomePoison(String biome) {
		if (biomesList.containsKey(biome)) {
			return (Float) biomesList.get(biome);
		} else {
			return (Float) biomesList.get("Other");
		}
	}
	
	@SuppressWarnings("unchecked")
	public void addBiomePoison() {
		biomesList.put("Ocean", 0.6f);
		biomesList.put("Plains", 0.3f);
		biomesList.put("Desert", 0.1f);
		biomesList.put("Extreme Hills", 0.2f);
		biomesList.put("Forest", 0.2f);
		biomesList.put("Swampland", 0.8f);
		biomesList.put("FrozenOcean", 0.1f);
		biomesList.put("FrozenRiver", 0.1f);
		biomesList.put("Ice Plains", 0.1f);
		biomesList.put("Ice Mountains", 0.1f);
		biomesList.put("River", 0.2f);
		biomesList.put("Other", 0.3f);
	}
	
	@SuppressWarnings("rawtypes")
	public static Map getBiomesList() {
		return biomesList;
	}

	public void setPoisonedTo(boolean what) {
		poisonPlayer = what;
	}

	public void setPoisonTime(int what) {
		poisonTimer = what;
	}
}
