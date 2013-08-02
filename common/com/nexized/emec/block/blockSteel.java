package com.nexized.emec.block;

import java.util.Random;

import com.nexized.emec.lib.modInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class blockSteel extends Block {

	public blockSteel(int id, Material mat)
	{
		super(id, mat); // @BlockConstructor
		this.setCreativeTab(CreativeTabs.tabBlock); // @CreativeTab
    	this.setStepSound(Block.soundStoneFootstep); // @StepSound
    	this.setHardness(25F); // @BlockHardness
    	this.setUnlocalizedName("Steel Block"); // @BlockName
	}
	
	public void registerIcons(IconRegister reg)
    {
        this.blockIcon = reg.registerIcon(modInfo.MODID + ":blockSteel"); // @blockIcon
    }
	
	public int idDropped(int pa1, Random rand, int par2)
    {
        // This block is dropping himself when it's mined
		return this.blockID;
    }

    public int quantityDropped(Random rand)
    {
    	// How many times the block drops an item when it's mined
        return 1;
    }
	
}