package control;

public class Star2 {
	public static void main(String[] args) {
		/*
		 * *****	1青 5凯 
		 * ****		2青 4凯
		 * ***		3青 3凯
		 * **		4青 2凯
		 * *		5青 1凯
		 * 青 + 凯 <= 6
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
