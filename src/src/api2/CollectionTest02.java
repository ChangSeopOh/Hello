package api2;

import java.util.ArrayList;

public class CollectionTest02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ֻ�");
		list.add("�����");
		list.add("���ڻ�");
		list.add("�ٻ�");

		for (String fruit : list) {
			System.out.println(fruit);
		}

		// Iterator iter = list.iterator(); //�ڹ� 5���� ����
		// while (iter.hasNext()) {
		// System.out.println(iter.next());
		// }

	}
}
