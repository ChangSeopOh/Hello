package api2;

import java.util.ArrayList;

public class CollectionTest03 {
	public static void main(String[] args) {

		ArrayList<FishVO> list = new ArrayList<FishVO>(); // java6버전을 위해 제너릭 둘다
															// 넣어준다.

		list.add(new FishVO("아이유", 1990, "서울서초", "010-2600"));
		list.add(new FishVO("이민정", 1987, "서울강남", "010-4987"));
		list.add(new FishVO("박지연", 1940, "서울명동", "010-1597"));

		printlist(list);

	}

	private static void printlist(ArrayList<FishVO> list) {
		for (FishVO fishvo : list) {
			System.out.println(fishvo + "\t");
		}

	}
}
