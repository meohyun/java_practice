import java.util.Scanner;

public class P1_21711824 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<10;i++) {
			System.out.print("정수를 입력하세요: ");
			int n = sc.nextInt();
			
			// 홀수일 경우 더하기
			if (n % 2 != 0) {
				sum += n;
			}
			// 짝수일 경우 빼기
			else 
				sum -= n;
		}
		System.out.println("합은 "+sum+"입니다.");

	}
	
}
