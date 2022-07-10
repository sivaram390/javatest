package section5JavaDecision;

public class MakingDecisionWithOperatorPart3_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x=true;
		boolean y = false;
		
		//Only if all the condition are True it will be considered as TRUE
		if(x && y) {
			System.out.println("The condition is TRUE");
		}
		else {
			System.out.println("The condition is FALSE");
		}
		
		//For or Operand the condition will be TRUE if just one condition is TRUE
		if(x || y) {
			System.out.println("The condition is TRUE");
		}
		else {
			System.out.println("The condition is FALSE");
		}
		int a =5;
		int b = 10;
		
		if((a<b) && (a==b)) {
			System.out.println("The condition is TRUE");
		}
		else {
			System.out.println("The condition is FALSE");
		}
		
		if(!(a<b) && (a==b)) {
			System.out.println("The condition is TRUE");
		}
		else {
			System.out.println("The condition is FALSE");
		}
		
		if((a<b) || (a==b)) {
			System.out.println("The condition is TRUE");
		}
		else {
			System.out.println("The condition is FALSE");
		}
		
		if(!(a<b) || (a==b)) {
			System.out.println("The condition is TRUE");
		}
		else {
			System.out.println("The condition is FALSE");
		}
		
		// Real life scenario example with marraige 
		
		int ageforBoys = 21;
		int ageforGirls = 17;
		
		if((ageforBoys >=21) && (ageforGirls >=18)) {
			System.out.println("Leagal age to get married");
		}
		else {
			System.out.println("Wait for sometime until 18");
		}


	}

}
