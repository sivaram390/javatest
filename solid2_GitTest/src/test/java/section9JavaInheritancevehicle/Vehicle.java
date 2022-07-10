package section9JavaInheritancevehicle;

public class Vehicle {

	public String engine;
	public int wheels;
	public int seat;
	public int fuelTank;
	public String lights;

	// Default construtor
	public Vehicle() {
		// super();
		this.engine = "Petrol";
		this.wheels = 4;
		this.seat = 4;
		this.fuelTank = 35;
		this.lights = "Led";
	}
	

	public Vehicle(String engine, int wheels, int seat, int fuelTank, String lights) {

		this.engine = engine;
		this.wheels = wheels;
		this.seat = seat;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeat() {
		return seat;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}

}
