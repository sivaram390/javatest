package encapsulation_Section9_Person;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		System.out.println(person);
		System.out.println(person.getAge());
		
		Person person2 = new Person("Devi", 36, "Female");
		person2.setAge(56);
		System.out.println(person2);

	}

}
