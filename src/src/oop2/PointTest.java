package oop2;

public class PointTest {
	public static void main(String[] args) {
		Point2D up= new Point3D(); //up casting(자동형변환) 서브클래스를 수퍼클래스에서 참조한다.
		
		up.setX(200);
		up.x = 100;
		
		up.y = 10;
		//up.z =11; 서브클래스에서 새로 만든 멤버변수(메서드)를 접근 할 수 없다.
		//up.setX(55); 도 안됨.
		//단, super type에서 상속한 메소드를 override했을 경우 접근 가능.
		
		up.print();
		
		System.out.println("-----------------------------");
		Point3D dn = (Point3D) up; //down casting(강제형변환)
		dn.x = 77;					//모든 멤버변수(메서드)에 접근 가능
		dn.y = 777;					//캐스팅시 명시적 형변환 필요
		
		dn.setZ(70);
		up.print();
	}
}
