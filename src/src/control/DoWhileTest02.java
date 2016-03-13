package control;

public class DoWhileTest02 {
	public static void main(String[] args) {
		int i;
		int j;
		
		do {
			i = (int) (Math.random() * 6) + 1;
			j = (int) (Math.random() * 6) + 1;
		} while (i==j); //i와 j가 같은값이 나오면 다시 돌아간다. 아래 출력값은 무조건 다른 값이 나온다 확신
		System.out.println(i+", "+j);	
	}
}
