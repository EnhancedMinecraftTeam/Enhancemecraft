package com.nexized.cross.item;

import com.nexized.cross.lib.libInfo;
import com.nexized.emec.emec;
import com.nexized.emec.proxy.proxyCommon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class crossArmor extends ItemArmor {

	public static proxyCommon proxy;
	
	private final EnumArmorMaterial material;
    private String texture;
	
    public crossArmor(int id, EnumArmorMaterial mat, int renderer, int slot, String type) 
	{
    	super(id, mat, renderer, slot);
    	this.material = mat;
    	this.setCreativeTab(emec.tabEnhanceMeCraft);
    	this.setArmorType(type.toLowerCase(), slot);
	}
    
    public void setArmorType(String type, int slotNumber)
    {
    	switch(slotNumber)
    	{
    		case 0:
    		{
    			this.texture = libInfo.ID + ":textures/armor/" + type +"_1.png";
    		}
    		break;
    		
    		case 1:
    		{
    			this.texture= libInfo.ID + ":textures/armor/" + type +"_1.png";
    		}
    		break;
    		
    		case 2:
    		{
    			this.texture = libInfo.ID + ":textures/armor/" + type +"_2.png";
    		}
    		break;
    		
    		case 3:
    		{
    			this.texture = libInfo.ID + ":textures/armor/" + type +"_1.png";
    		}
    		break;
    	}
    }
    
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
    	return this.texture;
    }
    
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		 this.itemIcon = iconRegister.registerIcon(libInfo.ID + ":" + (this.getUnlocalizedName()));
	}
    
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.material.getArmorCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
    
}
