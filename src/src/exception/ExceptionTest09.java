package exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest09 {
	public static void main(String[] args) {
		MemberVO[] registUsers = { new MemberVO("wonbean", "����", "1234"), 
				new MemberVO("gun", "�嵿��", "1111"),
				new MemberVO("jony", "���ϵ�", "2222"), 
				new MemberVO("oh", "������", "3333"),
				new MemberVO("kim", "����", "4444") };

		showRegistUsers(registUsers);

		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String user_id = sc.next();
		System.out.print("pw : ");
		String user_pw = sc.next();

		MemberVO memberVO = new MemberVO();
		memberVO.setUser_id(user_id);
		memberVO.setUser_pw(user_pw);

		// System.out.println(memberVO);
		MemberVO userInfo = null;
		try {

			userInfo = login(memberVO, registUsers);

			System.out.println(userInfo.getUser_name() + "���� �α��� �ϼ̽��ϴ�");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static MemberVO login(MemberVO memberVO, MemberVO[] registUsers) throws RuntimeException, IOException {

		for (int i = 0; i < registUsers.length; i++) {
			if (memberVO.getUser_id().equals(registUsers[i].getUser_id())) {
				if (memberVO.getUser_pw().equals(registUsers[i].getUser_pw())) {

					return registUsers[i];
				}
				throw new LoginFailException(memberVO, "�н����尡 Ʋ���ϴ�.");
			}
		
		}

		throw new LoginFailException(memberVO, "�׷������� �����ϴ�.");

	}

	private static void showRegistUsers(MemberVO[] registUsers) {
		System.out.println("��ü ȸ�� ���"); 
		for (MemberVO vo : registUsers) {
			System.out.println(vo);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
