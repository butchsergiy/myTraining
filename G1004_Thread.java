package proj1;

import java.util.Date;										//������ ������ Date:

class NewThread4 extends Thread{								//����� NewThread ��������� ����� Thread:
	
	private String name;									//��������� ������ (��������, ����� ��������, ���������� ��������):
	private int time;
	private int count;
	
	NewThread4(String name,int time,int count){				//�����������:
		super(name);
		this.name=name;
		System.out.print("** Created new Thread: "+name+". ");
		
		System.out.println(" Time : "+new Date()+".");		//����������� ���� � �������:
		this.time=time;
		this.count=count;
		
		start();}											//������ ������:
		
	public void run(){										//��������������� ������ run():
		try{
		for(int i=1;i<=count;i++){
		System.out.print("Thread : "+name+". Message "+i+" of "+count+". ");
		
		System.out.println("Time: "+new Date()+".");			//����������� ���� � �������:
		
		Thread.sleep(time);}									//������������ ������:
		}catch(InterruptedException e){
		System.out.println("Thread stoped "+name);}
		finally{
		System.out.print("Thread \""+name+"\" fineshed! ");
	
	System.out.println("Time: "+new Date()+".");}					//����������� ���� � �������:
}}



public class G1004_Thread {

	public static void main(String[] args) throws InterruptedException {

		System.out.print("***Begining of work ! ");
		
		System.out.println("Time: "+new Date()+".");			// ����������� ���� � �������:
		
		new NewThread4("Red",5000,5);						// �������� ���� �������� �������:
		new NewThread4("Yelow",6000,4);
		new NewThread4("Green",7000,3);
			
		Thread.sleep(30000);									// ������������ �������� ������:
		System.out.print("*** Programm is complete! ");
		
		System.out.println("Time : "+new Date()+".");			// ����������� ���� � �������:

	}

}
