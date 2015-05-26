package proj1;

class Thrd implements Runnable{
		
	Thread thread2;
	
	Thrd(){
		
		thread2 = new Thread(this,"MyNewThread");
		thread2.start();
	}
		
	public void run(){
	
		System.out.println("\n*New Thread started. Parameters of it is - "+Thread.currentThread());
		
		//try{	
		for (int i=100; i>-1; i--) {
			System.out.println((thread2.getName()
					)+" "+i);
			
			try {
//				thread2.sleep(100);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			
	}		
}






public class G1001_Thread {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		Thread zis = Thread.currentThread();
		System.out.println("Tread Name = "+zis.getName());
		
		zis.setName("ProgramkeMain");
		System.out.println("New Thread Name = "+zis.getName());		
		System.out.println(Thread.currentThread());
		
				
		Thrd potok2=new Thrd();
		
		try{
			 for(int n=10;n>0;n--){
				 System.out.println(zis.getName()+" countdown: "+n);
			 	 Thread.sleep(1000);}
			
		}catch(InterruptedException e){System.out.println("Thread is closed!");}
		


		
		
	}
}
