// ���� 
// ����(exception) -> ���� ������ �� �ɰ��� ����

// TRY-CATCH

public class exception{
	public static void main(String[] args) {
		try {
			String[] str = new String[2];
			for(int i =0;i<3;i++) {
				str[i] = "Number is" +(i+1);				
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception is caught");
		}
		finally {
			System.out.println("Program ended(1)");
		}
		System.out.println("Program ended(2)");
	}
}