package API;

public class BoxedPrimitives01 {
	public static void main(String[] args) {
		
		//Integer i0 = Integer.valueOf(10); //java 5 ����
		Integer i1 = new Integer(10);  //������, �⺻�ڷ����̾ƴϴ�
		Integer i2 = 10; // auto boxing(java 5 ����)
		
		int i3 = i1; // int�� �⺻�ڷ����̴�. �̰��� auto unboxing�̶�� �Ѵ�
		
		Object obj1 = 10;	// java 7 nf
		Object obj2 = (Integer)10;	// java 5 nf
		
		int i4 = (int)obj1;	//java 7nf 	
		int i5 = (Integer)obj2; //java 5nf
		
		int i6 = Integer.parseInt("10"); //���ڿ� �ش��ϴ� ���ڸ� Int�� �ٲ��ش�. only 10���� ����.
		int i7 = Integer.valueOf("10"); 
		
		
	}
	
}
