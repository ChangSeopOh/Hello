package oop1;

public class Point3D extends Point2D { 
	//포인트2D 상속받음 2D의 변수를 다 쓸수 있음

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
