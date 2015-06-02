package collectionss;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_Deque_LinkedList {

	public static void main(String[] args) {

		Deque<String> deque=new LinkedList<String>();
		deque.addLast("Oracle");
		deque.offerLast("Java");
		deque.offerLast("CSS");
		deque.offerLast("XML");
		deque.offerLast("aXML");
		System.out.println("Deque: "+deque);
		
		
		// remove elements from the Deque until it is empty
	    while (deque.peekFirst() != null) {
	      System.out.println("\nHead  Element: " + deque.peekFirst());
	      deque.removeFirst();
	      System.out.println("Removed one  element from  Deque");
	      System.out.println("Deque: " + deque);
	    }

	 // the Deque is empty. 
	     deque.peekFirst();
	     deque.pollFirst();
//	     deque.getFirst();
//	     deque.removeFirst();
	     
	    System.out.println("deque.isEmpty(): " + deque.isEmpty());


	}

}
