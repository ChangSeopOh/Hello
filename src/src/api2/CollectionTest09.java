package api2;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest09 {
	public static void main(String[] args) {

		Map<Integer, FishVO> member = new HashMap<Integer, FishVO>(); // java6������ ���� ���ʸ� �Ѵ�
															// �־��ش�.
		
		member.put(1, new FishVO("������", 1990, "���Ｍ��", "010-2600"));
		member.put(2, new FishVO("�̹���", 1987, "���ﰭ��", "010-4987"));
		member.put(3, new FishVO("������", 1940, "�����", "010-1597"));

		printlist(member);

	}

	private static void printlist(Map<Integer, FishVO> member) {
		for (int key : member.keySet()) {
			System.out.println(member.get(key));
		}

	}
}
