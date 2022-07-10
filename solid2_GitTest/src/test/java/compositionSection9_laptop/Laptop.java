package compositionSection9_laptop;

import compositionSection9_LaptopComponents.GraphicCard;
import compositionSection9_LaptopComponents.Processor;

public class Laptop {
	
	private Float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicCard grpahicCard;
	private String opticalDrive;
	private String keyboard;
	
	public Laptop() {
		
		// Initializing value in default constructor
		
		this.screen = 15.6f;
		//Create an anonymous object for processor and gets assigned to the processor class 
		//The object should be in capital letter
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2tb";
		this.grpahicCard = new GraphicCard();
		this.opticalDrive = "MLT Layer";
		this.keyboard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard grpahicCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.grpahicCard = grpahicCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", grpahicCard=" + grpahicCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public Float getScreen() {
		return screen;
	}

	public Processor getProcessor() {
		return processor;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicCard getGrpahicCard() {
		return grpahicCard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}
	
	
	
	

}
