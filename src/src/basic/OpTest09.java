package basic;

public class OpTest09 {
	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		System.out.println("i : "+i);
		System.out.println("j : "+j);
		System.out.println("switch");
		/*int temp;
		temp = i;
		i = j;
		j = temp;*/
		
		i ^=j; //i = i ^ j;
		j ^=i; //j = j ^ i;
		i ^=j; //i = i ^ j; ^ ������ : ���� �ٸ����̸� 1, ���� ���̸� 0
		
		System.out.println("i : "+i);
		System.out.println("j : "+j);
	}
}
