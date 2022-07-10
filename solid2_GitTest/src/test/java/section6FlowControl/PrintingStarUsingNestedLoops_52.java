package section6FlowControl;

public class PrintingStarUsingNestedLoops_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<=10; i++) {
			for(int j = 0; j<=i; j++) {
				// Instead of printing on next line it will print the elements next to each other
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
