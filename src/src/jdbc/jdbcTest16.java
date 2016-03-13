package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.log4j.Logger;

public class jdbcTest16 {
	
	private static Logger logger = LoggerFactory.getLogger(jdbcTest16.class);
//	private static Logger logger = Logger.getLogger(jdbcTest16.class);
									//내가사용할 클래스 이름을 넣으면됨.
	public static void main(String[] args) {

		List<EmpVO> list = selectEmployees();
		System.out.println("사번\t이름\t급여\t부서번\t부서이름");
		for (EmpVO vo : list) {
			System.out.println(vo);

		}
	}

	private static List<EmpVO> selectEmployees() {

		List<EmpVO> list = new ArrayList<EmpVO>(); //

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		StringBuilder sb = new StringBuilder();

		sb.append(" SELECT e.employee_id, e.last_name, e.salary");
		sb.append(" ,d.department_id, d.department_name");
		sb.append(" FROM employees e LEFT OUTER JOIN departments d");
		sb.append(" ON e.department_id = d.department_id");
		sb.append(" order by e.employee_id");

		logger.info(sb.toString());
		
		//로그출력
		//debug, infor, warn, error, fatal
		//debug쓰면 무조건 보이며 warn이면 warning이상아니면 안나옴
		//error을 쓰면 error이상아니면 안나옴.
		
		//slf4j log는 FATAL이 없음.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "h1001", "h1001");
			ps = conn.prepareStatement(sb.toString());

			rs = ps.executeQuery();
			while (rs.next()) {
				// record를 저장할 hash map을 만든다.
				EmpVO employeesvo = new EmpVO();

				employeesvo.setEmployee_id(rs.getInt("employee_id"));
				employeesvo.setLast_name(rs.getString("last_name"));
				employeesvo.setSalary(rs.getLong("salary"));

				DeptVO deptVO = new DeptVO();

				deptVO.setDepartment_id(rs.getInt("department_id"));
				deptVO.setDepartment_name(rs.getString("department_name"));
				// 언제든지 꺼내서 사용할수 있도록 map에 저장

				employeesvo.setDeptVO(deptVO);
				list.add(employeesvo); // map은 while이 끝난후 없어지니까 list(arrayList)에
										// 넣어 놓는다.
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (ps != null)
				try {
					ps.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}

		return list;
	}
}
