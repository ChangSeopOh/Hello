package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IOTest16 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("phone.txt");
			ois = new ObjectInputStream(fis);

			System.out.println("- - - ȸ�� ���� �Է� - - -");
			System.out.println("------------------------------------------------------");
			System.out.println("�̸�\t���̵�\t����\t��ȭ��ȣ\t\t��й�ȣ");
			System.out.println("------------------------------------------------------");
			System.out.print(ois.readObject());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null)
				try {
					ois.close();
				} catch (Exception e) {
				}
			if (fis != null)
				try {
					fis.close();
				} catch (Exception e) {
				}
		}
	}
}
