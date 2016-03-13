package basic;

public class OpTest13 {
	public static void main(String[] args) {
		double d = 10;
		System.out.println(d); //자동형변환(묵시적형변환) 10.0으로 나옴
		
		int i = (int)3.14; //강제형변환(명시적형변환)
		System.out.println(i);
	}

}
