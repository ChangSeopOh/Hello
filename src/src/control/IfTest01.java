package control;

import java.util.Scanner;
/*
 * ���
 * ���ǹ�
 *		if
 *		switch~case
 * �ݺ���
 * 		for
 * 		while
 * 		do~while
 * �б⹮
 * 		continue
 * 		break
 * 		return
 */
public class IfTest01 {
	public static void main(String[] args) {
		
		System.out.println("���� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n==1 || n==3) {
			System.out.println("�����Դϴ�.");
		} else if(n==2 || n==4) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("����");
	}
}
