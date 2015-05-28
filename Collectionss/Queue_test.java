package collectionss;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queue_test {

	public static void main(String[] args) {

		Queue<String> queue=new LinkedList<>();
		queue.add("Java");
		queue.offer("SQL");
		queue.offer("CSS");
		queue.offer("XML");
		System.out.println("Queue:"+queue);
		
		while(queue.peek()!=null){
			System.out.println("\nHead  Element: " + queue.peek());
			queue.remove();
			System.out.println("Removed one  element from  Queue");
			System.out.println("Queue: " + queue);
			}
		
		System.out.println("queue.isEmpty(): " + queue.isEmpty());
	    System.out.println("queue.peek(): " + queue.peek());
	    System.out.println("queue.poll(): " + queue.poll());

		try{
			String str=queue.element();
			System.out.println("queue.element(): " + str);
			str = queue.remove();
		    System.out.println("queue.remove(): " + str);
		}catch(NoSuchElementException e){
			 System.out.println("queue.remove(): Queue is  empty.");}
	

	}

}
