import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	GridLayoutEx(){
		setTitle("Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		GridLayout g = new GridLayout(4,2);
		g.setVgap(5); // ���� ���� 5�ȼ�
		c.setLayout(g);
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		setSize(350,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}