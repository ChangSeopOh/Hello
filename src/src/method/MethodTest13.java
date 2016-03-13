package method;

import java.util.Scanner;

public class MethodTest13 {
	public static void main(String[] args) {
		int[] n = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.print("작은 수를 입력하세요 : ");
		n[0] = sc.nextInt();
		System.out.print("큰 수를 입력하세요 : ");
		n[1] = sc.nextInt();

		swap(n);
		System.out.println(n[0] + "부터 " + n[1] + "까지 정수의 합계는" + sumNumbers(n[0], n[1]) + "입니다");
	}

	private static void swap(int[] n) { // 큰수 작은수 맞게끔 치환
		if (n[0] > n[1]) {
			int temp = n[0];
			n[0] = n[1];
			n[1] = temp;
		}
	}

	private static int sumNumbers(int a, int b) {
		int sum = 0;

		if (a > 0 && b > 0) { // 0보다 큰지 아닌지 체크
			for (int count = a; count <= b; count++) { // 최소값 최대값 합계
				sum += count;
			}
		} else {
			System.out.println("숫자가 양수가 아닙니다.\n종료하겠습니다.");
			System.exit(0);
		}
		return sum;
	}
}