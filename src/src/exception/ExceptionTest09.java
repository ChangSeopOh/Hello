package exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest09 {
	public static void main(String[] args) {
		MemberVO[] registUsers = { new MemberVO("wonbean", "원빈", "1234"), 
				new MemberVO("gun", "장동건", "1111"),
				new MemberVO("jony", "조니뎁", "2222"), 
				new MemberVO("oh", "오은석", "3333"),
				new MemberVO("kim", "김명수", "4444") };

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

			System.out.println(userInfo.getUser_name() + "님이 로그인 하셨습니다");

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
				throw new LoginFailException(memberVO, "패스워드가 틀립니다.");
			}
		
		}

		throw new LoginFailException(memberVO, "그런정보가 없습니다.");

	}

	private static void showRegistUsers(MemberVO[] registUsers) {
		System.out.println("전체 회원 목록"); 
		for (MemberVO vo : registUsers) {
			System.out.println(vo);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
