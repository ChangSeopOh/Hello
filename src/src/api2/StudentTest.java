package api2;

import java.util.StringTokenizer;

public class StudentTest {
	public static void main(String[] args) {

		StudentVO[] students = new StudentVO[args.length];
		
		
		System.out.println("�̸�\t����\t����\t����\tö��\t����\t���");
		
		
		for (int i = 0; i < args.length; i++) {
			StringTokenizer st = new StringTokenizer(args[i], ",");
			students[i] = new StudentVO();
			if (st.hasMoreTokens()) {  //���� ��ū�� �̽����ִ��� ������ Ȯ���Ϸ��� ��. ���࿡ �� �����̶�� ���� �ȳ־ ��.
				students[i].setName(st.nextToken());
				students[i].setKor((Integer.parseInt(st.nextToken())));
				students[i].setEng((Integer.parseInt(st.nextToken())));
				students[i].setMat((Integer.parseInt(st.nextToken())));
				students[i].setPil((Integer.parseInt(st.nextToken())));
			}
		System.out.println(students[i]);
		}
		
			//�������� ���� : �迭  �迭���� ���������� �����ȿ��ٰ� �ִ´�.
//		for (StudentVO studentVO : students) {
//			System.out.println(studentVO);
//		}

	}
}
