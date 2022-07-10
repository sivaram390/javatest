package section14_set_157;

import java.util.HashSet;
import java.util.Set;

public class SetExplanation_157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set is the least used in industry and the most used class of set is HashSet
		//Advantage of set is it will avoid duplicates
		Set<String> set = new HashSet<String>();
		set.add("Siva");
		set.add("Valli");
		set.add("Valli");
		set.add("Siva");
		set.add("Gurusamy");
		set.add("Ravi");
		
		for(String name:set) {
			System.out.println(name);
		}
		

	}

}
