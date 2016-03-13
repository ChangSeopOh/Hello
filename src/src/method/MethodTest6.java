package method;

public class MethodTest6 {
	public static void main(String[] args) {
		printstar('¡Ú',20);
	}

	
/*	private static void printstar(char c, int f) {
		
		for(int d=1; d<=f; ++d) {
			for(int j=1; j<=d; ++j) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}*/
	private static String printstar(char c, int f) {
		String str ="";
		for(int d=1; d<=f; ++d) {
			for(int j=1; j<=d; ++j) {
				str +=c;
			}
			str+='\n';
		}
		return str;
		
	}
	
}
