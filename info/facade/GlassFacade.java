package info.facade;

import info.service.ChampagneGlass;
import info.service.Glass;
import info.service.WineGlass;

public class GlassFacade {
	
	public static String Shipglass(GlassType glassType) {
		
		switch (glassType) {
		case Champagne:
			Glass champagneGlass = new ChampagneGlass();
			champagneGlass.makeglass(10);
			return champagneGlass.Shipglass();
			
		case Wine:
			Glass wineGlass = new WineGlass();
			wineGlass.makeglass(10);
			return wineGlass.Shipglass();
		
		}
		return null;
		
	}

}
