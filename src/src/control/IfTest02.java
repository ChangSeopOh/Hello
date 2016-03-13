package control;
import java.util.Scanner;
public class IfTest02 {
	/*
	 * Scanner sc = new Scanner(System.in)을 이용한 문제 풀이
	 * 1~100중의 정수 입력 : 
	 * score가 90점 이상이면 a / 종료
	 * score가 80점 이상이면 b / 종료
	 * score가 70점 이상이면 c / 종료
	 * score가 60점 이상이면 d / 종료
	 * score가 60점 미만이면 f / 종료
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 : "); double score = sc.nextDouble();
		if (score>=90 && score<=100) { System.out.println("A");} 
		else if(score>=80) { System.out.println("B");} 
		else if(score>=70) {System.out.println("C");} 
		else if(score>=60) {System.out.println("D");} 
		else if(score<60 && score>=0) {System.out.println("F");} 
		else {System.out.println("에러입니다.");}
	}

}
