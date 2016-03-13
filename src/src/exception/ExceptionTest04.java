package exception;

public class ExceptionTest04 {
	public static void main(String[] args) {//throws Exception를 메인에다가하면 안한것과 같다.
											
		System.out.println("main Block");

		try {
			runMethod();
		} catch (Exception e) {
		System.out.println("Error");
			e.printStackTrace();
		}

		System.out.println("The End");
	}

	private static void runMethod() throws Exception {//throws Exception 는 에러날경우, 호출한쪽으로 넘긴다.
		System.out.println("runMethod Block");

		throw new ArithmeticException();//강제로 에러 출력, 테스트를 위해서라도 필요함

	}

}
