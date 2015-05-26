//package myTraining;

public class test02 {
	
	static int fibo (int n){
		if (n==1 || n==2) {return 1;}
		return fibo(n-2)+fibo(n-1);
		}

	
	static double fact(double m) {
		if(m==1) {return 1;}
		if(m==2) {return 2;}
		return m*fact(m-1);
		}
	
	
	public static void main(String[] args) {
		
//		System.out.println(fibo(11));
		
		
		for (int i=1; i<180; i++){
		System.out.println(i+" "+fact(i));
		}
		
//		System.out.println(fact(50));
		
	}

}
