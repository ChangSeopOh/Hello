package basic;
import java.util.Scanner;

public class OpTest12 {
	// OpTest12 Ŭ��������
	// 1. Scanner�� �̿��Ͽ� ������ �Է¹޾Ƽ� ����̸� "����Դϴ�."
	//    ������ ������ "�����Դϴ�. 0�̸� "����� ������ �ƴմϴ�."
	// 2. ¦��, Ȧ�� �Ǹ� : ¦���̸� "¦���Դϴ�." Ȧ���̸� "Ȧ���Դϴ�."
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : "); 
		int i = sc.nextInt();
		
		System.out.println(
				i>0 ? "����Դϴ�." : 
				i<0 ? "�����Դϴ�." :
					  "����� ������ �ƴմϴ�.");
		
		System.out.println(i%2!=0 ? "Ȧ���Դϴ�." : 
			         				"¦���Դϴ�.");
		
		/*
		 * i%2==0 ���� �� ��� i�� ������ ������ ¦���� �����Ƿ� !=0 �� ��Ȯ�ϴ�.
		 */
		
		System.out.println("����");
	}
}
