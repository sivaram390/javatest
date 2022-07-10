package section3JavaGettingStarted;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class PrimitiveDatatypes_FloatandDouble_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 9/2;
		float value2 = 10f/6f;
		// f will assume that the value is on float
		
		double value3 = 10d/6d;
		// d will assume that the value is on double
		
		System.out.println("Value 1 = " + value1);
		System.out.println("Value 2 = " + value2 +" : Chek the level of precision in float");
		System.out.println("Value 3 = " + value3 +" : Chek the level of precision in double");
		
		
		
		//The value of integer is whole
		//Float will have a precision
		//Double will have the same precision as float
		//Using double will increase the speed of execution than float
		
		int marker = 512;
		double percentagecalc = marker *0.46;
		
		System.out.println("Percentage of Marker is : "+percentagecalc + "%");
		
		

	}

}
