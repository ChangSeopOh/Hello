package basic;
import java.util.Scanner;

public class OpTest11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڶ�� 1, ���ڶ�� 2 : "); int n = sc.nextInt();
		System.out.println(n==1 || n==3? "����": n==2 ||n==4 ? "����" : "����");
		System.out.println("����");
	}
}
