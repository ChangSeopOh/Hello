package IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class IOTest09 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = null;
		String id = null;
		int age = 0;
		String phone = null;
		String pwd = null;

		FileWriter fw = null;

		try {
			fw = new FileWriter("phone.txt");
			System.out.println("***ȸ������ �Է�***");
			System.out.println("�̸�       > ");
			name = br.readLine();
			System.out.println("���̵�    > ");
			id = br.readLine();
			System.out.println("����       > ");
			age = Integer.parseInt(br.readLine());
			System.out.println("��ȭ��ȣ > ");
			phone = br.readLine();
			System.out.println("��й�ȣ > ");
			pwd = br.readLine();

			String CRLF = "\r\n"; // carriage return, line feed

			fw.write(name + CRLF);
			fw.write(id + CRLF);
			fw.write(age + CRLF);
			fw.write(phone + CRLF);
			fw.write(pwd + CRLF);

			System.out.println("�Է� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					fw.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
