package com.emec.zero.item;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class zeroArmor extends ItemArmor {

	// @Material defined in crossMaterials
	private final EnumArmorMaterial material;
	// @Used texture for this part of the ItemArmor
    private String texture;
	
    /*
     * @Construct new itemArmor
     */    
    public zeroArmor(int id, EnumArmorMaterial mat, int renderer, int slot, String type) 
	{
    	// @Constructor of ItemArmor
    	super(id, mat, renderer, slot);
    	// @Set new armor material
    	this.material = mat;
    	// @Set new armor element
    	this.setArmorType(type.toLowerCase(), slot);
	}
    
    /*
     * @Construct new itemArmor with CreativeTab
     */
    public zeroArmor(int id, EnumArmorMaterial mat, int renderer, int slot, String type, CreativeTabs tab) 
	{
    	// @Constructor of ItemArmor
    	super(id, mat, renderer, slot);
    	// @Set new armor material
    	this.material = mat;
    	// @Set new armor element
    	this.setArmorType(type.toLowerCase(), slot);
    	// @Set new armor creative tab
    	this.setCreativeTab(tab);
	}
    
    /*
     * @Set the current item for initialization of the new ItemArmor
     */
    public void setArmorType(String type, int slotNumber)
    {
    	String itemIconLocation = "emec:textures/armor/";
    	
    	switch(slotNumber)
    	{
    		case 0:
    		{ this.texture = itemIconLocation + type +"_1.png"; }
    		break;
    		case 1:
    		{ this.texture= itemIconLocation + type +"_1.png"; }
    		break;
    		case 2:
    		{ this.texture = itemIconLocation + type +"_2.png"; }
    		break;
    		case 3:
    		{ this.texture = itemIconLocation + type +"_1.png"; }
    		break;
    	}
    }
    
    /*
     * @Return the current parts texture 
     */
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    { return this.texture; }
    
    /*
     * @Return the current parts icon
     */
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {  
    	String itemIconLocation = "emec:" + this.getUnlocalizedName();
    	this.itemIcon = iconRegister.registerIcon(itemIconLocation); 
    }
    
    /*
     * @Return if this item is reparable or not
     */
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.material.getArmorCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
    
}
