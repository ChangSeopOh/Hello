package api2;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest09 {
	public static void main(String[] args) {

		Map<Integer, FishVO> member = new HashMap<Integer, FishVO>(); // java6버전을 위해 제너릭 둘다
															// 넣어준다.
		
		member.put(1, new FishVO("아이유", 1990, "서울서초", "010-2600"));
		member.put(2, new FishVO("이민정", 1987, "서울강남", "010-4987"));
		member.put(3, new FishVO("박지연", 1940, "서울명동", "010-1597"));

		printlist(member);

	}

	private static void printlist(Map<Integer, FishVO> member) {
		for (int key : member.keySet()) {
			System.out.println(member.get(key));
		}

	}
}
