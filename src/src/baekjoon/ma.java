package baekjoon;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class ma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String temp = sc.nextLine();
        int[] A = new int[10];
        int[] B = new int[10];
        int C = 0;
 
        ST(temp, A);
        temp = sc.nextLine();
        ST(temp, B);
 
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                C++;
            } else if (A[i] < B[i]) {
                C--;
            }
        }
        if (C > 0) {
            System.out.println("A");
        } else if (C < 0) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
 
    private static void ST(String temp, int[] a) {
        StringTokenizer st = new StringTokenizer(temp, " ");
 
        int ct = st.countTokens();
        for (int i = 0; i < ct; i++) {
 
            a[i] = Integer.parseInt(st.nextToken());
        }
 
    }
 
}


