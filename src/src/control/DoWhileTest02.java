package control;

public class DoWhileTest02 {
	public static void main(String[] args) {
		int i;
		int j;
		
		do {
			i = (int) (Math.random() * 6) + 1;
			j = (int) (Math.random() * 6) + 1;
		} while (i==j); //i�� j�� �������� ������ �ٽ� ���ư���. �Ʒ� ��°��� ������ �ٸ� ���� ���´� Ȯ��
		System.out.println(i+", "+j);	
	}
}
