package com.emc.drink;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.util.EnumSet;

import com.emc.emc;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;

public class TickHandler implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {/*Not Used*/}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		emc.instance.onTickInGame();
	}

	@Override
	public EnumSet<TickType> ticks() { 
		if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER && FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			return EnumSet.of(TickType.PLAYER);
		} else if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
			return EnumSet.of(TickType.CLIENT);
		} else if(FMLCommonHandler.instance().getSide() == Side.SERVER) return EnumSet.of(TickType.WORLD);
		return null;
	}

	@Override
	public String getLabel() { return null; }
	
}
