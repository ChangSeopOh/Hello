package control;

public class WhileTest02 {
	public static void main(String[] args) {
		/*int sum=0;
		int i=1;
		
		while(i<=3) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		*/
		
		int sum2=0;
		int a=3;
		
		while(a<=1000) {
			if(a%3==0) {
				sum2 += a;
			}
			a+=3;
		}
			System.out.println("1���� 1000������ ���� �� 3�� ����� �� : "+sum2);

		}
	}