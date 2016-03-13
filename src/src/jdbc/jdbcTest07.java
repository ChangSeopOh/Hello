package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class jdbcTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\tInformation Change");

		System.out.print("ID > ");
		String user_id = sc.nextLine();

		System.out.print("Password > ");
		String user_password = DigestUtils.sha512Hex(sc.nextLine());

		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT count(*)as cnt FROM t_member");
		sql.append(" WHERE user_id=? AND user_password=?");

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");

			ps = conn.prepareStatement(sql.toString());
			ps.setString(1, user_id);
			ps.setString(2, user_password);
			rs = ps.executeQuery(); // ������(View)
			if (rs.next()) { // rs�� �ȵɰ�� if�� ��� �Ǳ������� �������� ���̱� ����
				if (rs.getInt("cnt") == 0) {
					System.out.println("Incorrect Information which is Your ID or PassWord");
					System.exit(0);
				}
				System.out.println("Let's Start to change your status. \nID :" + user_id + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1); // 0�̳� 1�̳� �������.
		}
		StringBuffer sql_update = new StringBuffer();
	
			
			sql_update.append(" UPDATE t_member SET");
			sql_update.append(" user_name =?,user_password=?");
			sql_update.append(" WHERE user_id=?");
			
		try {
			System.out.print("New name > ");
			String user_name = sc.nextLine();
			System.out.print("New password > ");
			user_password = DigestUtils.sha512Hex(sc.nextLine());
			
			ps = conn.prepareStatement(sql_update.toString()); //�������� ����Ŭ��
			
			ps.setString(1, user_name);
			ps.setString(2, user_password);
			ps.setString(3, user_id);
			
			if(ps.executeUpdate()==1){ //1�̶� ��������� �ȉ����
				System.out.println("Successfully changed your information(Name, Password).");
			}else{
				System.out.println("Failed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)try{rs.close();}catch (Exception e) {}
			if(ps!=null)try{ps.close();}catch (Exception e) {}
			if(conn!=null)try{conn.close();}catch (Exception e) {}
		}

	}
}
