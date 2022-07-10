/*
 * package section10_AnnonymusInnerClass_97;
 * 
 * abstract class Lock1{
 * 
 * public abstract boolean isUnlocked (String keyCode); }
 * 
 * public class Door {
 * 
 * Lock1 lock = new Lock1() {
 * 
 * //Add the anonymous inner class
 * 
 * @Override public boolean isUnlocked(String keyCode) { // TODO Auto-generated
 * method stub if(keyCode.equals("qwerty")) { return true; }else { return false;
 * }
 * 
 * }
 * 
 * };
 * 
 * //add a getter method to get the Lock object
 * 
 * public Lock1 getLock() { return lock; }
 * 
 * 
 * 
 * }
 */