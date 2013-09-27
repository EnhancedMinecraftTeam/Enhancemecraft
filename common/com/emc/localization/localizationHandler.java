package com.emc.localization;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-09-27
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.emc;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class localizationHandler {

	public static void loadLanguages() {
		for (final localization localeFile : localization.values())
				emc.proxy.loadLocalization(localeFile.filename(), localeFile.locale());
	}
	
	public static void addTabLocalization(String tab, String local) {
    	LanguageRegistry.instance().addStringLocalization("itemGroup." + tab, local);
    }
    
	
}

