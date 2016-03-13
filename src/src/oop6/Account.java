package oop6;

public class Account {
	static int money1;  //모든 곳에서 값이 공유가 된다. 그러므로 새로운 인스턴스를 만들더라도 값이 누적이 된다.
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
