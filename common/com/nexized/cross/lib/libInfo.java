package com.nexized.cross.lib;

public class libInfo {

	// @Lib Information
	public final static String ID = "crosslib";
	public final static int updatedID = 1;
	
	/*
	 * This void return a resource compatible string
	 */
	public static String getResourcePath(String entityUnlocalizedName) {
		return ID + ":" + entityUnlocalizedName.substring(5);
	}
	
	
}
