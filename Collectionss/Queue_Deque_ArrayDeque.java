package collectionss;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_Deque_ArrayDeque {

	public static void main(String[] args) {
		
		Deque<String> deque=new ArrayDeque<>();
		deque.push("Oracle");
	    deque.push("HTML");
	    deque.push("CSS");
	    deque.push("XML");
		
	    System.out.println("Stack: "+ deque);
	    
	    while(deque.peek()!=null){
	        System.out.println("\nElement at  top:  " + deque.peek());
	        System.out.println("Popped: " + deque.pop());
	        System.out.println("Stack: " + deque);
	    }

	    System.out.println("\nStack is empty: "+deque.isEmpty());
	}

}
