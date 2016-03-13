package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String user_id = sc.nextLine();
		System.out.print("pw : ");
		String user_pw = sc.nextLine();

		MemberVO memberVO = new MemberVO();
		memberVO.setUser_id(user_id);
		memberVO.setUser_pw(user_pw);

		MemberVO userInfo = null;
		try {

			userInfo = login(memberVO);

			System.out.println(userInfo.getUser_name() + "¥‘¿Ã ∑Œ±◊¿Œ «œºÃΩ¿¥œ¥Ÿ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static MemberVO login(MemberVO memberVO) throws Exception  {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		StringBuffer sql = new StringBuffer();
		sql.append(" select user_id, user_name from t_member");
		sql.append(" where user_id='" + memberVO.getUser_id() + "'");
		sql.append(" and   user_password='" + memberVO.getUser_pw() + "'");

		MemberVO userInfor = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");
			st = conn.createStatement();
			rs = st.executeQuery(sql.toString());
			
			if (rs.next()) {
				userInfor = new MemberVO(rs.getString("user_id"), rs.getString("user_name"), "");
			} else {
				throw new LoginFailException(memberVO, "ID or Password is not Correct");

			}

		} finally{
			if(rs!=null)try{rs.close();}catch(Exception e){}
			if(st!=null)try{st.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		}
		return userInfor;
			
	}

}
