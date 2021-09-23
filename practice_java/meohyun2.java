import java.util.Scanner;

public class meohyun2{
	public static void main(String[] args) {
		
		char mygrade;
		System.out.print("학점을 입력하세요: ");
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
		System.out.println("나의 학점은 "+mygrade+"입니다.");
		}
		
	}
}