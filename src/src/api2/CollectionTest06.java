package api2;

import java.util.LinkedList;

public class CollectionTest06 {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("������");
		queue.offer("������");
		queue.offer("������");
		queue.offer("������");

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}
}
