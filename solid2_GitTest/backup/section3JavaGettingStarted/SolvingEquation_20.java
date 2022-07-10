package section3JavaGettingStarted;

public class SolvingEquation_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a+b the whole square = a square + 2ab + b square
		
		//pesudo code
		
//		a = int
//		b= float
//		
//		value = ?? need to check
//		then what we have to typecast
		
		int a = 25;
		float b = 45.67f;
		
		double value = a*a + 2*(a+b) + b*b;
		int value1 = (int)(a*a + 2*(a+b) + b*b);
		
		System.out.println("Value of the equation is : "+value);
		System.out.println("The round off value of the equation is : "+value1);
		
		//let us extract the value and avoid decimals by type casting
		
		
		
		
				

	}

}
