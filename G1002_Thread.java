package proj1;

class NewThread implements Runnable{
	
	Thread t;												// ���� - ������ �� ������ ������:
	
	NewThread(){											// ����������� ������:
		t=new Thread(this,"MyThread1");					// �������� ������� ������:
		System.out.println("My new Thread1: "+t);			// ����� �������� � ������:
		t.start(); 											// ������ ������
	}
	
	public void run(){										// ����������� ������ run():
		try{
			for(int i=5;i>0;i--){
				System.out.println("MyThread1 coundown: "+i);
		
				Thread.sleep(500);}							// ������������ ������:
		}
															// ��������� �������������� �������� ���������� ������
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

		// �������� ���������� ������� ������ NewThread:
		new NewThread2();
		new NewThread(); // �������� ������ ������
		
/*		try{
			for(int i=5;i>0;i--){
				System.out.println("������� �����: "+i*100);
				
				Thread.sleep(1000);}		// ������������ �������� ������:
		}
	
		catch(InterruptedException e){		// ��������� �������������� �������� ���������� �������� ������:
			System.out.println("���������� �������� ������!");}
		
		System.out.println("���������� �������� ������!");
*/		
		
	}
}
