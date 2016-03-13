package api2;

import java.util.Vector;

public class CollectionTest04 {
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		list.add("감사");
		list.add("귤사");
		list.add("딸기사");
		list.add("수박사");
		list.add("다사");

		for (String fruit : list) {
			System.out.println(fruit);
		}

		// Iterator iter = list.iterator(); //자바 5버전 이하
		// while (iter.hasNext()) {
		// System.out.println(iter.next());
		// }

	}
}
