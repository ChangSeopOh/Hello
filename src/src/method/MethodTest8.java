package method;

public class MethodTest8 {
	public static void main(String[] args) {
		
		int a=10;
		a = testFunction(a); // call by value (값에 의한 전달)
		//a= 은 testFunction(a)를 불러온뒤에 그 값을 a에 넣는다
		testFunction(a);
		a = testFunction(a);
		
		testFunction(a);
		System.out.println("main : "+ a);
		
		testFunction(a);
		a = testFunction(a);
	}

	
	
	
	private static int testFunction(int a) {  //void는 값을 전달안하지만 자료형(int Strong)등을 입력시 반환될 수 있다
	 a+=10;
	 System.out.println("testFunction : "+a);
	return a; // a반환
	}
}
