package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class jdbcTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** 회원 가입 ****");
		
		System.out.print("아이디 > ");
		String user_id = sc.nextLine();
		System.out.print("이름 > ");
		String user_name = sc.nextLine(); //VarChar20으로 했기때문에 조정해야함
		System.out.print("비밀번호 > ");
		String user_password = DigestUtils.sha512Hex(sc.nextLine());
		
		Connection conn = null;
		PreparedStatement ps = null;
		//resultset는 조회한뒤에 가져올때 사용하므로 필요가 없다.
		
		StringBuilder sql = new StringBuilder();
		sql.append(" INSERT INTO t_member(user_id, user_name, user_password)");
		sql.append(" Values(?, ?, ?)");
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","n1","n1");
			ps = conn.prepareStatement(sql.toString());
			ps.setString(1, user_id);
			ps.setString(2, user_name);
			ps.setString(3, user_password);
			ps.executeUpdate();
			System.out.println(user_id+ "회원이 가입 되었습니다.");
			//excuteQuery SELECT 쿼리같은 것을 사용할때. 조회.
			//Insert, Update, Delete는 데이터의 변경이 가해질때는 excuteUpdate를 사용하면된다.
			//insert 반환은 1건했으니 1이 입력된다.
			//update는 2명있으면 2가 반환되고 4명있으면 4가 반환된다.
			//Insert, Update, Delete수행한 후에 몇개가 반영됬는지 확인해야된다.
			//특히 Update나 Delete는 확인해야 한다. 왜냐하면 Insert는 에러가 나면 Exception으로 빠지기 때문이다.
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(user_id="회원 가입 실패");

		}finally{
			if(ps!=null)try{ps.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		
		}
		
	}
}
