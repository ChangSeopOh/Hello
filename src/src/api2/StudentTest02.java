package api2;

import java.util.StringTokenizer;

public class StudentTest02 {
	public static void main(String[] args) {

		// StudentVO[] students = new StudentVO[args.length];

		System.out.println("�̸�\t����\t����\t����\tö��\t����\t���");

		StringTokenizer st = new StringTokenizer(args[0], ",");
		StudentVO student = new StudentVO();

			student.setName(st.nextToken());
			student.setKor((Integer.parseInt(st.nextToken())));
			student.setEng((Integer.parseInt(st.nextToken())));
			student.setMat((Integer.parseInt(st.nextToken())));
			student.setPil((Integer.parseInt(st.nextToken())));
		
		
		System.out.println(student);
	}

}
