package com.emec.zero.conf;

/*
 * Author: nexized
 * Last changed: 2013-08-22 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.emec.zero.zero;

public class localizationHandler {

	public static void loadLanguages() {
		for (final localization localeFile : localization.values())
				zero.proxy.loadLocalization(localeFile.filename(), localeFile.locale());
		}
	
}
