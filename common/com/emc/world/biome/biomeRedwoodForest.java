package com.emc.world.biome;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-16
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class biomeRedwoodForest extends BiomeGenBase {

	public biomeRedwoodForest(int par1) {
		super(par1);
		this.topBlock = (byte)Block.grass.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
		theBiomeDecorator.treesPerChunk = 10;
}
	
}
