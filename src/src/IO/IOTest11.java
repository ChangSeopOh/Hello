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

			dos.writeUTF(name);
			dos.writeUTF(id);
			dos.writeInt(age);
			dos.writeUTF(phone);
			dos.writeUTF(pwd);

			System.out.println("입력 완료");
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
