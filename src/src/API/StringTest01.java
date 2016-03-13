package API;

public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "안녕하세요~";//문자형은 이미 만들어진 곳을 쓴다.
		String str2 = "안녕하세요~";//숫자형은 별개이다. 

		if (str1 == str2) {

			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str1.equals(str2)) {

			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}	
	
	
	
	
	
	}
	
}
