package section9JavaInheritancedemo;

import section9JavaInheritancevehicles.Bike;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike bike = new Bike("Long", "Petrol", 4, 4, 20, "LED");
		bike.getHandle();
		bike.engine = "Petrol";

		System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());
		System.out.println(bike.getFuelTank());
		System.out.println(bike.getSeat());
		System.out.println(bike.getWheels());
		System.out.println(bike.getLights());
		
		//When we are directly trying to print the Object 2 string of the object will be called
		//The two String has been created in the child class 'Bike'
		System.out.println(bike);
		
		

	}

}
