import java.util.Scanner;

public class daehyun{
	
	public static void sort(int[] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		for (int i =0;i <array.length;i++) {
			System.out.print((i+1)+"번째 정수: ");
			int n = sc.nextInt();
			array[i] = n;
			for (int j = 1; j < array.length;j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int a=0; a< array.length; a++) {
			System.out.print(array[a]+" ");

		}
	}
	public static void main(String[] args) {
		int[] my_array = {0,0,0,0,0,0,0,0,0,0};
		sort(my_array);
	}
}
