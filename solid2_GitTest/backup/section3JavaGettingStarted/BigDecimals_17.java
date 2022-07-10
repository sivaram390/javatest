package section3JavaGettingStarted;

import java.math.BigDecimal;

public class BigDecimals_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 1.0d;
		double y = 2.55d;
		System.out.println(x+y);
		//when it comes to Java rounding off is done automatically and perfectly
		
		//BigDecimal will be used for ultra Precision
		
		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.05);
		System.out.println(d1.add(d2));
		
		//To reduce more numbers of the decimals use the parameter of big decimals as String
		
		BigDecimal d3 = new BigDecimal("1.05");
		BigDecimal d4 = new BigDecimal("2.05");
		System.out.println(d3.add(d4));
		
		

	}

}
