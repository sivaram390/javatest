package polymorphism_Section9;

public class Phone {
	
	private String model;
	
	public Phone(String model) {
		this.model = model;
	}
	
	public void features() {
		System.out.println("Basic Phone");
	}

	public String getModel() {
		return model;
	}
	
	

}
