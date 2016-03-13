package exception;

import java.io.IOException;
import java.util.Scanner;

import jdbc.LoginFailException;
import jdbc.MemberVO;

public class ExceptionTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String user_id = sc.next();
		System.out.print("pw : ");
		String user_pw = sc.next();
		
		MemberVO memberVO = new MemberVO();
		memberVO.setUser_id(user_id);
		memberVO.setUser_pw(user_pw);
		
		//System.out.println(memberVO);
		MemberVO userInfo = null;
		try {
			userInfo = login(memberVO);
			System.out.println(
					userInfo.getUser_name() + "님이 로그인 하셨습니다");
				
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static MemberVO login(MemberVO memberVO) throws RuntimeException, IOException {
		if (memberVO.getUser_id().equals("next") && 
			memberVO.getUser_pw().equals("d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db")) {
			memberVO.setUser_name("신해철");
			return memberVO;
		} else {
			throw new LoginFailException(memberVO, "아이디 혹은 패스워드가 틀릴걸요?");
		}
	}
}
