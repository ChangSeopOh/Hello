package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class IOTest12 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		DataInputStream dis = null;

		String name = null;
		String id = null;
		int age = 0;
		String phone = null;
		String pwd = null;
		try {
			fis = new FileInputStream("phone.txt");
			dis = new DataInputStream(fis);
			name = dis.readUTF();
			id = dis.readUTF();
			age = dis.readInt();
			phone = dis.readUTF();
			pwd = dis.readUTF();

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
			if (dis != null)
				try {
					dis.close();
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
