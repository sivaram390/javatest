package section6FlowControl;

public class ForLoop_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop contains initialization, condition and incremental
		// Forward loop
		for (int i = 0; i <= 10; i++) {
			// there are no restriction for statements in the loop
			System.out.println("The value of i : " + i);
			// System.out.println(i);
		}

		// Reverse loop
		for (int i = 1000; i >= 950; i--) {
			System.out.println(i);
		}

		// Checking prime number

		int i, m = 0, flag = 0;
		int n = 10;// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else

	}

}
