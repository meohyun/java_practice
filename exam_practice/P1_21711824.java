
public class P1_21711824 {
	public static void main(String[] args) {
		double sum = 0;
		double nums = 0;
		double avg = 0;
		double d = 0 ;
		double v = 0 ;
		double ans = 0;
		for (int i=0;i<1000;i++) {
			if (i % 3 == 0) {
				// 합
				sum += i;
				// 3의배수 갯수
				nums += 1;
				avg = sum/nums;
				
				d += Math.pow(i-avg, 2);
				// 분산
				v = d / nums;
				
				// 표준편차
				ans = Math.sqrt(v);
			}
		}
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(ans);
	}
}
