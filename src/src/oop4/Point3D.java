package oop4;

public class Point3D extends Point2D{
	int z;

	
	
	
	public Point3D(){
		this(10,10,10);
		//�Ʒ� �޼ҵ� ���
		
		System.out.println("Point 3D() ����");	
	} //Ȥ�� �Ʒ� �־ ���� �۵����� ��� �־
	//����� �ִ� ���� ����
	
	
	
	
	public Point3D(int x, int y, int z) {
	super(x,y);
		this.z = z;
		
		System.out.println("Point 3D(x,y,z) ����");	
	}


	
	
	
	
	//public Point3D(){} //�ȸ��� JVM�� �ڵ����� ������ش� 
	
	
	
}
