// python�� list�� ����ϴ�.

// �迭�� ��ü�̹Ƿ� new�� ����ϴ°��� ��Ģ!
// �迭 ���� -> ���� -> ����

//public class arraymeohyun{
//	public static void main(String[] args) {
//		
//		int[] meohyun_Array = {0,1,2,3,4,5,6,7,8,9};
//		
//		System.out.print(meohyun_Array[4]);
//	}
//}


//���� ū�� ã��
//
//import java.util.Scanner;
//
//public class arraymeohyun{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Scanner meohyun = new Scanner(System.in);
//		int iMax = 0;
//		
//		System.out.print("������ ������ �Է��ϼ���!:");
//		int j = meohyun.nextInt();
//		int meohyun_array[] = new int[j];
//		int iSize = meohyun_array.length;
//			
//		
//		for(int i=0; i<j; i++) {
//			System.out.print("���ڸ� �Է��ϼ���!");
//			meohyun_array[i] = in.nextInt();		
//			if (meohyun_array[i] > iMax)
//				iMax = meohyun_array[i];
//		}
//		System.out.println(iSize+"���� ���� �� "+"���� ū���� "+iMax+"�Դϴ�.");
//	}
//}


// 2���� �迭

//public class arraymeohyun{
//	public static void main(String[] args) {
//		int i[][] = new int [2][5];
//		
//		System.out.println(i.length); // ���� ����
//		System.out.print(i[0].length); // ���� ����
//	}
//}


// 3�Ⱓ ���� �Ѿװ� ���

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
//		System.out.print("���� �Ѿ��� "+ dSum+" �̸� " + "����� ������ " + 
//		dSum/(meohyun_Array.length)+"�Դϴ�.");
//	
//	}
//}

// �迭 ���� ����
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
