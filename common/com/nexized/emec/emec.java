package com.nexized.emec;

/*
 * Author: nexized
 * Last changed: 2013-08-18 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;
import com.nexized.cross.item.food.foodDropEvent;
import com.nexized.cross.lib.libInfo;
import com.nexized.cross.localisation.localizationHandler;
import com.nexized.cross.manager.*;
import com.nexized.cross.tiles.tileFusionFurnace;
import com.nexized.cross.world.crossWorldGenerator;
import com.nexized.emec.lib.modInfo;
import com.nexized.emec.proxy.proxyCommon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "EnhanceMeCraft", name = "EnhanceMeCraft", version = "0.4.0-pre")

public class emec {
	
	@SidedProxy(clientSide = "com.nexized.emec.proxy.proxyClient", serverSide = "com.nexized.emec.proxy.proxyCommon")
	public static proxyCommon proxy;
	
	@Instance("emec")
    public static emec instance;
	
	// @Creative Tab
	public static CreativeTabs tabEnhanceMeCraft;
	public static CreativeTabs tabEnhanceMeCraftFood;
	public static BiomeGenBase iceDesert;
	public static BiomeGenBase redwoodForest;
	// @Armor Renders
	public static int armorAluminumRenderer;
	public static int armorBronzeRenderer;
    public static int armorCopperRenderer;
    public static int armorPlatinumRenderer;
    public static int armorSilverRenderer;
    public static int armorSteelRenderer;
    public static int armorTinRenderer;
	
    
    // @ID Manager
    idManager idm;
    
	@EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
		// @ID Manager
		idm = new idManager(event);
		localizationHandler.loadLanguages();

		proxy.addStringLocalization("itemGroup.tabEnhanceMeCraft", "en_US", libInfo.ID);
		proxy.addStringLocalization("itemGroup.tabEnhanceMeCraftFood", "en_US", libInfo.ID);
	}
	
	@EventHandler
	public void Load(FMLInitializationEvent event) {
		// @Custom Tab
		tabEnhanceMeCraft = new CreativeTabs("tabEnhanceMeCraft") {
			public ItemStack getIconItemStack() {
                return new ItemStack(blockManager.blockFosil, 1, 0);
			}
		};
		tabEnhanceMeCraftFood = new CreativeTabs("tabEnhanceMeCraftFood"){
			public ItemStack getIconItemStack() {
                return new ItemStack(foodManager.foodBacon, 1, 0);
			}
		};
		// @Add Blocks
		blockManager.addBlocks(this.idm, tabEnhanceMeCraft); 
		blockManager.registerBlocks();
		// @Add Items
		itemManager.addItems(this.idm, tabEnhanceMeCraft);
		// @Add Tools
		toolManager.addTools(this.idm, tabEnhanceMeCraft); 
		toolManager.setHarvestLevel();
		// @Add Armor
		armorManager.addArmor(this.idm, tabEnhanceMeCraft);
		// @Add Food
		foodManager.addFood(this.idm, tabEnhanceMeCraftFood);
		idm.saveConf();
		// @Add Recipes
		recipesManager.addRecipes(); // recipesManager.addFusionRecipes();
		// @Add WorldGenerator
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		// @Add TileEntity
		GameRegistry.registerTileEntity(tileFusionFurnace.class, "fusionFurnace");
		GameRegistry.registerWorldGenerator(new crossWorldGenerator());
		// @Add Events
		MinecraftForge.EVENT_BUS.register(new foodDropEvent());
		// @Add armorRenders
		armorAluminumRenderer = proxy.addArmor("aluminum");
		armorBronzeRenderer = proxy.addArmor("bronze");
		armorCopperRenderer = proxy.addArmor("copper");
		armorPlatinumRenderer = proxy.addArmor("platinum");
		armorSilverRenderer = proxy.addArmor("silver");
		armorSteelRenderer = proxy.addArmor("steel");
		armorTinRenderer = proxy.addArmor("tin");
		// @Add LanguageRegistries
		LanguageRegistry.instance().addStringLocalization("Entity.Miner.name", "en-US", "Miner");
		// @Repair Materials
		crossMaterials.materialAluminum.customCraftingMaterial = itemManager.ingotAluminum;
		crossMaterials.materialCopper.customCraftingMaterial = itemManager.ingotCopper;
		crossMaterials.materialPlatinum.customCraftingMaterial = itemManager.ingotPlatinum;
		crossMaterials.materialSilver.customCraftingMaterial = itemManager.ingotSilver;
		crossMaterials.materialSteel.customCraftingMaterial = itemManager.ingotSteel;
		crossMaterials.materialTin.customCraftingMaterial = itemManager.ingotTin;
		// @Repair Armors
		crossMaterials.armorAluminum.customCraftingMaterial = itemManager.ingotAluminum;
		crossMaterials.armorCopper.customCraftingMaterial = itemManager.ingotCopper;
		crossMaterials.armorPlatinum.customCraftingMaterial = itemManager.ingotPlatinum;
		crossMaterials.armorSilver.customCraftingMaterial = itemManager.ingotSilver;
		crossMaterials.armorSteel.customCraftingMaterial = itemManager.ingotSteel;
		crossMaterials.armorTin.customCraftingMaterial = itemManager.ingotTin;
		// @Add Tab Names
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabEnhanceMeCraft", "en_US", "EnhanceMeCraft");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabEnhanceMeCraftFood", "en_US", "EnhanceMeCraftFood");

	}
	@EventHandler
	public static void preInit (FMLPreInitializationEvent event) {
		configManager.init(event.getSuggestedConfigurationFile());
		if (configManager.enableMobs) {
			mobManager.init();
			LanguageRegistry.instance().addStringLocalization("entity.EnhanceMeCraft.Miner.name", "en-US", "Miner");
		}
	}
	
}
