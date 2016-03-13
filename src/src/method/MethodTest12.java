package method;
import java.util.Scanner;

public class MethodTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("작은 수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("큰 수를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.println(sumNumbers(a, b) + "입니다");
	}

	private static int sumNumbers(int a, int b) {
		int sum = 0;
		int temp = a;

		 if (a > 0 && b > 0) { // 0보다 큰지 아닌지 체크
			if (temp > b) { // 최대 최소값 변환 만약에 바꼇을 경우
				a = b;
				b = temp;
			}
			System.out.print(a + "부터 " + b + "까지 정수의 합계는 ");
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