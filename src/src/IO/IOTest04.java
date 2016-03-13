package IO;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

public class IOTest04 {
	public static void main(String[] args) {
		int data = 0;
		FileReader reader = null;
		OutputStream os = System.out;
		System.out.println("글을 입력하세요. 끝내려면 CTRL + Z를 입력하세요.");

		try {
			reader = new FileReader("test.txt");
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					reader.close();
					os.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
