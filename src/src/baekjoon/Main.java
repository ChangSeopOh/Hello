package baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer();
		StringBuffer sb5 = new StringBuffer();
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String input3 = sc.nextLine();
		String input4 = sc.nextLine();
		String input5 = sc.nextLine();

		sb1.append(input1);
		trim(sb1);
		sb2.append(input2);
		trim(sb2);
		sb3.append(input3);
		trim(sb3);
		sb4.append(input4);
		trim(sb4);
		sb5.append(input5);
		trim(sb5);

		String result = "";

		for (int i = 0; i < 15; i++) {

			result += sb1.charAt(i);
			result += sb2.charAt(i);
			result += sb3.charAt(i);
			result += sb4.charAt(i);
			result += sb5.charAt(i);

		}
		System.out.print(result.replaceAll(" ", ""));

	}

	private static void trim(StringBuffer s) {
		for (int i = s.length() - 1; i < 15; i++) {
			s.append(" ");

		}

	}

}