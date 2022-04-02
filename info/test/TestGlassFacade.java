package info.test;

import info.facade.GlassFacade;
import info.facade.GlassType;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TestGlassFacade {
	
	GlassFacade glassFacade = new GlassFacade();
	GlassType glassType;
	
	@Test
	public void testOrderGlassWithValidGlassType() {
	 	
		assertNotNull(glassFacade.Shipglass(GlassType.Champagne));
	}

	@Test
	public void testOrderGlassWithInValidGlassType() {
	 	try {
	 		assertNull(glassFacade.Shipglass(null));
	 	}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	

}
