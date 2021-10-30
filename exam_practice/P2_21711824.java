
public class P2_21711824 {
	public static void main(String[] args) {
		boolean ok;
		int count = 0 ;
		int j = 0;
		int sum = 0;
		
		
		for(int i=2;i<1000;i++) {
			ok = true;
			// i는 2~1000까지의 자연수이고 j는 i보다 작습니다. j를 i로 나누었을때 0이되면 약수가 있기때문에 소수가 아닙니다. 
			for (j=2; j<i;j++){
				
				// 소수가 아닐때는 ok값이 false입니다.
				if (i % j == 0 ){
					ok = false;
				}
				
			}
			// 소수일때는 ok값이 true 입니다.
			if (ok == true) {
				// 1부터 1000까지의 자연수 중 소수들의 배수를 찾습니다.
				for (int k=1;k<1000;k++) {
					if (k % j == 0) {
						// sum에 모든 배수들을 더해주고 count에 배수들의 개수를 더해줍니다.
						sum += k;
						count++;
					}
				}
			}
		}
		System.out.println("소수의 배수의 합은 " +sum+"입니다.");
		System.out.println("이 값의 평균은 "+ sum/count +"입니다.");
	}
	
}
