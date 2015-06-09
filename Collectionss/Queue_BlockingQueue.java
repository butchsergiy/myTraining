package collectionss;

import java.util.concurrent.BlockingQueue;

public class Queue_BlockingQueue {

	class BQProduser extends Thread{
		private final BlockingQueue<String> queue;
		private final String name;
		public BQProduser(BlockingQueue<String> queue, String name) {
			this.name=name;
			this.queue=queue;			
		}
		
		public void run(){
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {



	}

}
