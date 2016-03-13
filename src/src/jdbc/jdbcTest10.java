package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTest10 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		StringBuffer sql = new StringBuffer();

		sql.append(" SELECT name, phone, birth, (to_char(sysdate, 'YYYY')-birth)+1 as age");
		sql.append(" FROM t_user");

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

				userAgeVO useragevo = new userAgeVO();
				useragevo.setName(rs.getString("name"));
				useragevo.setPhone(rs.getString("phone"));
				useragevo.setBirth(rs.getInt("birth"));
				useragevo.setAge(rs.getInt("age"));

				System.out.println(useragevo);

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
