package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest02B {
	public static void main(String[] args) {
		int data = 0;
		InputStream is = System.in;
		FileWriter writer = null;
		System.out.println("���� �Է��ϼ���. �������� CTRL + Z�� �Է��ϼ���.");

		try {
			writer = new FileWriter("test.txt");
			while ((data = is.read()) != -1) {
				writer.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
					writer.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
