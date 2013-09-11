package com.emc.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class playerTools {

	// @Name of the current player
	@SideOnly(Side.CLIENT)
	// public static String getPlayerName() {
		// return ClientProxy.getPlayer().username;
	// }
	
	// @Speed of the current player
	public static int getMovementStat(EntityPlayer entityplayer) {
		double s = entityplayer.posX;
		double s1 = entityplayer.posY;
		double s2 = entityplayer.posZ;
		double d = s - entityplayer.prevPosX;
		double d1 = s1 - entityplayer.prevPosY;
		double d2 = s2 - entityplayer.prevPosZ;
		return Math.round(MathHelper.sqrt_double(d * d + d1 * d1 + d2 * d2) * 100F);
	}
	
	// @Biome where the player currently is in
	// public static String getCurrentBiome(EntityPlayer entityplayer) {
		// if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
			// if(PacketHandler.isRemote == true) {
			//	return PacketPlayerPos.currentBiome;
			// } else {
			//	return entityplayer.worldObj.getWorldChunkManager().getBiomeGenAt((int) entityplayer.posX, (int) entityplayer.posZ).biomeName;
			// }
		// } else {
			// return entityplayer.worldObj.getWorldChunkManager().getBiomeGenAt((int) entityplayer.posX, (int) entityplayer.posZ).biomeName;
		// }
	// }
	
	
}
