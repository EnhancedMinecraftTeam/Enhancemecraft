package com.emc.localization;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-08-30
 * Licensed under nextized cross license - see license.txt for more information
 */

import com.emc.emc;

public class localizationHandler {

	public static void loadLanguages() {
		for (final localization localeFile : localization.values())
				emc.proxy.loadLocalization(localeFile.filename(), localeFile.locale());
	}		
}

