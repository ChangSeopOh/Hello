package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class jdbcTest05 {

	public static void main(String[] args) {
		Connection conn = null; //for connecting
		PreparedStatement st = null; //for query
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
				sb.append(" select user_id, user_name");
				sb.append(" from t_member");//여러줄일때 왼쪽에 공백을 둔다. 마지막 세미클론 뺀다
				sb.append(" Order by user_id asc");
		try { 
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","n1","n1");
			st = conn.prepareStatement(sb.toString());
			rs = st.executeQuery();
			
			System.out.println("\t회원 목록");
			System.out.println("-------------------------");
			System.out.println("아이디\t\t이름");
			System.out.println("-------------------------");
			
			while(rs.next()){ //next는 다음레코드가 존재할때까지 계속 반복
				System.out.print(rs.getString("user_id")+"\t\t");
				System.out.print(rs.getString("user_name")+"\n");
				
				
				
				
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
