package API;

public class Point2D {
	private static Point2D pt = new Point2D();  //2
	
	
	//sington 클래스를 같이 사용 오브젝트테스트01에서 참조할것
	//1. 생성자를 private
	//2. 자기자신을 참조하는 변수를 생성
	//3. 변수가 참조하는 인스턴스를 리턴하는 getter를 생성
	//4. 인스턴스를 오직 한번만 생성후 리턴
	
	public static Point2D getPt() { //3
//		if(pt==null){  //4
//			pt = new Point2D();
//		}
		return pt;
	}
	private Point2D(){  //1
		
	}
}
