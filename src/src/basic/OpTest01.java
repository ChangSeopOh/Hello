package basic;
import java.util.Scanner;
public class OpTest01 {
	public static void main(String[] args) {
		// ������� 5���� 
		// +,-,*,%,/
		int a = 7;
		int b = 4;
		//int a =7, b=4; ���µ� ����
		System.out.println(a+"+"+b+"= "+(a+b)); //��ȣ���� �Է��ϸ� 74��µ�
		System.out.println(a+"-"+b+"= "+(a-b));
		System.out.println(a+"/"+b+"= "+(a/b));
		System.out.println(a+"*"+b+"= "+(a*b)); 
		System.out.println(a+"%"+b+"= "+(a%b));
		/* http://docs.oracle.com/javase/8/docs/api/index.html
		 * �ڹ� API
		 * scanner
		 * Scanner sc = new Scanner(new File("myNumbers")); �ϱ� */
		Scanner sc = new Scanner(System.in);
		System.out.print("c : "); int c = sc.nextInt();
		System.out.print("d : "); int d = sc.nextInt();
		System.out.println(c+"+"+d+"= "+(c+d));
		System.out.println(c+"-"+d+"= "+(c-d));
		System.out.println(c+"/"+d+"= "+(c/d));
		System.out.println(c+"*"+d+"= "+(c*d)); 
		System.out.println(c+"%"+d+"= "+(c%d));
		/*import ���� java.util.Scanner �� ���� ���� ����
		 * Ctrl+Space �ڵ����� import ��Ű��
		 * Ctrl+Shift+F5 �ϸ� �ڵ����� ��� import �ȴ�.
		 * Alt+Shift+S �ҽ�â ���� ����
		 * Ctrl+Shift+O*/
	}
}