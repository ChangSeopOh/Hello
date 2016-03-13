package method;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1.���� 2.���� 3.�� �Է� : ");
		int you = sc.nextInt();
		int com = (int) ((Math.random() * 3) + 1); // 1�̻� 3������ ���� ���

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
		case 1: return"����";
		case 2: return"����";
		case 3: return"��";
		default: return"����";
		}

	}
}