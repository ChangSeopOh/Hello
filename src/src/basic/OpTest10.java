package basic;

public class OpTest10 {
	public static void main(String[] args) {
		short a = 0xA1; //16진수 표현할 때
		a = (short)(a<<2); //2비트 left shift
		System.out.println(a); 
		System.out.println(a>>2);
	}
}
