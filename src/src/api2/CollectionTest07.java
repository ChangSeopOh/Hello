package api2;

import java.util.LinkedList;

public class CollectionTest07 {
	public static void main(String[] args) {

		// LinkedList로 보통 Queue와 Stack을 같이 쓴다.

		LinkedList<String> stack = new LinkedList<String>();
		stack.addLast("김태희");
		stack.addLast("전지현");
		stack.addLast("송혜교");
		stack.addLast("송혜림");

		while (!stack.isEmpty()) {
			System.out.println(stack.removeLast());
		}

	}
}
