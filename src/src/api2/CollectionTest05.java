package api2;

import java.util.LinkedList;

public class CollectionTest05 {
	public static void main(String[] args) {
			//�Է¼��������� �����Ҷ��� LinkedList�� ���� ����� ���� �ϴ°��� ArrayList�� �� ����.
		LinkedList<String> list = new LinkedList<>();
		list.add("����Ŭ���");printlist(list);
		list.add("���� ��");printlist(list);
		list.add("���������� ��ī������");printlist(list);
		list.add("��â��");printlist(list);
		list.remove(2);printlist(list);			
		list.set(1,"����");printlist(list);		
		list.add(0, "����ȣ");printlist(list); 
		System.out.println(list.get(3)); 		
		System.out.println(list.size());  
		

	}

	private static void printlist(LinkedList<String> list) {
		for (String name : list) {
			System.out.print(name + "\t");
		}
		System.out.println();
	}
}
