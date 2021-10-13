import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame{
	JLabel la;
	MouseListenerEx(){
		
		
		setTitle("마우스 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		setContentPane(p);
		setLayout(null);
		p.addMouseListener(new MyMouseListener());
		
		la = new JLabel("hello");
		la.setSize(50,20);
		la.setLocation(30,30);
		p.add(la);
		
		setSize(200,200);
		setVisible(true);
		
	}
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}

	}
	
	
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}


	