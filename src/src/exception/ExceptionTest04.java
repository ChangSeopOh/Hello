package exception;

public class ExceptionTest04 {
	public static void main(String[] args) {//throws Exception�� ���ο��ٰ��ϸ� ���ѰͰ� ����.
											
		System.out.println("main Block");

		try {
			runMethod();
		} catch (Exception e) {
		System.out.println("Error");
			e.printStackTrace();
		}

		System.out.println("The End");
	}

	private static void runMethod() throws Exception {//throws Exception �� ���������, ȣ���������� �ѱ��.
		System.out.println("runMethod Block");

		throw new ArithmeticException();//������ ���� ���, �׽�Ʈ�� ���ؼ��� �ʿ���

	}

}
