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
			System.out.println("���� x �Է� : "); 
			user = sc.nextInt();
			
			if(user>x) {
				System.out.println("x�� "+user+"���� �۽��ϴ�.");
			} else {
				System.out.println("x�� "+user+"���� Ů�ϴ�.");
			}
			
		} while(user!=x);
		System.out.println("�����Դϴ�. x�� "+x+"�Դϴ�.");
		System.out.println(count+"������ �������ϴ�.");
		int c = ((int) Math.ceil((double)(count/4)));

		
			switch (c) { //count-0.9999999999999����
			case 1:System.out.println("Great "+count+"ȸ ���� ���߼̽��ϴ�."); break;
			case 2: System.out.println("Good "+count+"ȸ ���� ���߼̽��ϴ�."); break;
			case 3: System.out.println("So so "+count+"ȸ ���� ���߼̽��ϴ�."); break;
			default : System.out.println("�� "+count+"ȸ ���� ���߼̽��ϴ�.");
		break;
		}
	}
}