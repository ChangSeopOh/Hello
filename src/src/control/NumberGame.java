package control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int c1, c2, c3; //��ǻ�Ͱ� �������� ���� ���� 3��
		int h1, h2, h3; //����ڰ� �Է��� ���� 3��
		int s, b; //s:������ڰ��� b:Ʋ�����ڰ���
		int count=0; //�Է�Ƚ�� ����
		
		
		c1 = (int)((Math.random())*10); //random���� ���� ��(0�̻�1�̸�)�� *10 �� c1�� ����
		
		
		//���ϰ��� �ȳ������� �ݺ����� do while���� ����ߴ�.
		//c1, c2, c3 ���ϰ� �ȳ������� �켱 ó��
		do {
			c2 = (int) ((Math.random()) * 10);
		} while (c2==c1); //c2!=c1�϶��� ��µȴ�. c2�� c1�� ������ ���� ����
		
		
		do {
			c3 = (int) ((Math.random()) * 10);
		} while (c3==c1 || c3==c2); 
		/*
		 * c3�� c1 �Ǵ� c2�� ���� �ʵ��� do while�� ���
		 * c3�� c1�� ���� �Ǵ� c3�� c2�� ������� �ٽ� random �Լ� ���� ����
		*/
		
		
		Scanner sc = new Scanner(System.in); //������ �� �Է� �ޱ����� Scanner �Լ� ���
		
		
		
		//
		do {
			s = b = 0; //while ���������� �ʱ�ȭ, ���� ������ Ʋ�� ���� �ʱ�ȭ
			System.out.print("0~9������ �ߺ����� ���� �� 3�� �Է�(ex: 1 2 3) : ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			//s, b�� ���
			
			if(h1==c1) s++;
			else if(h1==c2||h1==c3) b++;
			
			if(h2==c2) s++;
			else if (h2==c1 || h2==c3) b++;
			
			if (h3==c3) s++;
			else if (h3==c1 || h3==c2) b++;			
		
			System.out.println("["+s+"S "+b+"B]");
			count++;
			}while (s!=3);
		
		System.out.println("�����մϴ�. "+count+"�� ���� ���߼̽��ϴ�.");
	}
}
