package com.nexized.cross.item.tools;

import com.nexized.cross.lib.libInfo;
import com.nexized.emec.emec;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.*;

public class toolAxe extends ItemAxe {

	private final EnumToolMaterial material;
	
	public toolAxe(int id, EnumToolMaterial mat) 
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
