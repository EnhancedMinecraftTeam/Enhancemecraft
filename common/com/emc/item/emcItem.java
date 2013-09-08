package com.emc.item;

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
import net.minecraft.item.Item;

public class emcItem extends Item {

	public emcItem(int id) {
		super(id);
	}
	
	public emcItem(int id, CreativeTabs tab)
	{
		super(id);
		this.setCreativeTab(tab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(
			emcLib.getRessource(this.getUnlocalizedName())
		); 
	}
	
}
