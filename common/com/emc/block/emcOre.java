package com.emc.block;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-01
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class emcOre extends emcBlock {

	public emcOre(int id, Material mat) {
		super(id, mat);
	}
	
	public emcOre(int id, Material mat, CreativeTabs tab) {
		super(id, mat, tab);
	}
	
	public int idDropped(int i, Random random, int j) { return this.blockID; }
	
}
