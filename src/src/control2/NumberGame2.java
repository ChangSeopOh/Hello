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
				System.out.print("1���� 99������ ���� �Է� : "); 
				user = sc.nextInt();
				
				if(x>user) {
					System.out.println("Ʋ���̽��ϴ�.");
					System.out.println("x��"+user+"���� Ů�ϴ�.");
				} 
				else if(x<user){
					System.out.println("Ʋ���̽��ϴ�.");
					System.out.println("x�� "+user+"���� �۽��ϴ�.");
				}
				count++;
		} while(user!=x);
			System.out.println("������ ���߼̽��ϴ�. x��"+x+"�Դϴ�. "+
								count+"�� ���� ���߼̽��ϴ�.");
			
			/* 1~4ȸ �ȿ� great
			 * 5~8ȸ good
			 * 9~12ȸ �׷�����
			 * 12ȸ �ʰ� ��
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
			case (2) : System.out.println("�׷�����"); break;
			default : System.out.println("��");
			
			}
		}
	}