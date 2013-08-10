package com.nexized.emec;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;
import com.nexized.cross.manager.*;
import com.nexized.cross.world.crossWorldGenerator;
import com.nexized.emec.lib.modInfo;
import com.nexized.emec.proxy.proxyCommon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = modInfo.ID, name = modInfo.NAME, version = modInfo.VERSION)

public class emec {
	
	@SidedProxy(clientSide = "com.nexized.emec.proxy.proxyClient", serverSide = "com.nexized.emec.proxy.proxyCommon")
	public static proxyCommon proxy;
	
	// @Creative Tab
	public static CreativeTabs tabEnhanceMeCraft;
	public static CreativeTabs tabEnhanceMeCraftFood;
	
	// @Armor Renders
	public static int armorAluminumRenderer;
    public static int armorCopperRenderer;
    public static int armorPlatinumRenderer;
    public static int armorSilverRenderer;
    public static int armorSteelRenderer;
    public static int armorTinRenderer;
	
    // @Language Configuration
    confEntity idm = new confEntity();
    confLocalisation local = new confLocalisation();
    
	@EventHandler
    public void preManager(FMLPreInitializationEvent event) {
		// @Configuration
		idm.runTask(event);
		// @Localisation
		local.runTask(event);		
	}
	
	@EventHandler
	public void Manager(FMLInitializationEvent event) {
		// @Custom Tab
		tabEnhanceMeCraft = new CreativeTabs("tabEnhanceMeCraft") {
			public ItemStack getIconItemStack() {
                return new ItemStack(blockManager.orePlatinum, 1, 0);
			}
		};
		tabEnhanceMeCraftFood = new CreativeTabs("tabEnhanceMeCraftFood"){
			public ItemStack getIconItemStack() {
                return new ItemStack(foodManager.foodBacon, 1, 0);
			}
		};
		// @Add Blocks
		blockManager.doWork(this.idm, this.local);
		// @Add Items
		itemManager.doWork(this.idm, this.local);
		// @Add Tools
		toolManager.doWork(this.idm, this.local);
		// @Add Armor
		armorManager.doWork(this.idm, this.local);
		// @Add Food
		foodManager.doWork(this.idm, this.local);
		// @Add Recipes
		recipesManager.addRecipes();
		// @Add WorldGenerator
		GameRegistry.registerWorldGenerator(new crossWorldGenerator());
		// @Add armorRenders
		armorAluminumRenderer = proxy.addArmor("aluminum");
		armorCopperRenderer = proxy.addArmor("copper");
		armorPlatinumRenderer = proxy.addArmor("platinum");
		armorSilverRenderer = proxy.addArmor("silver");
		armorSteelRenderer = proxy.addArmor("steel");
		armorTinRenderer = proxy.addArmor("tin");
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
	
}
