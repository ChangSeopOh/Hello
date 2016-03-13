package basic;
/*
 * 4~15사이의 정수를 난수로 발생하세요.
 */

/*
 * 600		700		800		900		1000
 * 1100		1200	1300	1400	1500
 * 1600		1700	1800	1900	2000
 * 2100		2200	2300
 */

/*
 * Math.random() 메소드(함수)는, 
 * 0.0 이상에서 1.0 미만의 double형 실수 값을 반환합니다. 
 * 즉, 0.0은 나올 수 있지만 1.0은 나올 수 없습니다
 */
public class OpTest15 {
	public static void main(String[] args) {
		System.out.print("4~15 사이의 정수 : " );
		Math.random();
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		System.out.println((int)(Math.random()*12)+4); 
		//12는 4와 15사이의 정수의 개수
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		System.out.println(((int)(Math.random()*18)+6)*100);
		
	}
}
