package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;

public class IOTest07 {
	public static void main(String[] args) {

		OutputStream os = null;
		FileWriter writer = null;

		String data = "0";
		File file = new File("C:\\Elle\\JAVA\\MultiCampus");

		File[] filelist = file.listFiles();

		for (File f : filelist) {
			if (f.isFile() == true) {
				String filename = "exam.txt";
				if (f.getName().equals(filename)) {
					System.out.println("exam.txt 파일이 존재합니다. 파일을 삭제하겠습니다.");
					f.delete();
					System.exit(0);
				}
			}
		}
		try {
			System.out.println("exam.txt 파일이 존재하지않습니다. 파일을 생성하겠습니다.");
			writer = new FileWriter("exam.txt");
			writer.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (Exception e) {
				}
			}
		}
	}
}