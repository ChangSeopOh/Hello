package array;

public class ObjectTest1 {
	public static void main(String[] args) {
		Object objnum =10;
		Object objStr = "��ö��";
		
		System.out.println(objnum);
		System.out.println(objStr);
		
		
		
		
		int num = (Integer)objnum; //(int)�� ������ �ڹ�6(�ȵ���̵尳��)������ ����Ҽ� ����.
		String str = (String)objStr;
		
		System.out.println(num);
		System.out.println(str);
		
	}
}
