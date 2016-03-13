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
									//��������� Ŭ���� �̸��� �������.
	public static void main(String[] args) {

		List<EmpVO> list = selectEmployees();
		System.out.println("���\t�̸�\t�޿�\t�μ���\t�μ��̸�");
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
		
		//�α����
		//debug, infor, warn, error, fatal
		//debug���� ������ ���̸� warn�̸� warning�̻�ƴϸ� �ȳ���
		//error�� ���� error�̻�ƴϸ� �ȳ���.
		
		//slf4j log�� FATAL�� ����.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "h1001", "h1001");
			ps = conn.prepareStatement(sb.toString());

			rs = ps.executeQuery();
			while (rs.next()) {
				// record�� ������ hash map�� �����.
				EmpVO employeesvo = new EmpVO();

				employeesvo.setEmployee_id(rs.getInt("employee_id"));
				employeesvo.setLast_name(rs.getString("last_name"));
				employeesvo.setSalary(rs.getLong("salary"));

				DeptVO deptVO = new DeptVO();

				deptVO.setDepartment_id(rs.getInt("department_id"));
				deptVO.setDepartment_name(rs.getString("department_name"));
				// �������� ������ ����Ҽ� �ֵ��� map�� ����

				employeesvo.setDeptVO(deptVO);
				list.add(employeesvo); // map�� while�� ������ �������ϱ� list(arrayList)��
										// �־� ���´�.
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
