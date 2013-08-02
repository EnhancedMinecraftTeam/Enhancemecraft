package com.nexized.emec.blocks;

import java.util.Random;

import com.nexized.emec.lib.modInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class blockSteel extends Block {

	public blockSteel(int id, Material mat)
	{
		// @Block Constructor
		super(id, mat);
		// @CreativeTab
		this.setCreativeTab(CreativeTabs.tabBlock);
        // @StepSound
		this.setStepSound(Block.soundStoneFootstep);
        // @BlockHardness
		this.setHardness(35F);
	}
	
	public void registerIcons(IconRegister reg)
    {
        this.blockIcon = reg.registerIcon(modInfo.MODID + ":blockSteel");
    }
	
	public int idDropped(int pa1, Random rand, int par2)
    {
        return this.blockID;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
	
}