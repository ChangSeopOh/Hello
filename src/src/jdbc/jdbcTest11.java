package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class jdbcTest11 {
	public static void main(String[] args) {
		//emp, depart  사원이름 부서이름
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet  rs= null;
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT e.last_name as name, d.department_name as department");
		sql.append(" FROM employees e JOIN departments d");
		sql.append(" ON e.department_id = d.department_id");
		sql.append(" ORDER by name");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "h1001", "h1001");
			ps = conn.prepareStatement(sql.toString());
			
			rs = ps.executeQuery();
			
			System.out.println("이름\t\t부서");
			System.out.println("-----------------------------");
			
			while(rs.next()){
				System.out.println(rs.getString("name")+"\t\t"+rs.getString("department"));
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
