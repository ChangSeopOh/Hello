package array;

public class ArrayTest4 {
	public static void main(String[] args) {
		int[][] score = 
		{
			{100,90,80,70},
			{90,80,70},
			{80,70,60,50}
		};
		
		for(int row=0;row<score.length;row++) {
			for(int col=0;col<score[row].length;col++) { 
					System.out.print(score[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
