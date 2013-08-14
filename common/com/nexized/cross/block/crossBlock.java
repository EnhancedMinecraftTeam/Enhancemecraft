package com.nexized.cross.block;

/*
 * Author: nexized
 * Last changed: 2013-08-13 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import java.util.Random;

import com.nexized.cross.lib.libInfo;

import cpw.mods.fml.relauncher.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class crossBlock extends Block {
	
	/*
	 * @Construct new crossBlock 
	 */
	public crossBlock(int id, Material mat) 
	{ super(id, mat); }
	
	
	/*
	 * @Construct new crossBlock  with creativeTab
	 */
	public crossBlock(int id, Material mat, CreativeTabs tab) 
	{ super(id, mat);
	  this.setCreativeTab(tab); }
	
	/*
	 * @Return icon of new crossBlock
	 */
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{ this.blockIcon = iconRegister.registerIcon(libInfo.getResourcePath(this.getUnlocalizedName())); }

	/*
	 * @Return idDropped if new crossBlock
	 */
	 public int idDropped(int i, Random random, int j)
	 { return this.blockID; }
}
