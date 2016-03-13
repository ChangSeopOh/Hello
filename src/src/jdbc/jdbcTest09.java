package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTest09 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		StringBuffer sql = new StringBuffer();

		sql.append(" SELECT name, phone, birth");
		sql.append(" FROM t_user");
		sql.append(" ORDER by name");


		try {

			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");

			ps = conn.prepareStatement(sql.toString());

			rs = ps.executeQuery();

			System.out.println("\t\t회원 목록");
			System.out.println("------------------------------------------");
			System.out.println("이름\t번호\t\t생년\t나이");
			System.out.println("------------------------------------------");

			while (rs.next()) { 
					userVO uservo = new userVO(
							rs.getString("name"),
							rs.getString("phone"),
							rs.getInt("birth"));
					System.out.println(uservo);
					
					
//					userVO uservo2 = new userVO();
//					uservo2.setName(rs.getString("name"));
					
					
					
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)try{rs.close();}catch(Exception e){}
			if(ps!=null)try{ps.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		}

	}



}
