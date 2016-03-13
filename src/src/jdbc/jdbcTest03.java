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
		//pw 안치면 에러. 고치려면 예외처리
		
		//문자열 넣어주는 Dynamic query = statement
		//매개변수를 넘겨서 하는 parameter query = preparedStatement
		//작성 용이성, 성능 향상, SQL Injection에 뚤릴 확률 감소.
		
		Connection conn = null;
		PreparedStatement ps = null; //구문수행, 참조하기위한
		ResultSet rs = null; //결과를 받기위한
		
		StringBuffer sql = new StringBuffer();	//쿼리작성
		sql.append(" SELECT user_id, user_name");
		sql.append(" FROM t_member");
		sql.append(" WHERE user_id =?");
		sql.append(" AND user_password =?");
		
		try{
			Class.forName("net.sf.log4jdbc.DriverSpy"); 	//접속 (드라이브확인)
			conn = DriverManager.getConnection(
					"jdbc:log4jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");
			ps = conn.prepareStatement(sql.toString()); //미리 쿼리를 던저놓고 ?를 나중에 처리함
			ps.setString(1, user_id);		//첫번째 ?에 무엇을 넣을것이냐?
			ps.setString(2, user_password);
			rs = ps.executeQuery();
			
			// 실행한 결과를 싱글 오브젝트로 받아온다.
			
			if(rs.next()){ //만약에 정상대로 받아왔다면 실행함
				System.out.println(
				rs.getString("user_name")+"("+
				rs.getString("user_id")+")님이 로그인 하였습니다.");
				
				//위의 조건(Where user_id)이 하나만 뿌리는 것이라 하나만 했다.
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
