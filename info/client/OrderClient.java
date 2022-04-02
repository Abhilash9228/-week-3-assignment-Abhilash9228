package info.client;

import info.cmd.GlassFurnace;
import info.cmd.GlassFurnaceCmdOff;
import info.cmd.GlassFurnaceCmdOn;
import info.cmd.RemoteControl;
import info.facade.GlassFacade;
import info.facade.GlassType;

public class OrderClient {
	
	public static void main(String[] args) {
				
		//Facade pattern to order Glasses
		System.out.println(GlassFacade.Shipglass(GlassType.Champagne));
		System.out.println(GlassFacade.Shipglass(GlassType.Wine));
		
		//Command pattern  to on/off the oven 
		RemoteControl control = new RemoteControl();
		GlassFurnace glassFurnace = new GlassFurnace();
		control.setCommand(new GlassFurnaceCmdOff(glassFurnace));
		control.pressButton();
		
		control.setCommand(new GlassFurnaceCmdOn(glassFurnace));
		control.pressButton();
	}

}
