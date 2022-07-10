package compositionSection9_hello;

import compositionSection9_LaptopComponents.GraphicCard;
import compositionSection9_LaptopComponents.Processor;
import compositionSection9_laptop.Laptop;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Composition can be really be helpful to depict in real life scenarios
		Laptop lap = new Laptop();
		System.out.println(lap.getProcessor().getBrand());
		
		Processor processor = new Processor("Intel", "7200u", 7, 4, 6, "6mb", "2.5ghz", "2.5ghz", "3.1ghz");
		GraphicCard gCard = new GraphicCard("Nvidia", 3070, "8gb");
		Laptop gamingLaptop = new Laptop(26, processor, "DDR4", "2tb", gCard, null, "backLit");
		
		System.out.println(gamingLaptop);
		

	}

}
