package API;

public class StringTest05 {
	public static void main(String[] args) {  //이런것은 웹에서 자주사용되기 때문에 외워둬야한다.
		String str ="길태은씨는 몇살때부터 자바를 잘했나?";
		System.out.println(str.charAt(2)); //3번째 문자를 출력한다 0부터 시작하기 떄문에
		System.out.println(str.indexOf("은"));  //"은"이 몇번째에 있는지 출력해준다.
		System.out.println(str.length());
	
		System.out.println(str.indexOf(" ")); //공백이 몇번째인지
		System.out.println(str.lastIndexOf(" ")); //공백이 뒤에서부터 몇번째인지
	
		System.out.println(str.replace("은", "선"));//바꿔준다 문자 혹은 문장을. 그러나 원본은 훼손되지 않는다.
		
		String str2 ="  길태은씨는 몇살때부터 자바를 잘했나?     ";
		
		System.out.println(str2.trim()); //양쪽의 공백을 없앤다.
		System.out.println(str2.substring(8)); //그위치까지 지운다.
		System.out.println(str2.substring(8,10)); //뒤에 숫자(전=9)까지 출력이 된다.  
		
		System.out.println("KillTaeEn".toLowerCase()); //다소문자
		System.out.println("KillTaeEn".toUpperCase()); //다대문자
		
	}
	
}
