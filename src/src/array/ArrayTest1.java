package array;

public class ArrayTest1 {
	public static void main(String[] args) {

		//int[] score = new int[] {100,90,80}; 
		//new�� �������� �޸𸮸� �Ҵ��϶�� �ǹ� / intŸ���� ������ ����
		
		//score[0] = 100;
		//score[1] = 80;
		//score[2] = 70;

		int score[] = {100,90,80};
		int len = score.length;
		int sum=0;
		
		for(int i=0; i<len; i++) {
			System.out.print(score[i]+"\t");
			sum+=score[i];
		}
		
		System.out.println();
		System.out.println("��� : "+(sum/score.length));
	}
}
