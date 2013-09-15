package com.emc.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeIceDesert extends BiomeGenBase{

	public BiomeIceDesert(int par1) {
		super(par1);
		this.topBlock = (byte)Block.ice.blockID;
		this.fillerBlock = (byte)Block.blockSnow.blockID;
		
	}

}
