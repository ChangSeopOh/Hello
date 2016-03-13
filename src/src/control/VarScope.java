package control;

public class VarScope {
	public static void main(String[] args) {
		int i=10;
		
		{
			int j=20;
			System.out.println("i: "+i);
			System.out.println("j: "+j);
		}
		
		System.out.println("i: "+i);
		/* System.out.println("j: "+j); */
	}

}
