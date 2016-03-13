package method;

public class MethodTest4 {
	public static void main(String[] args) {
		print(1);
		print(2,3);
		print(4,5,6);
		print(4,5,6,9,8,4,5,6,7,5,1,5,8,4,8,4,8,4,8,4,9,5,7,5,6,1,2,6);
	}

	private static void print(int... i) {
		for(int j=0;j<i.length;j++){
			System.out.print(i[j]+"\t");
			
		}
		System.out.println();
	}

	
	
//	private static void print(int i, int j, int k) {
//		System.out.println(i+"\t"+j+"\t"+k);
//		
//	}
//
//
//
//	private static void print(int i, int j) {
//		System.out.println(i+"\t"+j);
//		
//	}
//
//	private static void print(int i) {
//		System.out.println(i);	
//	}
//	
}
