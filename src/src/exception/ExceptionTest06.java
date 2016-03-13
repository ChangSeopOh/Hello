package exception;

import java.util.Scanner;

import jdbc.MemberVO;

public class ExceptionTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");
		String user_id = sc.next();
		System.out.println("pw : ");
		String user_pw = sc.next();

		MemberVO memberVO = new MemberVO();
		memberVO.setUser_id(user_id);
		memberVO.setUser_pw(user_pw);

		// System.out.println(memberVO);
		MemberVO userInfor = null;

		try {
			userInfor = login(memberVO);

			System.out.println(userInfor.getUser_name() + "님이 로그인 하셨습니다");

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
	
		}

	}

	private static MemberVO login(MemberVO memberVO) throws RuntimeException{
		if (memberVO.getUser_id().equals("next") && memberVO.getUser_pw().equals( //pw : 1234
				"d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db")) {
			memberVO.setUser_name("신해철");
			return memberVO;
		} else {

		throw new RuntimeException("아이디 혹은 패스워드가 틀립니다");
		}
	}
}
