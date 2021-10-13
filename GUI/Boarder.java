import javax.swing.*;
import java.awt.*;

public class Boarder extends JFrame{
	Boarder(){
		setTitle("hello");
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JButton("div"),BorderLayout.WEST);
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		setSize(300,100);
	}
	public static void main(String[] args) {
		new Boarder();
	}
}