package control;

public class Star2 {
	public static void main(String[] args) {
		/*
		 * *****	1�� 5�� 
		 * ****		2�� 4��
		 * ***		3�� 3��
		 * **		4�� 2��
		 * *		5�� 1��
		 * �� + �� <= 6
		 * i + j <= 6
		 * j <= 6 - i
		 */
		
		for (int i=1; i<=5; ++i) {
			for(int j=1; j<=6-i ; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
