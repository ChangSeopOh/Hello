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
		 * 행을 담당하는 변수는 i, 열을 담당하는 변수는 j
		 * *		1행 1열 * 출력
		 * **		2행 1,2열 * 출력
		 * ***		3행 1,2,3열 * 출력
		 * ****		4행 1,2,3,4열 * 출력
		 * *****	5행 1,2,3,4,5열 * 출력
		 * 행>=열
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