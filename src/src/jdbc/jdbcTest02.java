package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcTest02 {

	public static void main(String[] args) {
		Connection conn = null; // for connecting
		Statement st = null; // for query
		ResultSet rs = null;

		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT last_name, salary,");
		sb.append(" 		case when salary <=10000 then 'Low'");
		sb.append(" 			 when salary <=20000 then 'Mid'");
		sb.append("              else 'High' end as grade");
		sb.append(" FROM employees");
		sb.append(" order by salary desc");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","h1001","h1001");
			st = conn.createStatement();
			rs = st.executeQuery(sb.toString());
			
			System.out.println("list_name\tsalary\tgrade");
			System.out.println("==================================================");
			
			while(rs.next()){ //next�� �������ڵ尡 �����Ҷ����� ��� �ݺ�
				System.out.print(rs.getString("last_name")+"\t\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.print(rs.getString("grade")+"\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally{ //�ڿ� ����(��������) �߰��� ������ ���� ������, if�� ����
			if(rs != null)try{rs.close();}catch(Exception e){}
			if(rs != null)try{st.close();}catch(Exception e){}
			if(rs != null)try{conn.close();}catch(Exception e){}
		}
	}
}
