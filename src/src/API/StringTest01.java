package API;

public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "�ȳ��ϼ���~";//�������� �̹� ������� ���� ����.
		String str2 = "�ȳ��ϼ���~";//�������� �����̴�. 

		if (str1 == str2) {

			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if (str1.equals(str2)) {

			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}	
	
	
	
	
	
	}
	
}
