package array;

public class ArrayTest7 {
	public static void main(String[] args) {
		Object[] score = { "신해철", 100, 90, 80, 70 };

	

		System.out.println("--------------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t철학\t총점\t평균");
		System.out.println("--------------------------------------------------------------");

		int result = 0;
		for (int col = 0; col < score.length; col++) {
			System.out.print(score[col] + "\t");
			
			if( score[col] instanceof Integer)
			{
				result += (Integer) score[col];
			}
		}
			
//			if (col != 0) {                     	    //2번째 방법
//				result += (Integer) score[col];
//			}
		
		

//		int result = 0;									//3번째 방법
//		for (int col = 1; col < score.length; col++) {
//			result += (Integer) score[col];
//		}
		
		System.out.println(result+"\t"+result/(score.length-1));
		
		
		
		
	}
}
