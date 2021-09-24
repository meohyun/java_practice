

public class multtable{
	
	public static void printMultTable(int h) {
		String [][] table = new String[h][h];
		String d = "";
		
		for (int i=0;i<h;i++) {
			for (int j=0; j<h;j++) {
				int a = (i+1)*(j+1);
				String b = String.valueOf(a);
				
				if (i < j) 
					table[i][j] = d;
				else
					table[i][j] = b;
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		printMultTable(7);
	}
}