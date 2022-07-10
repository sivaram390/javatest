package section10_FinalKeyword_103;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj1 = new B(20);
		System.out.println(obj1.getX());
		//obj1.setX(20);
		//System.out.println(obj1.getX());
		//This is from overridden class B
		obj1.india();
		//This is from base class A and which is getting accessed from class B
		obj1.usa();

	}

}
