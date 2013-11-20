package com.emc.world;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-01
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.util.Random;

import com.emc.mat.matManager;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class emcWorldGenerator implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, 
			World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId)
        {
               case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
               case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
               case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
		
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
	       int diffBtwnMinMaxY = maxY - minY;
	       for(int x = 0; x < chancesToSpawn; x++)
	       {
	             int posX = blockXPos + random.nextInt(maxX);
	             int posY = minY + random.nextInt(diffBtwnMinMaxY);
	             int posZ = blockZPos + random.nextInt(maxZ);
	             (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
	       }
	}
	
	private void generateSurface(World world, Random random, int x, int z)
    {
    	this.addOreSpawn(matManager.oreExperience, world, random, x, z, 16, 16, 4, 24, 0, 90);
    	this.addOreSpawn(matManager.oreAluminum, world, random, x, z, 16, 16, 4, 16, 30, 60);
    	this.addOreSpawn(matManager.oreCopper, world, random, x, z, 16, 16, 4, 24, 0, 60);
    	this.addOreSpawn(matManager.orePlatinum, world, random, x, z, 16, 16, 4, 12, 0, 60);
    	this.addOreSpawn(matManager.oreSilver, world, random, x, z, 16, 16, 4, 16, 0, 60);
    	this.addOreSpawn(matManager.oreTin, world, random, x, z, 16, 16, 4, 24, 0, 60);
    	this.addOreSpawn(matManager.oreBronze, world, random, x, z, 16, 16, 4, 24, 0, 60);
    	this.addOreSpawn(matManager.oreKatchin, world, random, x, z, 16, 16, 1, 4, 0, 60);
    	this.addOreSpawn(matManager.oreSteel, world, random, x, z, 16, 16, 4, 12, 0, 60);
    	this.addOreSpawn(matManager.oreFrozen, world, random, x, z, 16, 16, 6, 28, 0, 60);
    }	
	
private void generateNether(World world, Random random, int x, int z) {
	this.addOreSpawn(matManager.oreVolcan, world, random, x, z, 16, 16, 3, 24, 0, 60);
}
private void generateEnd(World world, Random random, int x, int z) {}
	
}
