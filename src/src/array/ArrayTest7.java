package array;

public class ArrayTest7 {
	public static void main(String[] args) {
		Object[] score = { "����ö", 100, 90, 80, 70 };

	

		System.out.println("--------------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\tö��\t����\t���");
		System.out.println("--------------------------------------------------------------");

		int result = 0;
		for (int col = 0; col < score.length; col++) {
			System.out.print(score[col] + "\t");
			
			if( score[col] instanceof Integer)
			{
				result += (Integer) score[col];
			}
		}
			
//			if (col != 0) {                     	    //2��° ���
//				result += (Integer) score[col];
//			}
		
		

//		int result = 0;									//3��° ���
//		for (int col = 1; col < score.length; col++) {
//			result += (Integer) score[col];
//		}
		
		System.out.println(result+"\t"+result/(score.length-1));
		
		
		
		
	}
}
