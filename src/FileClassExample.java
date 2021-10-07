// 디렉토리 안에있는 파일 크기, 수정시간 

import java.io.File;

public class FileClassExample{
	public static void dir(File fd) {
		String[] strFilenames = fd.list();
		for (String s : strFilenames) {
			File f = new File(fd,s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t파일 크기 " + f.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n",t,t,t,t);
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\first plant\\eclipse-workspace\\daehyun\\src");
		dir(f1);
	}
}