package com.emec.zero.block;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class zeroBlock extends Block {

	/*
	 * @Construct new crossBlock 
	 */
	public zeroBlock(int id, Material mat) 
	{ super(id, mat); }

	/*
	 * @Construct new crossBlock  with creativeTab
	 */
	public zeroBlock(int id, Material mat, CreativeTabs tab) 
	{ super(id, mat);
	  this.setCreativeTab(tab); }
	
	/*
	 * @Return idDropped if new crossBlock
	 */
	 public int idDropped(int i, Random random, int j)
	 { return this.blockID; }
	
	 @SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister iconRegister) 
		{
			 String itemIconLocation = "emec:" + this.getUnlocalizedName();
			 this.blockIcon = iconRegister.registerIcon(itemIconLocation);
		}
	 
}
