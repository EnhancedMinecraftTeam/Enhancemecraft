package com.emc.localization;

/*
 * EnhanceMeCraft Basic Modification
 * @Author: nextized
 * @Last changed: 2013-08-30
 * Licensed under nextized cross license - see license.txt for more information
 */

public enum localization {
	US("en_US"); // , GERMAN("de_DE"), SPANISH("es_ES"); , FRENCH("fr_FR");

	private final String locale;
	
	 localization(String locale) {
	        this.locale = locale;
	    }
	 
	 public String filename() {
	        return String.format("/assets/emc/localization/%s.xml", locale);
	    }

	    public String locale() {
	        return locale;
	    }
}
