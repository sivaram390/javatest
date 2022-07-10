package section10_SingleContinuationafter_99;

import java.util.Scanner;

public class UserInput_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Your age is : " + age);
		sc.close();

	}

}
