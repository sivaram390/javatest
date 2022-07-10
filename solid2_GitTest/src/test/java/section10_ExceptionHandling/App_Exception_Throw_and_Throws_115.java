package section10_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App_Exception_Throw_and_Throws_115 {

	// We can throw multiple exception by simply adding commas

	public static void someMethod() throws Exception, FileNotFoundException, ArithmeticException {
		int x = 1;

		switch (x) {

		case 1:
			throw new FileNotFoundException();
		case 2:
			throw new Exception();
			default:
				//throw new UserDefinedException();

		}

	}

	public static void case2(int x, int y) {

	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try {
			someMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Catch block of main method");
			e.printStackTrace();
		}

	}

}
