package exception;

public class ExceptionTest03 {
	public static void main(String[] args) {

		System.out.println("main Block");
		try {
			runMethod();
		} catch (ArithmeticException | NullPointerException e) { //Java8부터는 |을 이용하여 2개 이상을 쓸수 있따.
			System.out.println("Specific issues");
		} catch (Exception e) {
			System.out.println("Catch BLock");
		}

		System.out.println("The End");
	}

	private static void runMethod() throws Exception{ //메소드안에서 Catch를 안썻을경우
													//thorws Exception을 작성하는 것이 좋다.
		System.out.println("runMethod Block");

		try {
			System.out.println(18 / 0);
		} finally {
			System.out.println("Finally Block");
		}

	}

}
