package api2;

import java.util.ArrayList;

public class CollectionTest01 {
	public static void main(String[] args) {
		// <String> = only String타입이거나 업캐스팅된 것만 참조 가능함.
		// 이런것을 두고 Generic이라고 한다.
		ArrayList<String> list = new ArrayList<>();// 오른쪽 생성, 왼쪽 참조 변수 생성
		list.add("조지클루니");printlist(list);
		list.add("조지 뎁");printlist(list);
		list.add("레오나르도 디카프리오");printlist(list);
		list.add("오창섭");printlist(list);
		list.remove(2);printlist(list);			//삭제
		list.set(1,"원빈");printlist(list);		//수정
		list.add(0, "유승호");printlist(list); // 추가
		System.out.println(list.get(3)); 		//조회
		System.out.println(list.size());  //0부터가 아니라 1부터 갯수파악.
		
		// for(int i = 0; i< list.size();i++){ //size는 length와 같음. 갯수가 됨
		// System.out.println(list.get(i));
		// }

		// for(Object obj:list){ //java 7 nf
		// System.out.println(obj); //위에 Generic을 사용하면 상관없다.
		// }

		// for(Object obj:list){ //java 5 nf
		// System.out.println((String)obj);
		// }
		// for(String name:list){ //java 6 nf
		// System.out.println((String)name);
		// }

	}

	private static void printlist(ArrayList<String> list) {
		for (String name : list) {
			System.out.print(name + "\t");
		}
		System.out.println();
	}
}
