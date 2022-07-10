package section9JavaOops;

public class GetterandSetter_66 {

	private String door;
	private String engine;
	private String driver;
	private int speed;
	
	//Constructor is a method and exactly the name of the method should be as same as the name of the class
	
	public GetterandSetter_66() {
		door = "Opened" ;
		engine = "Running";
		driver = "Present";
		speed = 0;
	}
	
	//Constructor can be overloaded and its possibe like other typical overloading of methods
	
	public GetterandSetter_66(String door, String engine, String driver, int speed) {
		super();
		this.door = door;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	
	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public String run() {
		// in String the equals method is used to compare two strings
		if (door.equals("closed") && engine.equals("on") && driver.equals("in") && speed > 0) {
			return "Car is Running";
		} else {
			return "Car is not Running";
		}
	}

}
