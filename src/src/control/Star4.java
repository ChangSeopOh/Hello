package control;

public class Star4 {
	/*
	 *     * 1��             5�� i+j=6
	 *    ** 2��          4,5��       6,7
	 *   *** 3��       3,4,5��       6,7,8
	 *  **** 4��    2,3,4,5��       6,7,8,9
	 * ***** 5�� 1,2,3,4,5��       6,7,8,9,10
	 * i+j>=6
	 * j>=6-i
	 * j>=6-i ? "*":" "
	 */
	
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			/*for(int k=0;k<5-i;k++) {
				System.out.print(" ");
			}*/
			for(int j=0; j<5;j++) {
				System.out.print(j>=(4-i) ? "*":" ");
			}
			System.out.println();
		}
		
		
		System.out.println("����");
	}
}
