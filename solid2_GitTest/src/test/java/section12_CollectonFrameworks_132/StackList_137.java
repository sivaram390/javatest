package section12_CollectonFrameworks_132;

import java.util.Stack;

public class StackList_137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> demo = new Stack<Integer>();
		//For stack use the push instead of add
		
		demo.push(20);
		demo.push(30);
		demo.push(40);
		demo.push(50);
		demo.push(60);
		demo.push(70);
		
		//Since Stack is a LIFO(Last In First Out) the pop will remove the last element
		// the 70 should be popped after using the pop
		
		//System.out.println(demo.get(0));
		//System.out.println("********************************************");
		System.out.println("Before POP : "+demo.peek());
		demo.pop();
		System.out.println("After POP : "+demo.peek());
		//The peek is used to check what is the last element in the stack let us before and after pop
		
		//Use foreach instead of iterator to print 
		for(int demos:demo) {
			System.out.println(demos);
		}
		
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("************************");
			System.out.println("The contents in stack is");
			for(int i:demo) {
				System.out.println(i);
			}
		}

	}

}
