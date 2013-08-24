package com.emec.zero.item;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class zeroItem extends Item {
	
		public zeroItem(int id) {
			super(id);	
		}

		public zeroItem(int id, CreativeTabs tab)
		{
			super(id);
			this.setCreativeTab(tab);
		}

		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister iconRegister) 
		{
			 String itemIconLocation = "emec:" + this.getUnlocalizedName();
			 this.itemIcon = iconRegister.registerIcon(itemIconLocation);
		}
	
}
