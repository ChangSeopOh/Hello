package control;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
		/*
		 * System.out.println(Math.random()); 
		 * //0.0<=x<1.0 �ּ� 0.0 �ִ� 0.9999xxx
		 * //0�̻� 1�̸��� ������ �Ǽ��� ���´�.
		 * System.out.println((int)(Math.random()*3)+1);//1�̻� 3������ ���� ���
		 * 
		 */		
		
		/*if(com==1) {
		 *	System.out.println("����");
		 *} else if (com==2) {
		 *	System.out.println("����");
		 *} else if (com==3) {
		 *	System.out.println("��");
		 *} else {
		 *	System.out.println("����");
		 * }
		 */	
		Scanner sc = new Scanner(System.in);
		System.out.print("1.���� 2.���� 3.�� �Է� : "); 
		int you = sc.nextInt();
		int com = (int)((Math.random()*3)+1); //1�̻� 3������ ���� ���
		
		System.out.print("You : ");
		
		switch (you) {
		case 1: {
			System.out.println("����");
			break;
			}
		case 2: {
			System.out.println("����");
			break;
			}
		case 3: {
			System.out.println("��");
			break;
			}
		default: {
			System.out.println("����");
			break;
			} //end of default 
		} //end of switch
		
		System.out.print("Computer : ");
		
		switch (com) {
		case 1: {
			System.out.println("����");
			break;
			}
		case 2: {
			System.out.println("����");
			break;
			}
		case 3: {
			System.out.println("��");
			break;
			}
		default: {
			System.out.println("����");
			break;
			} //end of default 
		} //end of switch	
		
		/*
		 * ����1 ����2 ��3
		 * com 1���� you 2���� you ��
		 * com 1���� you 1���� �����ϴ�.
		 * com 1���� you 3��   you �����ϴ�.
		 * 
		 * com 2���� you 1���� you �����ϴ�.
		 * com 2���� you 2���� �����ϴ�.
		 * com 2���� you 3��   you �̰���ϴ�.
		 * 
		 * com 3�� you 1���� you �̰���ϴ�.
		 * com 3�� you 2���� you �����ϴ�.
		 * com 3�� you 3��   �����ϴ�.
		 */
		
		/*if (com==you) {
			System.out.println("���º�");
		} else if (com==1 && you==2) {
			System.out.println("�¸�");
		} else if (com==1 && you==3) {
			System.out.println("�й�");
		} else if (com==2 && you==3) {
			System.out.println("�¸�");
		} else if (com==2 && you==1) {
			System.out.println("�й�");
		}  else if (com==3 && you==1) {
			System.out.println("�¸�");
		} else if (com==3 && you==2) {
			System.out.println("�й�");
		} */
		
		/*
		 * if (com==you) { System.out.println("���º�"); } else if
		 * ((com==1&&you==2) || (com==2&&you==3) || (com==3&&you==1)) {
		 * System.out.println("�¸�"); } else if ((com==1&&you==3) ||
		 * (com==2&&you==1) || (com==3&&you==2)) { System.out.println("�й�"); }
		 */
		
		/*
		 * ���º�, �й� ���� ó�� �� ������ �¸��� ó�� ����
		 * �¸�
		 * you		com		result	result2(result+3%3)
		 * 1		3		-2		1
		 * 2		1		1		1
		 * 3		2		1		1
		 * ��
		 * you		com		result	result2(result+3%3)
		 * 1		2		-1		2
		 * 2		3		-1		2
		 * 3		1		2		2
		 * ���	
		 * you		com		result	result2(result+3%3)
		 * 1		1		0		0
		 * 2		2		0		0
		 * 3		3		0		0
		 */
		
		int result = you - com;
		/*if ((result==-2)||(result==1)) {
			System.out.println("Win");
		} else if ((result==-1)||(result==2)) {
			System.out.println("Lose");
		} else if (result==0) {
			System.out.println("Draw");
		}*/
		
		/*switch (result) {
		case -2 :
		case 1 : System.out.println("Win");
		break;
		
		case -1:
		case 2: System.out.println("Lose");
		break;
		
		case 0 : System.out.println("Draw");
		break;
		}*/
		
		switch ((result+3)%3) {
		case 1 : System.out.println("Win");
		break;
		
		case 2: System.out.println("Lose");
		break;
		
		case 0 : System.out.println("Draw");
		break;
		}
		
		
		
		
		/*
		 * ��Ʈ������
		 * ~ 
		 * ^ �񱳴���� �Ǵ� �� ���� ���� Ʋ���� 1, ������ 0�� �Ǵ� ������ �����Ѵ�
		 * | �� ��Ʈ �� �ϳ��� 1�̸� ����� 1�̵ȴ�
		 * & �� ��Ʈ �� �ϳ��� 0�̸� ����� 0�̵ȴ�
		 * <<
		 * >>
		 * 
		 */

		} //end of main
	} //end of class
