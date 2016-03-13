package baekjoon;

import java.util.Scanner;

public class Insertion {
	public static void main(String[] args) {
		int[] com = new int[10];

		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 99);
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					com[i] = 0;
					i--;
					break;
				}
			}
		}

		print(com);

		InsertionSort(com);
		print(com);
		Scanner sc = new Scanner(System.in);

		int user = sc.nextInt();
		for (int i = 0; i < com.length; i++) {
			if (user == com[i]) {
				System.out.println((i + 1) + "번째 입니다.");
			}
		}
	}
	
	
	

	private static void print(int[] com) {
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();

	}

	private static void InsertionSort(int[] com) {

		for (int i = 1; i < com.length; i++) {
			int temp = com[i];
			int sub = i - 1;

			while ((sub >= 0) && com[sub] > temp) {
				com[sub + 1] = com[sub];
				sub--;
			}
			com[sub + 1] = temp;

		}

	}

}
