package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class jdbcTest03 {
	private static Logger logger = LoggerFactory.getLogger(jdbcTest03.class);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id: "); 
		String user_id = sc.nextLine();
		System.out.print("pw: "); 
		String user_password = DigestUtils.sha512Hex(sc.nextLine()); 
		//pw ��ġ�� ����. ��ġ���� ����ó��
		
		//���ڿ� �־��ִ� Dynamic query = statement
		//�Ű������� �Ѱܼ� �ϴ� parameter query = preparedStatement
		//�ۼ� ���̼�, ���� ���, SQL Injection�� �Ը� Ȯ�� ����.
		
		Connection conn = null;
		PreparedStatement ps = null; //��������, �����ϱ�����
		ResultSet rs = null; //����� �ޱ�����
		
		StringBuffer sql = new StringBuffer();	//�����ۼ�
		sql.append(" SELECT user_id, user_name");
		sql.append(" FROM t_member");
		sql.append(" WHERE user_id =?");
		sql.append(" AND user_password =?");
		
		try{
			Class.forName("net.sf.log4jdbc.DriverSpy"); 	//���� (����̺�Ȯ��)
			conn = DriverManager.getConnection(
					"jdbc:log4jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");
			ps = conn.prepareStatement(sql.toString()); //�̸� ������ �������� ?�� ���߿� ó����
			ps.setString(1, user_id);		//ù��° ?�� ������ �������̳�?
			ps.setString(2, user_password);
			rs = ps.executeQuery();
			
			// ������ ����� �̱� ������Ʈ�� �޾ƿ´�.
			
			if(rs.next()){ //���࿡ ������ �޾ƿԴٸ� ������
				System.out.println(
				rs.getString("user_name")+"("+
				rs.getString("user_id")+")���� �α��� �Ͽ����ϴ�.");
				
				//���� ����(Where user_id)�� �ϳ��� �Ѹ��� ���̶� �ϳ��� �ߴ�.
			}else{ 
				System.out.println("Incorrect Information. you need to check your Id or Password");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs!=null)try{rs.close();}catch(Exception e){}
			if(ps!=null)try{ps.close();}catch(Exception e){}
			if(conn!=null)try{conn.close();}catch(Exception e){}
		}
		
	}
}
