package API;

public class StringTest04 {
	public static void main(String[] args) {
		String str1= "길태은씨는 몇살때부터 자바를 잘했나?";
		String str2= "길태은씨는 몇살때부터 자바를 잘했나?";
		
		//str1 = str1.replace("몇살때부터", "언제부터");//str2와 완전히 달라짐.
		
		
		System.out.println(str1.replace("몇살때부터", "언제부터"));
							//원본은 변경하지 않는다 그이유는 str1과 str2는 같은 주소를 사용하고 있는데
							//변경해버리면 str2도 변경될수도 있고, 복잡해진다.
						
		//System.out.println(str1+"????????????");	//값을 복제하고나서 ??????을 붙인다.
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
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
