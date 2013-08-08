package com.nexized.cross.item;

import com.nexized.cross.lib.libInfo;
import com.nexized.emec.emec;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class crossItem extends Item {

	public crossItem(int id) {
		// @Initialize new crossItem
		super(id);
		// @Initialize Creative Tab (To be changed if implemented into another modification)
		this.setCreativeTab(emec.tabEnhanceMeCraft);	
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.itemIcon = iconRegister.registerIcon(libInfo.ID + ":" + (this.getUnlocalizedName()));
	}

}
