package method;

import java.util.Scanner;

public class MethodTest11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			ShowMenu();
			int menu = sc.nextInt();

			switch (menu) {
			case 1: 
				System.out.println("~~~~~~~~~~~");
				System.out.println(" ��� ����");
				System.out.println("~~~~~~~~~~~");
				 System.out.print("������ ���?");
				 String name = sc.next();
				 saySIamDunk(name);
			break;
			case 2: 
				System.out.println("�����մϴ�.");
				System.exit(0); //0�̸� ���� ���α׷� ����
				break;
			
			default:
				break;
			}

		}

	}

	private static void ShowMenu() {
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("������ũ ����");
		System.out.println("               ");
		System.out.println("1. ��𺸱�");
		System.out.println("2. ����");
		System.out.println("~~~~~~~~~~~~~~");
		System.out.print("> ");

	}

/*	private static void saySIamDunk(String name) { 
					//�ڹ� 8���� ��Ʈ������ ����(�ȵ���̵�� �ڹ�6)

		switch (name) {
		case "���븸":
			System.out.println("�׷� �� ���븸, ���⸦ �𸣴� ������.");
			break;
		case "�ȼ�����":
			System.out.println("�����ϴ� �� ������ ���� �����.");
			break;
		case "äġ��":
			System.out.println("���ٿ�带 �����ϴ� �ڰ� ������ �����Ѵ�.");
			break;
		case "����ȣ":
			System.out.println("�������� �ְ��� ������ ��������? �� �����̿���.");
			break;
		case "���¼�":
			System.out.println("�ѹ� 1����");
			break;
		case "���¿�":
			System.out.println("���� �ϻ��� ���� ���Ϸ� �̲���.");
			break;
		default:
			System.out.println("������ ��?");
			break;
		}

	}*/

	 private static void saySIamDunk(String name) {
	 if(name.equals("���븸")){ //�ڷ����� �ƴ϶� �ּҿ� ����Ǿ��ֱ� ������ ���Ϸ���
	 // .equals�� ���ؾߵȴ�
	 System.out.println("�׷� �� ���븸, ���⸦ �𸣴� ������.");
	 }else if(name.equals("�ȼ�����")){
	 System.out.println("�����ϴ� �� ������ ���� �����.");
	 }else if(name.equals("äġ��")){
	 System.out.println("���ٿ�带 �����ϴ� �ڰ� ������ �����Ѵ�.");
	 }else if(name.equals("����ȣ")){
	 System.out.println("�������� �ְ��� ������ ��������? �� �����̿���.");
	 }else if(name.equals("���¼�")){
	 System.out.println("�ѹ� 1����");
	 }else if(name.equals("���¿�")){
	 System.out.println("���� �ϻ��� ���� ���Ϸ� �̲���.");
	 }else{
	 System.out.println("������ ��?");
	 }
	
	 }
}
