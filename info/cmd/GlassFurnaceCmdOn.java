package info.cmd;

public class GlassFurnaceCmdOn implements Command {
	GlassFurnace FurnaceOn;

	public GlassFurnaceCmdOn(GlassFurnace FurnaceOn) {
		super();
		this.FurnaceOn = FurnaceOn;
	}

	@Override
	public void execute() {
		FurnaceOn.on();
	}
}
