package com.single.responsibilty.principles;

import java.util.Scanner;

public class InputProcessor {
	
	public static Pair process() {
		
		
		//ask the user for any input
		Scanner scanner = new Scanner(System.in);	
		
		//get the given values
		System.out.println("Enter the first number");
		String firstNumber = scanner.nextLine();
		
		System.out.println("Enter the second number");
		String secondNumber = scanner.nextLine();
		
		//instanciate pair and its the container for values
		Pair pair = new Pair(firstNumber , secondNumber);
		scanner.close();
		
		return pair;
	}

}
