package section12_CollectonFrameworks_132;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linked list are same as array list which connects each and every element with nodes
		LinkedList<String> list = new LinkedList<String>();
		list.add("Mercedes");
		list.add("BMW");
		list.add("Jaguar");
		list.add("TATA");
		list.add("Ferrari");
		
		printNamesofList(list);
		//adding country via index
		list.add(1, "Mahindra");
		printNamesofList(list);
		//Modifying the content
		list.set(4, "Scuderia Ferrari");
		printNamesofList(list);
		
		//sorting and ordering the elements of list in a natural order
		list.sort(null);
		printNamesofList(list);
		
		//Sorting the element order in reverse
		//Here we use the collection class
		Collections.reverse(list);
		printNamesofList(list);
		

	}
	
	public static void printNamesofList(LinkedList<String> list) {
		for(String lists : list) {
			System.out.println("Elements are : " +lists);
		}
		System.out.println("************************");		
		
	}
	
	//Iterator is similar to foreach
	public static void printNameswithIterator(List<String> list) {
		Iterator<String> iterate = list.iterator();
		while(iterate.hasNext()) {
			System.out.println("Element : " + iterate.next());
		}
	}
	
	public static void printNameswithListIterator(List<String> list) {
		ListIterator<String> iterate = list.listIterator();
		while(iterate.hasNext()) {
			System.out.println("Element : " + iterate.next());
		}
	}

	

}
