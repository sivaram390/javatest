package section10_ExceptionHandling;

public class Multiple_Exception_Try_Catch_blocks_112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2;
		try {
			System.out.println("This statement will get executed");
			//there are no partial execution will be carried away
			System.out.println("This statement might get executed "+ x/2);
			System.out.println("This statement will not get executed if divided by 0");
			
		}catch (ArithmeticException a) {
			//a.printStackTrace();
			System.out.println("Arithematic exception occured ");
		}	
		
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception insde the block");
		}
		finally {
			//Catch blocks should be kept befor finally block
			//if the finally block is placed it will execute no matter what eventually 
			//If any statement to be executed irrelevant of any try and catch scenario should be kept in finally block
			System.out.println("Checking if this block is getting executed");
		}

	}

}
