// 오류 
// 예외(exception) -> 복구 가능한 덜 심각한 오류

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

// 예외 발생 throw 문 이용
import java.util.Scanner;

public class exception{
	public static void getNumber() {
		Scanner in = new Scanner(System.in);
		int iNum = in.nextInt();
		try {
			if((iNum%2)==0) throw new EvenException("EVEN!");
			}
		catch(EvenException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		getNumber();
	}
}
