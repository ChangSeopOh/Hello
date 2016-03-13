package basic;
//관계연산자
//>, <, >=, <=, ==, !=
public class OpTest02 {
	public static void main(String[] args) {
		int a = 7;
		int b = 4;
		
		System.out.println(a+" > "+b+" : "+(a>b));
		System.out.println(a+" < "+b+" : "+(a<b));
		System.out.println(a+" >= "+b+" : "+(a>=b));
		System.out.println(a+" <= "+b+" : "+(a<=b));
		System.out.println(a+" != "+b+" : "+(a!=b));
		System.out.println(a+" == "+b+" : "+(a==b));
	}
//계산 순서 : 괄호 > 산술 > 관계 > 논리 
}
