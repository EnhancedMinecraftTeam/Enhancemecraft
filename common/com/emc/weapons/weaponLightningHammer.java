package com.emc.weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.emc.item.tools.toolSword;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: HackerTDog
 * @Last changed: 2013-10-14
 * Licensed under nextized cross license - see license.txt for more information
 */

public class weaponLightningHammer extends toolSword{

	public weaponLightningHammer(int id, EnumToolMaterial mat, CreativeTabs tab) {
		super(id, mat, tab);
	
}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
		float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

		world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
		return itemstack;
		}
		public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
		float var4 = 1.0F;

		world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
		return true;
		}
}