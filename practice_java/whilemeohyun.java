import java.util.Scanner;

// while 문 기본 
//public class whilemeohyun{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = 0;
//		double iSum = 0;
//		int i = 0;
//		while ((i = in.nextInt()) !=0){
//			iSum += i;
//			n++;
//		}
//		System.out.println("입력한 수의 개수는 "+ n +"개이며 평균은 "+ iSum/n + "입니다.");
//		
//	}
//}

// 알파벳 출력 프로그램
//public class whilemeohyun{
//	public static void main(String[] args) {
//		char chCharacter = 'a';
//		
//		do {
//			System.out.println(chCharacter);
//			chCharacter = (char)(chCharacter + 1);
//		} while (chCharacter <= 'z');
//	}
//}

// 이중 for문

public class whilemeohyun{
	public static void main(String[] args) {
		int i,j;
		for (i= 1; i<10; i++,System.out.println()) {
			for (j=1; j<10; j++) {
				System.out.println(i +"*"+ j+"="+i*j);
			}
		}
	}
}