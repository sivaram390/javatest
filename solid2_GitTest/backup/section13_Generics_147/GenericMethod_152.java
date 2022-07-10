/*
 * package section13_Generics_147;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * class Valli{
 * 
 * //Here we are creating a generic method in the list //using this generic
 * method with the E public <E> void printListData(List<E> list) { for(E element
 * : list) { System.out.println(element); } }
 * 
 * public <E> void printArrayData(E[] arrayData) { for(E element:arrayData) {
 * System.out.println(element); } } }
 * 
 * 
 * public class GenericMethod_152 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * List<Integer> list = new ArrayList<Integer>(); list.add(2); list.add(3);
 * list.add(4); list.add(5); list.add(6); Valli printInt = new Valli();
 * printInt.printListData(list);
 * 
 * 
 * List<String> stringList = new ArrayList<String>(); stringList.add("Siva");
 * stringList.add("Ram"); stringList.add("Gurusamy"); stringList.add("Yamaha");
 * stringList.add("Rocket"); Valli printString = new Valli();
 * printString.printListData(stringList);
 * 
 * }
 * 
 * }
 */