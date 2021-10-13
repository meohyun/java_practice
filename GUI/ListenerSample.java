import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//public class ListenerSample extends JFrame{
//	ListenerSample(){
//		setTitle("이벤트 리스너");
//		setLayout(new FlowLayout());
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		JButton btn = new JButton("Action");
//		MyActionListener listener = new MyActionListener();
//		btn.addActionListener(listener);
//		add(btn);
//		setSize(300,150);
//		setVisible(true);
//	}
//	public static void main(String[] args) {
//		new ListenerSample();
//	}
//	
//}
//
//class MyActionListener implements ActionListener{
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton)e.getSource();
//		if(b.getText().equals("Action"))
//			b.setText("성공");
//		else
//			b.setText("Action");
//	}
//}


public class ListenerSample extends JFrame{
	ListenerSample(){
		setTitle("이벤트 리스너");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("test button");
		btn.setBackground(Color.green);
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample();
	}
	
}

class MyMouseListener implements MouseListener{
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.green);
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
}