package section6FlowControl;

public class WhileLoop_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i <= 10) {

			System.out.println(i);
			i++;
		}
		// Checking prime number in while loop
		int primeCheckNumber;
		int n = 1;
		int divisibleCount;

		while (n <= 100) {
			divisibleCount = 0;
			primeCheckNumber = 2;
			while (primeCheckNumber <= n / 2) {
				if (n % primeCheckNumber == 0) {
					divisibleCount++;
					break;
				}
				primeCheckNumber++;
			}
			if (divisibleCount == 0 && n != 1) {
				System.out.print(n + " ");
			}
			n++;
		}

	}

}
