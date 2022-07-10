package section10_SingleContinuationafter_99;

import section10_SingleContinuationafter_99_staticTest.TestStatic_100;

public class StaticElements_100 {
	
	public static void main(String[] args) {
		
		//TestStatic_100 test = new TestStatic_100();
		
		
		System.out.println(TestStatic_100.getStaticVariable());
		TestStatic_100.setStaticVariable(30);
		System.out.println(TestStatic_100.getStaticVariable());
	}

}
