package section5JavaDecision;

public class MakingDecisionWithOperatorPart2_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A dead code warning will appear if the the condition is from constants
		if(4<5) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		// Dead code warning will disappear if we use variables to assign
		int x=4, y=5;
		if(x<y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		int a=5, b=5;
		if(a<=b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		int c=5, d=5;
		if(c>=d) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}


	}

}
