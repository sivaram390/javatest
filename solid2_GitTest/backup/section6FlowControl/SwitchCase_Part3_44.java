package section6FlowControl;

public class SwitchCase_Part3_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "DEVI";

		// switch will be based on the specific entity
		// for switch only int, enum, String and char are permitted
		// switch case characters are case sensitive 
		switch (x.toLowerCase()) {
		case "Siva":
		case "siva":
			//Switches can define more than one mode like an or statement 
			System.out.println("The value of x is 1");
			break;
		case "devi":
			System.out.println("The value of x is 2");
			break;
		case "shree":
			System.out.println("The value of x is 3");
			break;
		case "valli":
			System.out.println("The value of x is 4");
			break;
		case "gurusamy":
			System.out.println("The value of x is 5");
			break;

		default:
			System.out.println("The value can be any number");
			break;

		}

	

	}

}
