import java.util.Scanner;

public class meohyun{
	
	public static void main(String[] args) {
		
		char mygrade;
		
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		
		int scores = in.nextInt();
		
		
		if (90 <= scores) 
			mygrade = 'A';
		else if (scores >=80)
			mygrade = 'B';
		
		else if (scores >=70)
			mygrade = 'C';
		else if (scores >= 60)
			mygrade = 'D';
		else 
			mygrade = 'F';
		
		if  (scores > 100)
			System.out.println("100������ ���� ������ �����ϴ�.");
		
		System.out.println("���� ������ "+mygrade+"�Դϴ�.");
	}
}