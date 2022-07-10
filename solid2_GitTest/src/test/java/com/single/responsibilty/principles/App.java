package com.single.responsibilty.principles;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the applicaiton");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		String firstNumber = scanner.nextLine();
		
		System.out.println("Enter the second number");
		String secondNumber = scanner.nextLine();
		
		scanner.close();
		
		int firstInteger= 0;
		int secondInteger = 0;
		
		if(firstNumber == null) {
			System.out.println("The FirstNumber is not valid ");
			return;
		}		
		try {
			firstInteger = Integer.parseInt(firstNumber);
			
		}catch(NumberFormatException nfe){
			System.out.println("The FirstNumber is not valid ");
			return;
		}
		
		if(secondNumber == null) {
			System.out.println("The SecondNumber is not valid ");
			return;
		}		
		try {
			secondInteger = Integer.parseInt(secondNumber);
			
		}catch(NumberFormatException nfe){
			System.out.println("The SecondNumber is not valid ");
			return;
		}
		
		int result = firstInteger + secondInteger;
		
		System.out.println("The Result is "+result);
		System.out.println("End of the application");
		
		

	}

}
