import java.util.Scanner;

public class dd {
	public static void main(String[] args) {
		int iTime;
		int iSecond;
		int iMinute;
		int iHour;
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		
		iTime = in.nextInt();
		iSecond = iTime % 60;
		iMinute = (iTime / 60) % 60;
		iHour = (iTime/60)/60;
		
		System.out.print(iTime + "�ʴ�" );
		System.out.print(iHour + "�ð�" );
		System.out.print(iMinute + "��" );
		System.out.print(iSecond + "���Դϴ�." );
	
	}
}