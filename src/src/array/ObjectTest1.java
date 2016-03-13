package array;

public class ObjectTest1 {
	public static void main(String[] args) {
		Object objnum =10;
		Object objStr = "김철수";
		
		System.out.println(objnum);
		System.out.println(objStr);
		
		
		
		
		int num = (Integer)objnum; //(int)도 되지만 자바6(안드로이드개발)에서는 사용할수 없다.
		String str = (String)objStr;
		
		System.out.println(num);
		System.out.println(str);
		
	}
}
