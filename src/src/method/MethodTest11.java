package method;

import java.util.Scanner;

public class MethodTest11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			ShowMenu();
			int menu = sc.nextInt();

			switch (menu) {
			case 1: 
				System.out.println("~~~~~~~~~~~");
				System.out.println(" 명언 보기");
				System.out.println("~~~~~~~~~~~");
				 System.out.print("누구의 명언?");
				 String name = sc.next();
				 saySIamDunk(name);
			break;
			case 2: 
				System.out.println("종료합니다.");
				System.exit(0); //0이면 정상 프로그램 종료
				break;
			
			default:
				break;
			}

		}

	}

	private static void ShowMenu() {
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("슬램덩크 명대사");
		System.out.println("               ");
		System.out.println("1. 명언보기");
		System.out.println("2. 종료");
		System.out.println("~~~~~~~~~~~~~~");
		System.out.print("> ");

	}

/*	private static void saySIamDunk(String name) { 
					//자바 8부터 스트링값이 허용됨(안드로이드는 자바6)

		switch (name) {
		case "정대만":
			System.out.println("그래 난 정대만, 포기를 모르는 남자지.");
			break;
		case "안선생님":
			System.out.println("포기하는 그 순간이 시합 종료다.");
			break;
		case "채치수":
			System.out.println("리바운드를 제압하는 자가 시합을 제압한다.");
			break;
		case "강백호":
			System.out.println("영감님의 최고의 순간은 언제였죠? 난 지금이에요.");
			break;
		case "송태섭":
			System.out.println("넘버 1가드");
			break;
		case "서태웅":
			System.out.println("내가 북산을 전국 제일로 이끈다.");
			break;
		default:
			System.out.println("누구냐 넌?");
			break;
		}

	}*/

	 private static void saySIamDunk(String name) {
	 if(name.equals("정대만")){ //자료형이 아니라 주소에 저장되어있기 때문에 비교하려면
	 // .equals랑 비교해야된다
	 System.out.println("그래 난 정대만, 포기를 모르는 남자지.");
	 }else if(name.equals("안선생님")){
	 System.out.println("포기하는 그 순간이 시합 종료다.");
	 }else if(name.equals("채치수")){
	 System.out.println("리바운드를 제압하는 자가 시합을 제압한다.");
	 }else if(name.equals("강백호")){
	 System.out.println("영감님의 최고의 순간은 언제였죠? 난 지금이에요.");
	 }else if(name.equals("송태섭")){
	 System.out.println("넘버 1가드");
	 }else if(name.equals("서태웅")){
	 System.out.println("내가 북산을 전국 제일로 이끈다.");
	 }else{
	 System.out.println("누구냐 넌?");
	 }
	
	 }
}
