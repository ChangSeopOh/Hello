package oop;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김기열";
		h.age = 27;
		
		System.out.println("이름 : "+h.name);
		System.out.println("나이 : "+h.age);
	}
}
