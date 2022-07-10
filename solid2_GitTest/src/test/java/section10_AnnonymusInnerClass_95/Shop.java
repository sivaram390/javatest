package section10_AnnonymusInnerClass_95;

import section10_AnnonymusInnerClass_95_1.Door;

public class Shop {
	
	public static void main(String[] args) {
		
		//Door door = new Door();
		System.out.println(new Door().isLocked("Test"));
		
		//This arg is for getting the door command in command line argument in the Run configuration
		//Anonymous object has been created intead of using an assigned object for a class
		//with the help of anonymous object we can directly access the memory
		
		if(new Door().isLocked(args[0])) {
			System.out.println("The door is closed please visit again");
		}else {
			System.out.println("Welcome to our shop");
		}
		
		System.out.println(args[1] + " : - Arguments are passed inside the run configuration");
		System.out.println(args[2] + " : - Arguments are passed inside the run configuration");
	}

}
