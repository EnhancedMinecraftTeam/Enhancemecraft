package com.emc.basic;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-08-30
 * Licensed under nextized cross license - see license.txt for more information
 */

public class emclib {

	// @ Modification Name
	public final static String NAME = "Enhancemecraft";
	// @Modification ID
	public final static String ID = "emc";
	// @Modification Version
	public final static String VERSION = "0.4.0";
	
	public static String getRessource(String unlocalizedName) {
		return ID + ":" + unlocalizedName.substring(5);
	}
	
}
