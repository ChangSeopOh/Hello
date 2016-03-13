package oop4;

public class PointTest {
	public static void main(String[] args) {
//		Point2D pt =new Point2D();
		//new는 프로그램 수행중에 동적으로 생성하기위해
		//맨앞자리 Point2D pt는 생성자라는 뜻이다
//		
//	System.out.println("x : "+pt.x);	
//	System.out.println("y : "+pt.y);	
//	
//	Point2D pt2 =new Point2D(10,20);
//	
//	System.out.println("x : "+pt2.x);	
//	System.out.println("y : "+pt2.y);	
//	

	
		Point3D pt3 =new Point3D(100,200,300);
		System.out.println("x : "+pt3.x);	
		System.out.println("y : "+pt3.y);
		System.out.println("z : "+pt3.z);
	
		Point3D pt4 =new Point3D();
		System.out.println("x : "+pt4.x);	
		System.out.println("y : "+pt4.y);
		System.out.println("z : "+pt4.z);
	}
}
