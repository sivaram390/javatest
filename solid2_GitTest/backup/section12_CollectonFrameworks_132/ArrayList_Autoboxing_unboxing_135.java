/*
 * package section12_CollectonFrameworks_132;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * //The class should be an independent class and not to be declared inside the
 * class class intWrapper{
 * 
 * public int intValue;
 * 
 * public intWrapper(int intValue) {
 * 
 * this.intValue = intValue; }
 * 
 * public int getIntValue() { return intValue; }
 * 
 * public void setIntValue(int intValue) { this.intValue = intValue; }
 * 
 * 
 * }
 * 
 * public class ArrayList_Autoboxing_unboxing_135 {
 * 
 * //Wrapper classes work for one single entity
 * 
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * //We are getting the error for int because since its a primitive datatype
 * //Where collection framework only supports Object and Classes //Instead in
 * Java there are wrapper classes for all the primitive methods //ArrayList<int>
 * list = new ArrayList(); //Autoboxing and unboxing is working in backfround
 * List<Integer> studentNumbers = new ArrayList(); studentNumbers.add(25);
 * studentNumbers.add(35); //studentNumbers.in //For integers there is no need
 * to use array bounds or use the get methods to call the index
 * System.out.println(studentNumbers);
 * System.out.println(studentNumbers.get(0));
 * 
 * //Here we can use the custom wrapper class and understand about boxing and
 * unboxing ArrayList<intWrapper> studentNumbers1 = new ArrayList<intWrapper>();
 * //Still an error is getting occured since the unboxing has to be carried
 * manually //studentNumbers1.add(30); studentNumbers1.add(new
 * intWrapper(20));//Boxing
 * System.out.println(studentNumbers1.get(0).getIntValue());//UnBoxing //These
 * operations are carried automatically in if Java's Wrapper classes are used
 * 
 * }
 * 
 * }
 */