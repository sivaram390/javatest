package section14_set_157;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		//HashSet uses sequence of the order like ascending
		
		for (int i=30; i>0 ;i--) {
			set.add(i);
		}
		for(int i:set) {
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("");
		
		Set<Integer> Link = new LinkedHashSet<Integer>();
		//LinkedHashSet uses sequence of the order like Descending
		
		for (int i=30; i>0 ;i--) {
			Link.add(i);
		}
		for(int i:Link) {
			System.out.print(i);
		}
		
		System.out.println();
		//Natural ordering of set using String 
		Set<String> setString = new TreeSet<String>();
		//HashSet uses sequence of the order like ascending
		
		for (int i=30; i>0 ;i--) {
			setString.add("A "+i);
		}
		for(String i:setString) {
			System.out.print(i);
		}

	}

}
