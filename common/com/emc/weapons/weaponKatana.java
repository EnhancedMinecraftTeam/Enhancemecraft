package com.emc.weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

public class weaponKatana extends toolSword{

	public weaponKatana(int id, EnumToolMaterial mat, CreativeTabs tab) {
		super(id, mat, tab);
	}
	@Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        par1ItemStack.damageItem(1, par2EntityLivingBase);
        par3EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 5));
		return true;
    }
}