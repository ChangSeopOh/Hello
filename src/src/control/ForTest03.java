package control;

public class ForTest03 {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<3;j++)
			{
				System.out.print("*");
			} //나중에 입력된 것이 먼저 끝난다.
		}//처음에 입렷한 것이 먼저 끝난다.
		System.out.println("종료");
	}
}
