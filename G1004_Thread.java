package proj1;

import java.util.Date;										//Импорт класса Date:

class NewThread4 extends Thread{								//Класс NewThread наследует класс Thread:
	
	private String name;									//Параметры потока (название, время задержки, количество итераций):
	private int time;
	private int count;
	
	NewThread4(String name,int time,int count){				//Конструктор:
		super(name);
		this.name=name;
		System.out.print("** Created new Thread: "+name+". ");
		
		System.out.println(" Time : "+new Date()+".");		//Отображение даты и времени:
		this.time=time;
		this.count=count;
		
		start();}											//Запуск потока:
		
	public void run(){										//Переопределение метода run():
		try{
		for(int i=1;i<=count;i++){
		System.out.print("Thread : "+name+". Message "+i+" of "+count+". ");
		
		System.out.println("Time: "+new Date()+".");			//Отображение даты и времени:
		
		Thread.sleep(time);}									//Приостановка потока:
		}catch(InterruptedException e){
		System.out.println("Thread stoped "+name);}
		finally{
		System.out.print("Thread \""+name+"\" fineshed! ");
	
	System.out.println("Time: "+new Date()+".");}					//Отображение даты и времени:
}}



public class G1004_Thread {

	public static void main(String[] args) throws InterruptedException {

		System.out.print("***Begining of work ! ");
		
		System.out.println("Time: "+new Date()+".");			// Отображение даты и времени:
		
		new NewThread4("Red",5000,5);						// Создание трех дочерних потоков:
		new NewThread4("Yelow",6000,4);
		new NewThread4("Green",7000,3);
			
		Thread.sleep(30000);									// Приостановка главного потока:
		System.out.print("*** Programm is complete! ");
		
		System.out.println("Time : "+new Date()+".");			// Отображение даты и времени:

	}

}
