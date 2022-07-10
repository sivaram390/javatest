/*
 * package section13_Generics_147;
 * 
 * import java.util.LinkedList; import java.util.List;
 * 
 * class Siva<T> { private T myVariable;
 * 
 * // Create a constructor using field // if required create getters and setters
 * // also create ToString if needed
 * 
 * public Siva(T data) {
 * 
 * this.myVariable = data; }
 * 
 * public T getData() { return myVariable; }
 * 
 * public void setData(T data) { this.myVariable = data; }
 * 
 * @Override public String toString() { return "Generic [data=" + myVariable +
 * "]"; }
 * 
 * }
 * 
 * 
 * 
 * public class Understanding_Generics_149 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * //In this generic Data we can pass any list dataType we prefer
 * 
 * List<Siva> elements = new LinkedList<>(); elements.add(new Siva("Yamaha"));
 * 
 * 
 * }
 * 
 * }
 */