package section10_ExceptionHandling;

public class App_Exception_intro_111 {

	public void case1(int x, int y) {
		// here in the first case the exception is handled by finding out the
		// arithematic issue
		if (y != 0) {
			System.out.println("The value of Case 1 is : " + x / y);
		} else {
			System.out.println("The Y is zero");
		}
	}

	public void case2(int x, int y) {
		// here let the exception be handled using Try/Catch block
		try {
			System.out.println("The value of Case2 is : " + x / y);
		} catch (Exception e) {
			System.out.println("The value of Y is 0");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App_Exception_intro_111 app = new App_Exception_intro_111();
		app.case1(20, 0);
		app.case2(20, 0);

	}

}
