package Thread;


public class threadTest01 {
	public static void main(String[] args) {

		run();
		for (int i = 1; i <= 5; i++) {
			System.out.println("main : " + i);
			for (long k = 1; k <= 1000000000l; k++);

		}
		System.out.println("main end");

	}

	private static void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("run : " + i);
			for (long k = 1; k <= 1000000000l; k++);
		}
		System.out.println("rund end");
	}

}
