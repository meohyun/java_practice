import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("ContentPane and JFrame");
		// �����ư�� ������ ������ ���α׷��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("ignore"));
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}