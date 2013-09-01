package com.nexized.cross.item;

import com.nexized.cross.lib.libInfo;

import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class crossItem extends Item {

	public crossItem(int id) {
		super(id);	
	}
	
	public crossItem(int id, CreativeTabs tab)
	{
		super(id);
		this.setCreativeTab(tab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.itemIcon = iconRegister.registerIcon(libInfo.getResourcePath(this.getUnlocalizedName()));
	}

}
