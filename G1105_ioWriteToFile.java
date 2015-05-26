//package more;
import java.io.*;

public class G1105_ioWriteToFile {

	public static void main(String[] args) throws IOException{

		int a;
		
		try{ 
			FileOutputStream fout=new FileOutputStream("e:/mydataout.txt");
			FileInputStream fin=new FileInputStream("e:/mydatain.txt");
						
			a=fin.read();
			
			while (a!=-1){									// Replacing spaces with underscores    while not end of file
				if(a==(int)' ') a=(int)'_';
				fout.write(a);
				
				a=fin.read();				
			}
			
			fout.close();
			fin.close();
			
			}	
		
		catch(FileNotFoundException e){
			System.out.println("Cant read file "+e);
		
			}
		
		System.out.println("The work is complete ");
		
		
		
	}
}
