package api2;

import java.util.LinkedList;

public class CollectionTest07 {
	public static void main(String[] args) {

		// LinkedList�� ���� Queue�� Stack�� ���� ����.

		LinkedList<String> stack = new LinkedList<String>();
		stack.addLast("������");
		stack.addLast("������");
		stack.addLast("������");
		stack.addLast("������");

		while (!stack.isEmpty()) {
			System.out.println(stack.removeLast());
		}

	}
}
