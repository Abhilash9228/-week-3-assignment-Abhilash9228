package info.service;

public class ChampagneGlass implements Glass {
   
	public String orderedglasses;
	
	@Override
	public void makeglass(int quantity) {
		// TODO Auto-generated method stub
		orderedglasses=" Champagne Glasses of quantity "+quantity;
	}

	@Override
	public String Shipglass() {
		// TODO Auto-generated method stub
		return orderedglasses;
	}

}
