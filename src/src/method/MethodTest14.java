package method;

import java.util.Scanner;

public class MethodTest14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 10;
		int[] n = new int[size];

		for (int i = 0; i < size; i++) {
			// System.out.print("1���� 99������ ���� �Է� n" + i + " ��° >");
			n[i] = (int) ((Math.random() * 99) + 1);// sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j]) {
					n[i] = 0;
					i--;
					break;
				}
			}
			printArray(n);
		}
		// 
//		SelectionSort(n);
		bubbleSort(n);
		printArray(n);
		// bubble sort�� ����
	}

//	private static void SelectionSort(int[] n) {
//		System.out.println("Selection sort");
//
//		for (int i = 0; i < n.length - 1; i++) { // i�� 1�� �Ǵ¼��� 0�� �Ű�Ⱦ��� ������
//			for (int j = i + 1; j < n.length; j++) { // j�� i�� �Ű�ᵵ �ȴ�.
//				if (n[i] > n[j]) {
//					int temp = n[i];
//					n[i] = n[j];
//					n[j] = temp;
//				}
//
//			}
//
//		}
//	}

	private static void bubbleSort(int[] n) {
		System.out.println("bubble sort");

		for (int i = 1; i < n.length; i++)// ���� -1�� ��ŭ
		{
			for (int j = 0; j < n.length - 1; j++)// ���� -1�� ��ŭ ����⶧����
			{
				if (n[j] > n[j + 1]) {
					int temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}

			}

		}
	}

	private static void printArray(int[] n) {
		for (int num : n) {

			System.out.print(num + "\t");
		}
		System.out.println();
	}
}
