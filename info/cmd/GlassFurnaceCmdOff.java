package info.cmd;

public class GlassFurnaceCmdOff implements Command {
    GlassFurnace FurnaceOff;
    
    
	public GlassFurnaceCmdOff(GlassFurnace FurnaceOff) {
		super();
		this.FurnaceOff = FurnaceOff;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		FurnaceOff.off();
	}

	
	
}
