package com.nexized.cross.localisation;

import com.nexized.emec.emec;

/*
 * Author: nexized
 * Last changed: 2013-08-13 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

public class localizationHandler {

	public static void loadLanguages() {
			for (final localization localeFile : localization.values())
					emec.proxy.loadLocalization(localeFile.filename(), localeFile.locale());
			}
		
}
