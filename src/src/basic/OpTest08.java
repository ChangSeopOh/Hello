package basic;

public class OpTest08 {
	public static void main(String[] args) {
		byte i=1; //111(2)
		byte j=4; //100(2) 
		
		// 비트연산자 : 십진수 -> 이진수로 변경해서 계산
		
		System.out.println(i | j); // | 연산자 : 하나라도 1이면 1이다.
		System.out.println(i & j); // & 연산자 : 하나라도 0이면 0이다.
		System.out.println(i ^ j); // ^ 연산자 : 서로 다른값이면 1, 같은 값이면 0
		System.out.println(~i);
		
		/*
		 * 2				10
		 * -------------------------
		 * 0000 0010		2
		 * 0000 0001		1
		 * 0000 0000		0
		 * 1111	1111		-1
		 * 1111	1110 		-2
		 */
		

	}

}
