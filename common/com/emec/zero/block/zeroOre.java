package com.emec.zero.block;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class zeroOre extends zeroBlock {

	public zeroOre(int id, Material mat) 
	{ super(id, mat); }

	public zeroOre(int id, Material mat, CreativeTabs tab) 
	{ super(id, mat, tab); }
	
	public int idDropped(int i, Random random, int j)
	 {
		 return this.blockID;
	 }
	
	public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
        {
            int var3 = par2Random.nextInt(par1 + 2) - 1;
            if (var3 < 0) { var3 = 0; }
            return this.quantityDropped(par2Random) * (var3 + 1);
        }
        else
        {   return this.quantityDropped(par2Random); }
    }

 protected boolean canSilkHarvest()
    { return true; }
	
}
