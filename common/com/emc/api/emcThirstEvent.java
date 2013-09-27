package com.emc.api;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-27
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.*;

public class emcThirstEvent extends Event {

	
	 // @Called when the player is hurt because the thirst bar is empty.
	public static class OnPlayerHurt extends emcThirstEvent {
		public EntityPlayer thisPlayer;
		public OnPlayerHurt(EntityPlayer player) {
			thisPlayer = player;
		}
	}
	
	// @Called when the player drinks from a water source on the ground.
	public static class OnPlayerDrinkWater extends emcThirstEvent {
		public EntityPlayer thisPlayer;
		public OnPlayerDrinkWater(EntityPlayer player) {
			thisPlayer = player;
		}
	}
	
	// @Called when the player is poisoned. This is not called on server side.
	public static class OnPlayerPoisoned extends emcThirstEvent {
		public int timeRemaining;
		public OnPlayerPoisoned(int i) {
			timeRemaining = i;
		}
	}
	
	// @Called when the player is about to be poisoned. Set canceled to not poison the player.
	@Cancelable
	public static class ShouldPoison extends emcThirstEvent {
		public ShouldPoison() {}
	}
	
}
