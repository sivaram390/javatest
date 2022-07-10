package compositionSection9_LaptopComponents;

public class Processor {

	private String brand;
	private String series;
	private int generations;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;

	public Processor() {

		// Initializing value in default constructor

		this.brand = "Intel";
		this.series = "i5 7200u";
		this.generations = 7;
		this.cores = 8;
		this.threads = 4;
		this.cacheMemory = "3mb";
		this.frequency = "2.5ghz";
		this.minFrequency = "2.5ghz";
		this.maxFrequency = "3.1ghz";
	}

	public Processor(String brand, String series, int generations, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		super();
		this.brand = brand;
		this.series = series;
		this.generations = generations;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generations=" + generations + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGenerations() {
		return generations;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFrequency() {
		return minFrequency;
	}

	public String getMaxFrequency() {
		return maxFrequency;
	}
	
	

}
