package array;

public class Arraytest11 {
	public static void main(String[] args) {
		Object[][][] score = {{{"�̸�", "����", "����", "����", "ö��", "����", "���"},
							{"Ŭ���", 100, 100, 100, 100,0,0},
							{"���ϵ�", 90, 80, 70, 60,0,0},
							{"��⿭", 100, 90, 90, 90,0,0}},
							
							{	{"�̸�", "����", "����", "����", "ö��", "����", "���"},
							{"Ŭ���", 90, 90, 90, 90,0,0},
							{"���ϵ�", 90, 80, 90, 80,0,0},
							{"��⿭", 100, 60, 40, 30,0,0}}};
		
		for (int tab = 0; tab < score.length; tab++) {
			System.out.println("\n" + (tab + 1) + "�б� ����");

			for (int row = 0; row < score[tab].length; row++) {

				int result = 0;

				for (int col = 0; col < score[tab][row].length - 2; col++) {

					if (score[tab][row][col] instanceof Integer) {
						result += (Integer) score[tab][row][col];
					}
					if (row != 0) {
						score[tab][row][5] = result;
						score[tab][row][6] = result / 4;
					}
					System.out.print("\t" + score[tab][row][col]);
				}
				System.out.println("\t" + score[tab][row][5] + "\t" + score[tab][row][6]);

			}

		}

		System.out.println("\n-------------------------------------------------------------------------");

		for (int row = 0; row < score[0].length; row++) {
			for (int col = 0; col < score[0][row].length; col++) {
				if (score[0][row][col] instanceof Integer) {
					System.out.print((((Integer) score[0][row][col]) + ((Integer) score[1][row][col])) / 2 + "\t");

				} else {
					System.out.print(score[0][row][col] + "\t");
				}
			}
			System.out.println();

		}

	}
}
