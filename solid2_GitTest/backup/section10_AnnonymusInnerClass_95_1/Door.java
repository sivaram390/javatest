package section10_AnnonymusInnerClass_95_1;

public class Door {
	
	public boolean isLocked(String key) {
		
		//Inner class is created with in a method
		//The class which is abstract and hidden from outside world
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("qwerty")) {
					System.out.println("The door is unlocked");
					return false;
				}else {
					return true;
				}
			}
		}
		
		return new Lock().isLocked(key);
	}

}
