package api2;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest08 {
	public static void main(String[] args) {
		Map<String, String> member = new HashMap<String, String>();//Key���� Value��
		member.put("��ó�� ���", "010-1111-1111");
		member.put("���ϵ�", "010-1111-1112");
		member.put("�귡����Ʈ", "010-1111-1113");
		member.put("����", "010-1111-1114");
		member.put("������", "010-1111-1115");
		
		//System.out.println(member.get("������"));
		
		for(String key : member.keySet()){
		System.out.println(key+" : "+member.get(key));
		}
		
		
	}
}
