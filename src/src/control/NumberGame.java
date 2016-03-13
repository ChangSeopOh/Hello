package control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int c1, c2, c3; //컴퓨터가 랜덤으로 정한 숫자 3개
		int h1, h2, h3; //사용자가 입력한 숫자 3개
		int s, b; //s:맞춘숫자갯수 b:틀린숫자갯수
		int count=0; //입력횟수 누적
		
		
		c1 = (int)((Math.random())*10); //random으로 받은 값(0이상1미만)에 *10 후 c1에 저장
		
		
		//동일값이 안나오도록 반복문인 do while문을 사용했다.
		//c1, c2, c3 동일값 안나오도록 우선 처리
		do {
			c2 = (int) ((Math.random()) * 10);
		} while (c2==c1); //c2!=c1일때만 출력된다. c2와 c1이 같으면 루프 돌림
		
		
		do {
			c3 = (int) ((Math.random()) * 10);
		} while (c3==c1 || c3==c2); 
		/*
		 * c3이 c1 또는 c2와 같지 않도록 do while문 사용
		 * c3와 c1이 같다 또는 c3와 c2가 같을경우 다시 random 함수 루프 실행
		*/
		
		
		Scanner sc = new Scanner(System.in); //세개의 수 입력 받기위한 Scanner 함수 사용
		
		
		
		//
		do {
			s = b = 0; //while 돌릴때마다 초기화, 맞춘 갯수와 틀린 갯수 초기화
			System.out.print("0~9사이의 중복되지 않은 수 3개 입력(ex: 1 2 3) : ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			//s, b를 계산
			
			if(h1==c1) s++;
			else if(h1==c2||h1==c3) b++;
			
			if(h2==c2) s++;
			else if (h2==c1 || h2==c3) b++;
			
			if (h3==c3) s++;
			else if (h3==c1 || h3==c2) b++;			
		
			System.out.println("["+s+"S "+b+"B]");
			count++;
			}while (s!=3);
		
		System.out.println("축하합니다. "+count+"번 만에 맞추셨습니다.");
	}
}
