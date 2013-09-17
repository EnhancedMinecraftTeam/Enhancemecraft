package com.emc.mob;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.conf.idManager;
import com.emc.mob.ai.entityMiner;
import com.emc.mob.model.modelMiner;
import com.emc.mob.render.renderMiner;
import com.emc.world.biome.biomeManager;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
// import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;

public class mobManager {

	static int startEntityId = 300;

	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		}

		while (EntityList.getStringFromID(startEntityId) != null);
		return startEntityId++;
		}
	
	@SuppressWarnings("unchecked")
	public static void registerEntityEgg(Class<entityMiner> class1, int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, class1);
		EntityList.entityEggs.put(id, new EntityEggInfo(id,primaryColor,secondaryColor));
	}

	public static void addMobs(idManager idm) {
		if (idm.ifEnabled("@Mobs")) {
			EntityRegistry.registerGlobalEntityID(entityMiner.class, "Miner", idm.getEntityID("Miner"));
			EntityRegistry.addSpawn(entityMiner.class, 128, 2, 4, EnumCreatureType.monster);
			EntityRegistry.addSpawn(entityMiner.class, 1, 2, 4, EnumCreatureType.monster, biomeManager.iceDesert);
			EntityRegistry.addSpawn(entityMiner.class, 1, 2, 4, EnumCreatureType.monster, biomeManager.octoBase);
			EntityRegistry.addSpawn(entityMiner.class, 1, 2, 4, EnumCreatureType.monster, biomeManager.redwoodForest);
			EntityRegistry.findGlobalUniqueEntityId();
			registerEntityEgg(entityMiner.class, 0x3c768c, 0xb50000);
			RenderingRegistry.registerEntityRenderingHandler(entityMiner.class, new renderMiner(new modelMiner(), 0.3F));
		}
	}
}
