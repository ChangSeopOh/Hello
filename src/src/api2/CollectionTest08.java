package api2;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest08 {
	public static void main(String[] args) {
		Map<String, String> member = new HashMap<String, String>();//Key값과 Value값
		member.put("리처드 기어", "010-1111-1111");
		member.put("조니뎁", "010-1111-1112");
		member.put("브래드피트", "010-1111-1113");
		member.put("원빈", "010-1111-1114");
		member.put("오은석", "010-1111-1115");
		
		//System.out.println(member.get("오은석"));
		
		for(String key : member.keySet()){
		System.out.println(key+" : "+member.get(key));
		}
		
		
	}
}
