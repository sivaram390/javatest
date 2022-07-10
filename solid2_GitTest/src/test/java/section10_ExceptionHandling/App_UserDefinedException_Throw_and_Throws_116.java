package section10_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App_UserDefinedException_Throw_and_Throws_116 {

	public static void someMethod() throws FileNotFoundException {
		
		FileReader in = new FileReader("sample.txt");
		System.out.println("This is inside the someMethod");
		
	}

	public static void case2(int x, int y) {
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		App_UserDefinedException_Throw_and_Throws_116 app = new App_UserDefinedException_Throw_and_Throws_116();
		someMethod();

	}

}
