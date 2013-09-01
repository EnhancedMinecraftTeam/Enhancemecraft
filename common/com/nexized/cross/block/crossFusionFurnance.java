package com.nexized.cross.block;

/*
 * Author: nexized
 * Last changed: 2013-08-14 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import java.util.Random;

import com.nexized.emec.emec; // @This is used for the instance @onBlockActivated - TODO: Remove further references to EMEC with crossProxy
import com.nexized.cross.manager.blockManager;
import com.nexized.cross.tiles.tileFusionFurnace;
import com.nexized.cross.lib.libInfo;

import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class crossFusionFurnance extends BlockContainer {

	// Random Value for new furnanceFusion
	 private final Random furnaceRand = new Random();
	 // Check if block isActive()
	 private final boolean isActive;
	 // Check if furnanceInventory is keep when chunk is unloaded
	 private static boolean keepFurnaceInventory = false;
	 
	 // Icon for furnanceTop(client)
	 @SideOnly(Side.CLIENT)
	 private Icon furnaceIconTop;
	 // Icon for furnanceFront (client)
	 @SideOnly(Side.CLIENT)
	 private Icon furnaceIconFront;
	
	 /*
	  * @Constructs the new blockContainer
	  */
	public crossFusionFurnance(int par1, boolean par2) {
		super(par1, Material.rock);
        this.isActive = par2;
	}
	
	/*
	 * @Constructs the new blockContainer with CreativeTab
	 */
	public crossFusionFurnance(int par1, boolean par2, CreativeTabs tab) {
		super(par1, Material.rock);
        this.isActive = par2;
        this.setCreativeTab(tab);
	}
	
	/*
	 * @Return the ID of dropped block when broken
	 */
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return blockManager.furnanceFusion.blockID;
    }
	
	/*
	 * @This event handles when a block is placed on the world
	 */
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.setDefaultDirection(par1World, par2, par3, par4);
    }
	
	/*
	 * @Set the visibility of the new furnanceBlock
	 */
	private void setDefaultDirection(World par1World, int par2, int par3, int par4)
	{
	    if (!par1World.isRemote)
	    {
	        int l = par1World.getBlockId(par2, par3, par4 - 1);
	        int i1 = par1World.getBlockId(par2, par3, par4 + 1);
	        int j1 = par1World.getBlockId(par2 - 1, par3, par4);
	        int k1 = par1World.getBlockId(par2 + 1, par3, par4);
	        byte b0 = 3;
	
	        if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
	        { b0 = 3; }
	        if (Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
	        { b0 = 2; }
	        if (Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
	        { b0 = 5; }
	        if (Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
	        { b0 = 4; }
	
	        par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
	    }
	}
	
	/*
	 * @Return icon for two of six sides of the furnace
	 */
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
    {
        if(par2 == 0 || par2 == 1)
        { return par1 == 1 ? this.furnaceIconTop : (par1 == 0 ? this.furnaceIconTop : (par1 == 3 ? this.furnaceIconFront : this.blockIcon)); }
        else
        { return par1 == 1 ? this.furnaceIconTop : (par1 == 0 ? this.furnaceIconTop : (par1 != par2 ? this.blockIcon : this.furnaceIconFront)); }          
    }
	
	/*
	 * @Return Icons for the rest of the sides of the furnace
	 */
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(libInfo.ID +  ":" + "furnanceFusionSide");
        this.furnaceIconFront = par1IconRegister.registerIcon(this.isActive ? libInfo.ID +  ":" + "furnanceFusionFrontLit" : libInfo.ID +  ":" + "furnanceFusionFront");
        this.furnaceIconTop = par1IconRegister.registerIcon(libInfo.ID +  ":" + "furnanceFusionTop");
    }
	
	/*
	 * @Return Client GUI / Server Container when block is activated
	 */
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        { return true; }
        else
        { par5EntityPlayer.openGui(emec.instance, 0, par1World, par2, par3, par4); 
        return true; }
    }
	
	/*
	 * @Update block state by activation of block and change blockID
	 */
	public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4);
        TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
        keepFurnaceInventory = true;

        if (par0)
        { par1World.setBlock(par2, par3, par4, blockManager.furnanceFusionOn.blockID); }
        else
        { par1World.setBlock(par2, par3, par4, blockManager.furnanceFusion.blockID); }

        keepFurnaceInventory = false;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

        if (tileentity != null)
        {
            tileentity.validate();
            par1World.setBlockTileEntity(par2, par3, par4, tileentity);
        }
    }
	
	/*
	 * @Add particles of the new furnace
	 */
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (this.isActive)
        {
            int l = par1World.getBlockMetadata(par2, par3, par4);
            float f = (float)par2 + 0.5F;
            float f1 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)par4 + 0.5F;
            float f3 = 0.52F;
            float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

            if (l == 4)
            {   par1World.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D); }
            else if (l == 5)
            {   par1World.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D); }
            else if (l == 2)
            {   par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D); }
            else if (l == 3)
            {   par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D); }
        }
    }
	
	/*
	 * @Return new TileEntity for fusionFurnace
	 */
	public TileEntity createNewTileEntity(World par1World)
    { return new tileFusionFurnace(); }
	
	/*
	 * @EventHandler for onBlockPlacedBy()
	 */
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) { par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2); }
        if (l == 1) { par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2); }
        if (l == 2) { par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2); }
        if (l == 3) { par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2); }

        if (par6ItemStack.hasDisplayName())
        { ((TileEntityFurnace)par1World.getBlockTileEntity(par2, par3, par4)).setGuiDisplayName(par6ItemStack.getDisplayName()); }
    }
	
	/*
	 * @EventHandler for breakBlock
	 */
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        if (!keepFurnaceInventory)
        {
        	tileFusionFurnace tileentityfurnace = (tileFusionFurnace)par1World.getBlockTileEntity(par2, par3, par4);

            if (tileentityfurnace != null)
            {
                for (int j1 = 0; j1 < tileentityfurnace.getSizeInventory(); ++j1)
                {
                    ItemStack itemstack = tileentityfurnace.getStackInSlot(j1);

                    if (itemstack != null)
                    {
                        float f = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int k1 = this.furnaceRand.nextInt(21) + 10;
                            if (k1 > itemstack.stackSize) { k1 = itemstack.stackSize; }
                            itemstack.stackSize -= k1;
                            
                            EntityItem entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.itemID, k1, itemstack.getItemDamage()));
                            
                            if (itemstack.hasTagCompound()) { entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy()); }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.furnaceRand.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.furnaceRand.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.furnaceRand.nextGaussian() * f3);
                            par1World.spawnEntityInWorld(entityitem);
                        }
                    }
                }
                par1World.func_96440_m(par2, par3, par4, par5);
            }
        }
        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }
	
	/*
	 * @Configuration (default: true)
	 */
	public boolean hasComparatorInputOverride()
    { return true;  }
	
	/*
	 * @ComparatorInputOverride() 
	 */
	public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    { return Container.calcRedstoneFromInventory((IInventory)par1World.getBlockTileEntity(par2, par3, par4)); }
	
}