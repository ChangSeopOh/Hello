package control;
import java.util.Scanner;
public class IfTest02 {
	/*
	 * Scanner sc = new Scanner(System.in)�� �̿��� ���� Ǯ��
	 * 1~100���� ���� �Է� : 
	 * score�� 90�� �̻��̸� a / ����
	 * score�� 80�� �̻��̸� b / ����
	 * score�� 70�� �̻��̸� c / ����
	 * score�� 60�� �̻��̸� d / ����
	 * score�� 60�� �̸��̸� f / ����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : "); double score = sc.nextDouble();
		if (score>=90 && score<=100) { System.out.println("A");} 
		else if(score>=80) { System.out.println("B");} 
		else if(score>=70) {System.out.println("C");} 
		else if(score>=60) {System.out.println("D");} 
		else if(score<60 && score>=0) {System.out.println("F");} 
		else {System.out.println("�����Դϴ�.");}
	}

}
