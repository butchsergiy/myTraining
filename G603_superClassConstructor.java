package proj1;


class MySuperClass03{					//����������:
	
	int a;
	
	void showa(){
	System.out.println(" ���� a="+a);}
	
	MySuperClass03(){					//������������ �����������:
		a=0;
		showa();}
	
	MySuperClass03(int i){
		a=i;
		showa();}
}
	
class MySubClass03 extends MySuperClass03{		//��������:
	
	double x;
	
	void showx(){
		System.out.println(" ���� x="+x);}
	
	MySubClass03(){			//������������ ���������:
		super();			// ����� ������������ �����������
		x=0;	
		showx();}
	
	MySubClass03(int i,double z){
		super(i); 			// ����� ������������ �����������
		x=z;
		showx();}
}



public class G603_superClassConstructor {

	public static void main(String[] args) {

		System.out.println("������ ������:");
		MySubClass03 obj1=new MySubClass03();
		
		System.out.println("������ ������:");
		MySubClass03 obj2=new MySubClass03(5,3.2);

	}

}
