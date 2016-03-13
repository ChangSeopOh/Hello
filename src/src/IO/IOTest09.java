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

			String CRLF = "\r\n"; // carriage return, line feed

			fw.write(name + CRLF);
			fw.write(id + CRLF);
			fw.write(age + CRLF);
			fw.write(phone + CRLF);
			fw.write(pwd + CRLF);

			System.out.println("입력 완료");
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
