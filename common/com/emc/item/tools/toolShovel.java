package com.emc.item.tools;

import com.emc.emc;
import com.emc.lib.emcLib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

public class toolShovel extends ItemTool
{
       public static final Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};

    public toolShovel(int par1, EnumToolMaterial par2EnumToolMaterial, CreativeTabs tab)
    {
        super(par1, 1.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
        this.setCreativeTab(tab);
    }

        public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(
			emcLib.getRessource(this.getUnlocalizedName())
		); 
	}}