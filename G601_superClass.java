//package proj1;

class A{ 	// ����������
	
	int i,j;
	
	void showij(){
		System.out.println("���� i � j: "+i+" � "+j);}
}

class B extends A{ 		// ��������
	int k;
	
	void showk(){
		System.out.println("���� k: "+k);}
	
	void sum(){ 			// ��������� � ����������� �����:
		System.out.println("����� i+j+k="+(i+j+k));}  
}


public class G601_superClass {

	public static void main(String[] args) {
		
		A SuperObj=new A();		// ������ �����������:
		
		B SubObj=new B(); 		// ������ ���������:
		
		SuperObj.i=10;
		SuperObj.j=20;
		SuperObj.showij();
		SubObj.i=7;
		SubObj.j=8;
		SubObj.k=9;
		SubObj.showij();
		SubObj.showk();
		SubObj.sum();
		
		System.out.println("SuperObj has \n");
		SuperObj.showij();
	}
}
