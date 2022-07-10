package section10_JavaCoreConcepts_AbstractClass_Person;

public abstract class Person implements MultipleInteritance_92_IsAlive, MultipleInteritance_92_LiveLife {
	
	// In abstract class we can have properties variables and moreover methods for the abstract class
	
	public void speak() {
		System.out.println("The person is speaking ");
	}
	
	@Override
	public void breath() {
		System.out.println("Breath until you die ");
	}
	
	@Override
	public void message() {
		System.out.println("Breath until you die ");
	}
	
	public abstract void eat();

}
