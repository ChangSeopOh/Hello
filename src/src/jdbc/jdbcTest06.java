package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class jdbcTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** 회원 탈퇴 ****");
		
		System.out.print("아이디 > ");
		String user_id = sc.nextLine();
	
		System.out.print("비밀번호 > ");
		String user_password = DigestUtils.sha512Hex(sc.nextLine());
		
		Connection conn = null;
		PreparedStatement ps = null;

		
		StringBuilder sql = new StringBuilder();
		sql.append(" DELETE from t_member");
		sql.append(" WHERE user_id=? and user_password=?");
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","n1","n1");
			ps = conn.prepareStatement(sql.toString());
			ps.setString(1, user_id);
			ps.setString(2, user_password);
			
			
			//수정과 삭제는 반영된 레코드 갯수를 확인해야 된다.
			if(ps.executeUpdate() ==1){ //반영된 갯수가 1일경우. 레코드삭제는 1번만 수행되기때문에.
			
				
				System.out.println(user_id+ "회원 탈퇴가 정상처리 되었습니다.");
				
			}else{
				System.out.println(user_id="회원 탈퇴 실패");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(user_id="회원 탈퇴 실패");

		}finally{
			if(ps!=null)try{ps.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		
		}
		
	}
}
