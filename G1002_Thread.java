package proj1;

class NewThread implements Runnable{
	
	Thread t;												// Поле - ссылка на объект потока:
	
	NewThread(){											// Конструктор класса:
		t=new Thread(this,"MyThread1");					// Создание объекта потока:
		System.out.println("My new Thread1: "+t);			// Вывод сведений о потоке:
		t.start(); 											// Запуск потока
	}
	
	public void run(){										// Определение метода run():
		try{
			for(int i=5;i>0;i--){
				System.out.println("MyThread1 coundown: "+i);
		
				Thread.sleep(500);}							// Приостановка потока:
		}
															// Обработка исключительной ситуации прерывания потока
		catch(InterruptedException e){
			System.out.println("MyNewThread1 stoped!");}
		
		System.out.println("MyNewThread1 closed!");
	}
}


class NewThread2 extends Thread{
	
	NewThread2(){
	Thread z=new Thread(this,"MyThread2");
	System.out.println("Created new Thread --- "+z);
	z.start();
	}
	
	public void run(){
		System.out.print("My second thread started \n\n");
	}
	
	
}



public class G1002_Thread {

	public static void main(String[] args) {

		// Создание анонимного объекта класса NewThread:
		new NewThread2();
		new NewThread(); // Создание нового потока
		
/*		try{
			for(int i=5;i>0;i--){
				System.out.println("Главный поток: "+i*100);
				
				Thread.sleep(1000);}		// Приостановка главного потока:
		}
	
		catch(InterruptedException e){		// Обработка исключительной ситуации прерывания главного потока:
			System.out.println("Прерывание главного потока!");}
		
		System.out.println("Завершение главного потока!");
*/		
		
	}
}
