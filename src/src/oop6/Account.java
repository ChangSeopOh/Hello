package oop6;

public class Account {
	static int money1;  //��� ������ ���� ������ �ȴ�. �׷��Ƿ� ���ο� �ν��Ͻ��� ������� ���� ������ �ȴ�.
	int money2;
	
	public Account(){}
	
	public Account(int money){
		money1+= money;
		money2+= money;
					
	}
	
	
	@Override
	public String toString() {
		return "Account [money1=" + money1 + ", money2=" + money2 + "]";
	}
	
	
	
	
	
}
