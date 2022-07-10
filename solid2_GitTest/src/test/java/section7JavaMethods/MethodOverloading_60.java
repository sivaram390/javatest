package section7JavaMethods;

public class MethodOverloading_60 {
	
	public static int sum(int x, int y) {
		System.out.println("Adding two integers : ");
		return x+y;
	}
	
	public static float sum(int x, float y) {
		System.out.println("Adding one int and one float : ");
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2+3 : " + sum(2, 3));
		System.out.println("2+3.5 : " + sum(2, 3.5f));

	}

}
