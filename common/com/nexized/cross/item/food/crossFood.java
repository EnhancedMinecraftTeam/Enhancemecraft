package com.nexized.cross.item.food;

import com.nexized.cross.lib.libInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class crossFood extends ItemFood{

	public crossFood(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}

	public crossFood(int par1, int par2, float par3, boolean par4, CreativeTabs tab) {
		super(par1, par2, par3, par4);
		this.setCreativeTab(tab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.itemIcon = iconRegister.registerIcon(libInfo.getResourcePath(this.getUnlocalizedName()));
	}
	
}
