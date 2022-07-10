package section10_InnerClass_93_1;



public class Door {
	
	private Lock lock;
	
	//Create a constructor for the class door
	//Create a default value for lock as true
	public Door() {
		lock = new Lock(true);
		
	}
	
	
	
	public Lock getLock() {
		return lock;
	}



	public void shopStatus() {
		if (lock.isLock()) {
			System.out.println("The shop is closed please visit later");
		}else {
			System.out.println("The shop is opened please visit");
		}
		
	}
	
	public class Lock {
		private boolean lock;
		
		//Create a constructor to access the variable

		public Lock(boolean lock) {
			
			this.lock = lock;
		}
		
		//Then generate getters and setters for the lock variable

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
		
		
	}

}
