package array;

public class Arraytest10 {
	public static void main(String[] args) {
		Object[][][] score = {{{"�̸�", "����", "����", "����", "ö��", "����", "���"},
							{"Ŭ���", 100, 100, 100, 100},
							{"���ϵ�", 90, 80, 70, 60},
							{"��⿭", 100, 90, 90, 90}},
							
							{	{"�̸�", "����", "����", "����", "ö��", "����", "���"},
							{"Ŭ���", 90, 90, 90, 90},
							{"���ϵ�", 90, 80, 90, 80},
							{"��⿭", 100, 60, 40, 30}}};
		
		
		
			for (int tab = 0; tab < score.length; tab++) {
				System.out.println("\n"+(tab + 1) + "�б� ����");

				for (int row = 0; row < score[tab].length; row++) {

					int result = 0;

					for (int col = 0; col < score[tab][row].length; col++) {

						if (score[tab][row][col] instanceof Integer) {
							result += (Integer) score[tab][row][col];
						}

						System.out.print("\t" + score[tab][row][col]);

					}

					if (result != 0) {
						System.out.println("\t" + (result) + "\t" + (result / (score[tab][row].length - 1)));
					} else {
						System.out.println("\n-------------------------------------------------------------------------");
					}
				}

			}
			

		System.out.println("\n-------------------------------------------------------------------------");
		

		
		
	}
}
