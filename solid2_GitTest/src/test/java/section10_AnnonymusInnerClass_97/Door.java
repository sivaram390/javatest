package section10_AnnonymusInnerClass_97;

abstract class Lock{
	
	public abstract boolean isUnlocked (String keyCode); 
}

public class Door {
	
	Lock lock = new Lock() {
		
		//Add the anonymous inner class
		@Override
		public boolean isUnlocked(String keyCode) {
			// TODO Auto-generated method stub
			if(keyCode.equals("qwerty")) {
				return true;
			}else {
				return false;
			}
			
		}
		
	};
	
	//add a getter method to get the Lock object

	public Lock getLock() {
		return lock;
	}
	
	

}
