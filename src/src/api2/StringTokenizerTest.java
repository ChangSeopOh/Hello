package api2;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(
				"강백호|정대만, 서태웅|송태섭, 채치수|김준호", "|");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
