package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jdbcTest14 {
	public static void main(String[] args) {
		List<Map<String, Object>> list = selectEmployees();
		System.out.println("사번\t이름\t급여\t부서번\t부서이름");
		for(Map<String, Object> map : list){
			System.out.print(map.get("employee_id")+"\t");
			
			String last_name = (String)map.get("last_name"); //object로 저장되어있기 때문에 String으로 다운
			if (last_name.length() > 7) {
				last_name = last_name.substring(0, 5) + "…";
		}
			
			System.out.print(printColumn(map.get("last_name"))+"\t");
			System.out.print(printColumn(map.get("salary"))+"\t");
			System.out.print(printColumn(map.get("department_id"))+"\t");
			System.out.print(printColumn(map.get("department_name"))+"\n");
			
			
		}
	}
	private static String printColumn(Object columnValueTemp){
		String columnValue = String.valueOf(columnValueTemp);
		if(columnValue.length()>7){
			columnValue = columnValue.substring(0, 5)+ "…";
		}
		return columnValue;
		
	}
	private static List<Map<String, Object>> selectEmployees() {

		List<Map<String, Object>> list = 
				new ArrayList<Map<String, Object>>(); //

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
				//record를 저장할 hash map을 만든다.
				Map<String, Object>map = new HashMap<String, Object>();
				
				map.put("employee_id",rs.getInt("employee_id"));
				

				map.put("last_name", rs.getString("last_name"));
				map.put("salary", rs.getLong("salary"));
				map.put("department_id", rs.getInt("department_id"));
				map.put("department_name", rs.getString("department_name"));
				//언제든지 꺼내서 사용할수 있도록 map에 저장		
				
				list.add(map); //map은 while이 끝난후 없어지니까 list(arrayList)에 넣어 놓는다.
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
