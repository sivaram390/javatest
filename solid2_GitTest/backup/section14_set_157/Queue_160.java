package section14_set_157;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.openqa.selenium.NoSuchElementException;

public class Queue_160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue uses the FIFO and then it acts like the real world queue
		
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(6);
		
		try {
			queue.remove();
		} catch (NoSuchElementException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("There is not element in the Queue");
		}
		
		try {
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
			queue.add(7);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			System.out.println("Queue is full");
			//e.printStackTrace();
		}
		
		for(Integer element:queue) {
			System.out.println(element);
		}

	}

}
