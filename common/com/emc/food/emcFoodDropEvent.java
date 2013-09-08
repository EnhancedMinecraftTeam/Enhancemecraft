package com.emc.food;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-08-30
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class emcFoodDropEvent {

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
