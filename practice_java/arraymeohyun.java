// python의 list와 흡사하다.

// 배열은 객체이므로 new를 사용하는것이 원칙!
// 배열 선언 -> 생성 -> 접근

//public class arraymeohyun{
//	public static void main(String[] args) {
//		
//		int[] meohyun_Array = {0,1,2,3,4,5,6,7,8,9};
//		
//		System.out.print(meohyun_Array[4]);
//	}
//}


//가장 큰수 찾기
//
//import java.util.Scanner;
//
//public class arraymeohyun{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Scanner meohyun = new Scanner(System.in);
//		int iMax = 0;
//		
//		System.out.print("숫자의 갯수를 입력하세요!:");
//		int j = meohyun.nextInt();
//		int meohyun_array[] = new int[j];
//		int iSize = meohyun_array.length;
//			
//		
//		for(int i=0; i<j; i++) {
//			System.out.print("숫자를 입력하세요!");
//			meohyun_array[i] = in.nextInt();		
//			if (meohyun_array[i] > iMax)
//				iMax = meohyun_array[i];
//		}
//		System.out.println(iSize+"개의 숫자 중 "+"가장 큰수는 "+iMax+"입니다.");
//	}
//}


// 2차원 배열

//public class arraymeohyun{
//	public static void main(String[] args) {
//		int i[][] = new int [2][5];
//		
//		System.out.println(i.length); // 행의 개수
//		System.out.print(i[0].length); // 열의 개수
//	}
//}


// 3년간 매출 총액과 평균

//public class arraymeohyun{
//	public static void main(String[] args) {
//		int[][] meohyun_Array = {{90,90,110,110},
//								{100,120,110,90},
//								{100,80,90,100}};
//		double dSum = 0;
//		
//		for (int i=0;i < meohyun_Array.length;i++) 
//			for (int j=0; j < meohyun_Array[i].length;j++) 
//				dSum +=  meohyun_Array[i][j];
//				
//		System.out.print("매출 총액은 "+ dSum+" 이며 " + "연평균 매출은 " + 
//		dSum/(meohyun_Array.length)+"입니다.");
//	
//	}
//}

// 배열 리턴 예제
public class arraymeohyun{
	static int[] makeArray() {
		int[] iTemp = new int[4];
		for (int i=0; i<iTemp.length;i++)
			iTemp[i] = i;
		return iTemp;
	}
	public static void main(String[] args) {
		int[] intArray;
		
		intArray = makeArray();
		for(int i=0; i < intArray.length;i++)
			System.out.println(intArray[i]);
					
	}
}
