package oop2;

public class PointTest {
	public static void main(String[] args) {
		Point2D up= new Point3D(); //up casting(�ڵ�����ȯ) ����Ŭ������ ����Ŭ�������� �����Ѵ�.
		
		up.setX(200);
		up.x = 100;
		
		up.y = 10;
		//up.z =11; ����Ŭ�������� ���� ���� �������(�޼���)�� ���� �� �� ����.
		//up.setX(55); �� �ȵ�.
		//��, super type���� ����� �޼ҵ带 override���� ��� ���� ����.
		
		up.print();
		
		System.out.println("-----------------------------");
		Point3D dn = (Point3D) up; //down casting(��������ȯ)
		dn.x = 77;					//��� �������(�޼���)�� ���� ����
		dn.y = 777;					//ĳ���ý� ����� ����ȯ �ʿ�
		
		dn.setZ(70);
		up.print();
	}
}
