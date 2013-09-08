package com.emc.item.tools;

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
import net.minecraft.item.*;

public class toolAxe extends ItemAxe {

	private final EnumToolMaterial material;
	
	public toolAxe(int id, EnumToolMaterial mat) 
	{
		super(id, mat);
		this.material = mat;
	}
	
	public toolAxe(int id, EnumToolMaterial mat, CreativeTabs tab)
	{
		super(id, mat);
		this.material = mat;
		this.setCreativeTab(tab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(
			emcLib.getRessource(this.getUnlocalizedName())
		); 
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.material.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
	
}
