package control;

public class Star3 {
	/*
	 * ***** 1�� 1,2,3,4,5�� ���� 0 1���� 1������ 
	 *  **** 2��    2,3,4,5�� ���� 1 2���� 2������
	 *   *** 3��       3,4,5�� ���� 2 3���� 3������
	 *    ** 4��          4,5�� ���� 3 4���� 4������
	 *     * 5��             5�� ���� 4 5���� 5������
	 *  j
	 *   
	 *   
	 *     
	 */
	
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i<=j ? "*" : " ");
				}
			System.out.println();
			}
		}
}
	