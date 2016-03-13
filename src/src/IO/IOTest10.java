package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOTest10 {
	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		String name = null;
		String id = null;
		int age = 0;
		String phone = null;
		String pwd = null;
		try {
			fr = new FileReader("phone.txt");
			br = new BufferedReader(fr);
			name = br.readLine();
			id = br.readLine();
			age = Integer.parseInt(br.readLine());
			phone = br.readLine();
			pwd = br.readLine();

			System.out.println("- - - ȸ�� ���� �Է� - - -");
			System.out.println("------------------------------------------------------");
			System.out.println("�̸�\t���̵�\t����\t��ȭ��ȣ\t\t��й�ȣ");
			System.out.println("------------------------------------------------------");
			System.out.print(name + "\t");
			System.out.print(id + "\t");
			System.out.print(age + "\t");
			System.out.print(phone + "\t");
			System.out.print(pwd + "\t");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (Exception e) {
				}
			if (fr != null)
				try {
					fr.close();
				} catch (Exception e) {
				}
		}
	}
}
