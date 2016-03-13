package method;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1.가위 2.바위 3.보 입력 : ");
		int you = sc.nextInt();
		int com = (int) ((Math.random() * 3) + 1); // 1이상 3이하의 정수 출력

		System.out.print("You : ");

		caption(you);

		System.out.print("Computer : ");

		caption(com);

		winner(you, com);

	}

	private static void winner(int you, int com) {

		int result = you - com;

		switch ((result + 3) % 3) {
		case 1:
			System.out.println("Win");
			break;

		case 2:
			System.out.println("Lose");
			break;

		case 0:
			System.out.println("Draw");
			break;
		}
	}

	private static String caption(int value) {
		switch (value) {
		case 1: return"가위";
		case 2: return"바위";
		case 3: return"보";
		default: return"에러";
		}

	}
}