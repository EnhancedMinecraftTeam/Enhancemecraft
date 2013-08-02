package com.nexized.emec.tool.toolSword;

import com.nexized.emec.lib.modInfo;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class swordSilver extends ItemSword {

	public static final Block[] blocksEffectiveagainst = new Block[0];

    public swordSilver(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    public void registerIcons(IconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(modInfo.MODID + ":swordSilver");
    }
	
}