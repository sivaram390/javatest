package section6FlowControl;

public class NestedLoops_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested loops are nothing but loops inside loops
		//In Nested loops the complete execution of inner loop is the single iteration of outer loop
//		The value of i and j : 0 0 The 0 is from the outer loop and the next number sequence is from inner loop
//		The value of i and j : 0 1
//		The value of i and j : 0 2
//		The value of i and j : 0 3
//		The value of i and j : 0 4
//		The value of i and j : 0 5
//		The value of i and j : 0 6
//		The value of i and j : 0 7
//		The value of i and j : 0 8
//		The value of i and j : 0 9
//		The value of i and j : 0 10
//		***************************
		
		
		for (int i=0; i<=10;i++) {
			for (int j=0; j<=10;j++) {
				System.out.println("The value of i and j : " + i + " " + j);
			}
			System.out.println("***************************");
		}

	}

}
