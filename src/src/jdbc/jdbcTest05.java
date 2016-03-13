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
				sb.append(" from t_member");//�������϶� ���ʿ� ������ �д�. ������ ����Ŭ�� ����
				sb.append(" Order by user_id asc");
		try { 
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","n1","n1");
			st = conn.prepareStatement(sb.toString());
			rs = st.executeQuery();
			
			System.out.println("\tȸ�� ���");
			System.out.println("-------------------------");
			System.out.println("���̵�\t\t�̸�");
			System.out.println("-------------------------");
			
			while(rs.next()){ //next�� �������ڵ尡 �����Ҷ����� ��� �ݺ�
				System.out.print(rs.getString("user_id")+"\t\t");
				System.out.print(rs.getString("user_name")+"\n");
				
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally{ //�ڿ� ����(��������) �߰��� ������ ���� ������, if�� ����
			if(rs != null)try{rs.close();}catch(Exception e){}
			if(st != null)try{st.close();}catch(Exception e){}
			if(conn != null)try{conn.close();}catch(Exception e){}
		}
	}
}
