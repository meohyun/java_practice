
public class P2_21711824 {
	public static void main(String[] args) {
		boolean ok;
		int count = 0 ;
		int j = 0;
		int sum = 0;
		
		
		for(int i=2;i<1000;i++) {
			ok = true;
			// i�� 2~1000������ �ڿ����̰� j�� i���� �۽��ϴ�. j�� i�� ���������� 0�̵Ǹ� ����� �ֱ⶧���� �Ҽ��� �ƴմϴ�. 
			for (j=2; j<i;j++){
				
				// �Ҽ��� �ƴҶ��� ok���� false�Դϴ�.
				if (i % j == 0 ){
					ok = false;
				}
				
			}
			// �Ҽ��϶��� ok���� true �Դϴ�.
			if (ok == true) {
				// 1���� 1000������ �ڿ��� �� �Ҽ����� ����� ã���ϴ�.
				for (int k=1;k<1000;k++) {
					if (k % j == 0) {
						// sum�� ��� ������� �����ְ� count�� ������� ������ �����ݴϴ�.
						sum += k;
						count++;
					}
				}
			}
		}
		System.out.println("�Ҽ��� ����� ���� " +sum+"�Դϴ�.");
		System.out.println("�� ���� ����� "+ sum/count +"�Դϴ�.");
	}
	
}
