
public class P2_21711824_EX {
	public static void main(String[] args) {
		String str = "*";
		String [][] meohyun = new String [12][12];
		
		for (int i=0;i<12;i++) {
			for (int j=0;j<12;j++) {
				meohyun[i][j] = " ";
				
				
				if (5-0.5*i <= j && 5+0.5*i >=j) {
					meohyun[i][j] = str;
				}
				
				
				if(i % 2 != 0) {
					meohyun[i][j] = " ";
				}
				
				
				

				
				
				
				System.out.print(meohyun[i][j]);
			}
		System.out.println();	
		}
	}
}
