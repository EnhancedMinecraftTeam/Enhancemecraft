package com.nexized.cross.world.biome;

import com.nexized.cross.manager.blockManager;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeDoOctoBase extends BiomeGenBase{

	public BiomeDoOctoBase(int par1) {
		super(par1);
		this.topBlock = (byte)Block.dirt.blockID;
		this.fillerBlock = (byte)Block.blockClay.blockID;
	}

}
