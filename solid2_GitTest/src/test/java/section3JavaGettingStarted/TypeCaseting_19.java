package section3JavaGettingStarted;

public class TypeCaseting_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is called as implicit typecasting where it will get converted automatically
		short x =5;
		int y=x;
		System.out.println(x);
		
		//but if we do vice verse is called as Explicit typecasting 
		int y1 =5;
		short y2=(short)y1;
		System.out.println(x);
		
		//but if we do vice verse is called as Explicit typecasting and that can be done for short also
		int y3 =5;
		short y4=(byte)y3;
		System.out.println(x);
		
		//Explicit type casting 
		double x1 = 10.0d;
		float x2 = 20.0f;
		float x3 = (float)x1;
		System.out.println(x3);
		
		//Explicit type casting with loss of precision
		double x4 = 10.123456789d;
		float x5 = 20.0f;
		float x6 = (float)x4;
		System.out.println(x4);
		
		//String to int cannot be typecasted since they are not compatible
		
		String a = "10";
		//int x = a;
		
		//Best practice is to avoid typecasting as much as possible and implicit typecasting is much preffered than explicit typecasting
		
		
		
		

	}

}
