package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcTest01 {

	public static void main(String[] args) {
		Connection conn = null; //for connecting
		Statement st = null; //for query
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
				sb.append(" select first_name, last_name");
				sb.append(" from employees");//여러줄일때 왼쪽에 공백을 둔다. 마지막 세미클론 뺀다
		
		try { 
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","h1001","h1001");
			st = conn.createStatement();
			rs = st.executeQuery(sb.toString());
			
			System.out.println("first_name\tlast_name");
			System.out.println("==================================================");
			
			while(rs.next()){ //next는 다음레코드가 존재할때까지 계속 반복
				System.out.print(rs.getString("first_name")+"\t");
				System.out.print(rs.getString("last_name")+"\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally{ //자원 해지(역순으로) 중간에 에러가 날수 있으니, if문 삽임
			if(rs != null)try{rs.close();}catch(Exception e){}
			if(st != null)try{st.close();}catch(Exception e){}
			if(conn != null)try{conn.close();}catch(Exception e){}
		}
	}
}
