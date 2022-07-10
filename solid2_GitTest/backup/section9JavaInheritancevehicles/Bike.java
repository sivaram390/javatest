package section9JavaInheritancevehicles;

import section9JavaInheritancevehicle.Vehicle;

public class Bike extends Vehicle{
	
	private String handle;

	public Bike() {
		super();
		this.handle = "Short";	
	}
	
	//1-1 Correspondence should be present when trying to inherit the parameters form the Parent(Super Class)

	public Bike(String handle,String engine, int wheels, int seat, int fuelTank, String lights) {
		super(engine, wheels, seat, fuelTank, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [engine=" + engine + ", wheels=" + wheels + ", seat=" + seat + ", fuelTank=" + fuelTank
				+ ", lights=" + lights + ", getHandle()=" + getHandle() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeat()=" + getSeat() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + "]";
	}
	
	// 

}
