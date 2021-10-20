public class question_2{
	
	public static void main(String[] args) {
		int i , j;
		int k = 0 ;
		for (i=10;i<=30;i++) {
			for (j=0;j<=5;j++) {
				int [][] meohyun = new int [31][6];
				meohyun[i][j] = i * j;
				k += meohyun[i][j];
			}
		
		}
		System.out.print(k);
	}
}