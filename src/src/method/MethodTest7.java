package method;

public class MethodTest7 {
	public static void main(String[] args) {
		
		int a=10;
		testFunction(a); // call by value (���� ���� ����)
		
		
		System.out.println("main : "+ a);
	}

	
	
	
	private static void testFunction(int a) {
	 a+=10;
	 System.out.println("testFunction : "+a);
		
	}
}
