package section7JavaMethods;

public class MethodOverloading_59 {
	
	
	//Method overloading can contain the same name but the signature needs to be different
	//can be any datatype of the method but the signature should be unique
	
	public static double areaofRect(double length, double width) {
		return length*width;
		
	}
	
	public static double areaofRect(double side) {
		return side*side;
		
	}
	
	public static int areaofRect(int side) {
		return side*side;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangel is : " + areaofRect(20d, 30.8d));
		System.out.println("Area of square is : " + areaofRect(20.4d));
		System.out.println("Area of square is : " + areaofRect(20));
		
	}

}
