package com.nexized.emec.common.instance;

import com.nexized.emec.item.itemArmor.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraft.item.Item;

public class loaderArmor extends loaderIngot {
	
	public static EnumArmorMaterial armorCOPPER = EnumHelper.addArmorMaterial("COPPER", 30, new int[] {2, 7, 5, 3}, 9);
	public static EnumArmorMaterial armorSTEEL = EnumHelper.addArmorMaterial("STEEL", 50, new int[] {2, 7, 5, 3}, 9);
	
	public static Item helmetCopper;
	public static Item helmetSteel;
	
	public static Item chestplateCopper;
	public static Item chestplateSteel;
	
	public static Item legginsCopper;
	public static Item legginsSteel;
	
	public static Item bootsCopper;
	public static Item bootsSteel;

	public static void addArmor(configurationHandler common) 
	{
		// @Armor Copper
		helmetCopper = (new armorCopper(common.helmetCopperID, armorCOPPER, 5, 0)).setUnlocalizedName("helmetCopper");
		chestplateCopper = (new armorCopper(common.chestplateCopperID, armorCOPPER, 5, 1)).setUnlocalizedName("chestplateCopper");
		legginsCopper = (new armorCopper(common.legginsCopperID, armorCOPPER, 5, 2)).setUnlocalizedName("legginsCopper");
		bootsCopper = (new armorCopper(common.bootsCopperID, armorCOPPER, 5, 3)).setUnlocalizedName("bootsCopper");
	
		// @Armor Steel
		helmetSteel = (new armorSteel(common.helmetSteelID, armorSTEEL, 5, 0)).setUnlocalizedName("helmetSteel");
		chestplateSteel = (new armorSteel(common.chestplateSteelID, armorSTEEL, 5, 1)).setUnlocalizedName("chestplateSteel");
		legginsSteel = (new armorSteel(common.legginsSteelID, armorSTEEL, 5, 2)).setUnlocalizedName("legginsSteel");
		bootsSteel = (new armorSteel(common.bootsSteelID, armorSTEEL, 5, 3)).setUnlocalizedName("bootsSteel");
	
		// @Register Items Helmet
		GameRegistry.registerItem(helmetCopper, "helmetCopper");
		GameRegistry.registerItem(helmetSteel, "helmetSteel");
		// @Register Items Chestplate
		GameRegistry.registerItem(chestplateCopper, "chestplateCopper");
		GameRegistry.registerItem(chestplateSteel, "chestplateSteel");
		// @Register Items Leggins
		GameRegistry.registerItem(legginsCopper, "legginsCopper");
		GameRegistry.registerItem(legginsSteel, "legginsSteel");
		// @Register Items Boots
		GameRegistry.registerItem(bootsCopper, "bootsCopper");
		GameRegistry.registerItem(bootsSteel, "bootsSteel");
	}
	
	public static void addNames() {
		// @Armor Names
		LanguageRegistry.addName(helmetCopper, "Copper Helmet");
		LanguageRegistry.addName(helmetSteel, "Steel Helmet");
		LanguageRegistry.addName(chestplateCopper, "Copper Chestplate");
		LanguageRegistry.addName(chestplateSteel, "Steel Chestplate");
		LanguageRegistry.addName(legginsCopper, "Copper Leggins");
		LanguageRegistry.addName(legginsSteel, "Steel Leggins");
		LanguageRegistry.addName(bootsCopper, "Copper Boots");
		LanguageRegistry.addName(bootsSteel, "Steel Boots");		
	}
	
	public static void addRecipes() {
		// @Add Recipes itemHelmet
		GameRegistry.addRecipe(new ItemStack(helmetCopper, 1), new Object[] {"xxx", "x x", 'x', IngotCopper});
		GameRegistry.addRecipe(new ItemStack(helmetSteel, 1), new Object[] {"xxx", "x x", 'x', IngotSteel});
		// @Add Recipes itemChestplate
		GameRegistry.addRecipe(new ItemStack(chestplateCopper, 1), new Object[] {"x x", "xxx", "xxx", 'x', IngotCopper});
		GameRegistry.addRecipe(new ItemStack(chestplateSteel, 1), new Object[] {"x x", "xxx", "xxx", 'x', IngotSteel});
		// @Add Recipes itemLeggins
		GameRegistry.addRecipe(new ItemStack(legginsCopper, 1), new Object[] {"xxx", "x x", "x x", 'x', IngotCopper});
		GameRegistry.addRecipe(new ItemStack(legginsSteel, 1), new Object[] {"xxx", "x x", "x x", 'x', IngotSteel});
		// @Add Recipes itemBoots
		GameRegistry.addRecipe(new ItemStack(bootsCopper, 1), new Object[] {"x x", "x x", 'x', IngotCopper});
		GameRegistry.addRecipe(new ItemStack(bootsSteel, 1), new Object[] {"x x", "x x", 'x', IngotSteel});
	}
	
}
