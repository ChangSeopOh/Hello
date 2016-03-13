package array;

public class Arraytest9 {
	public static void main(String[] args) {
		Object[][] score = {{"ÀÌ¸§", "±¹¾î", "¿µ¾î", "¼öÇÐ", "Ã¶ÇÐ", "ÃÑÁ¡", "Æò±Õ"},
							{"Å¬·ç´Ï", 100, 100, 100, 100},
							{"Á¶´Ïµª", 90, 80, 70, 60},
							{"±è±â¿­", 100, 90, 90, 90}
		};
		
		System.out.println("-------------------------------------------------------------------------");
		for (int row = 0; row < score.length; row++) {
			int result = 0;

			for (int col = 0; col < score[row].length; col++) {
				
				if (score[row][col] instanceof Integer) {
					result += (Integer) score[row][col];
				}
				
				System.out.print("\t"+score[row][col] );

				

			}
			
			if (row != 0) {
				System.out.println("\t" + (result) +"\t" + (result / (score[row].length - 1)));
			} else {
				System.out.println("\n-------------------------------------------------------------------------");
			}
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		
	}
}
