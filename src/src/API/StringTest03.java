package API;

public class StringTest03 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  //0:16 ->0�� �������, 16�� �̸�Ȯ���� ����
		StringBuilder sb2 = new StringBuilder(); //Buffer�� ����. �׷��� ��Ƽ�����忡���� ���ۿ� ���� �������� ���ϴ�. 
												//builder�� �̱۾����忡���� �ӵ��� �� ������.
		printStr(sb);
		sb.append("����������");printStr(sb);
		sb.append(" ��춧����");printStr(sb);
		sb.append(" �ڹٸ�");printStr(sb);
		sb.append(" �׷���");printStr(sb);
		sb.append(" ���߳�?");printStr(sb);
		

		
	}

	private static void printStr(StringBuffer sb) {
		System.out.print(sb.length() + ":" + sb.capacity()+":");
		System.out.println(sb.toString());

	}

}
