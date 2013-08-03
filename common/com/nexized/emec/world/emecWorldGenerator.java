package com.nexized.emec.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.nexized.emec.common.instance.loaderOre;

import cpw.mods.fml.common.IWorldGenerator;

public class emecWorldGenerator implements IWorldGenerator {

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
    	this.addOreSpawn(loaderOre.OreFossil, world, random, x, z, 16, 16, 4 + random.nextInt(3), 2, 40, 60);
    	this.addOreSpawn(loaderOre.OreExp, world, random, x, z, 16, 16, 4 + random.nextInt(3), 2, 40, 60);
    	this.addOreSpawn(loaderOre.OreAluminium, world, random, x, z, 16, 16, 4 + random.nextInt(3), 10, 10, 30);
    	this.addOreSpawn(loaderOre.OreCopper, world, random, x, z, 16, 16, 4 + random.nextInt(3), 5, 15, 60);
    	this.addOreSpawn(loaderOre.OrePlatinum, world, random, x, z, 16, 16, 4 + random.nextInt(3), 4, 0, 40);
    	this.addOreSpawn(loaderOre.OreSilver, world, random, x, z, 16, 16, 4 + random.nextInt(3), 5, 15, 60);
    	this.addOreSpawn(loaderOre.OreTin, world, random, x, z, 16, 16, 4 + random.nextInt(3), 7, 15, 60);
    }

    private void generateNether(World world, Random random, int x, int z) {}
	
    private void generateEnd(World world, Random random, int x, int z) {}
	
}

