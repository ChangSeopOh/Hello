package API;

public class StringTest06 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("길태은씨는 몇살때부터 자바를 잘했나?");
		
		sb.replace(6, 11, "언제부터");
		
		System.out.println(sb.toString());
		
		sb.insert(6, "대체 ");  //insert 삽입
		System.out.println(sb.toString());
		
		sb.delete(6, 9); //Delete 삭제(Starting point, Ending Point) 몇몇 다른툴들은 2번째가 갯수일 수 있다.
		System.out.println(sb.toString());
		System.out.println(sb.reverse()); //거꾸로
		
	}
}
