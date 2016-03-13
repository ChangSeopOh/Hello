package control2;
import java.util.Scanner;
public class NumberGame2 {
	public static void main(String[] args) {
		int x = (int)((Math.random())*99);
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println(x);
		int user = 0;
		
		do {
				System.out.print("1부터 99사이의 정수 입력 : "); 
				user = sc.nextInt();
				
				if(x>user) {
					System.out.println("틀리셨습니다.");
					System.out.println("x는"+user+"보다 큽니다.");
				} 
				else if(x<user){
					System.out.println("틀리셨습니다.");
					System.out.println("x는 "+user+"보다 작습니다.");
				}
				count++;
		} while(user!=x);
			System.out.println("정답을 맞추셨습니다. x는"+x+"입니다. "+
								count+"번 만에 맞추셨습니다.");
			
			/* 1~4회 안에 great
			 * 5~8회 good
			 * 9~12회 그럭저럭
			 * 12회 초과 뷁
			 * */
			
			int sum=0;
			if (count<=4) sum=0;
			else if(count>4 && count<8) sum=1;
			else if(count>=8 && count<13) sum=2;
			else {
				sum=3;
			}
			
			switch(sum) {
			case (0) : System.out.println("Great"); break;
			case (1) : System.out.println("Good"); break;
			case (2) : System.out.println("그럭저럭"); break;
			default : System.out.println("뷁");
			
			}
		}
	}