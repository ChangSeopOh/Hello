package basic;
//��������
/*
 * AND && �ϳ��� false�̸� false, �Ѵ� true�� �� ����� true 
 * OR || �ϳ��� true�̸� true, �Ѵ� false�� �� ����� false
 * NOT
 */
public class OpTest03 {
	public static void main(String[] args) {
		boolean a,b;
		a = true; b = true;
		System.out.println(a && b); //��AND ��°� true
		System.out.println(a || b); //��OR ��°� true
		System.out.println(!a); //NOT ��°� false
		System.out.println();
		a = false; b = true;
		System.out.println(a && b); //��AND ��°� false
		System.out.println(a || b); //��OR ��°� true
		System.out.println(!a); //NOT ��°� true
		System.out.println();		
		a = false; b = false;
		System.out.println(a && b); //��AND ��°� false
		System.out.println(a || b); //��OR ��°� false
		System.out.println(!a); //NOT ��°� true
		System.out.println();
	}
}
