package method;

public class MethodTest8 {
	public static void main(String[] args) {
		
		int a=10;
		a = testFunction(a); // call by value (���� ���� ����)
		//a= �� testFunction(a)�� �ҷ��µڿ� �� ���� a�� �ִ´�
		testFunction(a);
		a = testFunction(a);
		
		testFunction(a);
		System.out.println("main : "+ a);
		
		testFunction(a);
		a = testFunction(a);
	}

	
	
	
	private static int testFunction(int a) {  //void�� ���� ���޾������� �ڷ���(int Strong)���� �Է½� ��ȯ�� �� �ִ�
	 a+=10;
	 System.out.println("testFunction : "+a);
	return a; // a��ȯ
	}
}
