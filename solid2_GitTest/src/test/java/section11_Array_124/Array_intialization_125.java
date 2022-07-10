package section11_Array_124;

public class Array_intialization_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array is used to store multiple values for one datatype
		//Example
		
		String [] names = {"Siva","Ram","Gurusamy","Valli"};
		//Instead of creating variables these names are stored in one adjecnt memory location in Java
		System.out.println("This shows the memory location of the variabel with gibberish text, numbers and symbols : " + names);
		
		int[] arrayVariables;
		//means this array is restricted to use only 10 variables 
		arrayVariables = new int[10];
		arrayVariables[3]=10;
		System.out.println("The allocated variable to the 3rd index of array "+arrayVariables[3]);
		
		//otherwise simply doesn't initialize any finite value and provide the necessary input
		String [] names1 = {"Siva","Ram","Gurusamy","Valli"};
		System.out.println(names1[3] + " The name valli will be printed here, since its from the 3rd index such as : 0-1-2-3");
		
		//Printing the array values using for loop
		
		for(int i=0;i<4;i++) {
			System.out.println(names1[i] + "  --- is Array of : "+" : " + i);
				
		}
		
		//always use lesser than symbol and others will create array bound exception
		for(int i=0;i<names1.length;i++) {
			System.out.println(names1[i] + "  --- is Array of : "+" : " + i);
				
		}
		
		//but if we are not sure about the size of array just use the length method 
		
		System.out.println(names1.length+" if its showing 4 means there are like 5 elements in the array");
		
		//using for each loop
		//declare a local variable in the foreach's scope
		for(String name : names1) {
			System.out.println(name);
		}
		
		

	}

}
