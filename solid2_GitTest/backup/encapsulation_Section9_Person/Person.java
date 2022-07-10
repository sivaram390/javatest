package encapsulation_Section9_Person;

public class Person {

	public String name = "Siva";
	public int age = 36;
	public String gender = "Male";

	// for encapsulation always make the access modifiers as private and then create
	// a default constructor then a constructor to initialize

	public Person() {
		super();
		this.name = "Siva";
		this.age = 36;
		this.gender = "Male";
	}
	
	//intialize the values inside the parameterized constructor

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//Use setter to modify any given field to outside world, here let us use name for headers
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public boolean setAge(int age) {
		if(age >0 && age<=100) {
		this.age = age;
		return true;
		}
		return false;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

}
