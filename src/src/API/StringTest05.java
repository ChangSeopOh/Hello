package API;

public class StringTest05 {
	public static void main(String[] args) {  //�̷����� ������ ���ֻ��Ǳ� ������ �ܿ��־��Ѵ�.
		String str ="���������� ��춧���� �ڹٸ� ���߳�?";
		System.out.println(str.charAt(2)); //3��° ���ڸ� ����Ѵ� 0���� �����ϱ� ������
		System.out.println(str.indexOf("��"));  //"��"�� ���°�� �ִ��� ������ش�.
		System.out.println(str.length());
	
		System.out.println(str.indexOf(" ")); //������ ���°����
		System.out.println(str.lastIndexOf(" ")); //������ �ڿ������� ���°����
	
		System.out.println(str.replace("��", "��"));//�ٲ��ش� ���� Ȥ�� ������. �׷��� ������ �Ѽյ��� �ʴ´�.
		
		String str2 ="  ���������� ��춧���� �ڹٸ� ���߳�?     ";
		
		System.out.println(str2.trim()); //������ ������ ���ش�.
		System.out.println(str2.substring(8)); //����ġ���� �����.
		System.out.println(str2.substring(8,10)); //�ڿ� ����(��=9)���� ����� �ȴ�.  
		
		System.out.println("KillTaeEn".toLowerCase()); //�ټҹ���
		System.out.println("KillTaeEn".toUpperCase()); //�ٴ빮��
		
	}
	
}
