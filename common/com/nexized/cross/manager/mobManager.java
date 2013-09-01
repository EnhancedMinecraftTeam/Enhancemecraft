package com.nexized.cross.manager;

import java.io.File;

import com.nexized.cross.entity.common.EntityMiner;
import com.nexized.cross.entity.model.ModelMiner;
import com.nexized.cross.entity.render.RenderMiner;
import com.nexized.cross.world.*;
import com.nexized.cross.world.biome.BiomeIceDesert;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.Configuration;

public class mobManager {
	
	//Mob Gen goes here
	static int startEntityId = 300;
	
		public static int getUniqueEntityId() {
			do {
				startEntityId++;
			}
			while (EntityList.getStringFromID(startEntityId) != null);
			return startEntityId++;
		}
		public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
			int id = getUniqueEntityId();
			EntityList.IDtoClassMapping.put(id, entity);
			EntityList.entityEggs.put(id, new EntityEggInfo(id,primaryColor,secondaryColor));
		}
		
	public static void init() {
		//Mob settings go here
		EntityRegistry.registerGlobalEntityID(EntityMiner.class, "Miner", configManager.MinerID);
		EntityRegistry.addSpawn(EntityMiner.class, 128, 2, 4, EnumCreatureType.monster);
		EntityRegistry.findGlobalUniqueEntityId();
		registerEntityEgg(EntityMiner.class, 0x3c768c, 0xb50000);
		RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class, new RenderMiner(new ModelMiner(), 0.3F));
		LanguageRegistry.instance().addStringLocalization("entity.EnhanceMeCraft.Miner.name", "en-US", "Miner");
	}
}
