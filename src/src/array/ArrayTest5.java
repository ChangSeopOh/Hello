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
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		
		for(int row=0;row<score.length;row++) {
			int sum=0; //배열선언 필요 없음  //변수 초기화(for문 돌면서 값이 축적될 수 있으므로)
			
			for(int col=0;col<score[row].length;col++) { 
					System.out.print(score[row][col]+"\t");
					sum+=score[row][col];
			}
			
			System.out.println(sum+"\t"+(sum/score[row].length));
		
		}
	}
}
