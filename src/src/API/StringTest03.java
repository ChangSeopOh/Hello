package API;

public class StringTest03 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  //0:16 ->0은 현재공간, 16은 미리확보한 공간
		StringBuilder sb2 = new StringBuilder(); //Buffer와 같다. 그러나 멀티쓰레드에서는 버퍼에 비해 안전하지 못하다. 
												//builder는 싱글쓰레드에서는 속도가 더 빠르다.
		printStr(sb);
		sb.append("길태은씨는");printStr(sb);
		sb.append(" 몇살때부터");printStr(sb);
		sb.append(" 자바를");printStr(sb);
		sb.append(" 그렇게");printStr(sb);
		sb.append(" 잘했나?");printStr(sb);
		

		
	}

	private static void printStr(StringBuffer sb) {
		System.out.print(sb.length() + ":" + sb.capacity()+":");
		System.out.println(sb.toString());

	}

}
