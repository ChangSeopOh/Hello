package IO;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class IOTest11 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = null;
		String id = null;
		int age = 0;
		String phone = null;
		String pwd = null;

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("phone.txt");
			dos = new DataOutputStream(fos);
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

			dos.writeUTF(name);
			dos.writeUTF(id);
			dos.writeInt(age);
			dos.writeUTF(phone);
			dos.writeUTF(pwd);

			System.out.println("�Է� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					fos.close();
					dos.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
