//package proj1;

class MySuperClass{ 	// ����������
	
	private int a;	 	// �������� ����:
	
	void showa(String s){		// �������� �����:
		System.out.println(s+" ���� a= "+a);}
	
	void seta(int n){		// �������� �����:
		a=n;
		showa("");}
}


class MySubClass extends MySuperClass{ 		// ��������
	int b;
	void setall(int i,int j){
		seta(i);
		b=j;
		System.out.println(" ���� b: "+b);}
		}


public class G602_superClass {

	public static void main(String[] args) {
		
		MySuperClass obj0=new MySuperClass();		// ������ super ������:
		MySubClass   obj1=new MySubClass();		// ������ ���������:
		MySubClass   obj2=new MySubClass();		// ������ ���������:
			
			System.out.println("Set obj1 a=1 b=5 ");
		obj1.setall(1,5);
			System.out.println("Set obj1 a=111 b=23 ");
		obj1.setall(111,23);
			System.out.println();
		
		System.out.println("obj1.b= "+obj1.b+"");
		System.out.println("obj2.b= "+obj2.b+"\n");
					
		obj0.showa("obj0.");
		obj1.showa("obj1.");
		obj2.showa("obj2.");

	}
}
