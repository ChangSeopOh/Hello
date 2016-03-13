package oop4;

public class Point3D extends Point2D{
	int z;

	
	
	
	public Point3D(){
		this(10,10,10);
		//아래 메소드 사용
		
		System.out.println("Point 3D() 수행");	
	} //혹시 아래 넣어서 가끔 작동안할 경우 있어서
	//만들어 주는 것이 좋다
	
	
	
	
	public Point3D(int x, int y, int z) {
	super(x,y);
		this.z = z;
		
		System.out.println("Point 3D(x,y,z) 수행");	
	}


	
	
	
	
	//public Point3D(){} //안만들어도 JVM이 자동으로 만들어준다 
	
	
	
}
