package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthSliderUI;

public class jdbcTest15 {
	public static void main(String[] args) {
		List<EmployeesVO> list = selectEmployees();
		System.out.println("���\t�̸�\t�޿�\t�μ���\t�μ��̸�");
		for (EmployeesVO vo : list) {
			System.out.println(vo);

		}
	}


	private static List<EmployeesVO> selectEmployees() {

		List<EmployeesVO> list = new ArrayList<EmployeesVO>(); //

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		StringBuilder sb = new StringBuilder();

		sb.append(" SELECT e.employee_id, e.last_name, e.salary");
		sb.append(" ,d.department_id, d.department_name");
		sb.append(" FROM employees e LEFT OUTER JOIN departments d");
		sb.append(" ON e.department_id = d.department_id");
		sb.append(" order by e.employee_id");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "h1001", "h1001");
			ps = conn.prepareStatement(sb.toString());

			rs = ps.executeQuery();
			while (rs.next()) {
				// record�� ������ hash map�� �����.
				EmployeesVO employeesvo = new EmployeesVO(); 

				employeesvo.setEmployee_id(rs.getInt("employee_id"));

				employeesvo.setLast_name(rs.getString("last_name"));
				employeesvo.setSalary(rs.getLong("salary"));
				employeesvo.setDepartment_id(rs.getInt("department_id"));
				employeesvo.setDepartment_name(rs.getString("department_name"));
				// �������� ������ ����Ҽ� �ֵ��� map�� ����

				list.add(employeesvo); // map�� while�� ������ �������ϱ� list(arrayList)�� �־� ���´�.
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
