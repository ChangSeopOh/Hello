package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~99사이의 점수를 입력하세요");

		try {
			int n = sc.nextInt();
			if (!(0<n&&n<100))throw new InputMismatchException();
			System.out.println("입력된 값은 "+n+"입니다.");
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력값입니다.");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
