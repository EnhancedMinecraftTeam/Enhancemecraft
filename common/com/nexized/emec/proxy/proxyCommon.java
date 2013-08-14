package com.nexized.emec.proxy;

/*
 * Author: nexized
 * Last changed: 2013-08-14 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.tiles.clientFusionFurnace;
import com.nexized.cross.tiles.containerFusionFurnace;
import com.nexized.cross.tiles.tileFusionFurnace;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class proxyCommon implements IGuiHandler {

	/*
	 * Localization (new method to load it in the commonProxy instance)	
	 */
	public void loadLocalization(String filename, String locale) {
        LanguageRegistry.instance().loadLocalization(filename, locale, true);
    }
	
	/*
	 * Localization (new method to load it in the commonProxy instance)
	 */
	public String getStringLocalization(String key) {
        return LanguageRegistry.instance().getStringLocalization(key);
    }
	
	/*
	 * Armor Renderer (disabled on the server)
	 */
	public int addArmor(String armor) 
	 {
	  	 return 0;
	 }

	/*
	 * Reference to containerFusionFurnance on the server (container)
	 */
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
		TileEntity machine = world.getBlockTileEntity(x, y, z);
        if(machine == null) { return null; }                 
        if(machine instanceof tileFusionFurnace)
        { return new containerFusionFurnace(player.inventory, (tileFusionFurnace)machine); }
        return null;
    }
	
	/*
	 * Show clientFusionFurnance on the client (GUI)
	 */
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
		TileEntity machine = world.getBlockTileEntity(x, y, z);
	    if(machine == null) { return null; }       
        if(machine instanceof tileFusionFurnace) 
        { return new clientFusionFurnace(player.inventory, (tileFusionFurnace)machine); }
        return null;
    }
	
}
