package API;

public class StringTest04 {
	public static void main(String[] args) {
		String str1= "���������� ��춧���� �ڹٸ� ���߳�?";
		String str2= "���������� ��춧���� �ڹٸ� ���߳�?";
		
		//str1 = str1.replace("��춧����", "��������");//str2�� ������ �޶���.
		
		
		System.out.println(str1.replace("��춧����", "��������"));
							//������ �������� �ʴ´� �������� str1�� str2�� ���� �ּҸ� ����ϰ� �ִµ�
							//�����ع����� str2�� ����ɼ��� �ְ�, ����������.
						
		//System.out.println(str1+"????????????");	//���� �����ϰ��� ??????�� ���δ�.
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
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
