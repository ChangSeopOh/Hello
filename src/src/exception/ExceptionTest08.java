package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~99������ ������ �Է��ϼ���");

		try {
			int n = sc.nextInt();
			if (!(0<n&&n<100))throw new InputMismatchException();
			System.out.println("�Էµ� ���� "+n+"�Դϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("�߸��� �Է°��Դϴ�.");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
