package control2;

public class BreakTest02 {
	public static void main(String[] args) {
		TARGET :  //Outter:
		for(char upper='A' ; upper <='F'; upper++) {
			for(char lower='a'; lower<='z';lower++) {
			System.out.println("대문자 : "+upper+" 소문자 : "+lower);
			
			if(lower=='g') break TARGET;
			}
		} 
		
		System.out.println("종료");
	}
}
