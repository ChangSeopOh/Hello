package method;

public class MethodTest2 {
	public static void main(String[] args) {
		
		String name ="������";
		hello(name);
	
		
		hello();
		
		System.out.println("The End");
		
	}

	private static void hello(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("�ȳ��ϼ���~"+name+"�Դϵ�");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	private static void hello() {
		// TODO Auto-generated method stub
		System.out.println("^^^^^^^^^^^");
		System.out.println("�ȳ��ϼ���~");
		System.out.println("~~~~~~~~~~~");
	}
	
	
}
