package api2;

import java.util.LinkedList;

public class CollectionTest05 {
	public static void main(String[] args) {
			//입력수정삭제를 자주할때는 LinkedList가 좋고 출력을 자주 하는것은 ArrayList가 더 낫다.
		LinkedList<String> list = new LinkedList<>();
		list.add("조지클루니");printlist(list);
		list.add("조지 뎁");printlist(list);
		list.add("레오나르도 디카프리오");printlist(list);
		list.add("오창섭");printlist(list);
		list.remove(2);printlist(list);			
		list.set(1,"원빈");printlist(list);		
		list.add(0, "유승호");printlist(list); 
		System.out.println(list.get(3)); 		
		System.out.println(list.size());  
		

	}

	private static void printlist(LinkedList<String> list) {
		for (String name : list) {
			System.out.print(name + "\t");
		}
		System.out.println();
	}
}
