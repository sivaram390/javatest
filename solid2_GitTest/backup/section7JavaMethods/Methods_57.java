package section7JavaMethods;

public class Methods_57 {

	public static void loop1() {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		// System.out.println("***********************");
	}

	public static void loop2() {
		int i = 1;
		while (i < 20) {
			System.out.println(i);
			i++;

		}
	}

	// Parametrization
	public static void dynamicLoop(int step, int finalValue) {

		while (step < 20) {
			System.out.println(step);
			step++;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		loop1();
//		System.out.println("***********************");
//		loop2();
//		System.out.println("***********************");
		dynamicLoop(5, 20);

	}

}
