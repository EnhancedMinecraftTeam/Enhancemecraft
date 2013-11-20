package com.emc.mob;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.entity.Entity;
// import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.emc.conf.idManager;
import com.emc.mob.ai.EntityOstrich;
import com.emc.mob.ai.entityMiner;
import com.emc.mob.model.ModelOstrich;
import com.emc.mob.model.modelMiner;
import com.emc.mob.render.RenderOstrich;
import com.emc.mob.render.renderMiner;
import com.emc.world.biome.biomeManager;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class mobManager {

	static int startEntityId = 300;

	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		}

		while (EntityList.getStringFromID(startEntityId) != null);
		return startEntityId++;
		}

	public static void addMobs(idManager idm) {
		if (idm.ifEnabled("@mobs")) {
			registerEntity(entityMiner.class, "Miner", 0x3c768c, 0xb50000);
			LanguageRegistry.instance().addStringLocalization("entity.Miner.name", "Miner");
			EntityRegistry.registerGlobalEntityID(entityMiner.class, "Miner", idm.getEntityID("Miner"));
			EntityRegistry.addSpawn(entityMiner.class, 128, 2, 4, EnumCreatureType.monster);
			EntityRegistry.findGlobalUniqueEntityId();
			RenderingRegistry.registerEntityRenderingHandler(entityMiner.class, new renderMiner(new modelMiner(), 0.2F));
		}
	}
	 public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColour, int fgEggColour) {
	    	int id = EntityRegistry.findGlobalUniqueEntityId();
	    	
	    	EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
	    	EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColour, fgEggColour)); 
	    }
	    public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
	    	if (spawnProb > 0) {
	    		EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.monster, biomes);
	    	}
	    }
}