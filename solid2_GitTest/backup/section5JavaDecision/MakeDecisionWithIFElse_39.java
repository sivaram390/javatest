package section5JavaDecision;

public class MakeDecisionWithIFElse_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;

		//if (x == 5)
		//	;
		// should not put semicolon after the if because it will be treated as a
		// statement
		if (x == 5)

		{
			System.out.println("The condition is True");

		} else if (x == 10) {
			System.out.println("Else its not true");
		}
		
		int a=3;
	    a=a++;
	    System.out.println("Post-Increment a: " +a);
	 
	    a=++a;
	    System.out.println("Pre-Increment a: "+a );
	 
	    a=a--;
	    System.out.println("Post-Decrement a: " +a);
	 
	    a=--a;
	    System.out.println("Pre-Decrement a: "+a );
	    
	}

}
