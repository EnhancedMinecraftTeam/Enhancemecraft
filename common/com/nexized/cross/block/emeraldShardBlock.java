package com.nexized.cross.block;

import java.util.Random;

import afroraydude.mainmod.main;

import com.nexized.cross.manager.itemManager;
import com.nexized.emec.emec;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class emeraldShardBlock extends Block {

	public emeraldShardBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(emec.tabEnhanceMeCraft);
		this.setHardness(10.0F);
		this.setResistance(12.0F);
		this.setLightValue(100000000000000.0F);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon("crosslib:emeraldshardb.png");
	}

	public int idDropped(int par1, Random par2random, int par3) {
		return itemManager.emeraldshard.itemID;
	}
	
	public int quantityDropped(int par1, Random par2random, int par3) {
		return 10;
	}
	
}
