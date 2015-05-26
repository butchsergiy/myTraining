//package more;
import java.awt.*;
import java.awt.event.*;

class MyAdapter extends WindowAdapter{								// ����� ����������� �������� ����:
	
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



class MyFrame extends Frame{							// ���� ����
	MyFrame(int a, int b){
		super("new window");
		setSize(a, b);
		setVisible(true);
		
		MyAdapter adapter=new MyAdapter(); 			// ������ ����������� �������� ����:
		addWindowListener(adapter);					// �������� ����������:
			
	}
	}




public class G1201_windowOnAWT {

	public static void main(String[] args) {

		MyFrame fr0=new MyFrame(333, 444);
		MyFrame fr1=new MyFrame(333, 444);
		
				
	}
}
