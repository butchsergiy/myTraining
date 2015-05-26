//package proj1;

class MySuperClass{ 	// Суперкласс
	
	private int a;	 	// Закрытое поле:
	
	void showa(String s){		// Закрытый метод:
		System.out.println(s+" Поле a= "+a);}
	
	void seta(int n){		// Открытый метод:
		a=n;
		showa("");}
}


class MySubClass extends MySuperClass{ 		// Подкласс
	int b;
	void setall(int i,int j){
		seta(i);
		b=j;
		System.out.println(" Поле b: "+b);}
		}


public class G602_superClass {

	public static void main(String[] args) {
		
		MySuperClass obj0=new MySuperClass();		// Объект super класса:
		MySubClass   obj1=new MySubClass();		// Объект подкласса:
		MySubClass   obj2=new MySubClass();		// Объект подкласса:
			
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
