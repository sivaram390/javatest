package section10_FinalKeyword_103;

//public final class A
//If a class is marked as final we will not be able to access the class or create a subclass for this
public class A {
	
	public void india() {
		System.out.println("India is Amazing");
	}
	
	//this final entity cannot be overridden
	public final void usa() {
		System.out.println("USA is fantastic");
	}

}
