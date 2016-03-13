package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class jdbcTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** ȸ�� Ż�� ****");
		
		System.out.print("���̵� > ");
		String user_id = sc.nextLine();
	
		System.out.print("��й�ȣ > ");
		String user_password = DigestUtils.sha512Hex(sc.nextLine());
		
		Connection conn = null;
		PreparedStatement ps = null;

		
		StringBuilder sql = new StringBuilder();
		sql.append(" DELETE from t_member");
		sql.append(" WHERE user_id=? and user_password=?");
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","n1","n1");
			ps = conn.prepareStatement(sql.toString());
			ps.setString(1, user_id);
			ps.setString(2, user_password);
			
			
			//������ ������ �ݿ��� ���ڵ� ������ Ȯ���ؾ� �ȴ�.
			if(ps.executeUpdate() ==1){ //�ݿ��� ������ 1�ϰ��. ���ڵ������ 1���� ����Ǳ⶧����.
			
				
				System.out.println(user_id+ "ȸ�� Ż�� ����ó�� �Ǿ����ϴ�.");
				
			}else{
				System.out.println(user_id="ȸ�� Ż�� ����");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(user_id="ȸ�� Ż�� ����");

		}finally{
			if(ps!=null)try{ps.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		
		}
		
	}
}
