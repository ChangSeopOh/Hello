package oop1;

public class Point3D extends Point2D { 
	//����Ʈ2D ��ӹ��� 2D�� ������ �� ���� ����

	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
@Override //Alt+shipt+S => override or pr->control+space
public void print() {

	super.print();
	System.out.println(getZ());
	
}
}
