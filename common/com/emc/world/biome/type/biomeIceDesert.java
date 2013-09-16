package com.emc.world.biome.type;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-16
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class biomeIceDesert extends BiomeGenBase {

	public biomeIceDesert(int par1) {
		super(par1);
		this.topBlock = (byte)Block.ice.blockID;
		this.fillerBlock = (byte)Block.blockSnow.blockID;
}
	
}
