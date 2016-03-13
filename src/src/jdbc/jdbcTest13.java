package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTest13 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		StringBuilder sb = new StringBuilder();
		
		sb.append(" SELECT e.employee_id, e.last_name, e.salary");
		sb.append(" ,d.department_id, d.department_name");
		sb.append(" FROM employees e LEFT OUTER JOIN departments d");
		sb.append(" ON e.department_id = d.department_id");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","h1001" ,"h1001" );
			ps = conn.prepareStatement(sb.toString());
			
			rs=ps.executeQuery();
			System.out.println("사번\t이름\t급여\t부서번\t부서이름");
			while(rs.next()){
				System.out.print(rs.getInt("employee_id")+"\t");
				String last_name = rs.getString("last_name");
				if(last_name.length()>7){
					last_name = last_name.substring(0,5)+"…";
				}
				System.out.print(rs.getString("last_name")+"\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.print(rs.getInt("department_id")+"\t");
				System.out.println(rs.getString("department_name"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!= null)try{rs.close();}catch(Exception e){}
			if(ps!= null)try{ps.close();}catch(Exception e){}
			if(conn!= null)try{conn.close();}catch(Exception e){}
		}
		
	}
}
