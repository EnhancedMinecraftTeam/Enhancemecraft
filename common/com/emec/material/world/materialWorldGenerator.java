package com.emec.material.world;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import java.util.Random;

import net.minecraft.world.World;

import com.emec.material.manager.blockManager;
import com.emec.zero.world.worldGenerator;

public class materialWorldGenerator extends worldGenerator {

	private void generateSurface(World world, Random random, int x, int z)
    {
		this.addOreSpawn(blockManager.blockFosil, world, random, x, z, 16, 16, 1, 8, 0, 45);
    	this.addOreSpawn(blockManager.oreExperience, world, random, x, z, 16, 16, 4, 24, 0, 90);
    	this.addOreSpawn(blockManager.oreAluminum, world, random, x, z, 16, 16, 4, 16, 30, 60);
    	this.addOreSpawn(blockManager.oreCopper, world, random, x, z, 16, 16, 4, 16, 0, 60);
    	this.addOreSpawn(blockManager.orePlatinum, world, random, x, z, 16, 16, 4, 12, 0, 60);
    	this.addOreSpawn(blockManager.oreSilver, world, random, x, z, 16, 16, 4, 16, 0, 60);
    	this.addOreSpawn(blockManager.oreTin, world, random, x, z, 16, 16, 4, 24, 0, 60);
    }
	
}
