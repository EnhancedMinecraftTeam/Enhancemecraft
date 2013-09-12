package com.emc.world.biome.block;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-12
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class blockRedRock extends ItemBlock {

	private static final String[] types = new String[] {"redrock", "redcobble", "redbrick"};

	public blockRedRock(int par1)
	{
		super(par1);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta)
	{
		return meta & 15;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int meta = itemstack.getItemDamage();
		if (meta < 0 || meta >= types.length) {
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}
	
}
