package com.emc.proxy;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class commonProxy {

	/*
	 * Localization (new method to load it in the commonProxy instance)	
	 */
	public void loadLocalization(String filename, String locale) {
        LanguageRegistry.instance().loadLocalization(filename, locale, true);
    }
	
	/*
	 * Localization (new method to load it in the commonProxy instance)
	 */
	public String getStringLocalization(String key) {
        return LanguageRegistry.instance().getStringLocalization(key);
    }
	
	/*
	 * Localization (new method to load it in the commonProxy instance)
	 */
	public void addStringLocalization(String key, String lang, String value) {
        LanguageRegistry.instance().addStringLocalization(key, lang, value);
    }
	
	/*
	 * Armor Renderer (disabled on the server)
	 */
	public int addArmor(String armor) { return 0; }

	public void RegisterRenderers() {
		
	}

	public void registerServerTickHandler() {		
	}
	
}
