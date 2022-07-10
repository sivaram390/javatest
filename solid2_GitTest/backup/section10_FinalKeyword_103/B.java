package section10_FinalKeyword_103;

public class B extends A {
	
	//final can be assigned to a variable, a method and for a class
	private final int x;
	
	/*
	 * public B() { super(); }
	 */
	
	//with an initialized finalKeyword the Constructor and setter will not work
	//inorder to make constructor work, remove the initialization in final data type
	//Then default constructor also is not needed

	public B(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}
	
	//We are overriding the methods from class A

	@Override
	public void india() {
		// TODO Auto-generated method stub
		System.out.println("Hello India whatsapp");
	}

	

	/*
	 * public void setX(int x) { this.x = x; }
	 * 
	 * 
	 */
	
	

}
