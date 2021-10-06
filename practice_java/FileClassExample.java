import java.io.File;

public class FileClassExample{
	public static void dir(File fd) {
		String[] strFilenames = fd.list();
		for (String s : strFilenames) {
			File f = new File(fd,s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\tÆÄÀÏ Å©±â " + f.length());
			System.out.printf("\t¼öÁ¤ÇÑ ½Ã°£ : %tb %td %ta %tT\n",t,t,t,t);
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("파일경로");
		dir(f1);
	}
}
