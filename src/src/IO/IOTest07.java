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
					System.out.println("exam.txt ������ �����մϴ�. ������ �����ϰڽ��ϴ�.");
					f.delete();
					System.exit(0);
				}
			}
		}
		try {
			System.out.println("exam.txt ������ ���������ʽ��ϴ�. ������ �����ϰڽ��ϴ�.");
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