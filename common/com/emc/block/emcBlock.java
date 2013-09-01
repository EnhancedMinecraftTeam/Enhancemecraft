package com.emc.block;

import java.util.Random;

import com.emc.basic.emclib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class emcBlock extends Block {

	// @Default Constructor for emcBlock
	public emcBlock(int id, Material mat) { super(id, mat); }
	
	// @Extended Constructor for emcBlock
	public emcBlock(int id, Material mat, CreativeTabs tab) {
		super(id, mat); this.setCreativeTab(tab);
	}
	
	// @Return icon
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(
				emclib.getRessource(this.getUnlocalizedName())
				); 
	}

	// @Return dropped id
	public int idDropped(int i, Random random, int j) { return this.blockID; }
	
}
