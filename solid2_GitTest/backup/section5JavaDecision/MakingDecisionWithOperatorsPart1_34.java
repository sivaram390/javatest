package section5JavaDecision;

public class MakingDecisionWithOperatorsPart1_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x =7;
		 
		 //here we are using equals operator
		 if(x==5) {
			 System.out.println("The value of X is 5 " );
		 }
		 else {
			 System.out.println("The value of x is not 5");
		 }
		 //if else without braces, works good for single statement but good practice is to use scope for every situation
		 if(x==5) 
			 System.out.println("The value of X is 5 " );
		 
		 else 
			 System.out.println("The value of x is not 5");
		 
		 //Now we are using the not equal to 
		 if(x!=5) {
			 System.out.println("The value of X is 5 " );
		 }
		 else {
			 System.out.println("The value of x is not 5");
		 }
		 
		 
		 

	}

}
