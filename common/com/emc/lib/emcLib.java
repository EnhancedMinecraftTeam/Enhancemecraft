package com.emc.lib;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-10-08
 * Licensed under nextized cross license - see license.txt for more information
 */

public class emcLib {

	// @ Modification Name
	public final static String NAME = "Enhancemecraft";
	// @Modification ID
	public final static String ID = "emc";
	// @Modification Version
	public final static String VERSION = "0.3.6.1";
	// @Modification Build
	public final static int BUILD = 361;
	
	public static String getRessource(String unlocalizedName) {
		return ID + ":" + unlocalizedName.substring(5);
	}
	
}
