package method;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n	 ={100,200};
		int[] d	 ={30,10};
		testFunction(n);	//call by reference 주소(참조)에 의한 전달
							//배열같은 경우 값이 아니라 주소를 전달 하기 때문에
							//안에 있는 내용도 바뀌게 된다.
		
		
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		testFunction(d);
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		
		

	}

	private static void testFunction(int[] n) {
			int temp = n[0];
			n[0] = n[1];
			n[1] = temp;
			
	}	
}
