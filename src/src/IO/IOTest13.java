package IO;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class IOTest13 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = null;
		String id = null;
		int age = 0;
		String phone = null;
		String pwd = null;

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("phone.txt");
			oos = new ObjectOutputStream(fos);
			System.out.println("***회원정보 입력***");
			System.out.println("이름       > ");
			name = br.readLine();
			System.out.println("아이디    > ");
			id = br.readLine();
			System.out.println("나이       > ");
			age = Integer.parseInt(br.readLine());
			System.out.println("전화번호 > ");
			phone = br.readLine();
			System.out.println("비밀번호 > ");
			pwd = br.readLine();

			oos.writeObject(name);
			oos.writeObject(id);
			oos.writeObject(age);
			oos.writeObject(phone);
			oos.writeObject(pwd);

			System.out.println("입력 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					fos.close();
					oos.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
