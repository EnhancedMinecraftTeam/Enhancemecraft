package com.nexized.cross.manager;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class fusionRecipes {

	public static FurnaceRecipes furnaceRecipes;
	public static int size;

	 private static final fusionRecipes smeltingBase = new fusionRecipes();
	 
	 private Map<String, ItemStack> recipeList = new HashMap<String, ItemStack>();

	 public static final fusionRecipes smelting()
	    {
	        return smeltingBase;
	    }
	 
	 private fusionRecipes()
	    {

	    }
	 
	 public void addSmelting(int input1, int input2, int catalyst, ItemStack output)
	    {
	    	StringBuffer ingredients = new StringBuffer(32);
	    	StringBuffer ingredients1 = new StringBuffer(32);
	    	ingredients.append(input1).append("_").append(input2).append("_").append(catalyst);
	    	ingredients1.append(input2).append("_").append(input1).append("_").append(catalyst);
	    	recipeList.put(ingredients.toString(), output);
	    	recipeList.put(ingredients1.toString(), output);
	    	
	    	size = recipeList.size();
	    }

	 public ItemStack getSmeltingResult(int input1, int input2, int catalyst)
	    {
	    	StringBuffer ingredients = new StringBuffer(32);
	    	ingredients.append(input1).append("_").append(input2).append("_").append(catalyst);
	    	return (ItemStack) recipeList.get(ingredients.toString());
	    }
	    
	    public Map<String, ItemStack> getRecipeList()
	    {
	        return recipeList;
	    }
	 
}
