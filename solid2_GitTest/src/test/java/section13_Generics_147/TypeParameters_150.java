package section13_Generics_147;

//Using my name as a custom generic due to somewhere in the project I had used Data inside a package
//This created this type is already defined error
class Sivaram<K, V> {
	private K key;
	private V value;

	public Sivaram(K key, V value) {

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
		return "Data [key=" + key + ", value=" + value + "]";
	}

	// displaying key value using a method
	public <E, N> void printNumandElements(E element, N number) {
		System.out.println("Element : " + element + "Number : " + number);
	}

}

public class TypeParameters_150 {

//	The naming convention as follows 
//	T - Type
//	E - Element
//	K - Key
//	N - Number
//	V - Value

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sivaram<Integer, String> data = new Sivaram<Integer, String>(1, "Siva");
		System.out.println("Key : " + data.getKey() + " : " + " Value : " + data.getValue());
		//This is directly accessing object and you can print any datatype you perfer
		//String and number
		data.printNumandElements("Siva", 2);
		//Character and Float
		data.printNumandElements('S', 2.0f);
		//double and integer
		data.printNumandElements(3.4d, 5);

	}

}
