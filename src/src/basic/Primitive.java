package basic;

public class Primitive {
	public static void main(String[] args) {
		int i = 10; //intŸ���� 4����Ʈ ���� ����ȴ�.
		System.out.println(i);
		
		boolean b = true;
		System.out.println(b);
		
		char c = '��'; //char Ÿ���� �ݵ�� Ȭ����ǥ '' �̿�, �ϳ��� ���ڸ� ������ �� �ִ�.
		System.out.println("c : "+c);
		
		short s = 32767; //short ���� �ִ�ġ�� 32767, 32768 �Է½� ����
		System.out.println("s : "+s);
		
		int a = 2147483647 + 1; //int�� �ִ�ġ�� 2147483647
		System.out.println("a = "+a); //�ִ�ġ�� �Ѿ�� ���� �ּҰ����� �Ѿ�� ��µȴ�.
		
		long ��1 = 2147483648l; //l�� �߰���
		System.out.println("l1 : "+��1);
		
		float f = 3.1415926535f; //f���� �Է��ϸ� out of range ����
		System.out.println("f = "+f);//floatŸ������ ǥ���� �� �ִ� �ٻ�ġ�� ��µȴ�.
		
		double d = 3.1415926535;
		System.out.println("d : "+d); //���е� ������ ä�� ��µȴ�.
		
		byte b2 = 10;
		System.out.println("b2 = "+b2);
		/*
		 * primitive type
		 * 1. boolean : 1bit / ������ �޸� �Ҵ��� 1byte / true or false
		 * 2. byte : 8bits / ������ �޸� �Ҵ��� 1byte 0000 0000 ~ 1111 1111
		 * 3. char : 2bytes / 2�� 16�°��� �� / 0~65535����
		 * 4. int : 4bytes / 2^32 ���� ���� ������ �� �ִ�. / -2^31 ~ 2^31-1 ���� ǥ������ ���� ���� / +-20�ﰡ�� ���� ����
		 * 5. short : 2bytes / -2^15 ~ 2^15-1������ ǥ������ / +-3������ ���� ����
		 * 6. long : 8bytes / +-900�� ǥ������
		 * 7. double : 8bytes / ������ int type�� ���� ���� ���
		 * 			    �Ǽ��� ��Ȯ�� ����ؾ��ϹǷ� double Ÿ�� ���
		 * 8. float : 4bytes  
		 * primitive Ÿ���� heap�� ���� �����ϴ� ���� �ƴ� �޸� �ּҸ� ���� ������ �ִ�.
		 */
		
		//Escape sequence : Ư�������̿��� �� ����� �� \�� �̿��Ѵ�.
		System.out.println("�ظ��� ���ƴ�. \"�� ���ٶ˲پ�.\"");
		System.out.println("\t\"�����Ѱ�������\"");
		System.out.println("����\t�̸�\t��ȸ��");
		System.out.println("����\t������\t100");
		System.out.println("\\\\");
		
		/*
		 * 
		 */
	}
}