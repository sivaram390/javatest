package section10_InnerClass_93;

import section10_InnerClass_93_1.Door;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Door door = new Door();
		door.shopStatus();
		door.getLock().setLock(false);
		door.shopStatus();

	}

}
