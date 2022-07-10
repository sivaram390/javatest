package section10_JavaCoreConcepts_InterfacetoErrorHandling.hello;

import section10_JavaCoreConcepts_InterfacetoErrorHandling.hello.phone.Iphone_Interface_90;
import section10_JavaCoreConcepts_InterfacetoErrorHandling.hello.phone.OnePlus5_Interface_90;
import section10_JavaCoreConcepts_InterfacetoErrorHandling.hello.phone.Phone;

public class Hello_Interface_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Phone_Interface_90 phone = new Phone_Interface_90(); int processor =
		 * phone.processor(); System.out.println(processor);
		 */
		
		//Interfaces are nothing but like rules for other classes and to use defined methods and datatypes
		//this restricts other team members to alter the methods
		
		Phone android = new OnePlus5_Interface_90();
		System.out.println("Processor of Android : " + android.processor());
		
		Phone ios = new Iphone_Interface_90();
		System.out.println("Processor of iOS : "+ios.processor());
		System.out.println("Space in GB of iOS : "+ios.spaceInGB() );

	}

}
