package com.nexized.emec.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.nexized.emec.common.CommonLoader;

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
	       /*
		   assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
	       assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
	       assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
	       assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
	       assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
	      */
		
	       int diffBtwnMinMaxY = maxY - minY;
	       for(int x = 0; x < chancesToSpawn; x++)
	       {
	             int posX = blockXPos + random.nextInt(maxX);
	             int posY = minY + random.nextInt(diffBtwnMinMaxY);
	             int posZ = blockZPos + random.nextInt(maxZ);
	             (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
	       }
	}
	
	private void generateEnd(World world, Random random, int x, int z)
    {
         
    }

    private void generateSurface(World world, Random random, int x, int z)
    {
    	this.addOreSpawn(CommonLoader.BlockFosil, world, random, x, z, 16, 16, 4 + random.nextInt(3), 2, 40, 60);
    	this.addOreSpawn(CommonLoader.OreAluminium, world, random, x, z, 16, 16, 4 + random.nextInt(3), 5, 15, 60);
    	this.addOreSpawn(CommonLoader.OreCopper, world, random, x, z, 16, 16, 4 + random.nextInt(3), 5, 15, 60);
    	this.addOreSpawn(CommonLoader.OrePlatinum, world, random, x, z, 16, 16, 4 + random.nextInt(3), 4, 0, 40);
    	this.addOreSpawn(CommonLoader.OreSilver, world, random, x, z, 16, 16, 4 + random.nextInt(3), 5, 15, 60);
    	this.addOreSpawn(CommonLoader.OreTin, world, random, x, z, 16, 16, 4 + random.nextInt(3), 7, 15, 60);
    }

    private void generateNether(World world, Random random, int x, int z)
    {
         
    }
	
	
}

