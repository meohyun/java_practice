import java.util.Scanner;

// '*' 으로 이루어진 직사각형 출력
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
			char[][] strArray = new char[h][h+(h-1)];
			char[] strAr = new char[h];
	
			for (int i =0; i<h;i++) {
				strAr[i] = c;
				for	(int j =0; j <h+(h-1);j++) {
					if (i < j && j < h+(h-1)-(i+1))
						strArray[i][j] = 0;
					else
						strArray[i][j] = strAr[i];
					System.out.print(strArray[i][j]+" ");
				}
				System.out.println();
				System.out.println();
		}
			
		}
		
	}
}
