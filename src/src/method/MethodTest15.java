package method;

import java.util.Scanner;

public class MethodTest15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, f = 0, count = 0, bonus = 0;

		int[] lotto = new int[7];
		int[] human = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = 0;
					i--;
					break;
				}
			}

		}

		SelectionSort(lotto);
		System.out.println("Lotto Number");
		printArray(lotto);
		System.out.println("보너스 번호 " + lotto[6]);

		for (int h = 0; h < 10000; h++) { // 사람
			for (int i = 0; i < human.length; i++) {

				human[i] = (int) ((Math.random() * 45) + 1);
				for (int j = 0; j < i; j++) {
					if (human[i] == human[j]) {
						human[i] = 0;
						i--;
						break;
					}
				}

			}

			SelectionSort(human);
			// System.out.println("human Number :"+(c+1)+"번째");
			// printArray(human);

		
			for (int i = 0; i < human.length; i++) {
				if (lotto[i] == human[i]) {
					count += 1;
				}
			}
	
			
			
			if (count >= 6) {

				a++;
			
				
			
				
				
			} else if (count >= 5) {
				
				for (int i = 0; i < human.length; i++) {
					if (lotto[6] == human[i]) {
						bonus += 1;
					}
				}
				
				if (bonus == 1) {
					b++;
		
					
					bonus = 0;
			
				} 
				
				
				else {
					c++;
				}
				
				
				
			} else if (count >= 4) {
				d++;
			} else if (count >= 3) {
				f++;
			}
			count = 0;
		
		}
		System.out.println(
				"1등 :" + a + "명\t" + "2등 :" + b + "명\t" + "3등 :" + c + "명\t" + "4등 :" + d + "명\t" + "5등 :" + f + "명");
	}

	private static void SelectionSort(int[] n) {

		for (int i = 0; i < n.length - 1; i++) { // i가 1이 되는순간 0을 신경안쓰기 때문에
			for (int j = i + 1; j < n.length; j++) { // j는 i만 신경써도 된다.
				if (n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}

			}

		}
	}

	private static void printArray(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {

			System.out.print(+n[i] + "\t");
		}

	}
}
