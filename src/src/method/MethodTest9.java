package method;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n	 ={100,200};
		int[] d	 ={30,10};
		testFunction(n);	//call by reference �ּ�(����)�� ���� ����
							//�迭���� ��� ���� �ƴ϶� �ּҸ� ���� �ϱ� ������
							//�ȿ� �ִ� ���뵵 �ٲ�� �ȴ�.
		
		
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
