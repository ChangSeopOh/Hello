package api2;

import java.util.ArrayList;

public class CollectionTest03 {
	public static void main(String[] args) {

		ArrayList<FishVO> list = new ArrayList<FishVO>(); // java6������ ���� ���ʸ� �Ѵ�
															// �־��ش�.

		list.add(new FishVO("������", 1990, "���Ｍ��", "010-2600"));
		list.add(new FishVO("�̹���", 1987, "���ﰭ��", "010-4987"));
		list.add(new FishVO("������", 1940, "�����", "010-1597"));

		printlist(list);

	}

	private static void printlist(ArrayList<FishVO> list) {
		for (FishVO fishvo : list) {
			System.out.println(fishvo + "\t");
		}

	}
}
