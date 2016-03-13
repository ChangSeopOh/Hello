package control;

public class Star3 {
	/*
	 * ***** 1행 1,2,3,4,5열 공백 0 1행은 1열부터 
	 *  **** 2행    2,3,4,5열 공백 1 2행은 2열부터
	 *   *** 3행       3,4,5열 공백 2 3행은 3열부터
	 *    ** 4행          4,5열 공백 3 4행은 4열부터
	 *     * 5행             5열 공백 4 5행은 5열부터
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
	