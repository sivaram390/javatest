package section13_Generics_147;

//import section13_Generics_147.Data.Generic;

class Data {
	private Object obj;

	public Data(Object obj) {

		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}

	// Create a generic class and the type would be T
	// Here we don't know what the type contains and it can contain any object
	
}

class Siva<T> {
	private T data;

	// Create a constructor using field
	// if required create getters and setters
	// also create ToString if needed

	public Siva(T data) {

		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Generic [data=" + data + "]";
	}

}


public class GettingStartedWithGenerics_147 {

	public static void main(String[] args) {
		// Making a string out of object since the O
		Data data = new Data("Siva");
		// We need to type cast the data since it will throw typecast error
		// Type mismatch: cannot convert from Object to String
		String name = (String) data.getObj();
		System.out.println(name);
		
		//There is almost no difference between the Object class and the Genreic class before execution
		//Dont forget to create the Generic class outside the Data and GettingStartedWithGEnerics_147 class
		Siva data1 = new Siva("Test String");
		String name1 = (String)data1.getData();
		System.out.println(name1);
		
		
		//Now there are no difference but this type casting will take more memory and the code will not look optimized
		//So to avoid declare the DataType in the generics bracket so avoid type casting
		Siva<String> data2 = new Siva<String>("Test String after Generic");
		String name2 = data2.getData();
		System.out.println(name2);
		
	}

}
