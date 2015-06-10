

public class test04 {

	public static void main(String... args) {
		
		int[] ar=new int[100];
		int m=0;
		
		for (int a = 0; a < 100; a++) {
			for (int i = 0; i < ((int)(Math.random() * 100)); i++) {
				m=i;
			}
			ar[m]++;
		}
		
		System.out.println("**********");
		for(int i=0; i<ar.length; i++) {
			System.out.print(i+" " + (ar[i]!=0?ar[i]:"")+"\t");
			if(i%10==0) System.out.println();
		}

		
//  баг!! ніразу не бачив числа більшого за 24, хоча по теорії мало би бути 
//  макс 100 бо 1,00 * 100 = 100 ... чого 36 ???
////////////////////////////////////////////////////////////////////////////////////////		
		
		int n=600;
		int[] arr1=new int[n];
		int[] arr2=new int[100];
		int b;
		
		for(int i=0; i<n;i++){
			b=(int)(Math.random()*100);
			arr1[i]=b;
			arr2[b]++;
		}
		
			System.out.println("\n**********");		
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(i+" " + (arr2[i]!=0?arr2[i]:"")+"\t");
			if(i%10==0) System.out.println();
		}

		////////////////////////////////////////////////////////////////////////////////
		int max=0;
		int min=100;
		
		for(int i=0; i<100; i++){
			if (arr2[i]>max) max=arr2[i];
			if (arr2[i]<min) min=arr2[i];
		}
		
/////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("\n");
		for(int p=0; p<20; p++){
		for(int i=0; i<arr2.length; i++) {
			System.out.print((arr2[i]>0?"x":" "));
			arr2[i]--;
			
		}
		System.out.println();
		}
		
		System.out.println("min = "+ min+"\t max = "+max);
		
	}


}
