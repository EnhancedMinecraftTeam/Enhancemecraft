package com.nexized.cross.block;

import java.util.Random;

import com.nexized.cross.lib.libInfo;
import com.nexized.emec.emec;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class crossBlock extends Block {
	
	public crossBlock(int id, Material mat) {
		// @Initialize new crossBlock
		super(id, mat);
		// @Initialize Creative Tab (To be changed if implemented into another modification)
		this.setCreativeTab(emec.tabEnhanceMeCraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.blockIcon = iconRegister.registerIcon(libInfo.ID + ":" + (this.getUnlocalizedName().substring(5)));
	}

	 public int idDropped(int i, Random random, int j)
	 {
		 return this.blockID;
	 }
	 	 
}
