//package more;
import javax.swing.*;

public class G1104_ioSwing {

	
	public static void main(String[] args) {
	
		String name;
		int age;
		
			System.out.println("*What is your name ?");
		name=JOptionPane.showInputDialog(" enter Your name ");
			System.out.println("You entered : "+name);
		
			System.out.println(" *How old are You ? ");
		age=Integer.parseInt(JOptionPane.showInputDialog(" so how old are you ?"));
		
			System.out.println(name+", Your age is "+age+" years.");
			
		System.exit(0);
		
		
		
		
	}
}
