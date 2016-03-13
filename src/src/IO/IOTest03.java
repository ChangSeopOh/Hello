package IO;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest03 {
	public static void main(String[] args) {
		int data = 0;
		InputStream is = System.in;
		OutputStream os = null;
		System.out.println("글을 입력하세요. 끝내려면 CTRL + Z를 입력하세요.");

		try {
			os = new FileOutputStream("test.txt");
			while ((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
