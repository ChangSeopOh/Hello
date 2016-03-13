package basic;
import java.util.Scanner;

public class OpTest12 {
	// OpTest12 클래스에서
	// 1. Scanner를 이용하여 정수를 입력받아서 양수이면 "양수입니다."
	//    음수를 받으면 "음수입니다. 0이면 "양수도 음수도 아닙니다."
	// 2. 짝수, 홀수 판명 : 짝수이면 "짝수입니다." 홀수이면 "홀수입니다."
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : "); 
		int i = sc.nextInt();
		
		System.out.println(
				i>0 ? "양수입니다." : 
				i<0 ? "음수입니다." :
					  "양수도 음수도 아닙니다.");
		
		System.out.println(i%2!=0 ? "홀수입니다." : 
			         				"짝수입니다.");
		
		/*
		 * i%2==0 으로 할 경우 i가 음수일 때에는 짝수로 나오므로 !=0 이 정확하다.
		 */
		
		System.out.println("종료");
	}
}
