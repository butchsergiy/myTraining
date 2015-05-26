//package more;
import java.io.*;

import javax.swing.*;

public class G1106_fileIO {

	public static void main(String[] args) throws IOException{

		String fileName, name, s;
		fileName=JOptionPane.showInputDialog("input file name ");
		
		try{
			FileInputStream fin=new FileInputStream("e:/"+fileName);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			
			name=JOptionPane.showInputDialog("enter workers surname");
			
			while(true){
				s=br.readLine();
				
				try{
					if (s.equalsIgnoreCase(name)){
						System.out.println(" surname : "+name);
						System.out.println(" name : "+br.readLine());
						System.out.println(" midlename : "+br.readLine());
						System.out.println(" age : "+br.readLine());
						System.out.println(" phone : "+br.readLine());
						
						break;
					}					
				}catch(NullPointerException e){
				
					System.out.println(" there is no such worker !");
					
					break;}
			}
			
			
			
//**********************************************************************************************************			
			
			String n=JOptionPane.showInputDialog("Do you want to print file to consol? \n yes or no");
			if(n.equalsIgnoreCase("yes")){
				int a;
				FileInputStream fin2=new FileInputStream("e:/"+fileName);
			
				a=fin2.read();
				System.out.println(" *** The file - "+fileName+". First symbol ="+a+"=\'"+((char)a)+"\'");
				System.out.println(" *** The file consist of:");
				while(a!=-1){
					System.out.print((char)a);
					a=fin2.read();
				}
				fin2.close();
			}
			
//*********************************************************************************************************			
			
			
			
			
				fin.close();
			}
			catch(FileNotFoundException e){
				System.out.println(" **File reading error == "+e);
			}
		
		System.exit(0);

	}

}
