package section10_Strings_119;

public class StringTest_119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "Study";
		String y = "easy";
		//String z = x+y;
		//use concat instead + operator for string as a practice even if + operator does the same operation
		String z = x.concat(y);
		
		
		//To compare a string always use the equals method not ==, this is for arithmetic operation
		if(z.equals("Studyeasy")) {
			System.out.println("The statement is Studyeasy");
		}else {
			System.out.println("The statement is not Studyeasy");
		}

	}

}
