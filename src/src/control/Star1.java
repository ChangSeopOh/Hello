package control;

public class Star1 {
	public static void main(String[] args) {
		/*
		 * for(int i=0;i<5;i++) { 
		 * 		for(int j=0;j<5;j++) { 
		 * 			System.out.print("*");
		 * 		} 
		 * System.out.println(); 
		 * 	}
		 */
		
		/*
		 * ���� ����ϴ� ������ i, ���� ����ϴ� ������ j
		 * *		1�� 1�� * ���
		 * **		2�� 1,2�� * ���
		 * ***		3�� 1,2,3�� * ���
		 * ****		4�� 1,2,3,4�� * ���
		 * *****	5�� 1,2,3,4,5�� * ���
		 * ��>=��
		 * i>=j
		 */
		
		for(int i=1; i<=5; ++i) {
			for(int j=1; j<=i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}