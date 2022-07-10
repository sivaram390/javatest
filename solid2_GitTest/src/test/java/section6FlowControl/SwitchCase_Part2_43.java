package section6FlowControl;

public class SwitchCase_Part2_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char x = 'a';

		// switch will be based on the specific entity
		// for switch only int, enum, String and char are permitted
		// switch case characters are case sensitive 
		switch (x) {
		case 'a':
		case 'A':
			//Switches can define more than one mode like an or statement 
			System.out.println("The value of x is 1");
			break;
		case 'b':
			System.out.println("The value of x is 2");
			break;
		case 'c':
			System.out.println("The value of x is 3");
			break;
		case 'd':
			System.out.println("The value of x is 4");
			break;
		case 'e':
			System.out.println("The value of x is 5");
			break;

		default:
			System.out.println("The value can be any number");
			break;

		}

	}

}
