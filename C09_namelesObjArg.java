class MyClass{
	int n,m;
	
	MyClass(int a, int b){
		n=a;
		m=b;
		System.out.println("Первый конструктор!");	}
	
	MyClass(MyClass obj){
		n=obj.n+1;
		m=obj.m-1;
		System.out.println("Второй конструктор!");	}
	
	void show(){
		System.out.println("Значения полей: "+n+" и "+m);}
}





public class C09_namelesObjArg {

	public static void main(String[] args) {

		MyClass obj=new MyClass(new MyClass(10,100));

		obj.show();}

	}


