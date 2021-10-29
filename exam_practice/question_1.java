public class question_1{
	public static void main(String[] args) {
		int i,j;
		int sum = 0;
		int nums = 0;
		
		int [][] a = {
				{78,48,78,98},
				{99,92},
				{29,64,83},
				{34,78,92,56}
		};
				
		for (i=0;i<4;i++) {
			for (j=0;j<a[i].length;j++) {
				
				sum += a[i][j];
				nums += 1;
		
				System.out.print(a[i][j] + " ");
				
				
				}
			System.out.println();
			
			}
		System.out.println("합은 "+sum+"입니다.");
		System.out.println("평균은 "+ sum/nums+"입니다.");
		}
		

	}
	
