import java.util.Scanner;

// while �� �⺻ 
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
//		System.out.println("�Է��� ���� ������ "+ n +"���̸� ����� "+ iSum/n + "�Դϴ�.");
//		
//	}
//}

// ���ĺ� ��� ���α׷�
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

// ���� for��

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