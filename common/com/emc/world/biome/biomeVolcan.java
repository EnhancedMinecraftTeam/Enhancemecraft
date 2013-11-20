package com.emc.world.biome;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: HackerTDog
 * @Last changed: 2013-10-18
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.mat.matManager;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class biomeVolcan extends BiomeGenBase {

	public biomeVolcan(int par1) {
		super(par1);
		this.topBlock = (byte)matManager.VolcanRock.blockID;
		this.fillerBlock = (byte)matManager.VolcanStone.blockID;
}
	
}
