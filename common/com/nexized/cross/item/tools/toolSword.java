package com.nexized.cross.item.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import com.nexized.cross.lib.libInfo;
import com.nexized.emec.emec;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class toolSword extends ItemAxe {

	private final EnumToolMaterial material;
	
	public toolSword(int id, EnumToolMaterial mat) 
	{
		super(id, mat);
		this.material = mat;
		this.setCreativeTab(emec.tabEnhanceMeCraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.itemIcon = iconRegister.registerIcon(libInfo.ID + ":" + (this.getUnlocalizedName()));
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.material.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
	
}