package section14_set_157;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Gurusamy<K,V>{
	
	private K key;
	private V value;
	
	
	
	public Gurusamy(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Gurusamy [key=" + key + ", value=" + value + "]";
	}
	
	
	
	
}

public class CustomSortingUsingComparator_159 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparator is used to handle more than one value like String and Integer or something like key value pair
		Comparator<Gurusamy<Integer,String>> compa = new Comparator<Gurusamy<Integer,String>>(){

			@Override
			public int compare(Gurusamy<Integer, String> obj1, Gurusamy<Integer, String> obj2) {
				// TODO Auto-generated method stub
				if(obj1.getKey()<obj2.getKey()) {
					return -1;
				}else if(obj1.getKey()>obj2.getKey()) {
					return 1;
				}else
				return 0;
			}
			
		};
	
		//Set<Gurusamy> set = new LinkedHashSet<Gurusamy>(compa);
		
		Set<Gurusamy<Integer,String>> set = new TreeSet<Gurusamy<Integer,String>>(compa);
		
		set.add(new Gurusamy<Integer,String>(1, "One"));
		set.add(new Gurusamy<Integer,String>(3, "Three"));
		set.add(new Gurusamy<Integer,String>(2, "Two"));
		
		for(Gurusamy<Integer, String> i: set) {
			System.out.println(i);
		}
		

	}

}
