import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	GridLayoutEx(){
		setTitle("Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		GridLayout g = new GridLayout(4,2);
		g.setVgap(5); // 수직 간격 5픽셀
		c.setLayout(g);
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		setSize(350,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}