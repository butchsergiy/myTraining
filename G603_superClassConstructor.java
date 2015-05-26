package proj1;


class MySuperClass03{					//Суперкласс:
	
	int a;
	
	void showa(){
	System.out.println(" поле a="+a);}
	
	MySuperClass03(){					//Конструкторы суперкласса:
		a=0;
		showa();}
	
	MySuperClass03(int i){
		a=i;
		showa();}
}
	
class MySubClass03 extends MySuperClass03{		//Подкласс:
	
	double x;
	
	void showx(){
		System.out.println(" поле x="+x);}
	
	MySubClass03(){			//Конструкторы подкласса:
		super();			// Вызов конструктора суперкласса
		x=0;	
		showx();}
	
	MySubClass03(int i,double z){
		super(i); 			// Вызов конструктора суперкласса
		x=z;
		showx();}
}



public class G603_superClassConstructor {

	public static void main(String[] args) {

		System.out.println("Первый объект:");
		MySubClass03 obj1=new MySubClass03();
		
		System.out.println("Второй объект:");
		MySubClass03 obj2=new MySubClass03(5,3.2);

	}

}
