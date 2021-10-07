import java.io.*;
//
//public class print{
//	public static void main(String[] args) {
//		InputStreamReader in = new InputStreamReader(System.in);
//	
//	FileWriter fout = null; 
//	int c ;
//	try {
//		fout = new FileWriter("C:\\Users\\first plant\\Documents\\test.txt");
//		while ((c = in.read()) != -1){
//			fout.write(c);
//		}
//	
//		in.close();
//	fout.close();
//	} catch (IOException e) {
//		System.out.println("입출력 오류");
//	}
//	}
//}

// enter 입력 후 ctrl +z (end of file) 입력하면 콘솔에 입력한 값이 메모장에 저장됨

// Buffer Stream
//
//public class print{
//	public static void main(String[] args) {
//		InputStreamReader in = 
//				new InputStreamReader(System.in);
//		BufferedOutputStream out = 
//				new BufferedOutputStream(System.out,5);
//	try {
//		int c;
//		while ((c=in.read()) != -1) {
//			out.write(c);
//	}
//	out.flush();
//	if (in != null) {
//		in.close();
//		out.close();
//	 }
//	} catch (IOException e) {
//		System.out.println("입출력 오류");
//	  }
//   }
//}

// enter 키를 입력했을때 버퍼에 저장된 12345까지만 출력
// ctrl + z를 입력했을때 버퍼에 남아있던 678 모두 출력





