package API;

public class Point2D {
	private static Point2D pt = new Point2D();  //2
	
	
	//sington Ŭ������ ���� ��� ������Ʈ�׽�Ʈ01���� �����Ұ�
	//1. �����ڸ� private
	//2. �ڱ��ڽ��� �����ϴ� ������ ����
	//3. ������ �����ϴ� �ν��Ͻ��� �����ϴ� getter�� ����
	//4. �ν��Ͻ��� ���� �ѹ��� ������ ����
	
	public static Point2D getPt() { //3
//		if(pt==null){  //4
//			pt = new Point2D();
//		}
		return pt;
	}
	private Point2D(){  //1
		
	}
}
