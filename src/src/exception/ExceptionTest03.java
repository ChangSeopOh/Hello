package exception;

public class ExceptionTest03 {
	public static void main(String[] args) {

		System.out.println("main Block");
		try {
			runMethod();
		} catch (ArithmeticException | NullPointerException e) { //Java8���ʹ� |�� �̿��Ͽ� 2�� �̻��� ���� �ֵ�.
			System.out.println("Specific issues");
		} catch (Exception e) {
			System.out.println("Catch BLock");
		}

		System.out.println("The End");
	}

	private static void runMethod() throws Exception{ //�޼ҵ�ȿ��� Catch�� �ț������
													//thorws Exception�� �ۼ��ϴ� ���� ����.
		System.out.println("runMethod Block");

		try {
			System.out.println(18 / 0);
		} finally {
			System.out.println("Finally Block");
		}

	}

}
