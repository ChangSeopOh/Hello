package api2;

import java.util.StringTokenizer;

public class StudentTest {
	public static void main(String[] args) {

		StudentVO[] students = new StudentVO[args.length];
		
		
		System.out.println("이름\t국어\t영어\t수학\t철학\t총점\t평균");
		
		
		for (int i = 0; i < args.length; i++) {
			StringTokenizer st = new StringTokenizer(args[i], ",");
			students[i] = new StudentVO();
			if (st.hasMoreTokens()) {  //다음 토큰에 이슈가있는지 없는지 확인하려고 함. 만약에 다 정상이라면 굳이 안넣어도 됨.
				students[i].setName(st.nextToken());
				students[i].setKor((Integer.parseInt(st.nextToken())));
				students[i].setEng((Integer.parseInt(st.nextToken())));
				students[i].setMat((Integer.parseInt(st.nextToken())));
				students[i].setPil((Integer.parseInt(st.nextToken())));
			}
		System.out.println(students[i]);
		}
		
			//변수선언 변수 : 배열  배열값을 변수선언한 변수안에다가 넣는다.
//		for (StudentVO studentVO : students) {
//			System.out.println(studentVO);
//		}

	}
}
