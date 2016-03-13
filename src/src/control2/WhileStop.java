package control2;

public class WhileStop {
public static void main(String[] args) {
	int i=0;
	while (i<5) {
		int j=0;
		while(j<=i) {
			System.out.print("*");
			j++;
			}
		i++;
		System.out.println();
	}

	int b=0;
	
	while(b<5) {
		int j=0;
		while(j<5-b) {
			System.out.print("*");
			j++;
		}
		b++; //
		System.out.println();
		
	}

	int c=0;
	while(c<5) {
		int j=0;
		while(j<5) {
			System.out.print(c<=j ? "*" : " ");
			j++;
		}
		System.out.println();
		c++;
	}

	{
	int d=0;
	while(d<5) {
		int j=0;
		while(j<5) {
			System.out.print(j>=(4-d) ? "*" : " ");
			j++;
		}
		System.out.println();
		d++;
	}
	}
}
}
