package basic;

public class OpTest10 {
	public static void main(String[] args) {
		short a = 0xA1; //16���� ǥ���� ��
		a = (short)(a<<2); //2��Ʈ left shift
		System.out.println(a); 
		System.out.println(a>>2);
	}
}
