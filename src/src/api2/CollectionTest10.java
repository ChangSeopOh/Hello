package api2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest10 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();	//�ߺ����� �������� �ʴ´�
		
		set.add("ÿ���ٴ���");
		set.add("ī����");
		set.add("ī����");
		set.add("�ν�Ʈ������ġ");
		set.add("Ǫ��Ʈ��۷�");
		set.add("�佺ī�ϴ�");
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){		//hash�� ������ �����ʰ� ���� ã������ �ҋ� ���°�
			System.out.println(iter.next());
		}
		
		
	}
}
