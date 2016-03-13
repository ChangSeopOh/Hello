package API;

public class ObjectTest01 {
	public static void main(String[] args) {

		Point2D pt = Point2D.getPt();
		System.out.println(pt.toString());
		System.out.println(pt.getClass());
		System.out.println(pt.hashCode());

		System.out.println("-------------------------");
		Point2D pt2 = Point2D.getPt();
		System.out.println(pt2.toString());
		System.out.println(pt2.getClass());
		System.out.println(pt2.hashCode());

	}
}
