package compositionSection9_LaptopComponents;

public class GraphicCard {
	
	private String brand;
	private int series;
	private String memory;
	
	public GraphicCard() {
		
		//Initializing value in default constructor
		
		this.brand = "Nvidia";
		this.series = 3070;
		this.memory = "8gb";
	}

	public GraphicCard(String brand, int series, String memory) {
		super();
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "GraphicCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

	public String getBrand() {
		return brand;
	}

	public int getSeries() {
		return series;
	}

	public String getMemory() {
		return memory;
	}
	
	
	
	

}
