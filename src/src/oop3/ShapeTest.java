package oop3;

public class ShapeTest {
	public static void main(String[] args) {

	printArea(new Circle());
	printArea(new Rectangle());
	printArea(new Triangle());

	}

	private static void printArea(Shape s) {
		s.area();
		System.out.println("넓이는 : " + s.res);

		if (s instanceof Circle) { // Circle일 경우
			Circle c = (Circle) s; // 다운캐스팅
			System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + c.res + "입니다.");

		} else if (s instanceof Rectangle) { // Circle일 경우
			Rectangle r = (Rectangle) s;
			System.out.println("세로가 " + r.h + "이고, 가로가 " + r.w + "인 사각형의 넓이는" + r.res + "입니다.");

		} else if (s instanceof Triangle) { // Circle일 경우
			Triangle a = (Triangle) s;
			System.out.println("높이가 " + a.h + "이고 밑변이 " + a.w + "인 삼각형의 넓이는" + a.res + "입니다.");

		}

	}
}
