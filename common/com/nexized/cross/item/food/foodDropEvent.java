package com.nexized.cross.item.food;

import com.nexized.cross.manager.foodManager;

import net.minecraft.entity.passive.*;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

/*
 * Author: nexized
 * Last changed: 2013-08-18 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

public class foodDropEvent {

	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {
		// Add @Drop on @EntitySheep with chance of 50%
		if (event.entityLiving instanceof EntitySheep) {
			double rand = Math.random();
			if (rand < 0.5d) {
				event.entityLiving.dropItem(foodManager.foodRawMoutton.itemID, 1);
			}
		}
		// Add @Drop on @EntityPig with chance of 25%
		if (event.entityLiving instanceof EntityPig) {
			double rand = Math.random();
			if (rand < 0.5d) {
				event.entityLiving.dropItem(foodManager.foodRawBacon.itemID, 2);
			}
		}
	}
}
