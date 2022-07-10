package section14_set_157;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maps_162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// There are 2 types of map
		// 1. Elements are not sorted
		// 2. In Tree map elements are sorted and then we can use comparator interface

		Map<Integer, String> map = new HashMap<Integer, String>(10);
		map.put(4, "Valli");
		map.put(1, "Siva");
		map.put(2, "Devi");
		map.put(3, "Ravi");

		// To retrieve complex data without using the ToString we can use the map entry
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());

		}

		System.out.println("Hashmap will sort all in a natural order");
		//printing a single entity
		System.out.println(map.get(2));
		
		Iterator <Entry<Integer,String>> itr = 	map.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
