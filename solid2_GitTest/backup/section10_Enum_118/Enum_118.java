package section10_Enum_118;

public class Enum_118 {
	
	public static final int COREJAVA = 1;
	public static final int COLLECTION = 5;
	public static final int JSPSERVELET = 6;
	public static final int GENERICS = 7;
	public static final int MULTITHREADING = 8;
	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enum are collection of predefined constants
		//As a practice provide the ENUMs in capital letters
		
		int learning = COREJAVA;
		
		switch(learning) {
		case COLLECTION:
			System.out.println("Learning collection");
			break;
			
		case COREJAVA:
			System.out.println("Learning core Java");
			break;
		
		}
		
		//To bring the Enum it cannot be assigned directly since type safety is involved
		//Assign the defined enum from the Enum class to the execution class
		EnumTest en = EnumTest.TESTENUM;
		switch(en) {
		case COLLECTION:
			break;
		case COREJAVA:
			break;
		case GENERICS:
			break;
		case JSPSERVELET:
			break;
		case MULTITHREADING:
			break;
		case TESTENUM:
			System.out.println("Testing the enum from other enum class");
			break;
		default:
			break;
		
		
		
		}

	}

}
