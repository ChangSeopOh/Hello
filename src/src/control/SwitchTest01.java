package control;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		System.out.print("�Է� : "); int n= sc.nextInt();
		
		switch (n) {
		case 1:
/*			System.out.println("����");
			break;*/
		case 3:
			System.out.println("����");
			break;
		case 2:
/*			System.out.println("����");
			break;*/
		case 4:
			System.out.println("����");
			break;
			
		default:
			System.out.println("Error");
			break;
		}
		System.out.println("����");
	}
}
