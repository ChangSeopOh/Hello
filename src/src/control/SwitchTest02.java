package control;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : "); int score = sc.nextInt();
		int n=score;
		
		/*
		 * if (score>=90 && score<=100) { System.out.println("A");} 
		else if(score>=80) { System.out.println("B");} 
		else if(score>=70) {System.out.println("C");} 
		else if(score>=60) {System.out.println("D");} 
		else if(score<60 && score>=0) {System.out.println("F");} 
		else {System.out.println("에러입니다.");}
		 */
		
		/*if (n>=90 && n<=100) {n=1;} 
		else if (n>=70) {n=2;}
		else if (n>=60) {n=3;}
		else if (n>=50) {n=4;}
		else if (n<50 && n>=0) {n=5;}

		switch (n) {
			
			case 1 : 
				System.out.println("A");
				break;
			case 2 : 
				System.out.println("B");
				break;
			case 3 : 
				System.out.println("C");
				break;
			case 4 : 
				System.out.println("D");
				break;
			case 5 : 
				System.out.println("F");
				break;
				
				default : System.out.println("Error");
				break;
			}*/
		
		switch (score/10) {
		case 10 : 
			System.out.println("A");
			break;
		case 9 : 
			System.out.println("B");
			break;
		case 8 : 
			System.out.println("C");
			break;
		case 7 : 
			System.out.println("D");
			break;
		case 6 : 
			System.out.println("F");
			break;
			
			default : System.out.println("Error");
			break;
			
		}
		}
}