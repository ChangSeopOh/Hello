package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class jdbcTest08 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		StringBuffer sql = new StringBuffer();

		sql.append(" SELECT name, phone, birth");
		sql.append(" FROM t_user");
		sql.append(" ORDER by name");

		Calendar today = Calendar.getInstance();
		int thisYear = today.get(Calendar.YEAR);

		try {

			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");

			ps = conn.prepareStatement(sql.toString());

			rs = ps.executeQuery();

			System.out.println("\t\tȸ�� ���");
			System.out.println("------------------------------------------");
			System.out.println("�̸�\t��ȣ\t\t����\t����");
			System.out.println("------------------------------------------");

			while (rs.next()) { // next�� �������ڵ尡 �����Ҷ����� ��� �ݺ�

				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("phone") + "\t");
				System.out.print(rs.getString("birth") + "\t");

				String birth = rs.getString("birth");
				System.out.println(age(birth, thisYear));
				//rs.getInt("birth"); �̰͵� ������.
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)try{rs.close();}catch(Exception e){}
			if(ps!=null)try{ps.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		}

	}

	private static int age(String birth, int thisYear) {
		int age = thisYear - Integer.valueOf(birth) + 1;

		return age;

	}

}
