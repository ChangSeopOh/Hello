package exception;

public class ExceptionTest02 {
	public static void main(String[] args) {//throws Exception�� ���ο��ٰ��ϸ� ���ѰͰ� ����.
											
		System.out.println("main Block");

		try {
			runMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("The End");
	}

	private static void runMethod() throws Exception {//throws Exception �� ���������, ȣ���������� �ѱ��.
		System.out.println("runMethod Block");

		System.out.println(5 / 0);
		
		
		
//		try {
//			System.out.println(5 / 0);
//		} catch (ArithmeticException e) {
//			System.out.println("can't divide the digit by using zero.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
