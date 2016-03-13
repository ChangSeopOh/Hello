package control;

import java.util.Scanner;
/*
 * 제어문
 * 조건문
 *		if
 *		switch~case
 * 반복문
 * 		for
 * 		while
 * 		do~while
 * 분기문
 * 		continue
 * 		break
 * 		return
 */
public class IfTest01 {
	public static void main(String[] args) {
		
		System.out.println("성별 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n==1 || n==3) {
			System.out.println("남자입니다.");
		} else if(n==2 || n==4) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("에러입니다.");
		}
		System.out.println("종료");
	}
}
