package oop3;

public class ShapeTest {
	public static void main(String[] args) {

	printArea(new Circle());
	printArea(new Rectangle());
	printArea(new Triangle());

	}

	private static void printArea(Shape s) {
		s.area();
		System.out.println("���̴� : " + s.res);

		if (s instanceof Circle) { // Circle�� ���
			Circle c = (Circle) s; // �ٿ�ĳ����
			System.out.println("�������� " + c.r + "�� ���� ���̴� " + c.res + "�Դϴ�.");

		} else if (s instanceof Rectangle) { // Circle�� ���
			Rectangle r = (Rectangle) s;
			System.out.println("���ΰ� " + r.h + "�̰�, ���ΰ� " + r.w + "�� �簢���� ���̴�" + r.res + "�Դϴ�.");

		} else if (s instanceof Triangle) { // Circle�� ���
			Triangle a = (Triangle) s;
			System.out.println("���̰� " + a.h + "�̰� �غ��� " + a.w + "�� �ﰢ���� ���̴�" + a.res + "�Դϴ�.");

		}

	}
}
