package control;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
		/*
		 * System.out.println(Math.random()); 
		 * //0.0<=x<1.0 최소 0.0 최대 0.9999xxx
		 * //0이상 1미만의 임의의 실수가 나온다.
		 * System.out.println((int)(Math.random()*3)+1);//1이상 3이하의 정수 출력
		 * 
		 */		
		
		/*if(com==1) {
		 *	System.out.println("가위");
		 *} else if (com==2) {
		 *	System.out.println("바위");
		 *} else if (com==3) {
		 *	System.out.println("보");
		 *} else {
		 *	System.out.println("에러");
		 * }
		 */	
		Scanner sc = new Scanner(System.in);
		System.out.print("1.가위 2.바위 3.보 입력 : "); 
		int you = sc.nextInt();
		int com = (int)((Math.random()*3)+1); //1이상 3이하의 정수 출력
		
		System.out.print("You : ");
		
		switch (you) {
		case 1: {
			System.out.println("가위");
			break;
			}
		case 2: {
			System.out.println("바위");
			break;
			}
		case 3: {
			System.out.println("보");
			break;
			}
		default: {
			System.out.println("에러");
			break;
			} //end of default 
		} //end of switch
		
		System.out.print("Computer : ");
		
		switch (com) {
		case 1: {
			System.out.println("가위");
			break;
			}
		case 2: {
			System.out.println("바위");
			break;
			}
		case 3: {
			System.out.println("보");
			break;
			}
		default: {
			System.out.println("에러");
			break;
			} //end of default 
		} //end of switch	
		
		/*
		 * 가위1 바위2 보3
		 * com 1가위 you 2바위 you 승
		 * com 1가위 you 1가위 비겼습니다.
		 * com 1가위 you 3보   you 졌습니다.
		 * 
		 * com 2바위 you 1가위 you 졌습니다.
		 * com 2바위 you 2바위 비겼습니다.
		 * com 2바위 you 3보   you 이겼습니다.
		 * 
		 * com 3보 you 1가위 you 이겼습니다.
		 * com 3보 you 2바위 you 졌습니다.
		 * com 3보 you 3보   비겼습니다.
		 */
		
		/*if (com==you) {
			System.out.println("무승부");
		} else if (com==1 && you==2) {
			System.out.println("승리");
		} else if (com==1 && you==3) {
			System.out.println("패배");
		} else if (com==2 && you==3) {
			System.out.println("승리");
		} else if (com==2 && you==1) {
			System.out.println("패배");
		}  else if (com==3 && you==1) {
			System.out.println("승리");
		} else if (com==3 && you==2) {
			System.out.println("패배");
		} */
		
		/*
		 * if (com==you) { System.out.println("무승부"); } else if
		 * ((com==1&&you==2) || (com==2&&you==3) || (com==3&&you==1)) {
		 * System.out.println("승리"); } else if ((com==1&&you==3) ||
		 * (com==2&&you==1) || (com==3&&you==2)) { System.out.println("패배"); }
		 */
		
		/*
		 * 무승부, 패배 먼저 처리 후 나머지 승리로 처리 가능
		 * 승리
		 * you		com		result	result2(result+3%3)
		 * 1		3		-2		1
		 * 2		1		1		1
		 * 3		2		1		1
		 * 패
		 * you		com		result	result2(result+3%3)
		 * 1		2		-1		2
		 * 2		3		-1		2
		 * 3		1		2		2
		 * 비김	
		 * you		com		result	result2(result+3%3)
		 * 1		1		0		0
		 * 2		2		0		0
		 * 3		3		0		0
		 */
		
		int result = you - com;
		/*if ((result==-2)||(result==1)) {
			System.out.println("Win");
		} else if ((result==-1)||(result==2)) {
			System.out.println("Lose");
		} else if (result==0) {
			System.out.println("Draw");
		}*/
		
		/*switch (result) {
		case -2 :
		case 1 : System.out.println("Win");
		break;
		
		case -1:
		case 2: System.out.println("Lose");
		break;
		
		case 0 : System.out.println("Draw");
		break;
		}*/
		
		switch ((result+3)%3) {
		case 1 : System.out.println("Win");
		break;
		
		case 2: System.out.println("Lose");
		break;
		
		case 0 : System.out.println("Draw");
		break;
		}
		
		
		
		
		/*
		 * 비트연산자
		 * ~ 
		 * ^ 비교대상이 되는 두 항의 값이 틀리면 1, 같으면 0이 되는 연산을 수행한다
		 * | 두 비트 중 하나라도 1이면 결과는 1이된다
		 * & 두 비트 중 하나라도 0이면 결과는 0이된다
		 * <<
		 * >>
		 * 
		 */

		} //end of main
	} //end of class
