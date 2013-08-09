package com.nexized.emec;

import net.minecraft.creativetab.CreativeTabs;

import com.nexized.cross.block.blockInit;
import com.nexized.cross.conf.*;
import com.nexized.cross.item.*;
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
    public void preInit(FMLPreInitializationEvent event) {
		// @Configuration
		idm.runTask(event);
		// @Localisation
		local.runTask(event);		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		// @Custom Tab
		tabEnhanceMeCraft = new CreativeTabs("tabEnhanceMeCraft");
		// @Add Blocks
		blockInit.doWork(this.idm, this.local);
		// @Add Items
		itemInit.doWork(this.idm, this.local);
		// @Add Tools
		toolInit.doWork(this.idm, this.local);
		// @Add Armor
		armorInit.doWork(this.idm, this.local);
		// @Add Recipes
		recipesInit.addRecipes();
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
		crossMaterials.materialAluminum.customCraftingMaterial = itemInit.ingotAluminum;
		crossMaterials.materialCopper.customCraftingMaterial = itemInit.ingotCopper;
		crossMaterials.materialPlatinum.customCraftingMaterial = itemInit.ingotPlatinum;
		crossMaterials.materialSilver.customCraftingMaterial = itemInit.ingotSilver;
		crossMaterials.materialSteel.customCraftingMaterial = itemInit.ingotSteel;
		crossMaterials.materialTin.customCraftingMaterial = itemInit.ingotTin;
		// @Repair Armors
		crossMaterials.armorAluminum.customCraftingMaterial = itemInit.ingotAluminum;
		crossMaterials.armorCopper.customCraftingMaterial = itemInit.ingotCopper;
		crossMaterials.armorPlatinum.customCraftingMaterial = itemInit.ingotPlatinum;
		crossMaterials.armorSilver.customCraftingMaterial = itemInit.ingotSilver;
		crossMaterials.armorSteel.customCraftingMaterial = itemInit.ingotSteel;
		crossMaterials.armorTin.customCraftingMaterial = itemInit.ingotTin;
		// @Add Tab Names
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabEnhanceMeCraft", "en_US", "EnhanceMeCraft");
	}
	
}
