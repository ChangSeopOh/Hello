package array;

public class ArrayTest8 {
	public static void main(String[] args) {
		Object[][][] score = {{ 
							 { "����ö", 100, 90, 80, 70 }, 
							 { "��ö��", 70, 90, 90, 70  },
							 { "��¯��", 40, 60, 30, 80  }
							},
							{{ "����ö", 70, 100, 100, 100}, 
							 { "��ö��", 60, 80, 10, 40  },
							 { "��¯��", 30, 90, 20, 30  }
							}};

		System.out.println("--------------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\tö��\t����\t���");
	

		for (int tab = 0; tab < score.length; tab++) {
			System.out.println("--------------------------------------------------------"+(tab + 1 )+ "�б�");
			for (int row = 0; row < score[tab].length; row++) {
				int result = 0;
				for (int col = 0; col < score[tab][row].length; col++) {
					System.out.print(score[tab][row][col] + "\t");
					if ( score[tab][row][col] instanceof Integer) {
						result += (Integer) score[tab][row][col];
					}
				}
				System.out.println(result + "\t" + result / (score[tab][row].length - 1));
			}
			System.out.println();
		}
	}
}
