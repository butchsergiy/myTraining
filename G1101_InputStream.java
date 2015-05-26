//package more;

import java.io.*;

public class G1101_InputStream {

	public static void main(String[] args) throws IOException{

		char symb;
		
		int q=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type any symbols and press <ENTER>");
		
		do{
			symb=(char)br.read();
			
			System.out.print("You enter : "+symb+ "=");
			System.out.print((int)symb);
			
			q++;
			System.out.println("   possition "+q);
			
		}while(symb!=10);

	}

}
