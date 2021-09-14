import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		int iTime;
		int iSecond;
		int iMinute;
		int iHour;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		iTime = in.nextInt();
		iSecond = iTime % 60;
		iMinute = (iTime / 60) % 60;
		iHour = (iTime/60)/60;
		
		System.out.print(iTime + "초는" );
		System.out.print(iHour + "시간" );
		System.out.print(iMinute + "분" );
		System.out.print(iSecond + "초입니다." );
	
	}
}
