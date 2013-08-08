package com.nexized.cross.item;

import com.nexized.cross.block.blockInit;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class recipesInit {

	public static void addRecipes() {
		// @Insert OreDirectionary
		OreDictionary.registerOre("oreAluminum", new ItemStack(blockInit.oreAluminum));
		OreDictionary.registerOre("oreCopper", new ItemStack(blockInit.oreCopper));
		OreDictionary.registerOre("orePlatinum", new ItemStack(blockInit.orePlatinum));
		OreDictionary.registerOre("oreSilver", new ItemStack(blockInit.oreSilver));
		OreDictionary.registerOre("oreTin", new ItemStack(blockInit.oreTin));
		
		// @Add Ingot Block Recipes	
		GameRegistry.addRecipe(new ItemStack(blockInit.blockAluminum), new Object[] {"XXX", "XXX", "XXX", 'X', itemInit.ingotAluminum});
		GameRegistry.addRecipe(new ItemStack(blockInit.blockCopper), new Object[] {"XXX", "XXX", "XXX", 'X', itemInit.ingotCopper});
		GameRegistry.addRecipe(new ItemStack(blockInit.blockPlatinum), new Object[] {"XXX", "XXX", "XXX", 'X', itemInit.ingotPlatinum});
		GameRegistry.addRecipe(new ItemStack(blockInit.blockSilver, 1), new Object[] {"XXX", "XXX", "XXX", 'X', itemInit.ingotSilver});
		GameRegistry.addRecipe(new ItemStack(blockInit.blockSteel), new Object[] {"XXX", "XXX", "XXX", 'X', itemInit.ingotSteel});
		GameRegistry.addRecipe(new ItemStack(blockInit.blockTin), new Object[] {"XXX", "XXX", "XXX", 'X', itemInit.ingotTin});
		// @Add Reverse Recipes
		GameRegistry.addRecipe(new ItemStack(itemInit.ingotCopper, 9), new Object[] {"X", 'X', blockInit.blockCopper});
		GameRegistry.addRecipe(new ItemStack(itemInit.ingotPlatinum, 9), new Object[] {"X", 'X', blockInit.blockPlatinum});
		GameRegistry.addRecipe(new ItemStack(itemInit.ingotSilver, 9), new Object[] {"X", 'X', blockInit.blockSilver});
		GameRegistry.addRecipe(new ItemStack(itemInit.ingotSteel, 9), new Object[] {"X", 'X', blockInit.blockSteel});
		GameRegistry.addRecipe(new ItemStack(itemInit.ingotTin, 9), new Object[] {"X", 'X', blockInit.blockTin});
		
		GameRegistry.addRecipe(new ItemStack(toolInit.axeAluminum), new Object[] {" XX", " *X", " * ", 'X', itemInit.ingotAluminum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.axeCopper), new Object[] {" XX", " *X", " * ", 'X', itemInit.ingotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.axePlatinum), new Object[] {" XX", " *X", " * ", 'X', itemInit.ingotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.axeSilver), new Object[] {" XX", " *X", " * ", 'X', itemInit.ingotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.axeSteel), new Object[] {" XX", " *X", " * ", 'X', itemInit.ingotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.axeTin), new Object[] {" XX", " *X", " * ", 'X', itemInit.ingotTin, '*', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(toolInit.hoeAluminum), new Object[] {" XX", " * ", " * ", 'X', itemInit.ingotAluminum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.hoeCopper), new Object[] {" XX", " * ", " * ", 'X', itemInit.ingotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.hoePlatinum), new Object[] {" XX", " * ", " * ", 'X', itemInit.ingotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.hoeSilver), new Object[] {" XX", " * ", " * ", 'X', itemInit.ingotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.hoeSteel), new Object[] {" XX", " * ", " * ", 'X', itemInit.ingotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.hoeTin), new Object[] {" XX", " * ", " * ", 'X', itemInit.ingotTin, '*', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(toolInit.pickAluminum), new Object[] {"XXX", " * ", " * ", 'X', itemInit.ingotAluminum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.pickCopper), new Object[] {"XXX", " * ", " * ", 'X', itemInit.ingotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.pickPlatinum), new Object[] {"XXX", " * ", " * ", 'X', itemInit.ingotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.pickSilver), new Object[] {"XXX", " * ", " * ", 'X', itemInit.ingotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.pickSteel), new Object[] {"XXX", " * ", " * ", 'X', itemInit.ingotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.pickTin), new Object[] {"XXX", " * ", " * ", 'X', itemInit.ingotTin, '*', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(toolInit.shovelAluminum), new Object[] {" X ", " * ", " * ", 'X', itemInit.ingotAluminum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.shovelCopper), new Object[] {" X ", " * ", " * ", 'X', itemInit.ingotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.shovelPlatinum), new Object[] {" X ", " * ", " * ", 'X', itemInit.ingotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.shovelSilver), new Object[] {" X ", " * ", " * ", 'X', itemInit.ingotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.shovelSteel), new Object[] {" X ", " * ", " * ", 'X', itemInit.ingotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.shovelTin), new Object[] {" X ", " * ", " * ", 'X', itemInit.ingotTin, '*', Item.stick});
				
		GameRegistry.addRecipe(new ItemStack(toolInit.swordAluminum), new Object[] {" X ", " X ", " * ", 'X', itemInit.ingotAluminum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.swordCopper), new Object[] {" X ", " X ", " * ", 'X', itemInit.ingotCopper, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.swordPlatinum), new Object[] {" X ", " X ", " * ", 'X', itemInit.ingotPlatinum, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.swordSilver), new Object[] {" X ", " X ", " * ", 'X', itemInit.ingotSilver, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.swordSteel), new Object[] {" X ", " X ", " * ", 'X', itemInit.ingotSteel, '*', Item.stick});
		GameRegistry.addRecipe(new ItemStack(toolInit.swordTin), new Object[] {" X ", " X ", " * ", 'X', itemInit.ingotTin, '*', Item.stick});
		
		// @Add Melting
		GameRegistry.addSmelting(blockInit.oreAluminum.blockID, new ItemStack(itemInit.ingotAluminum), 1.0F);
		GameRegistry.addSmelting(blockInit.oreCopper.blockID, new ItemStack(itemInit.ingotCopper), 1.0F);
		GameRegistry.addSmelting(blockInit.orePlatinum.blockID, new ItemStack(itemInit.ingotPlatinum), 1.0F);
		GameRegistry.addSmelting(blockInit.oreSilver.blockID, new ItemStack(itemInit.ingotSilver), 1.0F);
		GameRegistry.addSmelting(blockInit.oreTin.blockID, new ItemStack(itemInit.ingotTin), 1.0F);
	}
	
}
