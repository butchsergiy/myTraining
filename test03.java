//package more;

public class test03 {
	
	static int fibo (int n){
		if (n==1 || n==2) {return 1;}
		return fibo(n-2)+fibo(n-1);
		}

	
	static int fact(int m) {
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
		
		
		
	
		        int N = 13;
		        for (int i = -3*N/2; i <= N; i++) {
		            for (int j = -3*N/2; j <= 3*N/2; j++) {

		                // inside either diamond or two circles
		                if ( (Math.abs(i) + Math.abs(j) < N)
		                    || ((-N/2-i) * (-N/2-i) + ( N/2-j) * ( N/2-j) <= N*N/2)
		                    || ((-N/2-i) * (-N/2-i) + (-N/2-j) * (-N/2-j) <= N*N/2)
		                   )
		                        System.out.print("@ ");
		                else    System.out.print(". ");
		            }
		            System.out.println();
		        
		    
		}

		
		
		
		
		
	}

}
