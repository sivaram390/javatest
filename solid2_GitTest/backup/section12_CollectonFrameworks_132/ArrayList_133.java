package section12_CollectonFrameworks_132;

import java.util.ArrayList;

public class ArrayList_133 {

	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We are creating a static array list for convience to get elements in the
		// array list

		// The E in the ArrayList implies the array list can be of any : int, String,
		// float, double etc
		// static ArrayList<E>
		// Here we are declaring ArrayList of String
		// Arraylist is a class in Java and we are calling the default constructor
		// Adding elements in arraylist

		list.add("Siva");
		list.add("Gurusamy");
		list.add("Tonik");
		list.add("Bharath");
		list.add("DoomGuy");
		// Getting the index
		System.out.println(list.get(0));
		// Getting the full list
		System.out.println(list);
		// getting the list size
		System.out.println(list.size());
		
		//Checking display names method
		System.out.println("********************************************");
		
		ArrayList_133 displayName = new ArrayList_133();
		displayName.displayArraylist(list);
		System.out.println("********************************************");
		displayName.removeNameByPosition(2);
		displayName.displayArraylist(list);
		System.out.println("********************************************");
		displayName.removeNameByString("Bharath");
		displayName.displayArraylist(list);
		System.out.println("********************************************");
		displayName.addNameByStringandPosition(2, "DeadSpace");
		displayName.displayArraylist(list);

	}
	
	void displayArraylist(ArrayList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}
	}

	// Removing elements by position
	public void removeNameByPosition(int position) {
		list.remove(position);
	}

	// Removing elements by Name
	public void removeNameByString(String name) {
		list.remove(name);
	}
	
	public void addNameByStringandPosition(int position, String name) {
		list.set(position, name);
	}

}
