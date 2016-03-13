package api2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest10 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();	//중복값을 저장하지 않는다
		
		set.add("첼리바다케");
		set.add("카리안");
		set.add("카리안");
		set.add("로스트로포비치");
		set.add("푸르트뱅글러");
		set.add("토스카니니");
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){		//hash는 정렬을 하지않고 빨리 찾을려고 할떄 쓰는것
			System.out.println(iter.next());
		}
		
		
	}
}
