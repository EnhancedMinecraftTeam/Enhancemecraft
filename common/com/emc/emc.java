package com.emc;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-10-06
 * Licensed under nextized cross license - see license.txt for more information
 */

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

import com.emc.api.emcFoodDropEvent;
import com.emc.conf.idManager;
import com.emc.food.foodManager;
import com.emc.localization.localizationHandler;
import com.emc.mat.matManager;
import com.emc.mob.ai.EntityMoltenWolf;
import com.emc.mob.ai.EntityNetherMen;
import com.emc.mob.ai.EntityOstrich;
import com.emc.mob.ai.EntityThunderRat;
import com.emc.mob.ai.entityMiner;
import com.emc.proxy.commonProxy;
import com.emc.world.emcWorldGenerator;
import com.emc.world.biome.biomeManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "emc", name = "EnhanceMeCraft", version = "0.3.6.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class emc {

	@SidedProxy(clientSide = "com.emc.proxy.clientProxy", serverSide = "com.emc.proxy.commonProxy")
	public static commonProxy proxy;
		
	@Instance("emc")
    public static emc instance;
	
	// @Creative Tab
	public static CreativeTabs tabEMCBlocks;
	public static CreativeTabs tabEMCItems;
	public static CreativeTabs tabEMCArmor;
	public static CreativeTabs tabEMCFood;
    public static CreativeTabs tabEMCSpecial;	
    public static CreativeTabs tabEMCSnowgate;
    public static CreativeTabs tabEMCVolcan;
	// @ID Manager
    idManager idm;
    
    @EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
    	// @ID Manager
    	idm = new idManager(event);
    	// @Localisation
    	localizationHandler.loadLanguages();
    }
    
    @EventHandler
	public void Load(FMLInitializationEvent event) {
    	proxy.RegisterRenderers();
    	proxy.registerServerTickHandler();
    	// Custom Tabs
    	if(idm.ifEnabled("@oreBlock") || idm.ifEnabled("@ingotBlock") || idm.ifEnabled("@MultiTexture")) {
	    		tabEMCBlocks = new CreativeTabs("tabEMCBlocks") {
	    		public ItemStack getIconItemStack() {
	               	return new ItemStack(matManager.oreExperience, 1, 0);
					}
	    		};
    		}
    	if(idm.ifEnabled("@itemIngot") || idm.ifEnabled("@toolAxe")
    		|| idm.ifEnabled("@toolHoe") || idm.ifEnabled("@toolPick")
    		|| idm.ifEnabled("@toolShovel") || idm.ifEnabled("@toolSword")) {
    		tabEMCItems = new CreativeTabs("tabEMCItems") {
    		public ItemStack getIconItemStack() {
    			return new ItemStack(matManager.ingotAluminum, 1, 0);
    			}
    		};
    	}
    	if(idm.ifEnabled("@armor")) {
    		tabEMCArmor = new CreativeTabs("tabEMCArmor") {
        		public ItemStack getIconItemStack() {
        			return new ItemStack(matManager.chestSilver, 1, 0);
        		}
        	};
    	}
    	if(idm.ifEnabled("@food")) {
    		tabEMCFood = new CreativeTabs("tabEMCFood") {
        		public ItemStack getIconItemStack() {
        			return new ItemStack(foodManager.foodBacon, 1, 0);
        		}
        	};
        }
    	if(idm.ifEnabled("@Special")) {
    		tabEMCSpecial = new CreativeTabs("tabEMCSpecial") {
    			public ItemStack getIconItemStack() {
    				return new ItemStack(matManager.Katana,1, 0);
    			}
    		};
    	}
    	if(idm.ifEnabled("@Snowgate")) {
    		tabEMCSnowgate = new CreativeTabs("tabEMCSnowgate") {
    			public ItemStack getIconItemStack() {
    				return new ItemStack(matManager.Freezerite,1, 0);
    			}
    		};
    	}
    	if(idm.ifEnabled("@Volcan")) {
    		tabEMCVolcan = new CreativeTabs("tabEMCVolcan") {
    			public ItemStack getIconItemStack() {
    				return new ItemStack(matManager.VolcanGem,1, 0);
    			}
    		};
    	}
        	// Enable FoodDropEvent for @food
        	MinecraftForge.EVENT_BUS.register(new emcFoodDropEvent());
    	
    	
    	// @Add Stuff
    	matManager.addBlocks(idm, tabEMCBlocks);
    	matManager.addItems(idm, tabEMCItems);
    	matManager.addArmor(idm, tabEMCArmor);
    	matManager.addTools(idm, tabEMCItems);
    	matManager.addSpecial(idm, tabEMCSpecial);
    	matManager.addSnowgate(idm, tabEMCSnowgate);
    	matManager.addVolcan(idm, tabEMCVolcan);
    	matManager.addRecipes(idm);
    	
    	// @Add Food
    	foodManager.addFood(idm, tabEMCFood);
    	
    	// @Add Biomes
    	biomeManager.addBiomes(idm);
    	
    	// @IDManager
    	idm.saveConf();
    	
    	// WorldGenerator if @oreBlocks are enabled
    	if(idm.ifEnabled("@oreBlock")) {
    	GameRegistry.registerWorldGenerator(new emcWorldGenerator());
    	}
    	// Mobs
    	registerEntity(entityMiner.class, "Miner", 0xeaeae9, 0xc99a03);
    	LanguageRegistry.instance().addStringLocalization("entity.Miner.name", "Miner");
    	
    	registerEntity(EntityOstrich.class, "Ostrich", 0xd29bf3, 0xeaeae9);
    	LanguageRegistry.instance().addStringLocalization("entity.Ostrich.name", "Ostrich");
    	EntityRegistry.registerModEntity(EntityOstrich.class, "Ostrich", 20, this, 40, 3, true);
    	EntityRegistry.addSpawn(EntityOstrich.class, 12, 2, 6, EnumCreatureType.creature, BiomeGenBase.desert);
    	
    	registerEntity(EntityThunderRat.class, "ThunderRat", 0xFFEE22, 0xFFFF00);
    	LanguageRegistry.instance().addStringLocalization("entity.ThunderRat.name", "Thunder Rat");
    	EntityRegistry.registerModEntity(EntityThunderRat.class, "ThunderRat", 21, this, 10, 3, true);
    	EntityRegistry.addSpawn(EntityThunderRat.class, 10, 1, 4, EnumCreatureType.monster, BiomeGenBase.forest);
    	
    	registerEntity(EntityNetherMen.class, "NetherMen", 0xCC1111, 0x4);
    	LanguageRegistry.instance().addStringLocalization("entity.NetherMen.name", "Nethermen");
    	EntityRegistry.registerModEntity(EntityNetherMen.class, "NetherMen", 22, this, 60, 3, true);
    	EntityRegistry.addSpawn(EntityNetherMen.class, 10, 4, 9, EnumCreatureType.monster, BiomeGenBase.hell);
    	
    	registerEntity(EntityMoltenWolf.class, "MoltenWolf", 0xCC0000, 0xFFEE22);
    	LanguageRegistry.instance().addStringLocalization("entity.MoltenWolf.name", "Molten Wolf");
    	EntityRegistry.registerModEntity(EntityMoltenWolf.class, "MoltenWolf", 23, this, 20, 3, true);
    	EntityRegistry.addSpawn(EntityMoltenWolf.class, 18, 2, 6, EnumCreatureType.monster, BiomeGenBase.hell, biomeManager.Volcan);
    }   
    
	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
    public void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColour, int fgEggColour) {
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
