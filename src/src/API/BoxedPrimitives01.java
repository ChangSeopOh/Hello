package API;

public class BoxedPrimitives01 {
	public static void main(String[] args) {
		
		//Integer i0 = Integer.valueOf(10); //java 5 이전
		Integer i1 = new Integer(10);  //참조형, 기본자료형이아니다
		Integer i2 = 10; // auto boxing(java 5 이후)
		
		int i3 = i1; // int는 기본자료형이다. 이것은 auto unboxing이라고 한다
		
		Object obj1 = 10;	// java 7 nf
		Object obj2 = (Integer)10;	// java 5 nf
		
		int i4 = (int)obj1;	//java 7nf 	
		int i5 = (Integer)obj2; //java 5nf
		
		int i6 = Integer.parseInt("10"); //문자에 해당하는 숫자를 Int로 바꿔준다. only 10진수 정수.
		int i7 = Integer.valueOf("10"); 
		
		
	}
	
}
