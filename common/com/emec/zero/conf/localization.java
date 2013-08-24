package com.emec.zero.conf;

/*
 * Author: nexized
 * Last changed: 2013-08-24 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

public enum localization {
	US("en_US"); // , GERMAN("de_DE") , FRENCH("fr_FR");

	private final String locale;
	
	 localization(String locale) {
	        this.locale = locale;
	    }
	 
	 public String filename() {
	        return String.format("/assets/emecZero/localization/%s.xml", locale);
	    }

	    public String locale() {
	        return locale;
	    }
}
