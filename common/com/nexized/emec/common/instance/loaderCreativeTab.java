package com.nexized.emec.common.instance;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class loaderCreativeTab extends loaderTools {

	public static CreativeTabs emecCreativeTab;
	
	public static void addTab() {
		
		emecCreativeTab =new CreativeTabs ("EnhanceMeCraft") {
			
			public ItemStack getIconItemStack()
	        {
				// @Item Blocks
	            return new ItemStack(BlockCopper, 1, 0);   
	        }
		};
		
	}
}
