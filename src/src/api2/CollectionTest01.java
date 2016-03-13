package api2;

import java.util.ArrayList;

public class CollectionTest01 {
	public static void main(String[] args) {
		// <String> = only StringŸ���̰ų� ��ĳ���õ� �͸� ���� ������.
		// �̷����� �ΰ� Generic�̶�� �Ѵ�.
		ArrayList<String> list = new ArrayList<>();// ������ ����, ���� ���� ���� ����
		list.add("����Ŭ���");printlist(list);
		list.add("���� ��");printlist(list);
		list.add("���������� ��ī������");printlist(list);
		list.add("��â��");printlist(list);
		list.remove(2);printlist(list);			//����
		list.set(1,"����");printlist(list);		//����
		list.add(0, "����ȣ");printlist(list); // �߰�
		System.out.println(list.get(3)); 		//��ȸ
		System.out.println(list.size());  //0���Ͱ� �ƴ϶� 1���� �����ľ�.
		
		// for(int i = 0; i< list.size();i++){ //size�� length�� ����. ������ ��
		// System.out.println(list.get(i));
		// }

		// for(Object obj:list){ //java 7 nf
		// System.out.println(obj); //���� Generic�� ����ϸ� �������.
		// }

		// for(Object obj:list){ //java 5 nf
		// System.out.println((String)obj);
		// }
		// for(String name:list){ //java 6 nf
		// System.out.println((String)name);
		// }

	}

	private static void printlist(ArrayList<String> list) {
		for (String name : list) {
			System.out.print(name + "\t");
		}
		System.out.println();
	}
}
