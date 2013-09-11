package com.emc.api;

import java.util.EnumSet;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;

public class tickHandler implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {/*Not Used*/}


	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		// ThirstMod.INSTANCE.onTickInGame();
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
