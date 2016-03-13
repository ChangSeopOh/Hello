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
		System.out.println("���ʽ� ��ȣ " + lotto[6]);

		for (int h = 0; h < 10000; h++) { // ���
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
			// System.out.println("human Number :"+(c+1)+"��°");
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
				"1�� :" + a + "��\t" + "2�� :" + b + "��\t" + "3�� :" + c + "��\t" + "4�� :" + d + "��\t" + "5�� :" + f + "��");
	}

	private static void SelectionSort(int[] n) {

		for (int i = 0; i < n.length - 1; i++) { // i�� 1�� �Ǵ¼��� 0�� �Ű�Ⱦ��� ������
			for (int j = i + 1; j < n.length; j++) { // j�� i�� �Ű�ᵵ �ȴ�.
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
