package section7JavaMethods;

public class ParametersandReturnType_58 {
	
	public static void areaOfRectangle(double length, double width) {
		System.out.println(length*width);
	}
	
	public static double areaOfRectangler(double length, double width) {
		return length*width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unless until if a method is returning any value only we will be able to print the method inside a print statement
		System.out.println("The area of rectangle is length as 5 and width as 10 : " );
		areaOfRectangle(5, 10);
		
		System.out.println("The area of rectangler is length as 9 and width as 10 : " + areaOfRectangler(9, 10) );
		
		//a return type can be only displayed in a statement and will not be executed as standalone
		double rectArea = areaOfRectangler(20, 30);
		System.out.println(rectArea);

	}

}
