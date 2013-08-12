package com.nexized.emec.proxy;

import com.nexized.cross.tiles.clientFusionFurnace;
import com.nexized.cross.tiles.containerFusionFurnace;
import com.nexized.cross.tiles.tileFusionFurnace;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class proxyCommon implements IGuiHandler {

	public int addArmor(String armor) 
	 {
	  	 return 0;
	 }

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
		TileEntity machine = world.getBlockTileEntity(x, y, z);
		
        if(machine == null)
        {
        	return null;
        }
                    
        if(machine instanceof tileFusionFurnace)
        {
        	return new containerFusionFurnace(player.inventory, (tileFusionFurnace)machine);
        }
            
        return null;
    }
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
		TileEntity machine = world.getBlockTileEntity(x, y, z);
		
        if(machine == null)
        {
        	return null;
        }
                    
        if(machine instanceof tileFusionFurnace)
        {
        	return new clientFusionFurnace(player.inventory, (tileFusionFurnace)machine);
        }
            
        return null;
    }
	
}
