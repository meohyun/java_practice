import java.util.Scanner;

public class meohyun2{
	public static void main(String[] args) {
		
		char mygrade;
		System.out.print("������ �Է��ϼ���: ");
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			
			int scores = in.nextInt();
			switch (scores/10) {
			case 10:
			case 9:
				mygrade = 'A';
				break;
			case 8:
				mygrade = 'B';
				break;
			case 7:
				mygrade = 'C';
				break;
			case 6:
				mygrade = 'D';
				break;
			default:
				mygrade = 'F';
			}
		System.out.println("���� ������ "+mygrade+"�Դϴ�.");
		}
		
	}
}