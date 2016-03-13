package array;

public class ArrayTest6 {
	public static void main(String[] args) {
		  String name[]={
				  "ȫ�浿",
				  "��ö��",
				  "��¯��"};
		  
		int[][][] score = 
		{{ 
					{ 100, 90, 80, 70}, 
					{ 90, 80, 70, 60 }, 
					{ 80, 70, 60, 50 }
				},
				{ 
					{100, 100, 90, 80}, 
					{100, 90, 80, 70}, 
					{ 90, 80, 70, 60 } 			
			} };

		System.out.println("--------------------------------------------------------------");
		System.out.println("\t�̸�\t����\t����\t����\tö��\t����\t���");
		System.out.println("--------------------------------------------------------------");
		
		for (int tab = 0; tab < score.length; tab++) {
			System.out.println(tab+1+"�б�");
			for (int row = 0; row < score[tab].length; row++) {
				int sum =0;
				System.out.print("\t"+name[row] + "\t");
				for (int col = 0; col < score[tab][row].length; col++) {
					
					System.out.print(score[tab][row][col] + "��\t");
					sum+=score[tab][row][col];
				}
				double avg = (double)sum/score[tab][row].length;
				System.out.println(sum+"��\t"+(double)Math.round(avg*10)/10+"��");
				
				//System.out.println((int)sum+"\t"+(sum/score[tab][row].length));
			}
			System.out.println();
		}
	}
}
