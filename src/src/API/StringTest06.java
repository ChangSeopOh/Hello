package API;

public class StringTest06 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("���������� ��춧���� �ڹٸ� ���߳�?");
		
		sb.replace(6, 11, "��������");
		
		System.out.println(sb.toString());
		
		sb.insert(6, "��ü ");  //insert ����
		System.out.println(sb.toString());
		
		sb.delete(6, 9); //Delete ����(Starting point, Ending Point) ��� �ٸ������� 2��°�� ������ �� �ִ�.
		System.out.println(sb.toString());
		System.out.println(sb.reverse()); //�Ųٷ�
		
	}
}
