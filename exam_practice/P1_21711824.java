import java.util.Scanner;

public class P1_21711824 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<10;i++) {
			System.out.print("������ �Է��ϼ���: ");
			int n = sc.nextInt();
			
			// Ȧ���� ��� ���ϱ�
			if (n % 2 != 0) {
				sum += n;
			}
			// ¦���� ��� ����
			else 
				sum -= n;
		}
		System.out.println("���� "+sum+"�Դϴ�.");

	}
	
}
