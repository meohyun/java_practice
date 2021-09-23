import java.util.Scanner;

public class meohyun{
	
	public static void main(String[] args) {
		
		char mygrade;
		
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		
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
			System.out.println("100점보다 높은 점수는 없습니다.");
		
		System.out.println("나의 학점은 "+mygrade+"입니다.");
	}
}