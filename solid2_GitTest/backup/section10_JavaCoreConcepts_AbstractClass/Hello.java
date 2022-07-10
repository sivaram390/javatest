package section10_JavaCoreConcepts_AbstractClass;

import section10_JavaCoreConcepts_AbstractClass_Person.Non_Vegan_91;
import section10_JavaCoreConcepts_AbstractClass_Person.Person;
import section10_JavaCoreConcepts_AbstractClass_Person.Vegan_91;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person john = new Vegan_91();
		john.eat();
		john.speak();
		john.breath();
		john.message();
		
		Person siva = new Non_Vegan_91();
		siva.eat();
		siva.speak();
		
	}

}
