package array;

public class ArrayTest5 {
	public static void main(String[] args) {
		int[][] score = 
		{
			{100,90,80,70},
			{90,80,70,60},
			{80,70,60,50},
			{90,70,40,20},
			{100,100,100,90}
		};
		
		System.out.println("----------------------------------------------------");
		System.out.println("����\t����\t����\tö��\t����\t���");
		System.out.println("----------------------------------------------------");
		
		
		for(int row=0;row<score.length;row++) {
			int sum=0; //�迭���� �ʿ� ����  //���� �ʱ�ȭ(for�� ���鼭 ���� ������ �� �����Ƿ�)
			
			for(int col=0;col<score[row].length;col++) { 
					System.out.print(score[row][col]+"\t");
					sum+=score[row][col];
			}
			
			System.out.println(sum+"\t"+(sum/score[row].length));
		
		}
	}
}
