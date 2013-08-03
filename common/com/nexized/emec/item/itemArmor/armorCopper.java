package com.nexized.emec.item.itemArmor;

import com.nexized.emec.common.instance.loaderArmor;
import com.nexized.emec.lib.modInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class armorCopper extends ItemArmor {

	public String materialName = "Copper";
	
	public armorCopper(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	{
		if (itemID == loaderArmor.helmetCopper.itemID || itemID == loaderArmor.chestplateCopper.itemID) {
			return modInfo.MODID + ":textures/armor/" + this.materialName + "_1.png";
		}
		
		if (itemID == loaderArmor.legginsCopper.itemID || itemID == loaderArmor.bootsCopper.itemID) {
			return modInfo.MODID + ":textures/armor/" + this.materialName + "_2.png";
		} 
		
		else  { return null; }
	}
	
	public void registerIcons(IconRegister iconReg) {
		if(itemID == loaderArmor.helmetCopper.itemID)
			{
				itemIcon = iconReg.registerIcon(modInfo.MODID + ":helm" + this.materialName);
			}
			else if(itemID == loaderArmor.chestplateCopper.itemID)
			{
				itemIcon = iconReg.registerIcon(modInfo.MODID + ":chest" + this.materialName);
			}
			else if(itemID == loaderArmor.legginsCopper.itemID)
			{
				itemIcon = iconReg.registerIcon(modInfo.MODID + ":legs" + this.materialName);
			}
			else if(itemID == loaderArmor.bootsCopper.itemID)
			{
				itemIcon = iconReg.registerIcon(modInfo.MODID + ":boots" + this.materialName);
			}
		}
	}
	
