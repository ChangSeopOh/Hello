package api2;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(
				"����ȣ|���븸, ���¿�|���¼�, äġ��|����ȣ", "|");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
