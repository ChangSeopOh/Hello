package basic;

public class OpTest08 {
	public static void main(String[] args) {
		byte i=1; //111(2)
		byte j=4; //100(2) 
		
		// ��Ʈ������ : ������ -> �������� �����ؼ� ���
		
		System.out.println(i | j); // | ������ : �ϳ��� 1�̸� 1�̴�.
		System.out.println(i & j); // & ������ : �ϳ��� 0�̸� 0�̴�.
		System.out.println(i ^ j); // ^ ������ : ���� �ٸ����̸� 1, ���� ���̸� 0
		System.out.println(~i);
		
		/*
		 * 2				10
		 * -------------------------
		 * 0000 0010		2
		 * 0000 0001		1
		 * 0000 0000		0
		 * 1111	1111		-1
		 * 1111	1110 		-2
		 */
		

	}

}
