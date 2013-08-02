package com.nexized.emec.blockOre;

import java.util.Random;

import com.nexized.emec.lib.modInfo;

import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class oreCopper extends BlockOre {

	public oreCopper(int id)
    {
        super(id);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(25F);
    }

    public void registerIcons(IconRegister reg)
    {
        this.blockIcon = reg.registerIcon(modInfo.MODID + ":oreCopper");
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
