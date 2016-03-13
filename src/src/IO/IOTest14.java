package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IOTest14 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		String name = null;
		String id = null;
		int age = 0;
		String phone = null;
		String pwd = null;
		try {
			fis = new FileInputStream("phone.txt");
			ois = new ObjectInputStream(fis);
			name = (String) ois.readObject();
			id = (String) ois.readObject();
			age = (Integer) ois.readObject();
			phone = (String) ois.readObject();
			pwd = (String) ois.readObject();

			System.out.println("- - - 회원 정보 입력 - - -");
			System.out.println("------------------------------------------------------");
			System.out.println("이름\t아이디\t나이\t전화번호\t\t비밀번호");
			System.out.println("------------------------------------------------------");
			System.out.print(name + "\t");
			System.out.print(id + "\t");
			System.out.print(age + "\t");
			System.out.print(phone + "\t");
			System.out.print(pwd + "\t");

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
