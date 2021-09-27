import java.util.Scanner;

public class ornalim{
	
	public static void sort(int[] array) {
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		
		for (int i = 0; i < array.length-1;i++) {
			System.out.print((i+1)+"번째 정수: ");
			int n = sc.nextInt();
			array[i] = n;
			for (int j = 1; j < array.length;j++) {
				if (max < array[i]) 
					max = array[i];		
					array[array.length-1] = max;		
					array[j] = array[i];		
			}	
		}
			
		
		for (int a = 0; a< array.length;a++) {
			System.out.print(array[a]+" ");	
		}	
			
		
	}
		
	
	public static void main(String[] args){
		int[] ten_array = {0,0,0,0,0,0,0,0,0,0};
		sort(ten_array);
		}
	
}
