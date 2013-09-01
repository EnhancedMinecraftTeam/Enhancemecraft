package com.emc.food;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-01
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.lib.emcLib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class emcFood extends ItemFood {

	public emcFood(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}

	public emcFood(int par1, int par2, float par3, boolean par4, CreativeTabs tab) {
		super(par1, par2, par3, par4);
		this.setCreativeTab(tab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(
			emcLib.getRessource(this.getUnlocalizedName())
		); 
	}
	
}
