package control2;


import java.util.Scanner;

public class NumberGame3 {
	public static void main(String[] args) {
		int x = (int)(Math.random()*99)+1; //0~98.9999
		int user;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println(x);
		do {
			count++;
			System.out.println("변수 x 입력 : "); 
			user = sc.nextInt();
			
			if(user>x) {
				System.out.println("x는 "+user+"보다 작습니다.");
			} else {
				System.out.println("x는 "+user+"보다 큽니다.");
			}
			
		} while(user!=x);
		System.out.println("정답입니다. x는 "+x+"입니다.");
		System.out.println(count+"번만에 맞혔습니다.");
		int c = ((int) Math.ceil((double)(count/4)));

		
			switch (c) { //count-0.9999999999999가능
			case 1:System.out.println("Great "+count+"회 만에 맞추셨습니다."); break;
			case 2: System.out.println("Good "+count+"회 만에 맞추셨습니다."); break;
			case 3: System.out.println("So so "+count+"회 만에 맞추셨습니다."); break;
			default : System.out.println("뷁 "+count+"회 만에 맞추셨습니다.");
		break;
		}
	}
}