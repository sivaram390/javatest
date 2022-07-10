package section6FlowControl;

public class Loops_Revisted_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// loops are more than one single loop or one single variable
		
		for(int i=1,j=1; i<=10 && j<=10 ;i++,j++) {
			j++;
			System.out.println("i Equals : "+i+" j Equals : "+j);
			
		}
		
		for(int i=1,j=1; i<=10 || j<=10 ;i++,j++) {
			j++;
			System.out.println("i Equals : "+i+" j Equals : "+j);
			
		}
	
	

	}

}
