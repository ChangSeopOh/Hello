package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class jdbcTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** ȸ�� ���� ****");
		
		System.out.print("���̵� > ");
		String user_id = sc.nextLine();
		System.out.print("�̸� > ");
		String user_name = sc.nextLine(); //VarChar20���� �߱⶧���� �����ؾ���
		System.out.print("��й�ȣ > ");
		String user_password = DigestUtils.sha512Hex(sc.nextLine());
		
		Connection conn = null;
		PreparedStatement ps = null;
		//resultset�� ��ȸ�ѵڿ� �����ö� ����ϹǷ� �ʿ䰡 ����.
		
		StringBuilder sql = new StringBuilder();
		sql.append(" INSERT INTO t_member(user_id, user_name, user_password)");
		sql.append(" Values(?, ?, ?)");
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","n1","n1");
			ps = conn.prepareStatement(sql.toString());
			ps.setString(1, user_id);
			ps.setString(2, user_name);
			ps.setString(3, user_password);
			ps.executeUpdate();
			System.out.println(user_id+ "ȸ���� ���� �Ǿ����ϴ�.");
			//excuteQuery SELECT �������� ���� ����Ҷ�. ��ȸ.
			//Insert, Update, Delete�� �������� ������ ���������� excuteUpdate�� ����ϸ�ȴ�.
			//insert ��ȯ�� 1�������� 1�� �Էµȴ�.
			//update�� 2�������� 2�� ��ȯ�ǰ� 4�������� 4�� ��ȯ�ȴ�.
			//Insert, Update, Delete������ �Ŀ� ��� �ݿ������ Ȯ���ؾߵȴ�.
			//Ư�� Update�� Delete�� Ȯ���ؾ� �Ѵ�. �ֳ��ϸ� Insert�� ������ ���� Exception���� ������ �����̴�.
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(user_id="ȸ�� ���� ����");

		}finally{
			if(ps!=null)try{ps.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		
		}
		
	}
}
