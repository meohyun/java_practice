import java.util.Scanner;

public class SelectionSortEx {
	public static void main(String[] args) {
		int array[] = new int[10];
		Scanner In = new Scanner(System.in);
		int i;
		
		for(i=0; i<10; i++) {
			array[i] = In.nextInt();
		}
		
		sort(array);
		
		for(i=0;i<10;i++) {
			System.out.print(array[i]+ " ");
		}
	}
	
	static void sort(int array[]) {
		int i , j ;
		int max ;
		int temp ;
		
		for(i=9; i>0; i--) {
			max = 0;
			for(j=0;j<=i; j++) {
				if(array[max] < array[j])
					max=j;
			}
			
			temp = array[i];
			array[i] = array[max];
			array[max] = temp;
		}
	}
}
