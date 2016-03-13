package basic;

public class Primitive {
	public static void main(String[] args) {
		int i = 10; //int타입은 4바이트 값이 저장된다.
		System.out.println(i);
		
		boolean b = true;
		System.out.println(b);
		
		char c = '뷁'; //char 타입은 반드시 홑따옴표 '' 이용, 하나의 문자만 저장할 수 있다.
		System.out.println("c : "+c);
		
		short s = 32767; //short 값의 최대치는 32767, 32768 입력시 에러
		System.out.println("s : "+s);
		
		int a = 2147483647 + 1; //int의 최대치는 2147483647
		System.out.println("a = "+a); //최대치를 넘어가면 가장 최소값으로 넘어가서 출력된다.
		
		long 뤩1 = 2147483648l; //l을 추가함
		System.out.println("l1 : "+뤩1);
		
		float f = 3.1415926535f; //f없이 입력하면 out of range 오류
		System.out.println("f = "+f);//float타입으로 표현할 수 있는 근사치로 출력된다.
		
		double d = 3.1415926535;
		System.out.println("d : "+d); //정밀도 유지된 채로 출력된다.
		
		byte b2 = 10;
		System.out.println("b2 = "+b2);
		/*
		 * primitive type
		 * 1. boolean : 1bit / 실질적 메모리 할당은 1byte / true or false
		 * 2. byte : 8bits / 실질적 메모리 할당은 1byte 0000 0000 ~ 1111 1111
		 * 3. char : 2bytes / 2의 16승가지 수 / 0~65535가지
		 * 4. int : 4bytes / 2^32 가지 수를 지정할 수 있다. / -2^31 ~ 2^31-1 까지 표현범위 지정 가능 / +-20억가지 정의 가능
		 * 5. short : 2bytes / -2^15 ~ 2^15-1가지의 표현범위 / +-3만가지 정의 가능
		 * 6. long : 8bytes / +-900경 표현범위
		 * 7. double : 8bytes / 정수는 int type을 가장 많이 사용
		 * 			    실수는 정확히 사용해야하므로 double 타입 사용
		 * 8. float : 4bytes  
		 * primitive 타입은 heap에 따로 저장하는 것이 아닌 메모리 주소를 각각 가지고 있다.
		 */
		
		//Escape sequence : 특수문자이용할 때 사용할 땐 \를 이용한다.
		System.out.println("해리가 외쳤다. \"이 빵꾸똥꾸야.\"");
		System.out.println("\t\"일정한간격유지\"");
		System.out.println("제목\t이름\t조회수");
		System.out.println("하이\t아이유\t100");
		System.out.println("\\\\");
		
		/*
		 * 
		 */
	}
}