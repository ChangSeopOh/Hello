package control;

public class Star5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; ++i) {
			for(int j=1; j<=i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=5; ++i) {
			for(int j=1; j<=6-i ; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i<=j ? "*" : " ");
				}
			System.out.println();
			}
		for (int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				System.out.print(j>=(4-i) ? "*":" ");
				}
			System.out.println();
			}
}
}

