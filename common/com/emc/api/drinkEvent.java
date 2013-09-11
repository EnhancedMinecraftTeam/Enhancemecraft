package com.emc.api;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-11
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.Cancelable;
import net.minecraftforge.event.Event;

public class drinkEvent extends Event {


	// Called when the player is hurt because the thirst bar is empty.
	public static class OnPlayerHurt extends drinkEvent {
		public EntityPlayer thisPlayer;
		public OnPlayerHurt(EntityPlayer par1) {
			thisPlayer = par1;
		}
	}
	
	// Called when the player drinks from a water source on the ground by 
	// shifting in it or by shifting when it is raining.
	public static class OnPlayerDrinkWater extends drinkEvent {
		public EntityPlayer thisPlayer;
		public OnPlayerDrinkWater(EntityPlayer par1) {
			thisPlayer = par1;
		}
	}
	
	// Called when the player is poisoned. This is not called on server side.
	public static class OnPlayerPoisoned extends drinkEvent {
		public int timeRemaining;
		public OnPlayerPoisoned(int i) {
			timeRemaining = i;
		}
	}
	
	// Called when the player is about to be poisoned. Set canceled to not poison the player.
	@Cancelable
	public static class ShouldPoison extends drinkEvent {
		public ShouldPoison() {}
	}
	
}
