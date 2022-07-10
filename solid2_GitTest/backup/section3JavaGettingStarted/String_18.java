package section3JavaGettingStarted;

public class String_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is nothing but a set of characters 
		String var = "Hello World";
		String var1 = "Hello World \u00BB";
		System.out.println(var);
		System.out.println(var1);
		//if the unicode is not working mostly its due to IDE
		
		//String is not capable of storing integer values 
		String var2 = "10";
		String var3 = "30";
		System.out.println(var2+var3);
		
		//Proper way to declare a string 
		String var4 = new String ("Proper way of declaration of String");
		System.out.println(var4);
		
		

		

	}

}
