package packVehicles;

import java.util.List;

public class Bike extends Vehicle{
	
	private Wheel rodaDavantera;
	private Wheel rodaTrasera;
	
	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void afegirRodes(Wheel frontWheels, Wheel backWheels) {
		rodaDavantera = frontWheels;
		rodaTrasera = backWheels;
	}
	
}
