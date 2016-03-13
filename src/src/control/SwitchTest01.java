package control;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		System.out.print("입력 : "); int n= sc.nextInt();
		
		switch (n) {
		case 1:
/*			System.out.println("남자");
			break;*/
		case 3:
			System.out.println("남자");
			break;
		case 2:
/*			System.out.println("여자");
			break;*/
		case 4:
			System.out.println("여자");
			break;
			
		default:
			System.out.println("Error");
			break;
		}
		System.out.println("종료");
	}
}
