package basic;
//논리연산자
/*
 * AND && 하나라도 false이면 false, 둘다 true면 그 결과도 true 
 * OR || 하나라도 true이면 true, 둘다 false면 그 결과도 false
 * NOT
 */
public class OpTest03 {
	public static void main(String[] args) {
		boolean a,b;
		a = true; b = true;
		System.out.println(a && b); //논리AND 출력값 true
		System.out.println(a || b); //논리OR 출력값 true
		System.out.println(!a); //NOT 출력값 false
		System.out.println();
		a = false; b = true;
		System.out.println(a && b); //논리AND 출력값 false
		System.out.println(a || b); //논리OR 출력값 true
		System.out.println(!a); //NOT 출력값 true
		System.out.println();		
		a = false; b = false;
		System.out.println(a && b); //논리AND 출력값 false
		System.out.println(a || b); //논리OR 출력값 false
		System.out.println(!a); //NOT 출력값 true
		System.out.println();
	}
}
