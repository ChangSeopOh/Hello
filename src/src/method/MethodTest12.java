package method;
import java.util.Scanner;

public class MethodTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("ū ���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		System.out.println(sumNumbers(a, b) + "�Դϴ�");
	}

	private static int sumNumbers(int a, int b) {
		int sum = 0;
		int temp = a;

		 if (a > 0 && b > 0) { // 0���� ū�� �ƴ��� üũ
			if (temp > b) { // �ִ� �ּҰ� ��ȯ ���࿡ �ٲ��� ���
				a = b;
				b = temp;
			}
			System.out.print(a + "���� " + b + "���� ������ �հ�� ");
			for (int count = a; count <= b; count++) { // �ּҰ� �ִ밪 �հ�
				sum += count;
			}
		} else {
			System.out.println("���ڰ� ����� �ƴմϴ�.\n�����ϰڽ��ϴ�.");
			System.exit(0);
		}
		return sum;
	}
}