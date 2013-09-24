package com.emc.drink;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-17
 * Licensed under nextized cross license - see license.txt for more information
 */

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;

public class PlayerHandler {

	public static final Map<String, PlayerHandler> ALL_PLAYERS = new HashMap<String, PlayerHandler>();
	
	public EntityPlayer player;
	public PlayerStatistics stats;

	public PlayerHandler(EntityPlayer player, PlayerStatistics stats) {
		this.player = player;
		this.stats = stats;
	}

	public static void addPlayer(String username, PlayerHandler player) {
		if(!ALL_PLAYERS.containsKey(username)) {
			ALL_PLAYERS.put(username, player);
		}
	}
	
	public static PlayerHandler getPlayer(String username) {
		return ALL_PLAYERS.get(username);
	}
	
	public PlayerStatistics getStats() {
		return stats;
	}

	public void setDefaults() {
		getStats().level = 20;
		getStats().exhaustion = 0f;
		getStats().saturation = 5f;
		getStats().healhurtTimer = 0;
		getStats().drinkTimer = 0;
		getStats().getPoison().setPoisonedTo(false);
		getStats().getPoison().setPoisonTime(0);
		getStats().timeRemainingToShift = 0;
		getStats().timesDrunkShifting = 0;
	}

	public void setStats(int level, float saturation) {
		getStats().level = level;
		getStats().saturation = saturation;
	}
	
	public void addExhaustion(float f) {
		getStats().addExhaustion(f);
	}
	
}
