package com.nexized.emec.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.nexized.emec.common.CommonLoader;

import cpw.mods.fml.common.IWorldGenerator;

public class emecWorldGenerator implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case 1:
                this.generateNether(world, random, chunkX * 16, chunkZ * 16);

            case 0:
                this.generateSurface(world, random, chunkX * 16, chunkZ * 16);

            case -1:
                this.generateEnd(world, random, chunkX * 16, chunkZ * 16);

            default:
        }
    }

    private void generateSurface(World world, Random random, int ChunkX, int ChunkZ)
    {
        int i;
        int xCoord;
        int yCoord;
        int zCoord;
	
        for (i = 0; i < 15; ++i)
        {
            xCoord = ChunkX + random.nextInt(16);
            yCoord = random.nextInt(60);
            zCoord = ChunkZ + random.nextInt(16);
            (new WorldGenMinable(CommonLoader.OrePlatinum.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
        }
    }
    
    private void generateNether(World world, Random random, int chunkX, int chunkZ) {}
    
    private void generateEnd(World world, Random random, int i, int j) {}
}

