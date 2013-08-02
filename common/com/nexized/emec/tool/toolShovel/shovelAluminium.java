package com.nexized.emec.tool.toolShovel;

import com.nexized.emec.lib.modInfo;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class shovelAluminium extends ItemSpade {

	public static final Block[] blocksEffectiveagainst = new Block[0];

    public shovelAluminium(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(CreativeTabs.tabTools);
    }

    public void registerIcons(IconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(modInfo.MODID + ":shovelAluminium");
    }
	
}