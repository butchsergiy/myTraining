
class NewThread33 extends Thread{					//Класс NewThread расширяет класс Thread:
	
	NewThread33(String a){									//Конструктор класса:
		super(a);						//Вызов конструктора класса Thread:
		System.out.println("*Created SubThread: "+this);		//Вывод сведений о потоке:
		start();									//Запуск потока на выполнение:
	}
	
	
	public void run(){								//Переопределение метода run():
		try{
		for(int i=5;i>0;i--){
			System.out.println("SubThread "+this.getName()+" : "+i);
			Thread.sleep(1000);}							//Приостановка потока:
	}
	
		catch(InterruptedException e){					//Обработка исключения прерывания потока:
			System.out.println("subThread "+this.getName()+" broken!");}
		
		System.out.println("**SubThread "+this.getName()+" fineshed!");}
}




public class G1003_Thread {

	public static void main(String[] args) {

		new NewThread33("NewThread1");
		new NewThread33("NewThread2");
		new NewThread33("NewThread3");
		new NewThread33("NewThread4");
		new NewThread33("NewThread5");
		new NewThread33("NewThread6");
		new NewThread33("NewThread7");
		new NewThread33("NewThread8");
		new NewThread33("NewThread9");
		new NewThread33("NewThread10");
		
		try{
			for(int i=5;i>0;i--){
				System.out.println("MainThread : "+i*100);
				Thread.sleep(1000);}
			}catch(InterruptedException e){
				System.out.println("mainThread broken!");}
			
		System.out.println("**MainThread \""+Thread.currentThread() +"\" fineshed!");
		
	}
}
