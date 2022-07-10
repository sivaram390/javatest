package section15_MultiThreading_168;

import java.util.Random;

class MyCounters implements Runnable {

	private int threadNo;

	public MyCounters(int threadNo) {

		this.threadNo = threadNo;
	}

	public void countMe() throws InterruptedException {
		for (int i = 0; i <= 9; i++) {
			sleep(200);
			System.out.println("The value of i is : " + i + " The value of Thread number is : " + threadNo);
		}
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i <= 9; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is : " + i + " The value of Thread number is : " + threadNo);
		}
	}

}

public class RunnableInterface_ThreadCreationByExtendingThreadClass_171 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyCounters counter1 = new MyCounters(1);
		MyCounters counter2 = new MyCounters(2);
		// For runnable interface the class object should be called inside the Thread
		// object

		Thread run1 = new Thread(new MyCounters(1));
		Thread run2 = new Thread(new MyCounters(2));

		long startTime = System.currentTimeMillis();
		run1.start();

		System.out.println("*****************************************************");
		System.out.println();

		run2.start();

		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

		System.out.println("Total time required to Process : " + (endTime - startTime ));
		


	}

}
