import java.util.Scanner;

public class rectangle{
	public static void main(String[] args) {
		int h;
		char c = '*';
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the height : ");
		
		while ((h=in.nextInt())<=0){
			System.out.print("Enter the height : ");
		}
		
		if (h > 0) {
			char[][] strArray = new char[h][2*h-1];
			for (int i =0; i<h;i++) {
				for	(int j =0; j <(2*h-1);j++) {
					if (i < j && j < (2*h-1)-(i+1))
						strArray[i][j] = 0;
					else
						strArray[i][j] = c;
					System.out.print(strArray[i][j]+" ");
				}
				System.out.println();
				System.out.println();
		}
			
		}
		
	}
}
