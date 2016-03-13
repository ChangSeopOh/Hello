package basic;
import java.util.Scanner;
public class OpTest01 {
	public static void main(String[] args) {
		// 산술연산 5가지 
		// +,-,*,%,/
		int a = 7;
		int b = 4;
		//int a =7, b=4; 형태도 가능
		System.out.println(a+"+"+b+"= "+(a+b)); //괄호없이 입력하면 74출력됨
		System.out.println(a+"-"+b+"= "+(a-b));
		System.out.println(a+"/"+b+"= "+(a/b));
		System.out.println(a+"*"+b+"= "+(a*b)); 
		System.out.println(a+"%"+b+"= "+(a%b));
		/* http://docs.oracle.com/javase/8/docs/api/index.html
		 * 자바 API
		 * scanner
		 * Scanner sc = new Scanner(new File("myNumbers")); 암기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("c : "); int c = sc.nextInt();
		System.out.print("d : "); int d = sc.nextInt();
		System.out.println(c+"+"+d+"= "+(c+d));
		System.out.println(c+"-"+d+"= "+(c-d));
		System.out.println(c+"/"+d+"= "+(c/d));
		System.out.println(c+"*"+d+"= "+(c*d)); 
		System.out.println(c+"%"+d+"= "+(c%d));
		/*import 없이 java.util.Scanner 로 변수 선언 가능
		 * Ctrl+Space 자동으로 import 시키기
		 * Ctrl+Shift+F5 하면 자동으로 모두 import 된다.
		 * Alt+Shift+S 소스창 보기 가능
		 * Ctrl+Shift+O*/
	}
}