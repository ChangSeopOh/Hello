package api2;

import java.util.LinkedList;

public class CollectionTest06 {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("±èÅÂÈñ");
		queue.offer("ÀüÁöÇö");
		queue.offer("¼ÛÇı±³");
		queue.offer("¼ÛÇı¸²");

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}
}
