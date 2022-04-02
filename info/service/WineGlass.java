package info.service;

public class WineGlass implements Glass {

	public String orderedglasses;
	
	@Override
	public void makeglass(int quantity) {
		// TODO Auto-generated method stub
		orderedglasses =" Wine Glasses prepared with the quantity of "+quantity;
	}

	@Override
	public String Shipglass() {
		// TODO Auto-generated method stub
		return orderedglasses;
	}

}
