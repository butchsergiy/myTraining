//package more;
import java.util.*;

public class G1103_ioScaner {

	public static void main(String[] args) {

		Scanner i=new Scanner(System.in);
		String name;
		int age=0;
		System.out.println("*What is your name ?");
		name=i.nextLine();
			System.out.println("Hello "+name+" !");
		
		
			
		while(age==0){
			
				try{
					System.out.println("*How old are You ?");
	
					age=i.nextInt();
										
					System.out.println("\n"+name + ", Your age is "+age+" years.");
						
					}
				
				
				
				catch (InputMismatchException e){
					System.out.println("*** Enter number 0-200 ****");
					i=new Scanner(System.in);						
							}			
			}
		
		
		
		
		System.out.println("\n *************\n * Thats all * \n *************");
		i.close();
		
		
	}
}
