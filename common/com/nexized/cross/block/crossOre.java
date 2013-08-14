package com.nexized.cross.block;

/*
 * Author: nexized
 * Last changed: 2013-08-14 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import java.util.Random;

import com.nexized.cross.manager.blockManager;

import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class crossOre extends crossBlock {
	
	/*
	 * @Construct new crossOre based on crossBlock
	 */
	public crossOre(int id, Material mat) 
	{ super(id, mat); }

	public int idDropped(int i, Random random, int j)
	 {
		 if (this.blockID != blockManager.oreExperience.blockID) 
		 { return this.blockID; } 
		 else { return 0; }
	 }
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
	 	super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
	 	
	 	 if (this.idDropped(par5, par1World.rand, par7) != this.blockID) {
	 		 // @ Value for amount of dropped Experience
	 		 int now = 0;
	 		 if (this.blockID == blockManager.oreExperience.blockID) {
		 		// @ Value for maximal Experience
		 		int max= 16;
		 		// @ Value for minimal Experience
			 	int min = 8;
			 	// @Random 
		 		now = MathHelper.getRandomIntegerInRange(par1World.rand, min,max);	
	 		 }
		 	// @ Drop the calculated value of Experience
		 	this.dropXpOnBlockBreak(par1World, par2, par3, par4, now);
	 	 }
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
