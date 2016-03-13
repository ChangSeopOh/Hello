package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest02 {
	public static void main(String[] args) {
		int data = 0;
		InputStream is = null;
		OutputStream os = System.out;

		try {
			is = new FileInputStream("test.txt");
			while ((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
					os.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
