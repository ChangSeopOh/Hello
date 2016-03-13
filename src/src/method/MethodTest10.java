package method;

public class MethodTest10 {
	public static void main(String[] args) {
		int[] n = {23,45,55,30,10};
		
		System.out.println("배열 n의 가장 큰 값은 : "+maxnumber(n));
		
		
	}

	private static int maxnumber(int[] n) {
		int max = -2147483648;
		
		for(int i =0; i<n.length; i++){
			if(max <n[i]){
				max = n[i]; 
			}
		}
		return max;
	}
}
