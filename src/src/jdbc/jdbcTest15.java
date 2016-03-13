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
		System.out.println("사번\t이름\t급여\t부서번\t부서이름");
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
				// record를 저장할 hash map을 만든다.
				EmployeesVO employeesvo = new EmployeesVO(); 

				employeesvo.setEmployee_id(rs.getInt("employee_id"));

				employeesvo.setLast_name(rs.getString("last_name"));
				employeesvo.setSalary(rs.getLong("salary"));
				employeesvo.setDepartment_id(rs.getInt("department_id"));
				employeesvo.setDepartment_name(rs.getString("department_name"));
				// 언제든지 꺼내서 사용할수 있도록 map에 저장

				list.add(employeesvo); // map은 while이 끝난후 없어지니까 list(arrayList)에 넣어 놓는다.
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
