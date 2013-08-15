package com.nexized.cross.item.tools;

/*
 * Author: nexized
 * Last changed: 2013-08-15 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.lib.libInfo;

import cpw.mods.fml.relauncher.*;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class toolSword extends ItemAxe {

	private final EnumToolMaterial material;
	
	public toolSword(int id, EnumToolMaterial mat) 
	{
		super(id, mat);
		this.material = mat;
	}
	
	public toolSword(int id, EnumToolMaterial mat, CreativeTabs tab) {
		super(id, mat);
		this.material = mat;
		this.setCreativeTab(tab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.itemIcon = iconRegister.registerIcon(libInfo.getResourcePath(this.getUnlocalizedName()));
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.material.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
	
}