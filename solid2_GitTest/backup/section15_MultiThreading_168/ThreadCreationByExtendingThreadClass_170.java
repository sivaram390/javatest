/*
 * package section15_MultiThreading_168;
 * 
 * class MyCounter extends Thread{
 * 
 * private int threadNo;
 * 
 * public MyCounter(int threadNo) {
 * 
 * this.threadNo = threadNo; }
 * 
 * public void countMe() throws InterruptedException { for(int i=0;i<=9;i++) {
 * sleep(200); System.out.println("The value of i is : "+i
 * +" The value of Thread number is : "+threadNo); } }
 * 
 * @Override public void run() { try { countMe(); } catch (InterruptedException
 * e) { // TODO Auto-generated catch block e.printStackTrace(); } }
 * 
 * 
 * 
 * }
 * 
 * public class ThreadCreationByExtendingThreadClass_170 {
 * 
 * 
 * public static void main(String[] args) throws InterruptedException { // TODO
 * Auto-generated method stub
 * 
 * MyCounter counter1 = new MyCounter(1); MyCounter counter2= new MyCounter(2);
 * 
 * long startTime = System.currentTimeMillis(); System.out.println(startTime);
 * //counter1.countMe(); counter1.start(); System.out.println();
 * System.out.println("*****************************************************");
 * System.out.println(); //counter2.countMe(); counter2.start();
 * Thread.sleep(4505); long endTime = System.currentTimeMillis();
 * System.out.println(endTime);
 * 
 * System.out.println("Total time required to Process : " +
 * (endTime-startTime));
 * 
 * }
 * 
 * }
 */