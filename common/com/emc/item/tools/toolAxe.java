package com.emc.item.tools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import com.emc.emc;
import com.emc.lib.emcLib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class toolAxe extends ItemTool
{

    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.pumpkin, Block.pumpkinLantern};

    public toolAxe(int par1, EnumToolMaterial par2EnumToolMaterial, CreativeTabs tab)
    {
        super(par1, 3.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
        this.setCreativeTab(tab);
    }


    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && (par2Block.blockMaterial == Material.wood || par2Block.blockMaterial == Material.plants || par2Block.blockMaterial == Material.vine) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister) {
	this.itemIcon = iconRegister.registerIcon(
		emcLib.getRessource(this.getUnlocalizedName())
	); 
}}