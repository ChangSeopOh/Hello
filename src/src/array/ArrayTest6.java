package array;

public class ArrayTest6 {
	public static void main(String[] args) {
		  String name[]={
				  "È«±æµ¿",
				  "±èÃ¶¼ö",
				  "½ÅÂ¯±¸"};
		  
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
		System.out.println("\tÀÌ¸§\t±¹¾î\t¿µ¾î\t¼öÇĞ\tÃ¶ÇĞ\tÃÑÁ¡\tÆò±Õ");
		System.out.println("--------------------------------------------------------------");
		
		for (int tab = 0; tab < score.length; tab++) {
			System.out.println(tab+1+"ÇĞ±â");
			for (int row = 0; row < score[tab].length; row++) {
				int sum =0;
				System.out.print("\t"+name[row] + "\t");
				for (int col = 0; col < score[tab][row].length; col++) {
					
					System.out.print(score[tab][row][col] + "Á¡\t");
					sum+=score[tab][row][col];
				}
				double avg = (double)sum/score[tab][row].length;
				System.out.println(sum+"Á¡\t"+(double)Math.round(avg*10)/10+"Á¡");
				
				//System.out.println((int)sum+"\t"+(sum/score[tab][row].length));
			}
			System.out.println();
		}
	}
}
