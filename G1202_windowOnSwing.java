import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class FrameSwing extends JFrame{
	
	public FrameSwing(int a, int b) {
	
		super("Frame on Swing");
		
		setSize(a, b);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
}



class FrameAWT extends Frame{
	
	public FrameAWT() {
		super("Frame from AWT");
		setSize(400,400);
		setVisible(true);
	
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			
				
			
								
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
}







public class G1202_windowOnSwing {
	
	public static void main(String[] args) {

		FrameSwing w=new FrameSwing(500, 500);
		
		FrameAWT w2=new FrameAWT();
		

	}
}
