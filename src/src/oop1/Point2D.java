package oop1;

public class Point2D {
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x; //매개변수가 같으니까 this로 구별한다.
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print(){
	
		System.out.println(getX()+getY());
	
		}
}
