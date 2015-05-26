//package more;
import java.awt.*;
import java.awt.event.*;

class MyAdapter extends WindowAdapter{								// Класс обработчика закрытия окна:
	
	public void windowClosing(WindowEvent we){
		System.exit(0);
		}
	
	public void windowIconified (WindowEvent we){
		System.out.println("window is changed from a normal to a minimized state ");
		}
		
	public void windowDeactivated (WindowEvent we){
		System.out.println("Window --"+this+"-- is no longer the active Window ");
		}
		
	
	}



class MyFrame extends Frame{							// клас вікна
	MyFrame(int a, int b){
		super("new window");
		setSize(a, b);
		setVisible(true);
		
		MyAdapter adapter=new MyAdapter(); 			// Объект обработчика закрытия окна:
		addWindowListener(adapter);					// Добавлен обработчик:
			
	}
	}




public class G1201_windowOnAWT {

	public static void main(String[] args) {

		MyFrame fr0=new MyFrame(333, 444);
		MyFrame fr1=new MyFrame(333, 444);
		
				
	}
}
