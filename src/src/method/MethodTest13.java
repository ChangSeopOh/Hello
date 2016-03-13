package method;

import java.util.Scanner;

public class MethodTest13 {
	public static void main(String[] args) {
		int[] n = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		n[0] = sc.nextInt();
		System.out.print("ū ���� �Է��ϼ��� : ");
		n[1] = sc.nextInt();

		swap(n);
		System.out.println(n[0] + "���� " + n[1] + "���� ������ �հ��" + sumNumbers(n[0], n[1]) + "�Դϴ�");
	}

	private static void swap(int[] n) { // ū�� ������ �°Բ� ġȯ
		if (n[0] > n[1]) {
			int temp = n[0];
			n[0] = n[1];
			n[1] = temp;
		}
	}

	private static int sumNumbers(int a, int b) {
		int sum = 0;

		if (a > 0 && b > 0) { // 0���� ū�� �ƴ��� üũ
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